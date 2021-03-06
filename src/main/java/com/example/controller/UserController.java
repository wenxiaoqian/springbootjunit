package com.example.controller;

import com.example.bean.User;
import com.example.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author xiaoqian
 */
@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userService.findOne(id);
    }

    @GetMapping("/user/add")
    public String addUser(){
        User user = User.of().setName("wenxq4").setUsername("wenxq").setAge(10).setBalance(new BigDecimal(20));
        userService.addUser(user);
        log.info("user name:" + user.getName());
        return "success4";
    }

}  