package com.qy25.sm.controller;

import com.qy25.sm.common.http.AxiosResult;
import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.goods.Audit;
import com.qy25.sm.service.AuditService;
import com.qy25.sm.service.BrandService;
import com.qy25.sm.service.PriceadjustformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("audit")
public class AuditController extends BaseController<Audit,Long> {

    @Autowired
    private PriceadjustformService priceadjustformService;

    /**
     * 更新审核结果
     */
    @PutMapping("updatepriceadjust/{priceadjustformId}")
    public AxiosResult<Void> updatepriceadjust(@PathVariable Long priceadjustformId
    ,@RequestBody Audit audit){
      int i=  priceadjustformService.updateAudit(priceadjustformId,audit);
      return getAxios(i);
    }

}
