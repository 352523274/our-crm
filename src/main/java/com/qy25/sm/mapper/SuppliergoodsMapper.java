package com.qy25.sm.mapper;

import com.qy25.sm.entity.goods.Suppliergoods;
import com.qy25.sm.entity.goods.SuppliergoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SuppliergoodsMapper {
    long countByExample(SuppliergoodsExample example);

    int deleteByExample(SuppliergoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Suppliergoods record);

    int insertSelective(Suppliergoods record);

    List<Suppliergoods> selectByExample(SuppliergoodsExample example);

    Suppliergoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Suppliergoods record, @Param("example") SuppliergoodsExample example);

    int updateByExample(@Param("record") Suppliergoods record, @Param("example") SuppliergoodsExample example);

    int updateByPrimaryKeySelective(Suppliergoods record);

    int updateByPrimaryKey(Suppliergoods record);
}