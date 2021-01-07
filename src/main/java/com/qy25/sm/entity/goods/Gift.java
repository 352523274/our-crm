package com.qy25.sm.entity.goods;

import com.qy25.sm.entity.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Gift extends BaseEntity<Long> {

    private Long goodsId;

    private String giftsName;

    private Long giftsBrandId;

    private Long giftsCatagoryId;

    private String giftsModel;

    private String giftsColor;

    private BigDecimal marketPrice;

    private BigDecimal shoppingPrice;

    private Long purchaseDeptId;

    private BigDecimal purchasePrice;

    private Long stock;

    private Long minStock;

    private Boolean canPurchase;

}