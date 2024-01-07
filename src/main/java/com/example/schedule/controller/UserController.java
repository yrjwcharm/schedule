package com.example.schedule.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.schedule.common.R;
import com.example.schedule.entity.User;
import com.example.schedule.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
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
   public R<User> login(@RequestBody Map<String,Object> map, HttpSession httpSession) {
       User user = userService.wxLogin(map);
       httpSession.setAttribute("user",user.getUserId());
       return R.success(user);
   }
   @PutMapping("/update")
   public R<User> updateByOpenId(@RequestBody  User user){
       log.info("user:{}",user);
       userService.updateById(user);
       return R.success(user);
   }
}
