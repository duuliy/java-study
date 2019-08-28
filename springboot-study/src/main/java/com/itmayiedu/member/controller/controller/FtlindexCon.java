package com.itmayiedu.member.controller.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class FtlindexCon {

    @RequestMapping("/ftlindex")
    public String ftlindex(Map<String,Object> map){
        map.put("name","duuliy");
        map.put("age","20");
        map.put("sex","1");
        return "ftlindex";
    }

}


/**
 * @Controller 处理http请求
 *
 * */