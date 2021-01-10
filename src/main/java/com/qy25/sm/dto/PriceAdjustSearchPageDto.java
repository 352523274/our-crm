package com.qy25.sm.dto;


import lombok.Data;

import java.util.Date;

@Data
public class PriceAdjustSearchPageDto {
    private String goodsName;
    private Integer aduitStatus;
    private Date hopeEffectiveDate;
    private Date hopeExpiryDate;

}
