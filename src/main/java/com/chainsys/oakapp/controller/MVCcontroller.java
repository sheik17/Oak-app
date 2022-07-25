package com.chainsys.oakapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCcontroller {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}