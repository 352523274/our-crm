package com.qy25.sm.mapper;

import com.qy25.sm.entity.goods.Priceadjustform;
import com.qy25.sm.entity.goods.PriceadjustformExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PriceadjustformMapper {
    long countByExample(PriceadjustformExample example);

    int deleteByExample(PriceadjustformExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Priceadjustform record);

    int insertSelective(Priceadjustform record);

    List<Priceadjustform> selectByExample(PriceadjustformExample example);

    Priceadjustform selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Priceadjustform record, @Param("example") PriceadjustformExample example);

    int updateByExample(@Param("record") Priceadjustform record, @Param("example") PriceadjustformExample example);

    int updateByPrimaryKeySelective(Priceadjustform record);

    int updateByPrimaryKey(Priceadjustform record);
}