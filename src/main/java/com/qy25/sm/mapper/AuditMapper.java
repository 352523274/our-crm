package com.qy25.sm.mapper;

import com.qy25.sm.entity.goods.Audit;
import com.qy25.sm.entity.goods.AuditExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuditMapper {
    long countByExample(AuditExample example);

    int deleteByExample(AuditExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Audit record);

    int insertSelective(Audit record);

    List<Audit> selectByExample(AuditExample example);

    Audit selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Audit record, @Param("example") AuditExample example);

    int updateByExample(@Param("record") Audit record, @Param("example") AuditExample example);

    int updateByPrimaryKeySelective(Audit record);

    int updateByPrimaryKey(Audit record);
}