package com.example.schedule.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.schedule.common.R;
import com.example.schedule.dto.ScheduleDto;
import com.example.schedule.entity.*;
import com.example.schedule.service.ScheduleCategoryService;
import com.example.schedule.service.ScheduleCollectService;
import com.example.schedule.service.ScheduleService;
import com.example.schedule.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    private ScheduleCollectService scheduleCollectService;
    @Autowired
    private ScheduleCategoryService scheduleCategoryService;
    @PostMapping("/add")
    public R<String> add(@RequestBody  Schedule schedule){
        LambdaQueryWrapper<ScheduleCollect> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.eq(ScheduleCollect::getCollectStatus,1);
        lambdaQueryWrapper.eq(ScheduleCollect::getScheduleId,schedule.getScheduleId());
        int total = scheduleCollectService.count(lambdaQueryWrapper);
        schedule.setCollectCount(total);
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
        ScheduleCategory scheduleCategory =scheduleCategoryService.getById(item.getCategoryId());
        LambdaQueryWrapper<ScheduleCollect> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(ScheduleCollect::getUserId,item.getUserId());
        queryWrapper.eq(ScheduleCollect::getScheduleId,item.getScheduleId());
        ScheduleCollect scheduleCollect = scheduleCollectService.getOne(queryWrapper);
        if (user != null) {
            scheduleDto.setNickName(user.getNickName());
            scheduleDto.setAvatarUrl(user.getAvatarUrl());
            log.info("333:{}", scheduleDto.getScheduleArrange());
            scheduleDto.setCategoryName(scheduleCategory.getCategoryName());
        }
        // 普通方式
        if (scheduleDto.getScheduleArrange() != null) {
            //fastJson
            List<ScheduleArrange> arrayList = JSON.parseObject(scheduleDto.getScheduleArrange(), new TypeReference<List<ScheduleArrange>>() {});
            scheduleDto.setScheduleArrangeList(arrayList);
        }
        if(scheduleCollect!=null){
            scheduleDto.setCollectStatus(scheduleCollect.getCollectStatus());
        }else{
            scheduleDto.setCollectStatus(0);
        }
        return scheduleDto;
    }
    @GetMapping("/page")
    public R<Page<ScheduleDto>> queryCategory(int page, int pageSize, String keywords, Long categoryId, Integer sortId){
        //构造分页构造器
        Page<Schedule> pageInfo =new Page<>(page,pageSize);
        Page<ScheduleDto> scheduleDtoPage = new Page<>();

        LambdaQueryWrapper<Schedule> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        if(sortId==0) {
            lambdaQueryWrapper.orderByDesc(Schedule::getCreateTime);
        }else if(sortId==1){
            lambdaQueryWrapper.orderByDesc(Schedule::getCollectCount);
        }
        //添加条件根据name 进行like模糊查询
        lambdaQueryWrapper.like(StringUtils.isNotEmpty(keywords),Schedule::getScheduleName,keywords);
        lambdaQueryWrapper.eq(categoryId!=0, Schedule::getCategoryId,categoryId);
        scheduleService.page(pageInfo,lambdaQueryWrapper);

        //对象拷贝
        BeanUtils.copyProperties(pageInfo,scheduleDtoPage,"records");

        List<ScheduleDto> list = pageInfo.getRecords().stream().map(this::getScheduleDto).collect(Collectors.toList());
        scheduleDtoPage.setRecords(list);

        return R.success(scheduleDtoPage);
    }
}
