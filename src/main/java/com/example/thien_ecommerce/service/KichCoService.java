package com.example.thien_ecommerce.service;

import com.example.thien_ecommerce.entity.KichCo;
import org.springframework.data.domain.Page;
import java.util.List;


public interface KichCoService {
    List<KichCo> getAll();

    KichCo add(KichCo kichCo);

    KichCo update(KichCo kichCo);

    void remove(Long id);

    KichCo getById(Long id);

    Page<KichCo> getPage(Integer pageNo);

    Integer checkPageNo(Integer pageNo);

    Integer genMaTuDong();

    boolean checkTenTrung(Integer ten);

    boolean checkTenTrungSua(Long id, Integer ten);
}

