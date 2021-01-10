package com.qy25.sm.controller;

import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.dto.GoodsSearchPageDto;
import com.qy25.sm.dto.PriceAdjustSearchPageDto;
import com.qy25.sm.entity.goods.Priceadjustform;
import com.qy25.sm.service.PriceadjustformService;
import com.qy25.sm.vo.GoodsVo;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("priceadjustform")
public class PriceadjustformController extends BaseController<Priceadjustform, Long> {
    @Autowired
    private PriceadjustformService priceadjustformService;


    /**
     * 分页条件查询
     */
    @PostMapping("getPageWithExample")
    public AxiosResult<PageVo<Priceadjustform>> getPageWithExample(@RequestParam(defaultValue = "1") int currentPage,
                                                @RequestParam(defaultValue = "5") int pageSize,
                                                @RequestBody PriceAdjustSearchPageDto obj) {

        PageVo<Priceadjustform> l = priceadjustformService.getPageWithExample(currentPage, pageSize, obj);
        return AxiosResult.success(l);
    }
}
