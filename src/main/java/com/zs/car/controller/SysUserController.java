package com.zs.car.controller;

import com.zs.car.common.AllException;
import com.zs.car.common.utils.JWTUtils;
import com.zs.car.common.utils.ResultCodeEnum;
import com.zs.car.service.SysUserService;
import com.zs.car.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("users")
public class SysUserController {

    @Autowired
    private SysUserService userService;

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("login")
    public R login(@RequestParam("username") String username, @RequestParam("password") String password) {
        if (username == null || password == null) {
            throw new AllException(ResultCodeEnum.LOGIN_ERROR);
        }
        String token = userService.login(username, password);
        Map<String, Object> map = JWTUtils.verify(token);
        map.put("token", token);
        return R.ok().data(map);
    }

    /**
     * 注册
     * @param paramseter
     * @return
     */
    @RequestMapping("userRegistration")
    public R userRegistration(@RequestBody Map<String, Object> paramseter) {
        if (paramseter == null || !paramseter.containsKey("username") || !paramseter.containsKey("password")
                || !paramseter.containsKey("tel")) {
            return R.error().message("信息为空，保存错误！");
        }
        userService.userRegistration(paramseter);
        return R.ok().message("注册成功！");
    }

}
