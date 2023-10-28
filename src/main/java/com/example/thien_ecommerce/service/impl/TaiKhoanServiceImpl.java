package com.example.thien_ecommerce.service.impl;

import com.example.thien_ecommerce.entity.TaiKhoan;
import com.example.thien_ecommerce.repository.TaiKhoanRepository;
import com.example.thien_ecommerce.service.TaiKhoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {

    @Autowired
    private TaiKhoanRepository repository;


    @Autowired
    private PasswordEncoder passwordEncoder;

    public String addUser(TaiKhoan userInfo) {
        userInfo.setPassword(passwordEncoder.encode(userInfo.getPassword()));
        repository.save(userInfo);
        return "user added to system ";
    }
}
