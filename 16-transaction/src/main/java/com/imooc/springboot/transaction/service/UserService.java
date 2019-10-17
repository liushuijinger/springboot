package com.imooc.springboot.transaction.service;

import com.imooc.springboot.transaction.mapper.UserMapper;
import com.imooc.springboot.transaction.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 刘水镜
 * @blog https://liushuijinger.blog.csdn.net
 * @date 2019/10/14
 */
@Slf4j
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
    public void batchInsert() {
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setAge(i);
            user.setName("xiaoming"+i);
            user.setEmail("sfsdf"+i);
            insert(user);
        }
        log.info("run methon a" + AopUtils.isAopProxy(userService));
    }
}
