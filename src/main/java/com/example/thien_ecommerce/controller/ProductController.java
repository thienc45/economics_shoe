package com.example.thien_ecommerce.controller;


import com.example.thien_ecommerce.entity.TaiKhoan;
import com.example.thien_ecommerce.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    TaiKhoanService service;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }

    @PostMapping("/new")
    public String addNewUser(@RequestBody TaiKhoan userInfo) {
        return service.addUser(userInfo);
    }

//    @GetMapping("/admin")
//    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
//    public String getAllTheProducts() {
//        return "admin";
//    }
//
//    @GetMapping("/user")
//    @PreAuthorize("hasAuthority('ROLE_USER')")
//    public String getProductById() {
//        return "User";
//    }
}
