package com.itmayiedu.member.controller.controller;


import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {
    @ApiOperation(value = "资产状态跃迁", notes = "传入实体对象信息")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Integer.class, responseContainer = "actionResponse"), })
    @RequestMapping("/getUser")
    String getUser(@ApiParam(value = "statusJumpRequest")int i){
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
