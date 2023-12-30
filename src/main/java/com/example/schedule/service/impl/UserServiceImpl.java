package com.example.schedule.service.impl;

import com.example.schedule.entity.User;
import com.example.schedule.mapper.UserMapper;
import com.example.schedule.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author austin
 * @since 2023-12-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
