package com.imooc.springboot;

import com.imooc.springboot.unittest.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @author 刘水镜
 * @blog https://liushuijinger.blog.csdn.net
 * @date 2019/07/07
 */
@Api
@RestController
@RequestMapping("/rest")
public class RestFulController {

    @ApiOperation(value = "根据id获取用户信息")
    @GetMapping("/user/{id}")
    public com.imooc.springboot.unittest.User get(@PathVariable int id) {

        // 演示代码，实际开发需要与数据库交互
        com.imooc.springboot.unittest.User user = new com.imooc.springboot.unittest.User();
        user.setId(id);
        user.setName("ID为"+id+"的用户");
        user.setAge(18);
        user.setEmail("imooc@imooc.com");
        return user;
    }

    @ApiOperation(value = "创建用户")
    @PostMapping("/user")
    public boolean create(@RequestBody com.imooc.springboot.unittest.User user) {
        // 演示代码，实际开发需要与数据库交互
        if (user != null) {
            return true;
        }
        return false;
    }

    @ApiOperation(value = "更新用户")
    @PutMapping("/user")
    public boolean update(@RequestBody User user) {
        // 演示代码，实际开发需要与数据库交互
        if (user != null) {
            return true;
        }
        return false;
    }

    @ApiOperation(value = "删除用户")
    @DeleteMapping("/user/{id}")
    public boolean delete(@PathVariable int id) {
        // 演示代码，实际开发需要与数据库交互
        if (id > 0) {
            return true;
        }
        return false;
    }
}
