package com.example.crud.mapper;

import com.example.crud.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * from user where username = #{name} and password = #{password}")
    User getUserByNameAndPassword(@Param("name") String name, @Param("password") String password);
}