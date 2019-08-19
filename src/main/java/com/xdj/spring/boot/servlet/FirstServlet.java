package com.xdj.spring.boot.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * created by Jay on 2019/6/18
 */
@WebServlet(name = "firstServlet", urlPatterns = "/firstServlet")
public class FirstServlet implements Servlet
{
    @Override
    public void init(ServletConfig servletConfig) throws ServletException
    {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig()
    {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse response) throws ServletException, IOException
    {
        response.getWriter().write("ok!!");
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
