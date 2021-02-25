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
@Aspect
public class CheckPermissionAspect implements WebMvcConfigurer
{

}
