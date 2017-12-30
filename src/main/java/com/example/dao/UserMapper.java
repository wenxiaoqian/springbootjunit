package com.example.dao;

import com.example.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author xiaoqian.wen
 * @create 2017-03-15 15:47
 **/
@Mapper
public interface UserMapper {

    @Insert("insert into user(username,name,age,balance) values(#{name},#{username},#{age},#{balance})")
    int addUser(User user);

    @Select("select * from user where id = #{id} limit 1")
    User findOne(@Param("id") long id);

}
