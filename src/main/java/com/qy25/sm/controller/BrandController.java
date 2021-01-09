package com.qy25.sm.controller;

import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brand")
public class BrandController extends BaseController<Brand,Long> {
    @Autowired
    private BrandService brandService;
    @GetMapping("findAllWithoutExampleAndPage")
    public AxiosResult<List<Brand>> findAllWithoutExampleAndPage(){
        return AxiosResult.success(brandService.findAllWithoutExampleAndPage());
    }

}
