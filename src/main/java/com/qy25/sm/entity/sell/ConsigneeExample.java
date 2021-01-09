package com.qy25.sm.entity.sell;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsigneeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsigneeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNull() {
            addCriterion("consignee_name is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNotNull() {
            addCriterion("consignee_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameEqualTo(String value) {
            addCriterion("consignee_name =", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotEqualTo(String value) {
            addCriterion("consignee_name <>", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThan(String value) {
            addCriterion("consignee_name >", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_name >=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThan(String value) {
            addCriterion("consignee_name <", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThanOrEqualTo(String value) {
            addCriterion("consignee_name <=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLike(String value) {
            addCriterion("consignee_name like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotLike(String value) {
            addCriterion("consignee_name not like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIn(List<String> values) {
            addCriterion("consignee_name in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotIn(List<String> values) {
            addCriterion("consignee_name not in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameBetween(String value1, String value2) {
            addCriterion("consignee_name between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotBetween(String value1, String value2) {
            addCriterion("consignee_name not between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberIsNull() {
            addCriterion("vip_account_number is null");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberIsNotNull() {
            addCriterion("vip_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberEqualTo(String value) {
            addCriterion("vip_account_number =", value, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberNotEqualTo(String value) {
            addCriterion("vip_account_number <>", value, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberGreaterThan(String value) {
            addCriterion("vip_account_number >", value, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("vip_account_number >=", value, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberLessThan(String value) {
            addCriterion("vip_account_number <", value, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("vip_account_number <=", value, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberLike(String value) {
            addCriterion("vip_account_number like", value, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberNotLike(String value) {
            addCriterion("vip_account_number not like", value, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberIn(List<String> values) {
            addCriterion("vip_account_number in", values, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberNotIn(List<String> values) {
            addCriterion("vip_account_number not in", values, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberBetween(String value1, String value2) {
            addCriterion("vip_account_number between", value1, value2, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andVipAccountNumberNotBetween(String value1, String value2) {
            addCriterion("vip_account_number not between", value1, value2, "vipAccountNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNull() {
            addCriterion("consignee_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNotNull() {
            addCriterion("consignee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneEqualTo(Long value) {
            addCriterion("consignee_phone =", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotEqualTo(Long value) {
            addCriterion("consignee_phone <>", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThan(Long value) {
            addCriterion("consignee_phone >", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_phone >=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThan(Long value) {
            addCriterion("consignee_phone <", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThanOrEqualTo(Long value) {
            addCriterion("consignee_phone <=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIn(List<Long> values) {
            addCriterion("consignee_phone in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotIn(List<Long> values) {
            addCriterion("consignee_phone not in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneBetween(Long value1, Long value2) {
            addCriterion("consignee_phone between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotBetween(Long value1, Long value2) {
            addCriterion("consignee_phone not between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneIsNull() {
            addCriterion("consignee_cellPhone is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneIsNotNull() {
            addCriterion("consignee_cellPhone is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneEqualTo(Long value) {
            addCriterion("consignee_cellPhone =", value, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneNotEqualTo(Long value) {
            addCriterion("consignee_cellPhone <>", value, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneGreaterThan(Long value) {
            addCriterion("consignee_cellPhone >", value, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_cellPhone >=", value, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneLessThan(Long value) {
            addCriterion("consignee_cellPhone <", value, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneLessThanOrEqualTo(Long value) {
            addCriterion("consignee_cellPhone <=", value, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneIn(List<Long> values) {
            addCriterion("consignee_cellPhone in", values, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneNotIn(List<Long> values) {
            addCriterion("consignee_cellPhone not in", values, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneBetween(Long value1, Long value2) {
            addCriterion("consignee_cellPhone between", value1, value2, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeCellphoneNotBetween(Long value1, Long value2) {
            addCriterion("consignee_cellPhone not between", value1, value2, "consigneeCellphone");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeIsNull() {
            addCriterion("consignee_zipCode is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeIsNotNull() {
            addCriterion("consignee_zipCode is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeEqualTo(Long value) {
            addCriterion("consignee_zipCode =", value, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeNotEqualTo(Long value) {
            addCriterion("consignee_zipCode <>", value, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeGreaterThan(Long value) {
            addCriterion("consignee_zipCode >", value, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_zipCode >=", value, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeLessThan(Long value) {
            addCriterion("consignee_zipCode <", value, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeLessThanOrEqualTo(Long value) {
            addCriterion("consignee_zipCode <=", value, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeIn(List<Long> values) {
            addCriterion("consignee_zipCode in", values, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeNotIn(List<Long> values) {
            addCriterion("consignee_zipCode not in", values, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeBetween(Long value1, Long value2) {
            addCriterion("consignee_zipCode between", value1, value2, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeZipcodeNotBetween(Long value1, Long value2) {
            addCriterion("consignee_zipCode not between", value1, value2, "consigneeZipcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNull() {
            addCriterion("consignee_address is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNotNull() {
            addCriterion("consignee_address is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressEqualTo(String value) {
            addCriterion("consignee_address =", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotEqualTo(String value) {
            addCriterion("consignee_address <>", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThan(String value) {
            addCriterion("consignee_address >", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_address >=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThan(String value) {
            addCriterion("consignee_address <", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThanOrEqualTo(String value) {
            addCriterion("consignee_address <=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLike(String value) {
            addCriterion("consignee_address like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotLike(String value) {
            addCriterion("consignee_address not like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIn(List<String> values) {
            addCriterion("consignee_address in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotIn(List<String> values) {
            addCriterion("consignee_address not in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressBetween(String value1, String value2) {
            addCriterion("consignee_address between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotBetween(String value1, String value2) {
            addCriterion("consignee_address not between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIsNull() {
            addCriterion("consignee_email is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIsNotNull() {
            addCriterion("consignee_email is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailEqualTo(String value) {
            addCriterion("consignee_email =", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotEqualTo(String value) {
            addCriterion("consignee_email <>", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailGreaterThan(String value) {
            addCriterion("consignee_email >", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_email >=", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLessThan(String value) {
            addCriterion("consignee_email <", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLessThanOrEqualTo(String value) {
            addCriterion("consignee_email <=", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLike(String value) {
            addCriterion("consignee_email like", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotLike(String value) {
            addCriterion("consignee_email not like", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIn(List<String> values) {
            addCriterion("consignee_email in", values, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotIn(List<String> values) {
            addCriterion("consignee_email not in", values, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailBetween(String value1, String value2) {
            addCriterion("consignee_email between", value1, value2, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotBetween(String value1, String value2) {
            addCriterion("consignee_email not between", value1, value2, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyIsNull() {
            addCriterion("consignee_money is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyIsNotNull() {
            addCriterion("consignee_money is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyEqualTo(Double value) {
            addCriterion("consignee_money =", value, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyNotEqualTo(Double value) {
            addCriterion("consignee_money <>", value, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyGreaterThan(Double value) {
            addCriterion("consignee_money >", value, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("consignee_money >=", value, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyLessThan(Double value) {
            addCriterion("consignee_money <", value, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyLessThanOrEqualTo(Double value) {
            addCriterion("consignee_money <=", value, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyIn(List<Double> values) {
            addCriterion("consignee_money in", values, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyNotIn(List<Double> values) {
            addCriterion("consignee_money not in", values, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyBetween(Double value1, Double value2) {
            addCriterion("consignee_money between", value1, value2, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeMoneyNotBetween(Double value1, Double value2) {
            addCriterion("consignee_money not between", value1, value2, "consigneeMoney");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeIsNull() {
            addCriterion("consignee_time is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeIsNotNull() {
            addCriterion("consignee_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeEqualTo(Date value) {
            addCriterion("consignee_time =", value, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeNotEqualTo(Date value) {
            addCriterion("consignee_time <>", value, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeGreaterThan(Date value) {
            addCriterion("consignee_time >", value, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("consignee_time >=", value, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeLessThan(Date value) {
            addCriterion("consignee_time <", value, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeLessThanOrEqualTo(Date value) {
            addCriterion("consignee_time <=", value, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeIn(List<Date> values) {
            addCriterion("consignee_time in", values, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeNotIn(List<Date> values) {
            addCriterion("consignee_time not in", values, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeBetween(Date value1, Date value2) {
            addCriterion("consignee_time between", value1, value2, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeTimeNotBetween(Date value1, Date value2) {
            addCriterion("consignee_time not between", value1, value2, "consigneeTime");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkIsNull() {
            addCriterion("consignee_remark is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkIsNotNull() {
            addCriterion("consignee_remark is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkEqualTo(String value) {
            addCriterion("consignee_remark =", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkNotEqualTo(String value) {
            addCriterion("consignee_remark <>", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkGreaterThan(String value) {
            addCriterion("consignee_remark >", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_remark >=", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkLessThan(String value) {
            addCriterion("consignee_remark <", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkLessThanOrEqualTo(String value) {
            addCriterion("consignee_remark <=", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkLike(String value) {
            addCriterion("consignee_remark like", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkNotLike(String value) {
            addCriterion("consignee_remark not like", value, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkIn(List<String> values) {
            addCriterion("consignee_remark in", values, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkNotIn(List<String> values) {
            addCriterion("consignee_remark not in", values, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkBetween(String value1, String value2) {
            addCriterion("consignee_remark between", value1, value2, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeRemarkNotBetween(String value1, String value2) {
            addCriterion("consignee_remark not between", value1, value2, "consigneeRemark");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberIsNull() {
            addCriterion("consignee_number is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberIsNotNull() {
            addCriterion("consignee_number is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberEqualTo(Long value) {
            addCriterion("consignee_number =", value, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberNotEqualTo(Long value) {
            addCriterion("consignee_number <>", value, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberGreaterThan(Long value) {
            addCriterion("consignee_number >", value, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("consignee_number >=", value, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberLessThan(Long value) {
            addCriterion("consignee_number <", value, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberLessThanOrEqualTo(Long value) {
            addCriterion("consignee_number <=", value, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberIn(List<Long> values) {
            addCriterion("consignee_number in", values, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberNotIn(List<Long> values) {
            addCriterion("consignee_number not in", values, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberBetween(Long value1, Long value2) {
            addCriterion("consignee_number between", value1, value2, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeNumberNotBetween(Long value1, Long value2) {
            addCriterion("consignee_number not between", value1, value2, "consigneeNumber");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountIsNull() {
            addCriterion("consignee_totalAmount is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountIsNotNull() {
            addCriterion("consignee_totalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountEqualTo(Double value) {
            addCriterion("consignee_totalAmount =", value, "consigneeTotalamount");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountNotEqualTo(Double value) {
            addCriterion("consignee_totalAmount <>", value, "consigneeTotalamount");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountGreaterThan(Double value) {
            addCriterion("consignee_totalAmount >", value, "consigneeTotalamount");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountGreaterThanOrEqualTo(Double value) {
            addCriterion("consignee_totalAmount >=", value, "consigneeTotalamount");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountLessThan(Double value) {
            addCriterion("consignee_totalAmount <", value, "consigneeTotalamount");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountLessThanOrEqualTo(Double value) {
            addCriterion("consignee_totalAmount <=", value, "consigneeTotalamount");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountIn(List<Double> values) {
            addCriterion("consignee_totalAmount in", values, "consigneeTotalamount");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountNotIn(List<Double> values) {
            addCriterion("consignee_totalAmount not in", values, "consigneeTotalamount");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountBetween(Double value1, Double value2) {
            addCriterion("consignee_totalAmount between", value1, value2, "consigneeTotalamount");
            return (Criteria) this;
        }

        public Criteria andConsigneeTotalamountNotBetween(Double value1, Double value2) {
            addCriterion("consignee_totalAmount not between", value1, value2, "consigneeTotalamount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}