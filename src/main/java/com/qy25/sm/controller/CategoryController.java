package com.qy25.sm.controller;

import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Category;
import com.qy25.sm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController extends BaseController<Category,Long> {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("getTreeData")
    public AxiosResult<List<Category>> getTreeData(){
        return AxiosResult.success(categoryService.getTreeData());
    }
}
