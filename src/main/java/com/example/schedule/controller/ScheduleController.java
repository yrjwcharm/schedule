package com.example.schedule.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.schedule.common.R;
import com.example.schedule.dto.ScheduleDto;
import com.example.schedule.entity.Schedule;
import com.example.schedule.entity.ScheduleArrange;
import com.example.schedule.entity.ScheduleType;
import com.example.schedule.entity.User;
import com.example.schedule.service.ScheduleService;
import com.example.schedule.service.ScheduleTypeService;
import com.example.schedule.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author austin
 * @since 2024-01-01
 */
@Slf4j
@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService  scheduleService;
    @Autowired
    private UserService userService;

    @Autowired
    private ScheduleTypeService scheduleTypeService;
    @PostMapping("/add")
    public R<String> add(@RequestBody  Schedule schedule){
        scheduleService.save(schedule);
        return R.success("日程创建成功！！！");
    }
    @GetMapping("/page")
    public R<Page<ScheduleDto>> queryCategory(int page, int pageSize, String keywords, Long typeId, Integer sortId){
        //构造分页构造器
        Page<Schedule> pageInfo =new Page<Schedule>(page,pageSize);
        Page<ScheduleDto> scheduleDtoPage = new Page<>();

        LambdaQueryWrapper<Schedule> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        if(sortId==0) {
            lambdaQueryWrapper.orderByDesc(Schedule::getUpdateTime);
        }else if(sortId==1){
            lambdaQueryWrapper.orderByDesc(Schedule::getViewCount);
        }else{
            lambdaQueryWrapper.orderByDesc(Schedule::getStartDate);
        }
        //添加条件根据name 进行like模糊查询
        lambdaQueryWrapper.like(StringUtils.isNotEmpty(keywords),Schedule::getScheduleName,keywords);
        lambdaQueryWrapper.eq(typeId!=0, Schedule::getTypeId,typeId);
        scheduleService.page(pageInfo,lambdaQueryWrapper);

        //对象拷贝
        BeanUtils.copyProperties(pageInfo,scheduleDtoPage,"records");

        List<ScheduleDto> list = pageInfo.getRecords().stream().map(item -> {
            //根据id查询分类对象
            ScheduleDto scheduleDto = new ScheduleDto();
            BeanUtils.copyProperties(item, scheduleDto);
            User user = userService.getById(item.getUserId());
            ScheduleType scheduleType =scheduleTypeService.getById(item.getTypeId());
            if (user != null) {
                scheduleDto.setNickName(user.getNickName());
                scheduleDto.setAvatarUrl(user.getAvatarUrl());
                log.info("333:{}",scheduleDto.getScheduleArrange());
                scheduleDto.setCategoryName(scheduleType.getTypeName());
                JSONArray jsonArray = JSON.parseArray(scheduleDto.getScheduleArrange());
//              // 处理 JSONArray 对象
                List<ScheduleArrange> arrayList =new ArrayList<>();
                for (Object obj : jsonArray) {
                    JSONObject jsonObject = (JSONObject) obj; // 转换为 JSONObject
                    // 进行你的处理，比如获取属性值
                    String date = jsonObject.getString("date");
                    String content = jsonObject.getString("content");
                    ScheduleArrange scheduleArrange =new ScheduleArrange();
                    scheduleArrange.setContent(content);
                    scheduleArrange.setDate(date);
                    arrayList.add(scheduleArrange);
                }
                scheduleDto.setScheduleArrangeList(arrayList);
            }
            return scheduleDto;
        }).collect(Collectors.toList());
        scheduleDtoPage.setRecords(list);

        return R.success(scheduleDtoPage);
    }
}
