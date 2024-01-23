package com.example.schedule.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.schedule.common.R;
import com.example.schedule.entity.Constellation;
import com.example.schedule.service.ConstellationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-23
 */
@RestController
@RequestMapping("/constellation")
public class ConstellationController {
    @Autowired
    private ConstellationService constellationService;
    @GetMapping("/get")
    public R<Constellation> get(String keyword) {
        Constellation constellation = constellationService.getConstellation(keyword);
        return R.success(constellation);

    }
}
