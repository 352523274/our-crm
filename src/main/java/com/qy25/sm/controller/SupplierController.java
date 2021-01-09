package com.qy25.sm.controller;

import com.github.pagehelper.PageHelper;
import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.dto.FirstGoodsSearchPageDto;
import com.qy25.sm.dto.SupplierSearchPageDto;
import com.qy25.sm.entity.Supplier;
import com.qy25.sm.entity.goods.Firstgoods;
import com.qy25.sm.entity.goods.Goods;
import com.qy25.sm.service.FirstgoodsService;
import com.qy25.sm.service.SupplierService;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("supplier")
public class SupplierController extends BaseController<Supplier,Long> {
    @Autowired
    private SupplierService supplierService;
    /**
     * 分页条件查询
     */
    @PostMapping("getPageWithExample")
    public AxiosResult<PageVo<Supplier>> getPageWithExample(@RequestParam(defaultValue = "1") int currentPage,
                                                              @RequestParam(defaultValue = "5") int pageSize,
                                                              @RequestBody SupplierSearchPageDto obj){
        System.out.println(obj);
        System.out.println(pageSize);
        PageHelper.startPage(currentPage,pageSize);
        PageVo<Supplier> l= supplierService.getPageWithExample(obj);
        return AxiosResult.success(l);
    }
    /**
     * 查询供应商的供应商品
     */

    @GetMapping("getAddGoods")
    public AxiosResult<List<Goods>> getAddGoods(Long supplierId){
        List<Goods> goods = supplierService.getAddGoods(supplierId);

        return AxiosResult.success(goods);
    }

}
