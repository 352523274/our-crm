package com.qy25.sm.entity.goods;

import com.qy25.sm.entity.base.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Goods extends BaseEntity<Long> {


    private Long firstGoodsId;

    private Long giftId;

    private String goodsName;

    private Long goodsBrandId;

    private Long goodsCatagoryId;

    private String goodsModel;

    private Long goodsColorId;

    private BigDecimal marketPrice;

    private BigDecimal shoppingPrice;

    private String tranceMessage;

    private String goodsSupplierId;

    private String purchaseDept;

    private BigDecimal purchasePrice;

    private Long stock;

    private Long minStock;

    private Boolean canPurchase;


}