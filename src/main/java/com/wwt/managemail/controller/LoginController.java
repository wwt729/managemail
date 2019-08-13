package com.wwt.managemail.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class LoginController {
    @PostMapping("/login")
    public String test(){
        System.out.println("true = " + true);
        return "";
    }
}
