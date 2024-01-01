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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.time.LocalDateTime;
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
    // 每分钟执行一次，查询接下来10分钟内需要提醒的日程
    @Scheduled(fixedDelay = 6000)
    public void checkReminder() {
        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime endTime = currentTime.plusMinutes(10); // 查询10分钟内需要提醒的日程
        LambdaQueryWrapper<Schedule> lambdaQueryWrapper =new LambdaQueryWrapper<>();
        lambdaQueryWrapper.between(Schedule::getRemindTime,currentTime,endTime);
        List<Schedule> scheduleList = scheduleService.list(lambdaQueryWrapper);
        // 遍历需要提醒的日程
        for (Schedule schedule : scheduleList) {
                if(LocalDateTime.now().isAfter(schedule.getRemindTime())) {
                    Long userId = schedule.getUserId();
                    LambdaQueryWrapper<User> userLambdaQueryWrapper = new LambdaQueryWrapper<>();
                    userLambdaQueryWrapper.eq(User::getUserId, userId);
                    User user = userService.getOne(userLambdaQueryWrapper);
                    try {
                        sendMsg(user);
                        // 处理发送结果，记录日志或处理失败情况
                        // ...
                    } catch (Exception e) {
                        throw new CustomException(e.getMessage());
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
    public void sendMsg(User user) throws IOException {
        Map<String,Object> body=new HashMap<>();
        body.put("touser",user.getOpenId());
        body.put("template_id","Cf7lRaY7cb8U8Eq8phyry2Eu5RXXL5R_NB-AFCnIbGY");
        Map<String,Object> map=new HashMap<>();
        Map<String, Object> thing5Map = new HashMap<>();
        thing5Map.put("value","垃圾");
        Map<String, Object> thing2Map = new HashMap<>();
        thing2Map.put("value","得到的");
        Map<String, Object> date4Map = new HashMap<>();
        date4Map.put("value","2023-01-01");
//        date4Map.put("value",LocalDateTime.now());
        map.put("thing5",thing5Map);
        map.put("thing2",thing2Map);
        map.put("time3",date4Map);
        body.put("data",map);
        body.put("miniprogram_state","developer");
        body.put("page","pages/index/index");
        //发送
        String accessToken= getAccessToken();
        HttpClientUtil.doPost4Json("https://api.weixin.qq.com/cgi-bin/message/subscribe/send?access_token=" + accessToken, body);
    }
}