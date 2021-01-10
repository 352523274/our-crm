package com.qy25.sm.service;

import com.qy25.sm.dto.SupplierSearchPageDto;
import com.qy25.sm.entity.Supplier;
import com.qy25.sm.entity.goods.Firstgoods;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.service.base.BaseService;
import com.qy25.sm.vo.PageVo;

import java.util.List;

public interface SupplierService extends BaseService<Supplier,Long> {
    PageVo<Supplier> getPageWithExample(SupplierSearchPageDto obj);

    List<Goods> getAddGoods(Long supplierId);

    int addGoods(Long id, List<Long> ids);

    int deletesuppgoodsById(List<Long> ids);
}
