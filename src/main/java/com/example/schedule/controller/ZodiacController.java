package com.example.schedule.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.schedule.common.R;
import com.example.schedule.entity.Zodiac;
import com.example.schedule.service.ZodiacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yanruifeng
 * @since 2024-01-22
 */
@RestController
@RequestMapping("/zodiac")
public class ZodiacController {
    @Autowired
    private ZodiacService zodiacService;
    @GetMapping("/get")
    public R<Zodiac>  get(String keyword){
        LambdaQueryWrapper<Zodiac> lambdaQueryWrapper = Wrappers.lambdaQuery();
        lambdaQueryWrapper.eq(Zodiac::getName,keyword);
        Zodiac zodiac = zodiacService.getOne(lambdaQueryWrapper);
        return R.success(zodiac);

    }
}
