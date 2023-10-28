package com.example.thien_ecommerce.repository;


import com.example.thien_ecommerce.entity.MauSac;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface MauSacRepository extends JpaRepositoryImplementation<MauSac,Long> {
//    @Query("SELECT t FROM MauSac t WHERE LOWER(t.ten) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
//            "AND (:trang_thai IS NULL OR t.trangThai = :trang_thai)")
//    Page<MauSac> findByTenContainingAndTrangThai(@Param("keyword") String keyword, @Param("trang_thai") Integer trang_thai, Pageable pageable);
//
//    @Query("SELECT t FROM MauSac t WHERE t.ten = :ten")
//    MauSac findByTen(@Param("ten") String ten);
//
    @Query(value = "SELECT MAX(CONVERT(varchar, SUBSTRING(ma_mau,3,10))) from mau_sac",nativeQuery = true)
    Integer index();
}
