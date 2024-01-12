package com.example.schedule.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.schedule.common.R;
import com.example.schedule.dto.ScheduleDto;
import com.example.schedule.entity.*;
import com.example.schedule.service.ScheduleCollectService;
import com.example.schedule.service.ScheduleService;
import com.example.schedule.service.ScheduleTypeService;
import com.example.schedule.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    private ScheduleCollectService scheduleCollectService;
    @Autowired
    private ScheduleTypeService scheduleTypeService;
    @PostMapping("/add")
    public R<String> add(@RequestBody  Schedule schedule){
        scheduleService.save(schedule);
        return R.success("日程创建成功！！！");
    }
    @DeleteMapping("/{id}")
    public R<String> delete (@PathVariable Long id){
        scheduleService.removeById(id);
        return R.success("日程计划删除成功！！！");
    }
    @GetMapping("/get")
    public R<ScheduleDto> get(Long id){
        Schedule schedule = scheduleService.getById(id);
        ScheduleDto scheduleDto = getScheduleDto(schedule);
        return R.success(scheduleDto);
    }
    @GetMapping("/list")
    public R<List<ScheduleDto>> list(Long userId ,int status){
        LambdaQueryWrapper<Schedule> lambdaQueryWrapper =new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Schedule::getUserId,userId);
        //-1 指全部
        if(status!=-1) {
            if(status!=0){
                lambdaQueryWrapper.eq(Schedule::getOpenRemind, 1);
            }
            lambdaQueryWrapper.eq(Schedule::getStatus, status);
        }
        lambdaQueryWrapper.orderByDesc(Schedule::getUpdateTime);
        List<ScheduleDto> list = scheduleService.list(lambdaQueryWrapper).stream().map(this::getScheduleDto).collect(Collectors.toList());
        return R.success(list);
    }
    private ScheduleDto getScheduleDto(Schedule item){
        ScheduleDto scheduleDto=new ScheduleDto();
        BeanUtils.copyProperties(item,scheduleDto);
        User user = userService.getById(item.getUserId());
        ScheduleType scheduleType =scheduleTypeService.getById(item.getTypeId());
        LambdaQueryWrapper<ScheduleCollect> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.eq(ScheduleCollect::getCollectStatus,1);
        lambdaQueryWrapper.eq(ScheduleCollect::getScheduleId,item.getScheduleId());
        int total = scheduleCollectService.count(lambdaQueryWrapper);

        LambdaQueryWrapper<ScheduleCollect> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(ScheduleCollect::getUserId,item.getUserId());
        queryWrapper.eq(ScheduleCollect::getScheduleId,item.getScheduleId());
        ScheduleCollect scheduleCollect = scheduleCollectService.getOne(queryWrapper);
        if (user != null) {
            scheduleDto.setNickName(user.getNickName());
            scheduleDto.setAvatarUrl(user.getAvatarUrl());
            log.info("333:{}", scheduleDto.getScheduleArrange());
            scheduleDto.setCategoryName(scheduleType.getTypeName());
        }
        // 普通方式
        if (scheduleDto.getScheduleArrange() != null) {
            //fastJson
            List<ScheduleArrange> arrayList = JSON.parseObject(scheduleDto.getScheduleArrange(), new TypeReference<List<ScheduleArrange>>() {});
            scheduleDto.setScheduleArrangeList(arrayList);
        }
        if(scheduleCollect!=null){
            scheduleDto.setCollectStatus(scheduleCollect.getCollectStatus());
        }
        scheduleDto.setCollectTotal(total);
        return scheduleDto;
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
//            lambdaQueryWrapper.orderByDesc(Schedule::getViewCount);
        }else{
            lambdaQueryWrapper.orderByDesc(Schedule::getStartDate);
        }
        //添加条件根据name 进行like模糊查询
        lambdaQueryWrapper.like(StringUtils.isNotEmpty(keywords),Schedule::getScheduleName,keywords);
        lambdaQueryWrapper.eq(typeId!=0, Schedule::getTypeId,typeId);
        scheduleService.page(pageInfo,lambdaQueryWrapper);

        //对象拷贝
        BeanUtils.copyProperties(pageInfo,scheduleDtoPage,"records");

        List<ScheduleDto> list = pageInfo.getRecords().stream().map(this::getScheduleDto).collect(Collectors.toList());
        scheduleDtoPage.setRecords(list);

        return R.success(scheduleDtoPage);
    }
}
