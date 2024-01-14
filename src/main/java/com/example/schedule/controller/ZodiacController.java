package com.example.schedule.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.schedule.common.R;
import com.example.schedule.entity.Zodiac;
import com.example.schedule.utils.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/zodiac")
public class ZodiacController {
    @Value("${zodiac.key}")
    private String key;
    @GetMapping("/get")
    public R<Zodiac> get(String keyword){
        Map<String,Object> map =new HashMap<>();
        map.put("keyword",keyword);
        map.put("key",key);
        String s= HttpClientUtil.doGet("http://apis.juhe.cn/fapig/zodiac/query",map);
        Zodiac zodiac = JSON.parseObject(s,Zodiac.class);
        return R.success(zodiac);

    }
}
