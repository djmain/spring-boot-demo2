package com.xdj.spring.boot.init;

import com.xdj.spring.boot.config.WebConfig;
import com.xdj.spring.boot.servlet.FirstServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * created by Jay on 2019/6/18
 */
public class WebInitializer implements WebApplicationInitializer
{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException
    {
//        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//        context.register(WebConfig.class);
//        context.setServletContext(servletContext);
//        ServletRegistration.Dynamic firstServlet = servletContext.addServlet("firstServlet", new FirstServlet());
//        firstServlet.addMapping("/firstServlet");
//        firstServlet.setLoadOnStartup(1);
    }
}
