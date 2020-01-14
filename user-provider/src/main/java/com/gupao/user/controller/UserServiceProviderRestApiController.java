package com.gupao.user.controller;

import com.gupao.user.domain.User;
import com.gupao.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserServiceProviderRestApiController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/saveUser")
    public User saveUser(@RequestBody User user){
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
