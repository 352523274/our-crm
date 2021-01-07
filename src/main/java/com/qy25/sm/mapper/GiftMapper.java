package com.qy25.sm.mapper;

import com.qy25.sm.entity.goods.Gift;
import com.qy25.sm.entity.goods.GiftExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GiftMapper {
    long countByExample(GiftExample example);

    int deleteByExample(GiftExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Gift record);

    int insertSelective(Gift record);

    List<Gift> selectByExample(GiftExample example);

    Gift selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Gift record, @Param("example") GiftExample example);

    int updateByExample(@Param("record") Gift record, @Param("example") GiftExample example);

    int updateByPrimaryKeySelective(Gift record);

    int updateByPrimaryKey(Gift record);
}