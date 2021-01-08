package com.qy25.sm.mapper.sell;


import com.qy25.sm.entity.sell.SellOrder;
import com.qy25.sm.entity.sell.SellOrderExample;
import com.qy25.sm.vo.SellVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SellOrderMapper {
    long countByExample(SellOrderExample example);

    int deleteByExample(SellOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SellOrder record);

    int insertSelective(SellOrder record);

    List<SellVo> selectByExample();

    SellVo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SellOrder record, @Param("example") SellOrderExample example);

    int updateByExample(@Param("record") SellOrder record, @Param("example") SellOrderExample example);

    int updateByPrimaryKeySelective(SellOrder record);

    int updateByPrimaryKey(SellOrder record);
}