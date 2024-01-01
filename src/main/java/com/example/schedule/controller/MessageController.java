package com.example.schedule.controller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.schedule.common.R;
import com.example.schedule.entity.User;
import com.example.schedule.properties.WeixinProperties;
import com.example.schedule.utils.HttpClientUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/msg")
public class MessageController {
    @Autowired
    private WeixinProperties weixinProperties;
    public String getAccessToken() {
        Map<String,Object> map = new HashMap<>();
        map.put("appid",weixinProperties.getAppid());
        map.put("secret",weixinProperties.getSecret());
        map.put("grant_type","client_credential");
        String result = HttpClientUtil.doGet("https://api.weixin.qq.com/cgi-bin/token",map);
        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject.getString("access_token");
    }
    @PostMapping("/send")
    public R<String> send(@RequestBody User user) throws IOException {
        Map<String,Object> body=new HashMap<>();
        body.put("touser",user.getOpenId());
        body.put("template_id","Cf7lRaY7cb8U8Eq8phyry2vWCwgJxi5llrobKDpzqgc");
        Map<String,Object> map=new HashMap<>();
        Map<String, Object> thing5Map = new HashMap<>();
        thing5Map.put("value","垃圾");
        Map<String, Object> thing2Map = new HashMap<>();
        thing2Map.put("value","得到的");
        Map<String, Object> date4Map = new HashMap<>();
        date4Map.put("value","2023-01-01");
        map.put("thing5",thing5Map);
        map.put("thing2",thing2Map);
        map.put("date4",date4Map);
        body.put("data",map);
        body.put("miniprogram_state","developer");
        body.put("page","page/index/index");
        //发送
        String accessToken= getAccessToken();
        String s = HttpClientUtil.doPost4Json("https://api.weixin.qq.com/cgi-bin/message/subscribe/send?access_token=" + accessToken, body);
        return R.success(s);
    }
}


