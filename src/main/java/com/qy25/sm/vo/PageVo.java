package com.qy25.sm.vo;

import com.github.pagehelper.PageInfo;
import lombok.Data;

import java.util.List;

@Data
public class PageVo<T> {
    private long total;
    private List<T> list;
}
