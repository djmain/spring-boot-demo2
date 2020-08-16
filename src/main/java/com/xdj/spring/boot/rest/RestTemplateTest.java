package com.xdj.spring.boot.rest;

import com.xdj.spring.boot.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RestTemplateTest {

    RestTemplate restTemplate = new RestTemplate();


    @Test
    public void testGetForObject() {
        /**
         * 传参方式1：可变参数
         * 此处传参是按照顺序的方式替换的,
         * 相当于用第一个参数Jack替换第一个占位符{name}, 用第二个参数18替换第二个占位符{age},
         * 组成的url: http://localhost:8080/get?name=Jack&age=18
         */
        String result1 = restTemplate.getForObject("http://localhost:8080/get?name={name}&age={age}", String.class, "Jack", 18);
        System.out.println(result1);


        /**
         * 传参方式2：Map传参
         * 此时，相当于从map获取key为name的value, 然后替换{name}; 从map中获取key为age的value, 然后替换{age};
         * 注意: map中的key必须与参数占位符名称相同，否则会报错非法的参数异常，如：java.lang.IllegalArgumentException: Map has no value for 'name'
         * 组成的URL：http://localhost:8080/get?name=Jack&age=20
         */
        Map<String, Object> param = new HashMap<>();
        param.put("name", "James");
        param.put("age", 20);
        String result2 = restTemplate.getForObject("http://localhost:8080/get?name={name}&age={age}", String.class, param);
        System.out.println(result2);
    }

    /**
     Hello, name=Jack, age:18
     200
     {Content-Type=[text/plain;charset=UTF-8], Content-Length=[24], Date=[Sun, 16 Aug 2020 14:59:35 GMT]}
     Hello, name=James, age:20
     200
     {Content-Type=[text/plain;charset=UTF-8], Content-Length=[25], Date=[Sun, 16 Aug 2020 14:59:35 GMT]}
     */
    @Test
    public void testGetForEntity() {
        /**
         * 传参方式1：可变参数
         * 此处传参是按照顺序的方式替换的,
         * 相当于用第一个参数Jack替换第一个占位符{name}, 用第二个参数18替换第二个占位符{age},
         * 组成的url: http://localhost:8080/get?name=Jack&age=18
         */
        ResponseEntity<String> result1 = restTemplate.getForEntity("http://localhost:8080/get?name={name}&age={age}", String.class, "Jack", 18);
        System.out.println(result1.getBody());
        System.out.println(result1.getStatusCodeValue());
        System.out.println(result1.getHeaders());


        /**
         * 传参方式2：Map传参
         * 此时，相当于从map获取key为name的value, 然后替换{name}; 从map中获取key为age的value, 然后替换{age};
         * 注意: map中的key必须与参数占位符名称相同，否则会报错非法的参数异常，如：java.lang.IllegalArgumentException: Map has no value for 'name'
         * 组成的URL：http://localhost:8080/get?name=Jack&age=20
         */
        Map<String, Object> param = new HashMap<>();
        param.put("name", "James");
        param.put("age", 20);
        ResponseEntity<String> result2 = restTemplate.getForEntity("http://localhost:8080/get?name={name}&age={age}", String.class, param);
        System.out.println(result2.getBody());
        System.out.println(result2.getStatusCodeValue());
        System.out.println(result2.getHeaders());
    }
}
