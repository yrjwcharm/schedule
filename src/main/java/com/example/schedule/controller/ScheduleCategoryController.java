package com.example.schedule.controller;

import com.example.schedule.common.R;
import com.example.schedule.entity.ScheduleCategory;
import com.example.schedule.service.ScheduleCategoryService;
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
 * @since 2024-01-14
 */
@RestController
@RequestMapping("/scheduleCategory")
public class ScheduleCategoryController {
    @Autowired
    private ScheduleCategoryService scheduleCategoryService;
    @GetMapping("/list")
    public R<List<ScheduleCategory>> list(){
        return R.success(scheduleCategoryService.list());
    }
}
