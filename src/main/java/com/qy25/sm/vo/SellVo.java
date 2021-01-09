package com.qy25.sm.vo;

import com.qy25.sm.entity.sell.SellOrder;
import lombok.Data;

@Data
public class SellVo {
    private String typeName;
    private String deliveryName;
    private String statusName;
    private SellOrder sellOrder;
}
