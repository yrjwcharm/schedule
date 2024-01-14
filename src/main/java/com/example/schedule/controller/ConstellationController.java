package com.example.schedule.controller;

import com.alibaba.fastjson.JSON;
import com.example.schedule.common.R;
import com.example.schedule.entity.Constellation;
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
@RequestMapping("/constellation")
public class ConstellationController {
    @Value("${constellation.key}")
    private String key;
    @GetMapping("/get")
    public R<Constellation> get(String keyword){
        Map<String,Object> map =new HashMap<>();
        map.put("keyword",keyword);
        map.put("key",key);
        String s= HttpClientUtil.doGet("http://apis.juhe.cn/fapig/constellation/query",map);
        Constellation constellation = JSON.parseObject(s,Constellation.class);
        return R.success(constellation);

    }
}
