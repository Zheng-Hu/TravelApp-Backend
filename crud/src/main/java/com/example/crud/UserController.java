package com.example.crud;

import com.example.crud.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class UserController {


    @Resource
    UserMapper userMapper;

    @PostMapping("/login")
    public User login(@RequestBody User user, HttpServletRequest request) {
        User dbUser = userMapper.getUserByNameAndPassword(user.getName(), user.getPassword());
        return dbUser;
    }


}
