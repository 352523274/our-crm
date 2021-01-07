package com.qy25.sm.mapper;

import com.qy25.sm.entity.goods.Giftconvertgoodsform;
import com.qy25.sm.entity.goods.GiftconvertgoodsformExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftconvertgoodsformMapper {
    long countByExample(GiftconvertgoodsformExample example);

    int deleteByExample(GiftconvertgoodsformExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Giftconvertgoodsform record);

    int insertSelective(Giftconvertgoodsform record);

    List<Giftconvertgoodsform> selectByExample(GiftconvertgoodsformExample example);

    Giftconvertgoodsform selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Giftconvertgoodsform record, @Param("example") GiftconvertgoodsformExample example);

    int updateByExample(@Param("record") Giftconvertgoodsform record, @Param("example") GiftconvertgoodsformExample example);

    int updateByPrimaryKeySelective(Giftconvertgoodsform record);

    int updateByPrimaryKey(Giftconvertgoodsform record);
}