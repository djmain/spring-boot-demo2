package com.xdj.spring.boot;

import com.xdj.spring.boot.servlet.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@RestController
@ServletComponentScan(basePackages = "com.xdj.spring.boot")
public class App
{

    @RequestMapping("/get")
    public String home()
    {
        try
        {
            TimeUnit.MILLISECONDS.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        String str = Thread.currentThread().getName() + ": hello spring boot!";
        System.out.println(str);
        return str;
    }

    //    @Bean
//    public ServletRegistrationBean getServletRegistrationBean()
//    {  //一定要返回ServletRegistrationBean
//        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());     //放入自己的Servlet对象实例
//        bean.addUrlMappings("/secondServlet");  //访问路径值
//        return bean;
//    }
    @Bean
    public ServletRegistrationBean getServletRegistrationBean()
    {
        return new ServletRegistrationBean(new SecondServlet(), "/secondServlet");
    }

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

}