package com.example.schedule.service;

import com.example.schedule.common.R;
import com.example.schedule.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author austin
 * @since 2023-12-31
 */
public interface UserService extends IService<User> {
    User wxLogin(Map<String,Object> map);
}
