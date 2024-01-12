package com.example.schedule.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.schedule.common.R;
import com.example.schedule.entity.ScheduleCollect;
import com.example.schedule.service.ScheduleCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-12
 */
@RestController
@RequestMapping("/scheduleCollect")
public class ScheduleCollectController {
    @Autowired
    private ScheduleCollectService scheduleCollectService;

    @GetMapping("/get")
    public R<Integer> getStatus(Long userId, Long scheduleId) {
        LambdaQueryWrapper<ScheduleCollect> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.eq(ScheduleCollect::getScheduleId, scheduleId);
        lambdaQueryWrapper.eq(ScheduleCollect::getUserId, userId);
        ScheduleCollect scheduleCollect = scheduleCollectService.getOne(lambdaQueryWrapper);
        if (scheduleCollect == null) return R.success(0);
        return R.success(scheduleCollect.getCollectStatus());
    }

    @PostMapping("/collect")
    public R<String> collectSchedule(@RequestBody ScheduleCollect scheduleCollect) {
        // 构建查询条件，查找用户是否已收藏该日程
        LambdaQueryWrapper<ScheduleCollect> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(ScheduleCollect::getScheduleId, scheduleCollect.getScheduleId());
        queryWrapper.eq(ScheduleCollect::getUserId, scheduleCollect.getUserId());

        // 获取用户对该日程的收藏记录
        ScheduleCollect existingCollect = scheduleCollectService.getOne(queryWrapper);

        if (existingCollect == null) {
            // 如果没有找到收藏记录，则创建新的收藏记录
            scheduleCollectService.save(scheduleCollect);
            return R.success("收藏成功");
        } else {
            // 如果已经存在收藏记录，则更新收藏状态为未收藏（0代表未收藏）

            if (existingCollect.getCollectStatus() == 1) {
                existingCollect.setCollectStatus(0);
            }else {
                existingCollect.setCollectStatus(1);
            }
            scheduleCollectService.updateById(existingCollect);
            return R.success("取消收藏成功");
        }
    }
}
