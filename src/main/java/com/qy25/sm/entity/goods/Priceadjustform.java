package com.qy25.sm.entity.goods;

import com.qy25.sm.entity.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Priceadjustform extends BaseEntity<Long> {
    private Long goodsId;

    private String goodsName;

    private Long marketPrice;

    private Long shoppingPrice;

    private Long stock;

    private BigDecimal adjustedMarketPrice;

    private BigDecimal adjustedShoppingPrice;

    private Date hopeEffectiveDate;

    private Date hopeExpiryDate;

    private String adjustReason;

    private String remark;

    private Long auditId;

    private Integer aduitStatus;



}