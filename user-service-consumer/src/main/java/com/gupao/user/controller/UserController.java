package com.gupao.user.controller;

import com.gupao.user.domain.User;
import com.gupao.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/saveUser")
    public User saveUser(@RequestParam String name){
        User user = new User();
        user.setName(name);
        if(userService.save(user)){
            return user;
        }else{
            return null;
        }
    }

    @RequestMapping("/user/list")
    public Collection<User> list(){
        return userService.findAll();
    }
}
