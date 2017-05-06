package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xiaoqian.wen
 * @create 2017-03-16 10:09
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private StringRedisTemplate redisTemplate;

    @Test
    public void testAdd(){
        redisTemplate.opsForValue().set("youname", "wenzijie");
    }

    @Test
    public void testGet(){
        String str = redisTemplate.opsForValue().get("youname");

        Assert.assertEquals("wenzijie", str);
    }

}
