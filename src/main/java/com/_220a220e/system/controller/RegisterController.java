package com._220a220e.system.controller;

import com._220a220e.system.entity.SysUser;
import com._220a220e.system.service.SysUserService;
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
    private SysUserService sysUserService;

    @GetMapping("/user")
    public String main() {
        return "/register/main";
    }

    @PostMapping("/")
    public String register(SysUser user) {
        sysUserService.saveRegisterUser(user);
        return "";
    }
}
