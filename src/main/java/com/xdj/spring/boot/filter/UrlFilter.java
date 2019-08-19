package com.xdj.spring.boot.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * created by Jay on 2019/8/17
 */
//@WebFilter(filterName = "test1", urlPatterns = "/user/*")
public class UrlFilter implements Filter
{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
        System.out.println("过滤器 test 被创建");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();
        System.out.println("过滤器 test 请求地址:" + requestURI);
        if (!requestURI.contains("money"))
        {
            servletRequest.getRequestDispatcher("/user/forbidden").forward(servletRequest, servletResponse);
        }
        else
        {
            request.setCharacterEncoding(StandardCharsets.UTF_8.name());
            filterChain.doFilter(servletRequest, servletResponse);
            System.out.println("过滤器 test 执行完web资源后");
        }
    }

    @Override
    public void destroy()
    {
        System.out.println("过滤器 test 被销毁");
    }
}
