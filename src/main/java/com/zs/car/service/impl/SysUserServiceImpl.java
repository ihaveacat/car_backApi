package com.zs.car.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zs.car.entity.SysUser;
import com.zs.car.mapper.SysUserMapper;
import com.zs.car.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    @Override
    public SysUser login(String username, String password) {
        Map<String, Object> map = new HashMap<>();
        SysUser user = baseMapper.login(username, password);
        map.put("row", user);
        return user;
    }

    /**
     * 用户注册
     * @param paramseter
     * @return
     */
    @Override
    @Transactional
    public Map<String, Object> userRegistration(Map<String, Object> paramseter) {
        Map<String, Object> map = new HashMap<>();
        SysUser su = new SysUser();
        su.setUsername(paramseter.get("username").toString());
        su.setPassword(paramseter.get("password").toString());
        su.setTel(paramseter.get("tel").toString());
        su.setCreateUser("admin");
        int row = baseMapper.userRegistration(su);
        map.put("row", map);
        return map;
    }


}
