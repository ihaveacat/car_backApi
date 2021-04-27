package com.zs.car.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zs.car.entity.SysUser;
import com.zs.car.mapper.SysUserMapper;
import com.zs.car.service.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser findUserById(Long id) {
        return null;
    }
}
