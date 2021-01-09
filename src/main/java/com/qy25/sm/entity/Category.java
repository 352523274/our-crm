package com.qy25.sm.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.qy25.sm.entity.base.BaseEntity;
import lombok.Data;

import java.util.List;

@Data
public class Category extends BaseEntity<Long> {

    private String categoryName;

    private String categoryDesc;

    private Long parentId;

    private Boolean isParent;

    private List<Category> children;


}