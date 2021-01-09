package com.qy25.sm.entity.sell;

import com.qy25.sm.entity.base.BaseEntity;

import java.util.Date;

public class SellOrder extends BaseEntity<Long> {


    private Long orderNumber;

    private Long orderType;

    private String orderAction;

    private Long businessType;

    private Long paymentMethod;

    private Long deliveryMethod;

    private Long orderStatus;

    private String returnedCouse;

    private Byte returnedOrders;

    private Boolean deliverystatus;

    private String orderTstatus;

    private Long consigneeId;



    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Long getOrderType() {
        return orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public String getOrderAction() {
        return orderAction;
    }

    public void setOrderAction(String orderAction) {
        this.orderAction = orderAction == null ? null : orderAction.trim();
    }

    public Long getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Long businessType) {
        this.businessType = businessType;
    }

    public Long getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Long paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Long getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(Long deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public Long getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getReturnedCouse() {
        return returnedCouse;
    }

    public void setReturnedCouse(String returnedCouse) {
        this.returnedCouse = returnedCouse == null ? null : returnedCouse.trim();
    }

    public Byte getReturnedOrders() {
        return returnedOrders;
    }

    public void setReturnedOrders(Byte returnedOrders) {
        this.returnedOrders = returnedOrders;
    }

    public Boolean getDeliverystatus() {
        return deliverystatus;
    }

    public void setDeliverystatus(Boolean deliverystatus) {
        this.deliverystatus = deliverystatus;
    }

    public String getOrderTstatus() {
        return orderTstatus;
    }

    public void setOrderTstatus(String orderTstatus) {
        this.orderTstatus = orderTstatus == null ? null : orderTstatus.trim();
    }

    public Long getConsigneeId() {
        return consigneeId;
    }

    public void setConsigneeId(Long consigneeId) {
        this.consigneeId = consigneeId;
    }
}