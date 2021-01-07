package com.qy25.sm.service.impl;

import com.qy25.sm.entity.goods.Firstgoods;
import com.qy25.sm.service.FirstgoodsService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FirstgoodsServiceImpl extends BaseServiceImpl<Firstgoods,Long> implements FirstgoodsService {
}
