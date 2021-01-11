package com.qy25.sm.service.impl;

import cn.hutool.core.date.DateUnit;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.LocalDateTimeUtil;
import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qy25.sm.dto.PriceAdjustSearchPageDto;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.Category;
import com.qy25.sm.entity.goods.*;
import com.qy25.sm.mapper.AuditMapper;
import com.qy25.sm.mapper.PriceadjustformMapper;
import com.qy25.sm.service.BrandService;
import com.qy25.sm.service.PriceadjustformService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import com.qy25.sm.vo.GoodsVo;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PriceadjustformServiceImpl extends BaseServiceImpl<Priceadjustform,Long> implements PriceadjustformService {

    @Autowired
    private PriceadjustformMapper priceadjustformMapper;
    @Autowired
    private AuditMapper auditMapper;

    /**
     *分页条件查询
     */
    @Override
    public PageVo<Priceadjustform> getPageWithExample(int currentPage, int pageSize, PriceAdjustSearchPageDto priceAdjustSearchPageDto) {
        PriceadjustformExample priceadjustformExample = new PriceadjustformExample();
        PriceadjustformExample.Criteria criteria = priceadjustformExample.createCriteria();

//       商品名称模糊查询
        if (!StringUtils.isEmpty(priceAdjustSearchPageDto.getGoodsName())) {
            criteria.andGoodsNameLike("%" + priceAdjustSearchPageDto.getGoodsName() + "%");
        }
        //审批状态精确查询
        if (priceAdjustSearchPageDto.getAduitStatus()!=null&&priceAdjustSearchPageDto.getAduitStatus()!=-1){
            criteria.andAduitStatusEqualTo(priceAdjustSearchPageDto.getAduitStatus());
        }
        //价格生效时间
        if (priceAdjustSearchPageDto.getHopeEffectiveDate()!=null){
            criteria.andHopeEffectiveDateBetween(priceAdjustSearchPageDto.getHopeEffectiveDate()
            ,new Date(priceAdjustSearchPageDto.getHopeEffectiveDate().getTime()+24*3600*1000));
        }
        //价格失效时间
        if (priceAdjustSearchPageDto.getHopeExpiryDate()!=null){
            criteria.andHopeEffectiveDateBetween(priceAdjustSearchPageDto.getHopeExpiryDate()
                    ,new Date(priceAdjustSearchPageDto.getHopeExpiryDate().getTime()+24*3600*1000));
        }

        PageHelper.startPage(currentPage,pageSize);
        List<Priceadjustform> priceadjustforms = priceadjustformMapper.selectByExample(priceadjustformExample);

        PageInfo<Priceadjustform> pageInfo=new PageInfo<Priceadjustform>(priceadjustforms);

        long total = pageInfo.getTotal();

        PageVo<Priceadjustform> tPageVo = new PageVo<>();
        tPageVo.setList(priceadjustforms);
        tPageVo.setTotal(total);
        return tPageVo;
    }

    /**
     *更新价格调整表的审核状态
     */
    @Override
    public int updateAudit(Long priceadjustformId, Audit audit) {
        Priceadjustform priceadjustform = priceadjustformMapper.selectByPrimaryKey(priceadjustformId);

        //新增audit

        //audit  赋值auditUserName   auditDate
        audit.setAuditUserName("写死了");
        audit.setAuditDate(new Date());
        int insert = auditMapper.insert(audit);
        //将其主键赋值给priceadjustform
        priceadjustform.setAuditId(audit.getId());
        //判断审核结果
        Byte auditResult = audit.getAuditResult();
        if (auditResult.equals(0)) {
            //审核未通过
            priceadjustform.setAduitStatus(0);
        }else {
            //审核通过



            //口子




            priceadjustform.setAduitStatus(1);
        }
        int i = priceadjustformMapper.updateByPrimaryKey(priceadjustform);
        return i;
    }

    /**
     *新添加初始化值
     */
    @Override
    public int addEntity(Priceadjustform entity) {
        entity.setAduitStatus(2);
        return super.addEntity(entity);
    }
    /**
     * 修改后初始化数据
     * 审核变成未审核
     */
    @Override
    public int updateEntity(Priceadjustform entity) {
        entity.setAduitStatus(2);
        return super.updateEntity(entity);
    }
}
