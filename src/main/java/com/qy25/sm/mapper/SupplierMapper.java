package com.qy25.sm.mapper;

import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.Supplier;
import com.qy25.sm.entity.SupplierExample;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.mapper.base.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SupplierMapper extends BaseMapper<Supplier,Long> {
  List<Goods>  getAddGoods(Long supplierId);

}