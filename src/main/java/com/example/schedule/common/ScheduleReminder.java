package com.example.schedule.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.schedule.entity.Schedule;
import com.example.schedule.entity.User;
import com.example.schedule.properties.WeixinProperties;
import com.example.schedule.service.ScheduleService;
import com.example.schedule.service.UserService;
import com.example.schedule.utils.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class ScheduleReminder {
    @Autowired
    private  ScheduleService scheduleService;
    @Autowired
    private UserService userService;
    @Transactional
    @Scheduled(fixedDelay = 60000)
    public void checkReminder() {
        LambdaQueryWrapper<Schedule> lambdaQueryWrapper =new LambdaQueryWrapper<>();
        //0.不提醒 1.待提醒 2.已提醒
        lambdaQueryWrapper.eq(Schedule::getStatus,1);
        //1.开启提醒 0关闭提醒
        lambdaQueryWrapper.eq(Schedule::getOpenRemind,1);
        List<Schedule> scheduleList = scheduleService.list(lambdaQueryWrapper);
        // 遍历需要提醒的日程
        for (Schedule schedule : scheduleList) {
            if(schedule.getRemindTime()!=null) {
                if (LocalDateTime.now().compareTo(schedule.getRemindTime()) >= 0) {
                    Long userId = schedule.getUserId();
                    User user = userService.getById(userId);
                    try {
                        String s = sendMsg(user, schedule);
                        JSONObject jsonObject = JSON.parseObject(s);
                        if (jsonObject.getInteger("errcode") == 0) {
                            schedule.setStatus(2);
                            scheduleService.updateById(schedule);
                            break;
                        }
                        // 处理发送结果，记录日志或处理失败情况
                        // ...
                    } catch (Exception e) {
                        throw new CustomException(e.getMessage());
                    }
                }
            }
        }
    }
    @Autowired
    private WeixinProperties weixinProperties;
    public String getAccessToken() {
        Map<String,Object> map = new HashMap<>();
        map.put("appid",weixinProperties.getAppid());
        map.put("secret",weixinProperties.getSecret());
        map.put("grant_type","client_credential");
        String result = HttpClientUtil.doGet("https://api.weixin.qq.com/cgi-bin/token",map);
        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject.getString("access_token");
    }
    public String sendMsg(User user,Schedule schedule) throws IOException {
        Map<String,Object> body=new HashMap<>();
        body.put("touser",user.getOpenId());
        body.put("template_id","Cf7lRaY7cb8U8Eq8phyryyVf3SzDDi1zpyJtaljoqjk");
        Map<String,Object> map=new HashMap<>();
        Map<String, Object> thing5Map = new HashMap<>();
        thing5Map.put("value",schedule.getScheduleName());
        Map<String, Object> thing2Map = new HashMap<>();
        thing2Map.put("value","您的日程计划提醒通知到了，请提前做好准备");
        Map<String, Object> date4Map = new HashMap<>();
        date4Map.put("value",schedule.getStartDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        map.put("thing5",thing5Map);
        map.put("thing2",thing2Map);
        map.put("time3",date4Map);
        body.put("data",map);
        body.put("miniprogram_state","developer");
        body.put("page","pages/index/index");
        //发送
        String accessToken= getAccessToken();
        return HttpClientUtil.doPost4Json("https://api.weixin.qq.com/cgi-bin/message/subscribe/send?access_token=" + accessToken, body);
    }
}