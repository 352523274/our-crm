package com.qy25.sm.service.sell.impl;


import com.github.pagehelper.PageInfo;
import com.qy25.sm.mapper.sell.ConsigneeMapper;
import com.qy25.sm.mapper.sell.SellOrderMapper;
import com.qy25.sm.service.sell.SellOrderService;
import com.qy25.sm.vo.ConsigneeVo;
import com.qy25.sm.vo.PageVo;
import com.qy25.sm.vo.SellVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SellOrderServiceImpl implements SellOrderService {
    @Autowired
    private SellOrderMapper sellOrderMapper;

    @Autowired
    private ConsigneeMapper consigneeMapper;

    /**
     * 查询所有 带总数的
     * @return
     */
    @Override
    public PageVo<SellVo> findAll() {
        List<SellVo> sellVos = sellOrderMapper.selectByExample();
        PageVo<SellVo> sellVoPageVo = setPageVo(sellVos);
        return sellVoPageVo;
    }

    /**
     * 根据id查询对应的订单信息
     * @param id
     * @return
     */
    @Override
    public SellVo findById(long id) {
        SellVo sellVo = sellOrderMapper.selectByPrimaryKey(id);
        return sellVo;
    }

    /**
     * 根据id查询收货人和其他信息
     * @param id
     * @return
     */
    @Override
    public ConsigneeVo findDetailById(long id) {
        ConsigneeVo consigneeVo = consigneeMapper.selectByPrimaryKey(id);
        return consigneeVo;
    }

    /**
     * 获取total 封装方法
     * @param list
     * @return
     */
    private PageVo<SellVo> setPageVo(List<SellVo> list){
        PageInfo<SellVo> pageInfo=new PageInfo<SellVo>(list);
        long total = pageInfo.getTotal();
        PageVo<SellVo> tPageVo = new PageVo<>();
        tPageVo.setList(list);
        tPageVo.setTotal(total);
        return tPageVo;
    }
}
