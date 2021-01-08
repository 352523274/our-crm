package com.qy25.sm.entity.sell;

import java.util.Date;

public class SellOrder {
    private Long id;

    private Long orderNumber;

    private Long orderType;

    private String orderAction;

    private Long businessType;

    private Long paymentMethod;

    private Long deliveryMethod;

    private Boolean orderStatus;

    private String returnedCouse;

    private Byte returnedOrders;

    private Boolean deliverystatus;

    private Date addTime;

    private Long updateId;

    private Long creatorId;

    private Date updateTime;

    private String orderTstatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
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

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Long getUpdateId() {
        return updateId;
    }

    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOrderTstatus() {
        return orderTstatus;
    }

    public void setOrderTstatus(String orderTstatus) {
        this.orderTstatus = orderTstatus == null ? null : orderTstatus.trim();
    }
}