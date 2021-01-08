package com.qy25.sm.entity.sell;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SellOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SellOrderExample() {
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

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(Long value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(Long value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(Long value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(Long value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(Long value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<Long> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<Long> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(Long value1, Long value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(Long value1, Long value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Long value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Long value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Long value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Long value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Long value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Long> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Long> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Long value1, Long value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Long value1, Long value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderActionIsNull() {
            addCriterion("order_action is null");
            return (Criteria) this;
        }

        public Criteria andOrderActionIsNotNull() {
            addCriterion("order_action is not null");
            return (Criteria) this;
        }

        public Criteria andOrderActionEqualTo(String value) {
            addCriterion("order_action =", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotEqualTo(String value) {
            addCriterion("order_action <>", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionGreaterThan(String value) {
            addCriterion("order_action >", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionGreaterThanOrEqualTo(String value) {
            addCriterion("order_action >=", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionLessThan(String value) {
            addCriterion("order_action <", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionLessThanOrEqualTo(String value) {
            addCriterion("order_action <=", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionLike(String value) {
            addCriterion("order_action like", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotLike(String value) {
            addCriterion("order_action not like", value, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionIn(List<String> values) {
            addCriterion("order_action in", values, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotIn(List<String> values) {
            addCriterion("order_action not in", values, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionBetween(String value1, String value2) {
            addCriterion("order_action between", value1, value2, "orderAction");
            return (Criteria) this;
        }

        public Criteria andOrderActionNotBetween(String value1, String value2) {
            addCriterion("order_action not between", value1, value2, "orderAction");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNull() {
            addCriterion("business_type is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIsNotNull() {
            addCriterion("business_type is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeEqualTo(Long value) {
            addCriterion("business_type =", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotEqualTo(Long value) {
            addCriterion("business_type <>", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThan(Long value) {
            addCriterion("business_type >", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("business_type >=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThan(Long value) {
            addCriterion("business_type <", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeLessThanOrEqualTo(Long value) {
            addCriterion("business_type <=", value, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeIn(List<Long> values) {
            addCriterion("business_type in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotIn(List<Long> values) {
            addCriterion("business_type not in", values, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeBetween(Long value1, Long value2) {
            addCriterion("business_type between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andBusinessTypeNotBetween(Long value1, Long value2) {
            addCriterion("business_type not between", value1, value2, "businessType");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(Long value) {
            addCriterion("payment_method =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(Long value) {
            addCriterion("payment_method <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(Long value) {
            addCriterion("payment_method >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_method >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(Long value) {
            addCriterion("payment_method <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(Long value) {
            addCriterion("payment_method <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<Long> values) {
            addCriterion("payment_method in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<Long> values) {
            addCriterion("payment_method not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(Long value1, Long value2) {
            addCriterion("payment_method between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(Long value1, Long value2) {
            addCriterion("payment_method not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIsNull() {
            addCriterion("delivery_method is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIsNotNull() {
            addCriterion("delivery_method is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodEqualTo(Long value) {
            addCriterion("delivery_method =", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodNotEqualTo(Long value) {
            addCriterion("delivery_method <>", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodGreaterThan(Long value) {
            addCriterion("delivery_method >", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodGreaterThanOrEqualTo(Long value) {
            addCriterion("delivery_method >=", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodLessThan(Long value) {
            addCriterion("delivery_method <", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodLessThanOrEqualTo(Long value) {
            addCriterion("delivery_method <=", value, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodIn(List<Long> values) {
            addCriterion("delivery_method in", values, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodNotIn(List<Long> values) {
            addCriterion("delivery_method not in", values, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodBetween(Long value1, Long value2) {
            addCriterion("delivery_method between", value1, value2, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andDeliveryMethodNotBetween(Long value1, Long value2) {
            addCriterion("delivery_method not between", value1, value2, "deliveryMethod");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Boolean value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Boolean value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Boolean value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Boolean value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Boolean> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Boolean> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseIsNull() {
            addCriterion("returned_couse is null");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseIsNotNull() {
            addCriterion("returned_couse is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseEqualTo(String value) {
            addCriterion("returned_couse =", value, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseNotEqualTo(String value) {
            addCriterion("returned_couse <>", value, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseGreaterThan(String value) {
            addCriterion("returned_couse >", value, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseGreaterThanOrEqualTo(String value) {
            addCriterion("returned_couse >=", value, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseLessThan(String value) {
            addCriterion("returned_couse <", value, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseLessThanOrEqualTo(String value) {
            addCriterion("returned_couse <=", value, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseLike(String value) {
            addCriterion("returned_couse like", value, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseNotLike(String value) {
            addCriterion("returned_couse not like", value, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseIn(List<String> values) {
            addCriterion("returned_couse in", values, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseNotIn(List<String> values) {
            addCriterion("returned_couse not in", values, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseBetween(String value1, String value2) {
            addCriterion("returned_couse between", value1, value2, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedCouseNotBetween(String value1, String value2) {
            addCriterion("returned_couse not between", value1, value2, "returnedCouse");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersIsNull() {
            addCriterion("returned_orders is null");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersIsNotNull() {
            addCriterion("returned_orders is not null");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersEqualTo(Byte value) {
            addCriterion("returned_orders =", value, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersNotEqualTo(Byte value) {
            addCriterion("returned_orders <>", value, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersGreaterThan(Byte value) {
            addCriterion("returned_orders >", value, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersGreaterThanOrEqualTo(Byte value) {
            addCriterion("returned_orders >=", value, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersLessThan(Byte value) {
            addCriterion("returned_orders <", value, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersLessThanOrEqualTo(Byte value) {
            addCriterion("returned_orders <=", value, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersIn(List<Byte> values) {
            addCriterion("returned_orders in", values, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersNotIn(List<Byte> values) {
            addCriterion("returned_orders not in", values, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersBetween(Byte value1, Byte value2) {
            addCriterion("returned_orders between", value1, value2, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andReturnedOrdersNotBetween(Byte value1, Byte value2) {
            addCriterion("returned_orders not between", value1, value2, "returnedOrders");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusIsNull() {
            addCriterion("deliveryStatus is null");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusIsNotNull() {
            addCriterion("deliveryStatus is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusEqualTo(Boolean value) {
            addCriterion("deliveryStatus =", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusNotEqualTo(Boolean value) {
            addCriterion("deliveryStatus <>", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusGreaterThan(Boolean value) {
            addCriterion("deliveryStatus >", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("deliveryStatus >=", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusLessThan(Boolean value) {
            addCriterion("deliveryStatus <", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusLessThanOrEqualTo(Boolean value) {
            addCriterion("deliveryStatus <=", value, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusIn(List<Boolean> values) {
            addCriterion("deliveryStatus in", values, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusNotIn(List<Boolean> values) {
            addCriterion("deliveryStatus not in", values, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusBetween(Boolean value1, Boolean value2) {
            addCriterion("deliveryStatus between", value1, value2, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andDeliverystatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("deliveryStatus not between", value1, value2, "deliverystatus");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusIsNull() {
            addCriterion("order_tstatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusIsNotNull() {
            addCriterion("order_tstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusEqualTo(String value) {
            addCriterion("order_tstatus =", value, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusNotEqualTo(String value) {
            addCriterion("order_tstatus <>", value, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusGreaterThan(String value) {
            addCriterion("order_tstatus >", value, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_tstatus >=", value, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusLessThan(String value) {
            addCriterion("order_tstatus <", value, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusLessThanOrEqualTo(String value) {
            addCriterion("order_tstatus <=", value, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusLike(String value) {
            addCriterion("order_tstatus like", value, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusNotLike(String value) {
            addCriterion("order_tstatus not like", value, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusIn(List<String> values) {
            addCriterion("order_tstatus in", values, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusNotIn(List<String> values) {
            addCriterion("order_tstatus not in", values, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusBetween(String value1, String value2) {
            addCriterion("order_tstatus between", value1, value2, "orderTstatus");
            return (Criteria) this;
        }

        public Criteria andOrderTstatusNotBetween(String value1, String value2) {
            addCriterion("order_tstatus not between", value1, value2, "orderTstatus");
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