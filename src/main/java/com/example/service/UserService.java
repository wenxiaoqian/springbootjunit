package com.example.service;

import com.example.bean.User;
import com.example.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author xiaoqian.wen
 * @create 2017-02-28 11:16
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int addUser(User user){
        return userMapper.addUser(user);
    }

    public User findOne(long id){
        return userMapper.findOne(id);
    }
}
