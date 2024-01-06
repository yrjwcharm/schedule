package com.example.schedule.controller;

import com.example.schedule.common.R;
import com.example.schedule.entity.Schedule;
import com.example.schedule.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author austin
 * @since 2024-01-01
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService  scheduleService;
    @PostMapping("/add")
    public R<String> add(@RequestBody  Schedule schedule){
        scheduleService.save(schedule);
        return R.success("日程创建成功！！！");
    }
}
