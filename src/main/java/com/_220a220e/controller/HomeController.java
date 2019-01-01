package com._220a220e.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Garrosh
 * @date 2018/6/2
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = {"/", "/index", "/index.html"})
    public String main() {
        return "index";
    }
}
