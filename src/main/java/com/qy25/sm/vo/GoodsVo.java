package com.qy25.sm.vo;

import com.qy25.sm.entity.goods.Goods;
import lombok.Data;

@Data
public class GoodsVo extends Goods {
    //goodsCatagoryId  goodsBrandId  goodsColorId
    private String goodsCatagory;
    private String goodsBrand;
    private String goodsColor;

}
