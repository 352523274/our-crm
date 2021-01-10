package com.qy25.sm.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.qy25.sm.dto.SupplierSearchPageDto;
import com.qy25.sm.entity.Supplier;
import com.qy25.sm.entity.SupplierExample;
import com.qy25.sm.entity.goods.*;
import com.qy25.sm.mapper.GoodsMapper;
import com.qy25.sm.mapper.SupplierMapper;
import com.qy25.sm.mapper.SuppliergoodsMapper;
import com.qy25.sm.service.SupplierService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import com.qy25.sm.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class SupplierServiceImpl extends BaseServiceImpl<Supplier,Long> implements SupplierService {
    @Autowired
    private SupplierMapper supplierMapper;
    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private SuppliergoodsMapper suppliergoodsMapper;
    @Override
    public PageVo<Supplier> getPageWithExample(SupplierSearchPageDto supplierSearchPageDto) {
        SupplierExample supplierExample = new SupplierExample();
        SupplierExample.Criteria criteria = supplierExample.createCriteria();


        //        供应商名字模糊查询
        if (!StringUtils.isEmpty(supplierSearchPageDto.getSupplierName())){
            criteria.andSupplierNameLike("%"+supplierSearchPageDto.getSupplierName()+"%");
        }
//        联系人模糊查询
        if (!StringUtils.isEmpty(supplierSearchPageDto.getSupplierContact())){
            criteria.andSupplierContactLike("%"+supplierSearchPageDto.getSupplierContact()+"%");
        }
//        联系人电话迷糊查询
        if (!StringUtils.isEmpty(supplierSearchPageDto.getSupplierPhone())){
            criteria.andSupplierPhoneLike("%"+supplierSearchPageDto.getSupplierPhone()+"%");
        }
//        供应商地址模糊查询
        if (!StringUtils.isEmpty(supplierSearchPageDto.getSupplierAddress())){
            criteria.andSupplierAddressLike("%"+supplierSearchPageDto.getSupplierAddress()+"%");
        }
//       银行账号精确查询
        if (!StringUtils.isEmpty(supplierSearchPageDto.getSupplierBrankCode())){
            criteria.andSupplierBrankCodeEqualTo(supplierSearchPageDto.getSupplierBrankCode());
        }
//        银行名模糊查询
        if (!StringUtils.isEmpty(supplierSearchPageDto.getSupplierBrank())){
            criteria.andSupplierBrankLike("%"+supplierSearchPageDto.getSupplierBrank()+"%");
        }

        List<Supplier> goods = supplierMapper.selectByExample(supplierExample);

        return setPageVo(goods);
    }

    @Override
    public List<Goods> getAddGoods(Long supplierId) {
        List<Goods> goods= supplierMapper.getAddGoods(supplierId);
        return goods;
    }

    /**
     *给此供应商批量添加供应商品
     */
    @Override
    public int addGoods(Long id, List<Long> ids) {
        Suppliergoods suppliergoods = new Suppliergoods();
        SuppliergoodsExample suppliergoodsExample = new SuppliergoodsExample();
        SuppliergoodsExample.Criteria criteria = suppliergoodsExample.createCriteria();
        criteria.andSupplierIdEqualTo(id);
        List<Suppliergoods> suppliergoodsed = suppliergoodsMapper.selectByExample(suppliergoodsExample);

        ids.forEach(goodsId->{
            //遍历数组看看有没有
            int size = suppliergoodsed.stream().filter(a -> a.getGoodsId().equals(goodsId)).collect(Collectors.toList()).size();
            if (size==0){
                //没有就加上
                suppliergoods.setSupplierId(id);
                suppliergoods.setGoodsId(goodsId);
                suppliergoodsMapper.insert(suppliergoods);
            }
        });
        return 1;
    }

    @Override
    public int deletesuppgoodsById(List<Long> ids) {

        SuppliergoodsExample suppliergoodsExample = new SuppliergoodsExample();
        SuppliergoodsExample.Criteria criteria = suppliergoodsExample.createCriteria();
        criteria.andGoodsIdIn(ids);
        suppliergoodsMapper.deleteByExample(suppliergoodsExample);
        return 1;
    }
}
