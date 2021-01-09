package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.dto.FirstGoodsSearchPageDto;
import com.qy25.sm.dto.GoodsSearchPageDto;
import com.qy25.sm.entity.goods.Firstgoods;
import com.qy25.sm.entity.goods.Gift;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.service.FirstgoodsService;
import com.qy25.sm.service.GoodsService;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("firstGoods")
public class FirstGoodsController extends BaseController<Firstgoods,Long> {
    @Autowired
    private FirstgoodsService firstgoodsService;
    /**
     * 分页条件查询
     */
    @PostMapping("getPageWithExample")
    public AxiosResult<PageVo<Firstgoods>> getPageWithExample(@RequestParam(defaultValue = "1") int currentPage,
                                                         @RequestParam(defaultValue = "5") int pageSize,
                                                         @RequestBody FirstGoodsSearchPageDto obj){
        System.out.println(obj);
        System.out.println(pageSize);
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Firstgoods> l= firstgoodsService.getPageWithExample(obj);
        return AxiosResult.success(l);
    }
}
