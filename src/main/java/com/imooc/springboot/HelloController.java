package com.imooc.springboot;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class HelloController {

    @ApiOperation(value = "Hello Spring Boot 方法")
    @GetMapping("/")
    public String hello(@RequestParam(required = false) @ApiParam("名字") String name) {
        if (name != null && !"".equals(name)) {
            return "Hello " + name;
        }
        return "Hello Spring Boot";
    }
}
