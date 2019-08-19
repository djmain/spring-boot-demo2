package com.xdj.spring.boot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * created by Jay on 2019/8/17
 */
//@WebFilter(filterName = "atest2", urlPatterns = "/user/*")
public class AUrlFilter1 implements Filter
{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        System.out.println("过滤器 test2 被创建");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String requestURI = req.getRequestURI();
        System.out.println("过滤器 test2 请求地址:" + requestURI);
        if (!requestURI.contains("money"))
        {
            servletRequest.getRequestDispatcher("/user/forbidden").forward(servletRequest, servletResponse);
        }
        else
        {
            filterChain.doFilter(servletRequest, servletResponse);
            System.out.println("过滤器 test2 执行完web资源后");
        }
    }

    @Override
    public void destroy()
    {
        System.out.println("过滤器 test2 被销毁");
    }
}

