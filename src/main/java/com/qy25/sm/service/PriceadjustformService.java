package com.qy25.sm.service;

import com.qy25.sm.dto.PriceAdjustSearchPageDto;
import com.qy25.sm.entity.goods.Audit;
import com.qy25.sm.entity.goods.Priceadjustform;
import com.qy25.sm.service.base.BaseService;
import com.qy25.sm.vo.PageVo;

public interface PriceadjustformService extends BaseService<Priceadjustform,Long> {
    PageVo<Priceadjustform> getPageWithExample(int currentPage, int pageSize, PriceAdjustSearchPageDto obj);

    int updateAudit(Long priceadjustformId, Audit audit);
}
