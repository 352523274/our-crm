package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.dto.GoodsSearchPageDto;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.entity.goods.Goodscolor;
import com.qy25.sm.service.GoodsService;
import com.qy25.sm.vo.GoodsVo;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("goods")
public class GoodsController extends BaseController<Goods,Long> {
    @Autowired
    private GoodsService goodsService;
    /**
     * 分页条件查询
     */
    @PostMapping("getPageWithExample")
    public AxiosResult<PageVo<GoodsVo>> getPageWithExample(@RequestParam(defaultValue = "1") int currentPage,
                                                           @RequestParam(defaultValue = "5") int pageSize,
                                                           @RequestBody GoodsSearchPageDto obj){
        PageVo<GoodsVo> l= goodsService.getPageWithExample(currentPage,pageSize,obj);
        return AxiosResult.success(l);
    }
    /**
     * 查询全部的颜色
     */
    @GetMapping("findAllColor")
    public AxiosResult<List<Goodscolor>> findAllColor(){
        List<Goodscolor> goodscolorsList= goodsService.findAllColor();
        return AxiosResult.success(goodscolorsList);
    }

    /**
     * 查询全部的颜色
     */
    @GetMapping("findGoodsVoById/{id}")
    public AxiosResult<GoodsVo> findAllColor(@PathVariable long id){
       GoodsVo goodsVo=goodsService.findGoodsVoById(id);
        return AxiosResult.success(goodsVo);
    }
}
