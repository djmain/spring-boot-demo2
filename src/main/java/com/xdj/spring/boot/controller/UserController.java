package com.xdj.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by Jay on 2019/6/18
 */
@RestController
@RequestMapping("/user")
public class UserController
{
    @RequestMapping("/money")
    public int getMoney()
    {
        System.out.println("calling getMoney.");
        return Integer.MAX_VALUE;
    }

    @RequestMapping("/name")
    public String getName()
    {
        System.out.println("calling getName.");
        return "DJMAIN";
    }

    @RequestMapping("/forbidden")
    public String forbidden()
    {
        System.out.println("calling forbidden.");
        return "forbidden";
    }

    @RequestMapping("/test/1")
    public String test()
    {
        System.out.println("test");
        return "test";
    }
}
