package com.xdj.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
@RestController
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

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

}