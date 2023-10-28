package com.example.thien_ecommerce.service.impl;

import com.example.thien_ecommerce.entity.KichCo;
import com.example.thien_ecommerce.repository.KichCoRepository;
import com.example.thien_ecommerce.service.KichCoService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class KichCoServiceImpl implements KichCoService {
    @Autowired
    KichCoRepository kichCoRepository;


    @Override
    public List<KichCo> getAll() {
        return kichCoRepository.findAll();
    }

    @Override
    public KichCo add(KichCo kichCo) {
        return kichCoRepository.save(kichCo);
    }

    @Override
    public KichCo update(KichCo kichCo) {
        return kichCoRepository.save(kichCo);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public KichCo getById(Long id) {
        return kichCoRepository.findById(id).get();
    }

    @Override
    public Page<KichCo> getPage(Integer pageNo) {
        return kichCoRepository.findAll(PageRequest.of(pageNo, 5));
    }

    @Override
    public Integer checkPageNo(Integer pageNo) {
        Integer sizeList = kichCoRepository.findAll().size();
        Integer pageCount = (int) Math.ceil((double) sizeList / 5);
        if (pageNo >= pageCount) {
            pageNo = 0;
        } else if (pageNo < 0) {
            pageNo = pageCount - 1;
        }
        return pageNo;
    }

    @Override
    public Integer genMaTuDong() {
        return null;
    }

    @Override
    public boolean checkTenTrung(Integer ten) {
        if (ten == null) {
            return false; // No need to check for duplicates if ten is null
        }
        for (KichCo sp : kichCoRepository.findAll()) {
            if (sp.getTen().equals(ten)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkTenTrungSua(Long id, Integer ten) {
        if (ten == null) {
            return false; // No need to check for duplicates if ten is null
        }
        for (KichCo sp : kichCoRepository.findAll()) {
            if (sp.getTen().equals(ten)) {
                if (!sp.getId().equals(id)) {
                    return false;
                }
            }
        }
        return true;
    }
}
