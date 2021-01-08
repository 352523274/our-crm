package com.qy25.sm.service.sell;

import com.qy25.sm.entity.sell.SellOrder;
import com.qy25.sm.vo.PageVo;
import com.qy25.sm.vo.SellVo;

public interface SellOrderService {
    PageVo<SellVo> findAll();
}
