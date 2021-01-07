package com.qy25.sm.entity.goods;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Goods {

    private Long firstGoodsId;

    private Long giftId;

    private String goodsName;

    private Long goodsBrandId;

    private Long goodsCatagoryId;

    private String goodsModel;

    private String goodsColor;

    private BigDecimal marketPrice;

    private BigDecimal shoppingPrice;

    private String tranceMessage;

    private String goodsSupplier;

    private Long purchaseDeptId;

    private BigDecimal purchasePrice;

    private Long stock;

    private Long minStock;

    private Boolean canPurchase;


}