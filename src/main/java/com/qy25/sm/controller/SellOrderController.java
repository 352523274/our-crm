package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.service.sell.SellOrderService;
import com.qy25.sm.vo.PageVo;
import com.qy25.sm.vo.SellVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("sellOrder")
public class SellOrderController {
    @Autowired
    private SellOrderService sellOrderService;

    @GetMapping
    public AxiosResult<PageVo> findAll(@RequestParam(defaultValue = "1") int currentPage,
                                       @RequestParam(defaultValue = "5") int pageSize){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<SellVo> all = sellOrderService.findAll();
        return AxiosResult.success(all);
    }
}
