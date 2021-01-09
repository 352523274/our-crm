package com.qy25.sm.service.impl;

import com.qy25.sm.entity.Brand;
import com.qy25.sm.mapper.BrandMapper;
import com.qy25.sm.service.BrandService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BrandServiceImpl extends BaseServiceImpl<Brand,Long> implements BrandService {

    @Autowired
    private BrandMapper brandMapper;
    @Override
    public List<Brand> findAllWithoutExampleAndPage() {
        return brandMapper.selectByExample(null);
    }
}
