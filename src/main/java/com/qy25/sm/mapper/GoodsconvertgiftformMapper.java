package com.qy25.sm.mapper;

import com.qy25.sm.entity.goods.Goodsconvertgiftform;
import com.qy25.sm.entity.goods.GoodsconvertgiftformExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsconvertgiftformMapper {
    long countByExample(GoodsconvertgiftformExample example);

    int deleteByExample(GoodsconvertgiftformExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Goodsconvertgiftform record);

    int insertSelective(Goodsconvertgiftform record);

    List<Goodsconvertgiftform> selectByExample(GoodsconvertgiftformExample example);

    Goodsconvertgiftform selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Goodsconvertgiftform record, @Param("example") GoodsconvertgiftformExample example);

    int updateByExample(@Param("record") Goodsconvertgiftform record, @Param("example") GoodsconvertgiftformExample example);

    int updateByPrimaryKeySelective(Goodsconvertgiftform record);

    int updateByPrimaryKey(Goodsconvertgiftform record);
}