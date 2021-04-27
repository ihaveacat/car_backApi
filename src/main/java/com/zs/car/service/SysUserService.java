package com.zs.car.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zs.car.entity.SysUser;

import java.util.Map;

public interface SysUserService extends IService<SysUser> {

    public SysUser findUserById(Long id);
}
