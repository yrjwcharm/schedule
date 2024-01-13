package com.example.schedule.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.schedule.common.R;
import com.example.schedule.dto.ScheduleDto;
import com.example.schedule.entity.*;
import com.example.schedule.service.ScheduleCollectService;
import com.example.schedule.service.ScheduleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-12
 */
@Slf4j
@RestController
@RequestMapping("/scheduleCollect")
public class ScheduleCollectController {
    @Autowired
    private ScheduleCollectService scheduleCollectService;
    @Autowired
    private ScheduleService scheduleService;
    @GetMapping("/getCollectStatus")
    public R<Integer> getStatus(Long userId, Long scheduleId) {
        LambdaQueryWrapper<ScheduleCollect> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.eq(ScheduleCollect::getScheduleId, scheduleId);
        lambdaQueryWrapper.eq(ScheduleCollect::getUserId, userId);
        ScheduleCollect scheduleCollect = scheduleCollectService.getOne(lambdaQueryWrapper);
        if (scheduleCollect == null) return R.success(0);
        return R.success(scheduleCollect.getCollectStatus());
    }

    @GetMapping("/myCollect")
    public R<Page<ScheduleDto> > getCollect(Long userId, int page , int pageSize) {
        Page<ScheduleDto> collectedSchedules = scheduleCollectService.getCollectedSchedules(userId, (page-1)*pageSize,pageSize);
        return R.success(collectedSchedules);

    }

    @Transactional
    @PostMapping("/collect")
    public R<Schedule> collectSchedule(@RequestBody ScheduleCollect scheduleCollect) {
        // 构建查询条件，查找用户是否已收藏该日程
        LambdaQueryWrapper<ScheduleCollect> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(ScheduleCollect::getScheduleId, scheduleCollect.getScheduleId());
        queryWrapper.eq(ScheduleCollect::getUserId, scheduleCollect.getUserId());

        // 获取用户对该日程的收藏记录
        ScheduleCollect collect = scheduleCollectService.getOne(queryWrapper);

        if (collect == null) {
            // 如果没有找到收藏记录，则创建新的收藏记录
            scheduleCollectService.save(scheduleCollect);
        } else {
             collect.setCollectStatus(scheduleCollect.getCollectStatus());
            scheduleCollectService.updateById(collect);
        }
            Schedule schedule = scheduleService.getById(scheduleCollect.getScheduleId());
            LambdaQueryWrapper<ScheduleCollect> lambdaQueryWrapper = Wrappers.lambdaQuery();
            lambdaQueryWrapper.eq(ScheduleCollect::getCollectStatus, 1);
            lambdaQueryWrapper.eq(ScheduleCollect::getScheduleId, schedule.getScheduleId());
            int total = scheduleCollectService.count(lambdaQueryWrapper);

            schedule.setCollectCount(total);
            scheduleService.updateById(schedule);


        return R.success(null);
    }
}
