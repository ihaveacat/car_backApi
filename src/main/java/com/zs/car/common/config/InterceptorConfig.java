package com.zs.car.common.config;

import com.zs.car.common.intercept.JWTinterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * JWT拦截器配置
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private JWTinterceptor jwTinterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(jwTinterceptor)
                .addPathPatterns("/**")//拦截所有接口
                .excludePathPatterns("/users/login")//放行登录接口
                .excludePathPatterns("/users/userRegistration");//放行注册接口
    }
}
