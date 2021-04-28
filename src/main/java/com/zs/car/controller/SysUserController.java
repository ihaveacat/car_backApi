package com.zs.car.controller;

import com.zs.car.entity.SysUser;
import com.zs.car.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("users")
public class SysUserController {

    @Autowired
    private SysUserService userService;

    /**
     *
     * @param user
     * @return
     */
    @RequestMapping("getUserById/{id}")
    public SysUser findUserById(@RequestBody SysUser sysUser) {
        return userService.findUserById(sysUser.getId());
    }
}
