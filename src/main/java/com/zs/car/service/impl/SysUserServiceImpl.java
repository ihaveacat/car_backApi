package com.zs.car.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zs.car.common.AllException;
import com.zs.car.common.utils.CustomException;
import com.zs.car.common.utils.JWTUtils;
import com.zs.car.common.utils.ResultCodeEnum;
import com.zs.car.entity.SysUser;
import com.zs.car.mapper.SysUserMapper;
import com.zs.car.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public String login(String username, String password) {
        SysUser user = baseMapper.login(username, password);
        if (user == null) {
            throw new AllException(ResultCodeEnum.FETCH_USERINFO_ERROR);
        }
        String token = JWTUtils.getToken(user.getId(), user.getUsername());
        return token;
    }

    /**
     * 用户注册
     * @param paramseter
     * @return
     */
    @Override
    @Transactional
    public void userRegistration(Map<String, Object> paramseter) {
        //根据手机号查询是否已注册
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("tel",paramseter.get("tel"));
        Integer count = baseMapper.selectCount(queryWrapper);
        if (count > 0) {
            throw new CustomException();
        }
        SysUser su = new SysUser();
        su.setUsername(paramseter.get("username").toString());
        su.setPassword(paramseter.get("password").toString());
        su.setTel(paramseter.get("tel").toString());
        baseMapper.userRegistration(su);
    }


}
