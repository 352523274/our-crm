package com.qy25.sm.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.qy25.sm.dto.FirstGoodsSearchPageDto;
import com.qy25.sm.entity.goods.Firstgoods;
import com.qy25.sm.entity.goods.FirstgoodsExample;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.entity.goods.GoodsExample;
import com.qy25.sm.mapper.FirstgoodsMapper;
import com.qy25.sm.service.FirstgoodsService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.xml.ws.soap.Addressing;
import java.util.List;

@Service
@Transactional
public class FirstgoodsServiceImpl extends BaseServiceImpl<Firstgoods,Long> implements FirstgoodsService {

    @Autowired
    private FirstgoodsMapper firstgoodsMapper;
    @Override
    public PageVo<Firstgoods> getPageWithExample(FirstGoodsSearchPageDto firstGoodsSearchPageDto) {
        FirstgoodsExample firstgoodsExample = new FirstgoodsExample();
        FirstgoodsExample.Criteria criteria = firstgoodsExample.createCriteria();

//        存货编码查询
        if (!StringUtils.isEmpty(firstGoodsSearchPageDto.getGoodsCode())){
            criteria.andGoodsCodeEqualTo(firstGoodsSearchPageDto.getGoodsCode());
        }
//        基础库型号模糊查询
        if (!StringUtils.isEmpty(firstGoodsSearchPageDto.getModel())){
            criteria.andModelLike("%"+firstGoodsSearchPageDto.getModel()+"%");
        }
//        基础库颜色迷糊查询
        if (!StringUtils.isEmpty(firstGoodsSearchPageDto.getColor())){
            criteria.andColorLike("%"+firstGoodsSearchPageDto.getColor()+"%");
        }
//        基础库品牌模糊查询
        if (!StringUtils.isEmpty(firstGoodsSearchPageDto.getBrand())){
            criteria.andBrandLike("%"+firstGoodsSearchPageDto.getBrand()+"%");
        }
//       基础库分类模糊查询
        if (!StringUtils.isEmpty(firstGoodsSearchPageDto.getCategory())){
            criteria.andCatagoryLike("%"+firstGoodsSearchPageDto.getCategory()+"%");
        }

        List<Firstgoods> goods = firstgoodsMapper.selectByExample(firstgoodsExample);

        return setPageVo(goods);
    }
}
