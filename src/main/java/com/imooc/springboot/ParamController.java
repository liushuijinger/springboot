package com.imooc.springboot;

import com.imooc.springboot.unittest.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Spring MVC接收参数的方式
 *
 * @author 刘水镜
 * @blog https://liushuijinger.blog.csdn.net
 * @date 2019/06/23
 */
@Api
@RestController
public class ParamController {

    @ApiOperation(value = "无注解方式")
    @GetMapping("/noannotation")
    public com.imooc.springboot.unittest.User noAnnotation(com.imooc.springboot.unittest.User user) {
        return user;
    }

    @ApiOperation(value = "@RequestParam方式")
    @GetMapping("/requestparam")
    public com.imooc.springboot.unittest.User RequestParam(@RequestParam String name, @RequestParam int age) {
        com.imooc.springboot.unittest.User user = new com.imooc.springboot.unittest.User();
        user.setName(name);
        user.setAge(age);
        return user;
    }
    @ApiOperation(value = "@PathVariable方式")
    @GetMapping("/pathvariable/{name}/{age}")
    public com.imooc.springboot.unittest.User PathVariable(@PathVariable String name, @PathVariable int age) {
        com.imooc.springboot.unittest.User user = new com.imooc.springboot.unittest.User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    @ApiOperation(value = "@RequestBody方式")
    @PostMapping("/requestbody")
    public com.imooc.springboot.unittest.User RequestBody(@RequestBody @Valid User user) {
        return user;
    }
}
