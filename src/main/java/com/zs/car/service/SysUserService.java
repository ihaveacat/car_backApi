package com.zs.car.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zs.car.entity.SysUser;

public interface SysUserService extends IService<SysUser> {

    SysUser findUserById(Long id);
}
