package com.zs.car.service.impl;

import com.zs.car.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Map<String, Object> findUserById(Long id) {
        Map<String, Object> map
                = jdbcTemplate.queryForMap("select * from user where id=?", id);
        return map;
    }
}
