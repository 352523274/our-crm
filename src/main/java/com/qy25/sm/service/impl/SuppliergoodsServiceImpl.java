package com.qy25.sm.service.impl;

import com.qy25.sm.entity.goods.Suppliergoods;
import com.qy25.sm.service.SuppliergoodsService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SuppliergoodsServiceImpl extends BaseServiceImpl<Suppliergoods,Long> implements SuppliergoodsService {
}
