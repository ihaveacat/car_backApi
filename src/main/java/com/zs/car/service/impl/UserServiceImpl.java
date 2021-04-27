package com.zs.car.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zs.car.entity.User;
import com.zs.car.mapper.UserMapper;
import com.zs.car.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public User findUserById(Integer id) {
        return null;
    }
}
