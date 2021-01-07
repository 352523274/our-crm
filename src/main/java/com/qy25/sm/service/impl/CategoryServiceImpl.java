package com.qy25.sm.service.impl;

import com.qy25.sm.entity.Category;
import com.qy25.sm.mapper.CategoryMapper;
import com.qy25.sm.service.CategoryService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class CategoryServiceImpl extends BaseServiceImpl<Category, Long> implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getTreeData() {
        List<Category> categories = categoryMapper.selectByExample(null);
        List<Category> collect0 = categories.stream().filter(a -> a.getParentId().equals(0L)).collect(Collectors.toList());
        collect0.forEach(a->{
            Category children = getChildren(categories, a);
        });
        return collect0;
    }

    /**
     *返回其带有children
     */
    private Category getChildren(List<Category> categories,Category category) {
        List<Category> collect = categories.stream().filter(item ->
            item.getParentId().equals(category.getId())
        ).collect(Collectors.toList());
        if (collect.size()>0){
            category.setChildren(collect);
            collect.forEach(a->{
                getChildren(categories,a);
            });
        }
        return category;
    }
}
