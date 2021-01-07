package com.qy25.sm.entity.goods;

import com.qy25.sm.entity.base.BaseEntity;
import lombok.Data;

import java.util.Date;

@Data
public class Giftconvertgoodsform extends BaseEntity<Long> {


    private Long giftId;

    private Long goodsId;

    private Long convertNum;

    private String remark;

    private Long auditId;

    private Integer aduitStatus;



}