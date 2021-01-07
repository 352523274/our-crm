package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.dto.GoodsSearchPageDto;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.service.GoodsService;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("goods")
public class GoodsController extends BaseController<Goods,Long> {
    @Autowired
    private GoodsService goodsService;
    /**
     * 分页条件查询
     */
    @GetMapping("getPageWithExample")
    public AxiosResult<PageVo<Goods>> getPageWithExample(@RequestParam(defaultValue = "1") int currentPage,
                                                         @RequestParam(defaultValue = "5") int pageSize,
                                                         GoodsSearchPageDto goodsSearchPageDto){
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Goods> l= goodsService.getPageWithExample(goodsSearchPageDto);
        return AxiosResult.success(l);
    }
}
