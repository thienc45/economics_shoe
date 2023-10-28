package com.example.thien_ecommerce.repository;

import com.example.thien_ecommerce.entity.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan,Long> {
    Optional<TaiKhoan> findByUsername(String name);
}
