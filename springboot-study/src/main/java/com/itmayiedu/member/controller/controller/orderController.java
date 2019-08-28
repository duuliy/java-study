package com.itmayiedu.member.controller.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class orderController {

        @RequestMapping("/order")
        String home() {
            return "Hello order!";
        }



}
