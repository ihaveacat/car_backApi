package com.zs.car.common.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.Map;

public class JWTUtils {

    private static final String SIGN = "CAR";

    /**
     * 生成token header.payload.sign
     * @param map
     * @return
     */
    public static String getToken(Map<String, String> map) {
        //指定过期时间
        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.DATE, 7);
        //创建jwt builder
        JWTCreator.Builder builder = JWT.create();
        //payload
        map.forEach((k ,v) -> {
            builder.withClaim(k, v);
        });
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
    public static DecodedJWT verify(String token) {
        try {
            DecodedJWT verify = JWT.require(Algorithm.HMAC256(SIGN)).build().verify(token);
            return verify;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
