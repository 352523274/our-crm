package com.qy25.sm.controller;

import com.qy25.sm.controller.base.BaseController;
import com.qy25.sm.entity.Brand;
import com.qy25.sm.entity.goods.Gift;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gift")
public class GiftController extends BaseController<Gift,Long> {

}
