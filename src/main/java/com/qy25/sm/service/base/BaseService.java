package com.qy25.sm.service.base;

import com.qy25.sm.entity.Brand;
import com.qy25.sm.vo.PageVo;

import java.util.List;

public interface BaseService<T, ID> {
    /**
     * 分页查询
     */
    PageVo<T> findPage();
    /**
     * 有条件的分页查询
     */
    PageVo<T> findPage(Object example);

    /**
     * 通过id查询
     */
    T findById(ID id);

    /**
     * 修改
     */
    int updateEntity(T entity);

    /**
     * 增加
     */
    int addEntity(T entity);

    /**
     * 删除
     */
    int deleteById(ID id);

    /**
     * 批量添加
     */
    int batchAddEntity(List<T> entities);
    /**
     * 批量修改
     */
    int batchUpdateEntity(List<T> entities);
    /**
     * 批量删除
     */
    int batchDeleteEntity(List<ID> ids);

}
