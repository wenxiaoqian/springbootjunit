package com.example;

import com.example.bean.User;
import com.example.service.UserService;
import org.junit.Assert;
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.boot.test.context.SpringBootTest;  
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;


@RunWith(SpringRunner.class)  
@SpringBootTest  
public class SpringbootH2ApplicationTests {  
  
    @Autowired  
    private UserService userService;

    @Test
    public void addUser(){
        User user = User.of().setName("wenxq").setUsername("wenxq").setAge(10).setBalance(new BigDecimal(20));
        userService.addUser(user);
    }

    @Test  
    public void test(){  
        User u = userService.findOne(2L);
        Assert.assertEquals("成功的测试用例", "wenxq", u.getName());
    }  
}  