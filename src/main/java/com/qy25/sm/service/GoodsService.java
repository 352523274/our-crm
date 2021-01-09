package com.qy25.sm.service;

import com.qy25.sm.dto.GoodsSearchPageDto;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.entity.goods.Goodscolor;
import com.qy25.sm.service.base.BaseService;
import com.qy25.sm.vo.GoodsVo;
import com.qy25.sm.vo.PageVo;

import java.util.List;

public interface GoodsService extends BaseService<Goods,Long> {
    PageVo<GoodsVo> getPageWithExample(int currentPage,int pageSize,GoodsSearchPageDto goodsSearchPageDto);

    List<Goodscolor> findAllColor();


    GoodsVo findGoodsVoById(long id);
}
