package com.zs.car;

import com.zs.car.entity.SysUser;
import com.zs.car.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarApplicationTests {

    @Autowired
    private SysUserService sysUserService;

    @Test
    void testMybatisPlus() {
        SysUser userById = sysUserService.findUserById(1L);
        System.out.println(userById);
    }

}
