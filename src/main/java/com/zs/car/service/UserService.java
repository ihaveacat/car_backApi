package com.zs.car.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zs.car.entity.User;

public interface UserService extends IService<User> {

    public User findUserById(Integer id);
}
