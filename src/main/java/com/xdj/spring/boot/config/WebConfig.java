package com.xdj.spring.boot.config;

import com.xdj.spring.boot.interceptor.CheckHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleServletHandlerAdapter;

/**
 * created by Jay on 2019/6/18
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer
{
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new CheckHandlerInterceptor()).addPathPatterns("/**");
//        registry.addInterceptor(new CheckHandlerInterceptor2()).addPathPatterns("/user/*");
    }

    @Bean
    public SimpleServletHandlerAdapter servletHandlerAdapter()
    {
        return new SimpleServletHandlerAdapter();
    }


}
