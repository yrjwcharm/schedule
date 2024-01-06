package com.example.schedule.controller;

import com.example.schedule.common.R;
import com.example.schedule.entity.Schedule;
import com.example.schedule.entity.ScheduleType;
import com.example.schedule.service.ScheduleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-06
 */
@RestController
@RequestMapping("/scheduleType")
public class ScheduleTypeController {
    @Autowired
    private ScheduleTypeService scheduleTypeService;
    @GetMapping("/list")
    public R<List<ScheduleType>> list(){
        List<ScheduleType> list = scheduleTypeService.list();
        return R.success(list);
    }
}
