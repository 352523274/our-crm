package com.qy25.sm.entity.goods;

import lombok.Data;

import java.util.Date;


@Data
public class Firstgoods {
    private Long id;

    private String name;

    private String brand;

    private String catagory;

    private String model;

    private String color;

    private Date addTime;

    private Long creatorId;

    private Date updateTime;

    private Long updateId;

    private String purchaseType;

    private boolean isDistribution;

    private boolean isSpare;

    private String goodsCode;


}