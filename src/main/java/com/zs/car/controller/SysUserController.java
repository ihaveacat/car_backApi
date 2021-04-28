package com.zs.car.controller;

import com.zs.car.entity.SysUser;
import com.zs.car.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("users")
public class SysUserController {

    @Autowired
    private SysUserService userService;


    @RequestMapping("getToken")
    public Map<String, Object> getToken() {
        Map<String, Object> map = new HashMap<>();
        map.put("username", "张三");
        map.put("password", "123456");
        map.put("token", "token");
        return map;
    }

    /**
     *测试方法可删除
     * @param paramseter
     * @return
     */
    @RequestMapping("findUserById")
    public SysUser findUserById(@RequestBody Map<String, Object> paramseter) {
        return userService.findUserById(Long.valueOf(paramseter.get("id").toString()));
    }
}
