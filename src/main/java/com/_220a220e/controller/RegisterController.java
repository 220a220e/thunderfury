package com._220a220e.controller;

import com._220a220e.system.entity.User;
import com._220a220e.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Garrosh
 * @date 2018/6/3
 */
@Controller
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String main() {
        return "/register/main";
    }

    @PostMapping("/")
    public String register(User user) {
        userService.saveRegisterUser(user);
        return "";
    }
}
