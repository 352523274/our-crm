package com.qy25.sm.service.impl;

import com.qy25.sm.entity.goods.Gift;
import com.qy25.sm.service.GiftService;
import com.qy25.sm.service.base.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GiftServiceImpl extends BaseServiceImpl<Gift,Long> implements GiftService {
}
