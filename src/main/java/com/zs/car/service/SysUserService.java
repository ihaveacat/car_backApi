package com.zs.car.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zs.car.entity.SysUser;

import java.util.Map;

public interface SysUserService extends IService<SysUser> {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    SysUser login(String username, String password);

    /**
     * 用户注册
     * @param paramseter
     * @return
     */
    Map<String, Object> userRegistration(Map<String, Object> paramseter);


}
