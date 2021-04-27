package com.zs.car;

import com.zs.car.entity.User;
import com.zs.car.mapper.UserMapper;
import com.zs.car.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;

@SpringBootTest
class CarApplicationTests {

    //暂时没调通
    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void insert() {
        User user = new User();
        user.setId(2);
        user.setUsername("测试");
        user.setPassword("123456");
        user.setTel("15800000000");
        user.setCreateUser("admin");
        user.setCreateTime(new Date());
        int row = userMapper.insert(user);
        System.out.println("插入了"+row+"行");
    }

    @Test
    void removeById() {
        int row = userMapper.deleteById(2);
        System.out.println("根据id删除了"+row+"行");
    }

    @Test
    void update() {
        User user = new User();
        user.setId(1);
        user.setTel("18888888888");
        int row = userMapper.updateById(user);
        System.out.println("更新了"+row+"行");
    }

    @Test
    void getById() {//根据id查询
        User user = userMapper.selectById(1);
        System.out.println(user);
    }

    @Test
    void testTemplate() {
        int row = jdbcTemplate.update("update user u set u.level=? where id=?", 2, 1);
        System.out.println("更新了"+row+"行");
    }

}
