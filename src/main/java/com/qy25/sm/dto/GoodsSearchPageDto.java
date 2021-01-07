package com.qy25.sm.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class GoodsSearchPageDto {
    private String goodsName;
    private String goodsModel;
    private Long goodsColorId;
    private Long goodsBrandId;
    private Long goodsCategoryId;

}
