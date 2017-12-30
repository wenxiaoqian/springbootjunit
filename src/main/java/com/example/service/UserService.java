package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xiaoqian.wen
 * @create 2017-02-28 11:16
 **/
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    public void addUser(User user){
        userMapper.addUser(user);

        addChild(user);
    }

    public void addChild(User user){
        user.setUsername("wenzijie");
        user.setAge(3);
        userMapper.addUser(user);
    }

    public User findOne(long id){
        return userMapper.findOne(id);
    }
}
