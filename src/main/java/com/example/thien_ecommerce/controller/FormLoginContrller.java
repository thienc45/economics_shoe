package com.example.thien_ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormLoginContrller {
    @GetMapping("/login")
    public  String formLogin(){
        return  "dang-nhap";
    }
}
