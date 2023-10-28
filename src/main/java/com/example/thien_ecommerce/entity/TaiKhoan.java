package com.example.thien_ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tai_khoan")
public class TaiKhoan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;


    @Column(name = "password", length = 255)
    private String password;

    @Column(name = "username", length = 255)
    @NotBlank(message = "Họ và tên không được trống")
    private String username;

    @Column(name = "so_dien_thoai", length = 15)
    @NotBlank(message = "Số điện thoai không được trống")
    @Pattern(regexp = "^0\\d{9,10}", message = "SĐT phải là số và bắt đầu bằng 0 và có 10-11 số")
    private String soDienThoai;

    @Column(name = "email", length = 255)
    @NotBlank(message = "Email không được trống")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(.+)$", message = "Email không hợp lệ")
    private String email;

    @Column(name = "dia_chi_cu_the", length = 100)
    @NotBlank(message = "Địa chỉ cụ thể không được trống")
    private String diaChiCuThe;

    @Column(name = "ngay_tao")
    private Date ngayTao;

    @Column(name = "ngay_sua")
    private Date ngaySua;

    @Column(name = "trang_thai")
    private Integer trangThai;

    @ManyToOne
//   (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//   dùng cái này không xóa đến bảng con cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    @JoinColumn(name = "vai_tro_id", referencedColumnName = "id")
    private VaiTro vaiTro;

}
