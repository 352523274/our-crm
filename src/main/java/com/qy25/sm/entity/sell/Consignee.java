package com.qy25.sm.entity.sell;

import java.util.Date;

public class Consignee {
    private Long id;

    private String consigneeName;

    private String vipAccountNumber;

    private Long consigneePhone;

    private Long consigneeCellphone;

    private Long consigneeZipcode;

    private String consigneeAddress;

    private String consigneeEmail;

    private Double consigneeMoney;

    private Date consigneeTime;

    private String consigneeRemark;

    private Long consigneeNumber;

    private Double consigneeTotalamount;

    private Long consigneeGoodsid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName == null ? null : consigneeName.trim();
    }

    public String getVipAccountNumber() {
        return vipAccountNumber;
    }

    public void setVipAccountNumber(String vipAccountNumber) {
        this.vipAccountNumber = vipAccountNumber == null ? null : vipAccountNumber.trim();
    }

    public Long getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(Long consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public Long getConsigneeCellphone() {
        return consigneeCellphone;
    }

    public void setConsigneeCellphone(Long consigneeCellphone) {
        this.consigneeCellphone = consigneeCellphone;
    }

    public Long getConsigneeZipcode() {
        return consigneeZipcode;
    }

    public void setConsigneeZipcode(Long consigneeZipcode) {
        this.consigneeZipcode = consigneeZipcode;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress == null ? null : consigneeAddress.trim();
    }

    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail == null ? null : consigneeEmail.trim();
    }

    public Double getConsigneeMoney() {
        return consigneeMoney;
    }

    public void setConsigneeMoney(Double consigneeMoney) {
        this.consigneeMoney = consigneeMoney;
    }

    public Date getConsigneeTime() {
        return consigneeTime;
    }

    public void setConsigneeTime(Date consigneeTime) {
        this.consigneeTime = consigneeTime;
    }

    public String getConsigneeRemark() {
        return consigneeRemark;
    }

    public void setConsigneeRemark(String consigneeRemark) {
        this.consigneeRemark = consigneeRemark == null ? null : consigneeRemark.trim();
    }

    public Long getConsigneeNumber() {
        return consigneeNumber;
    }

    public void setConsigneeNumber(Long consigneeNumber) {
        this.consigneeNumber = consigneeNumber;
    }

    public Double getConsigneeTotalamount() {
        return consigneeTotalamount;
    }

    public void setConsigneeTotalamount(Double consigneeTotalamount) {
        this.consigneeTotalamount = consigneeTotalamount;
    }

    public Long getConsigneeGoodsid() {
        return consigneeGoodsid;
    }

    public void setConsigneeGoodsid(Long consigneeGoodsid) {
        this.consigneeGoodsid = consigneeGoodsid;
    }
}