package com.zs.car.common.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.zs.car.common.AllException;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class JWTUtils {

    //加密随机码
    private static final String SIGN = "CAR";

    /**
     *
     * @param id
     * @param username
     * @return
     */
    public static String getToken(Long id, String username) {
        //指定过期时间(7天)
        Calendar instance = Calendar.getInstance();
//        instance.add(Calendar.DATE, 7);
        //【临时修改】
        instance.add(Calendar.MINUTE, 5);
        //创建jwt builder
        JWTCreator.Builder builder = JWT.create();
        //payload
        builder.withClaim("id", id);
        builder.withClaim("username", username);
        //生成token
        String token = builder.withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256(SIGN));
        return token;
    }

    /**
     * 验证token并返回值
     * @param token
     * @return
     */
    public static Map<String, Object> verify(String token) {
        try {
            DecodedJWT verify = JWT.require(Algorithm.HMAC256(SIGN)).build().verify(token);
            Map<String, Object> map = new HashMap<>();
            Long id = verify.getClaim("id").asLong();
            String username = verify.getClaim("username").asString();
            map.put("id", id);
            map.put("username", username);
            return map;
        } catch (Exception e) {
            new AllException(ResultCodeEnum.TOKEN_ANALYSIS);
        }
        return null;
    }

}
