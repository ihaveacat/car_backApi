package com.zs.car;

import com.zs.car.entity.FindPerson;
import com.zs.car.entity.SysUser;
import com.zs.car.service.FindPersonService;
import com.zs.car.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CarApplicationTests {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private FindPersonService findPersonService;

    @Test
    void testMybatisPlus() {
//        SysUser userById = sysUserService.findUserById(1L);
//        System.out.println(userById);
    }

    @Test
    void testPageFindPersonList() {
//        List<FindPerson> findPeople =
//                findPersonService.pageFindPersonList(0, 5);
//        for (FindPerson fp: findPeople) {
//            System.out.println(fp);
//        }
    }
}
