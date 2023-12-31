package com.example.schedule.controller;

import com.example.schedule.common.R;
import com.example.schedule.entity.User;
import com.example.schedule.service.UserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author austin
 * @since 2023-12-31
 */
@Slf4j
@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口")
public class UserController {
    @Autowired
   private UserService userService;
   @PostMapping("/login")
   public R<User> login(@RequestBody Map<String,Object> map){
        User user = userService.wxLogin(map);
        userService.save(user);
       return R.success(user);
   }
}
