package com.qy25.sm.service.impl;

import com.qy25.sm.dto.GoodsSearchPageDto;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.entity.goods.GoodsExample;
import com.qy25.sm.mapper.GoodsMapper;
import com.qy25.sm.service.BrandService;
import com.qy25.sm.service.GoodsService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsServiceImpl extends BaseServiceImpl<Goods,Long> implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public PageVo<Goods> getPageWithExample(GoodsSearchPageDto goodsSearchPageDto) {
        GoodsExample goodsExample = new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if (goodsSearchPageDto.getGoodsBrandId()!=-1){

        }
//        goodsMapper.selectByExample()
        return null;
    }
}
