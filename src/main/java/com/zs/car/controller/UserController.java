package com.zs.car.controller;

import com.zs.car.entity.User;
import com.zs.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *
     * @param user
     * @return
     */
    @RequestMapping("getUserById")
    public Map<String, Object> getUserById(@RequestBody User user) {
        return userService.findUserById(user.getId());
    }
}
