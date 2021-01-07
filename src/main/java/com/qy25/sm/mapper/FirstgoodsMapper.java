package com.qy25.sm.mapper;

import com.qy25.sm.entity.goods.Firstgoods;
import com.qy25.sm.entity.goods.FirstgoodsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FirstgoodsMapper {
    long countByExample(FirstgoodsExample example);

    int deleteByExample(FirstgoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Firstgoods record);

    int insertSelective(Firstgoods record);

    List<Firstgoods> selectByExample(FirstgoodsExample example);

    Firstgoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Firstgoods record, @Param("example") FirstgoodsExample example);

    int updateByExample(@Param("record") Firstgoods record, @Param("example") FirstgoodsExample example);

    int updateByPrimaryKeySelective(Firstgoods record);

    int updateByPrimaryKey(Firstgoods record);
}