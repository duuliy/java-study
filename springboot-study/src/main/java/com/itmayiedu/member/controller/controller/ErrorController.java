package com.itmayiedu.member.controller.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    @RequestMapping("/getUser")
    String getUser(int i){
        int j=1/i;
        return "success"+j;
    }
}


/**
 * 全局捕获异常
 *
 * 在页面输入地址后?i=1  就能拿到参数i
 *
 * */
