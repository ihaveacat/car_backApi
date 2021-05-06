package com.zs.car.controller;

import com.zs.car.entity.SysUser;
import com.zs.car.service.SysUserService;
import com.zs.car.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController()
@RequestMapping("users")
//@Slf4j
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
            return R.error();
        }
        SysUser user = userService.login(username, password);
        if (user == null) {
            return R.error();
        }
        return R.ok().data("user", user);
    }

    /**
     * 获取token（未完成）
     * @return
     */
    @RequestMapping("getToken")
    public Map<String, Object> getToken() {
        Map<String, Object> map = new HashMap<>();
        map.put("username", "张三");
        map.put("password", "123456");
        map.put("token", "token");
        return map;
    }

    /**
     * 用户注册
     * @param paramseter
     * @return
     */
    @RequestMapping("userRegistration")
    public R userRegistration(@RequestBody Map<String, Object> paramseter) {
        if (paramseter == null || !paramseter.containsKey("username") || !paramseter.containsKey("password")
                || !paramseter.containsKey("tel")) {
            return R.error().message("信息为空，保存错误！");
        }
        return R.ok().data(userService.userRegistration(paramseter));
    }

}
