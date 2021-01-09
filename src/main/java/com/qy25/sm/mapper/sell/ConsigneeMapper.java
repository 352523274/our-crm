package com.qy25.sm.mapper.sell;

import com.qy25.sm.entity.sell.Consignee;
import com.qy25.sm.entity.sell.ConsigneeExample;
import com.qy25.sm.vo.ConsigneeVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConsigneeMapper {
    long countByExample(ConsigneeExample example);

    int deleteByExample(ConsigneeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Consignee record);

    int insertSelective(Consignee record);

    List<ConsigneeVo> selectByExample();

    List<ConsigneeVo> selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Consignee record, @Param("example") ConsigneeExample example);

    int updateByExample(@Param("record") Consignee record, @Param("example") ConsigneeExample example);

    int updateByPrimaryKeySelective(Consignee record);

    int updateByPrimaryKey(Consignee record);
}