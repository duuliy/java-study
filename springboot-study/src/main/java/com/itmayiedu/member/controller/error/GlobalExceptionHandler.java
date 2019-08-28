package com.itmayiedu.member.controller.error;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages="com.itmayiedu.member.controller")
public class GlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<String,Object> errorResult(){
        //大公司会把错误记录在日志中，发邮件。
        Map<String,Object> errorResultMap=new HashMap<String,Object>();
        errorResultMap.put("errorCode","500");
        errorResultMap.put("errorNsg","全局捕获异常系统错误!");
        return errorResultMap;
    }

}


/**
 * 全局异常捕获
 * 1.捕获返回json格式
 * 2.捕获返回页面
 *
 * @ControllerAdvice 全局异常捕获注入
 * @ResponseBody 返回Json
 * @ExceptionHandler 异常捕获点  RuntimeException.class运行时的异常
 *
 * */