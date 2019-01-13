package com._220a220e.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Garrosh
 * @date 2018/6/2
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping("/")
    public String main(Model model) {
        model.addAttribute("aaaaa","Hello World");
        return "/index";
    }

}
