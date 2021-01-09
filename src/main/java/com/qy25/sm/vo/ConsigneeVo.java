package com.qy25.sm.vo;

import com.qy25.sm.entity.sell.Consignee;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ConsigneeVo {
    private Consignee consignee;
    private String goodsName;
    private BigDecimal shoppingPrice;
    private Long id;

}
