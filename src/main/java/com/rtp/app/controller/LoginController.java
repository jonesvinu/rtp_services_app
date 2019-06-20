package com.rtp.app.controller;

import com.rtp.app.domain.Users;
import com.rtp.app.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController(value = "/login")
public class LoginController {

    private UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "";
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users users){
        return userService.register(users);
    }


}