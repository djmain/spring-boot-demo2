package com.xdj.spring.boot.servlet;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * created by Jay on 2019/6/18
 */
@Component
public class ThirdServlet implements Servlet
{
    @Override
    public void init(ServletConfig servletConfig) throws ServletException
    {

    }

    @Override
    public ServletConfig getServletConfig()
    {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        servletResponse.getWriter().write("thirdServlet");
    }

    @Override
    public String getServletInfo()
    {
        return null;
    }

    @Override
    public void destroy()
    {

    }
}
