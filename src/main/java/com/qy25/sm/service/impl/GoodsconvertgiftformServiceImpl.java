package com.qy25.sm.service.impl;

import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.goods.Goodsconvertgiftform;
import com.qy25.sm.service.BrandService;
import com.qy25.sm.service.GoodsconvertgiftformService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsconvertgiftformServiceImpl extends BaseServiceImpl<Goodsconvertgiftform,Long> implements GoodsconvertgiftformService {
}
