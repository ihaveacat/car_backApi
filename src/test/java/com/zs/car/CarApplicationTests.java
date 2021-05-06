package com.zs.car;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zs.car.entity.FindPerson;
import com.zs.car.entity.SysUser;
import com.zs.car.mapper.SysUserMapper;
import com.zs.car.service.FindPersonService;
import com.zs.car.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

//@SpringBootTest
class CarApplicationTests {

    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private FindPersonService findPersonService;

    @Test
    void contextLoads() {

    }

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
    @Test
    void testUserRegistration() {
//        Map<String, Object> param = new HashMap<>();
//        param.put("username", "注册1");
//        param.put("password", "123456");
//        param.put("tel", "18888888888");
//        param.put("create_user", "admin");
//        Map<String, Object> map = sysUserService.userRegistration(param);
//        System.out.println(map);
    }

    /**
     * token加密
     */
    @Test
    void testToken() {
        Map<String,Object> map = new HashMap<>();
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.SECOND, 60);
        String sign = JWT.create()
                .withHeader(map)//header（可省略）
                .withClaim("userId", 1)//payload
                .withClaim("name", "张三")
                .withExpiresAt(instance.getTime())//过期时间
                .sign(Algorithm.HMAC256("CAR"));//签名
        System.out.println(sign);
    }
    @Test
    void testToken1() {
        //创建验证对象
        JWTVerifier car = JWT.require(Algorithm.HMAC256("CAR")).build();
        DecodedJWT verify =
                car.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYW1lIjoi5byg5LiJIiwiZXhwIjoxNjIwMTQxOTIxLCJ1c2VySWQiOjF9.nqN_vxPDn6BfLG4k0tidRwoc2iNZJ5LI_5ByiUrw4qk");
        System.out.println(verify.getClaim("userId").asLong());
        System.out.println(verify.getClaim("name").asString());
    }

}
