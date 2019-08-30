package com.itmayiedu.member.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @Value("${name}")
    private String name;

    @Value("${http_url}")
    private String http_url;

    @RequestMapping("/")
    String home() {
        return "Hello World2333!"+name+" "+http_url;
    }


    public String hello() {
        return "hello world";
    }



}



/**
 * @RequestMapping 注解提供了 routing（路由）信息。它告诉 Spring，任何具有路径为 / 的 HTTP 请求都应映射到 home 方法。
 * @RestController 注解告知 Spring 渲染结果字符串直接返回给调用者。
 * @EnableAutoConfiguration Spring Boot 根据您添加的 jar 依赖来“猜测”您想如何配置 Spring 并进行自动配置
 * @ComponentScan("xx") 启动的扫包范围
 *
 * */


/**
 * @RunWith(SpringRunner.class)  单元测试用
 * @SpringBootTest  单元测试用
 *
 *
 * */