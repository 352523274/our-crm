package com.qy25.sm.mapper;

import com.qy25.sm.entity.goods.Saleseventgoods;
import com.qy25.sm.entity.goods.SaleseventgoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SaleseventgoodsMapper {
    long countByExample(SaleseventgoodsExample example);

    int deleteByExample(SaleseventgoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Saleseventgoods record);

    int insertSelective(Saleseventgoods record);

    List<Saleseventgoods> selectByExample(SaleseventgoodsExample example);

    Saleseventgoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Saleseventgoods record, @Param("example") SaleseventgoodsExample example);

    int updateByExample(@Param("record") Saleseventgoods record, @Param("example") SaleseventgoodsExample example);

    int updateByPrimaryKeySelective(Saleseventgoods record);

    int updateByPrimaryKey(Saleseventgoods record);
}