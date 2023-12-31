package com.example.schedule.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.schedule.common.R;
import com.example.schedule.entity.User;
import com.example.schedule.mapper.UserMapper;
import com.example.schedule.properties.WeixinProperties;
import com.example.schedule.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.schedule.utils.HttpClientUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author austin
 * @since 2023-12-31
 */
@Slf4j
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private WeixinProperties weixinProperties;
    @Override
    public User wxLogin(Map<String, Object> map) {
        Map<String,Object> wxMap =new HashMap<>();
        wxMap.put("appid",weixinProperties.getAppid());
        wxMap.put("secret",weixinProperties.getSecret());
        wxMap.put("js_code",map.get("code"));
        wxMap.put("grant_type","authorization_code");
        String s = HttpClientUtil.doGet(weixinProperties.getJscode2sessionUrl(), wxMap);
        JSONObject jsonObject = JSON.parseObject(s);
        String openid = jsonObject.getString("openid");
        LambdaQueryWrapper<User> lambdaQueryWrapper =new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(User::getOpenId,openid);
        User user = getOne(lambdaQueryWrapper);
        if(user==null){
            user = JSON.parseObject(JSON.toJSONString(map), User.class);
            user.setOpenId(openid);
        }
        return user;
    }
}
