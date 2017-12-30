package com.example.mapper;

import com.example.entity.User;
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

    int addUser(User user);

    User findOne(@Param("id") long id);

}
