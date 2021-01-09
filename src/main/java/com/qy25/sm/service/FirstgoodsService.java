package com.qy25.sm.service;

import com.qy25.sm.dto.FirstGoodsSearchPageDto;
import com.qy25.sm.entity.goods.Firstgoods;
import com.qy25.sm.service.base.BaseService;
import com.qy25.sm.vo.PageVo;

public interface FirstgoodsService extends BaseService<Firstgoods,Long> {
    PageVo<Firstgoods> getPageWithExample(FirstGoodsSearchPageDto obj);
}
