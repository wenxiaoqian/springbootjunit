package com.example.controller;

import com.example.bean.User;
import com.example.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;


@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user/{id}")
    // 注意，此处使用的是GetMapping注解，该注解的作用类似与@RequestMapping(value="/user/{id}" ,method=RequestMethod.GET)，@PostMapping注解同理
    public User findById(@PathVariable Long id) {
        return this.userMapper.findOne(id);
    }

    @GetMapping("/user/add")
    public String addUser(){
        User user = User.of().setName("wenxq").setUsername("wenxq").setAge(10).setBalance(new BigDecimal(20));
        userMapper.addUser(user);
        return "success";
    }

}  