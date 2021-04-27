package com.zs.car.controller;

import com.sun.javafx.collections.MappingChange;
import com.zs.car.entity.User;
import com.zs.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用entity对象也可一接收参数
     * @param user
     * @return
     */
    @RequestMapping("save")
    public Map<String, Object> save(@RequestBody Map<String, Object> user) {
        return user;
    }

}
