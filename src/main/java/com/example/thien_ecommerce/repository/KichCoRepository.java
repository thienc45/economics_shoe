package com.example.thien_ecommerce.repository;


import com.example.thien_ecommerce.entity.KichCo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KichCoRepository extends JpaRepository<KichCo,Long> {
//    @Query("SELECT t FROM KichCo t WHERE LOWER(t.ten) LIKE LOWER(CONCAT('%', :keyword, '%')) " +
//            "AND (:trang_thai IS NULL OR t.trangThai = :trang_thai)")
//    Page<ThuongHieu> findByTenContainingAndTrangThai(@Param("keyword") String keyword, @Param("trang_thai") Integer trang_thai, Pageable pageable);
//
//    @Query("SELECT t FROM KichCo t WHERE t.ten = :ten")
//    KichCo findByTen(@Param("ten") Float ten);
}
