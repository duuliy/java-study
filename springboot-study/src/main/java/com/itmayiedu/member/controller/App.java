package com.itmayiedu.member.controller;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//启动代码抽离处理
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.itmayiedu.member.controller", "com.itmayiedu.member.controller.controller"})
@SpringBootApplication
@MapperScan(basePackages = {"com.itmayiedu.member.controller"})
public class App {


    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

}

/**
 * SpringApplication 跑起来
 * @ComponentScan("xx") 启动的扫包范围
 *
 * @SpringBootApplication 本级包以及子包启动，小项目用，比较消耗性能
 *
 * @Value 初始化的时候从application.properties取值
 *
 * @Component 没有明确角色的组件
 * @Service 在业务逻辑层（Service层）使用
 * @Repositpry 在数据访问层（dao层）使用
 * @Controller 用于标注控制层组件
 * @Bean 实例化
 *
 *
 * @MapperScan 全局注入Mapper 相当于依赖注入连接池
 * */