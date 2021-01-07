package com.qy25.sm.service;

import com.qy25.sm.dto.GoodsSearchPageDto;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.service.base.BaseService;
import com.qy25.sm.vo.PageVo;

public interface GoodsService extends BaseService<Goods,Long> {
    PageVo<Goods> getPageWithExample(GoodsSearchPageDto goodsSearchPageDto);
}
