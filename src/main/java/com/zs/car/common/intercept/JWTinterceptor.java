package com.zs.car.common.intercept;

import com.zs.car.common.AllException;
import com.zs.car.common.utils.JWTUtils;
import com.zs.car.common.utils.ResultCodeEnum;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * JWT拦截器
 */
@Component
public class JWTinterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        //获取请求头中的token
        String token = request.getHeader("token");
        if (token == null) {
            throw new AllException(ResultCodeEnum.FETCH_USERINFO_ERROR);
        }
        //验证token
        JWTUtils.verify(token);
        return true;
    }
}
