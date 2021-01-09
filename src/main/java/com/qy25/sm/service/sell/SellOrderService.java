package com.qy25.sm.service.sell;

import com.qy25.sm.entity.sell.SellOrder;
import com.qy25.sm.vo.ConsigneeVo;
import com.qy25.sm.vo.PageVo;
import com.qy25.sm.vo.SellVo;

import java.util.List;

public interface SellOrderService {
    PageVo<SellVo> findAll();

    SellVo findById(long id);

    ConsigneeVo findDetailById(long id);
}
