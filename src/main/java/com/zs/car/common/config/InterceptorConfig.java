package com.zs.car.common.config;

import com.zs.car.common.intercept.JWTinterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JWTinterceptor())
                .addPathPatterns("/users/**")//拦截所有接口
                .excludePathPatterns("/users/login");//放行这个接口
    }
}
