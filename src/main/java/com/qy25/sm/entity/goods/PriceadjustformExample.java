package com.qy25.sm.entity.goods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PriceadjustformExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PriceadjustformExample() {
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

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(Long value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(Long value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(Long value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(Long value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(Long value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<Long> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<Long> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(Long value1, Long value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(Long value1, Long value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIsNull() {
            addCriterion("shopping_price is null");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIsNotNull() {
            addCriterion("shopping_price is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceEqualTo(Long value) {
            addCriterion("shopping_price =", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotEqualTo(Long value) {
            addCriterion("shopping_price <>", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThan(Long value) {
            addCriterion("shopping_price >", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("shopping_price >=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThan(Long value) {
            addCriterion("shopping_price <", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThanOrEqualTo(Long value) {
            addCriterion("shopping_price <=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIn(List<Long> values) {
            addCriterion("shopping_price in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotIn(List<Long> values) {
            addCriterion("shopping_price not in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceBetween(Long value1, Long value2) {
            addCriterion("shopping_price between", value1, value2, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotBetween(Long value1, Long value2) {
            addCriterion("shopping_price not between", value1, value2, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(Long value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(Long value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(Long value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(Long value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(Long value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(Long value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<Long> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<Long> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(Long value1, Long value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(Long value1, Long value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceIsNull() {
            addCriterion("adjusted_market_price is null");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceIsNotNull() {
            addCriterion("adjusted_market_price is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceEqualTo(BigDecimal value) {
            addCriterion("adjusted_market_price =", value, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("adjusted_market_price <>", value, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("adjusted_market_price >", value, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("adjusted_market_price >=", value, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceLessThan(BigDecimal value) {
            addCriterion("adjusted_market_price <", value, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("adjusted_market_price <=", value, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceIn(List<BigDecimal> values) {
            addCriterion("adjusted_market_price in", values, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("adjusted_market_price not in", values, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjusted_market_price between", value1, value2, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjusted_market_price not between", value1, value2, "adjustedMarketPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceIsNull() {
            addCriterion("adjusted_shopping_price is null");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceIsNotNull() {
            addCriterion("adjusted_shopping_price is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceEqualTo(BigDecimal value) {
            addCriterion("adjusted_shopping_price =", value, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceNotEqualTo(BigDecimal value) {
            addCriterion("adjusted_shopping_price <>", value, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceGreaterThan(BigDecimal value) {
            addCriterion("adjusted_shopping_price >", value, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("adjusted_shopping_price >=", value, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceLessThan(BigDecimal value) {
            addCriterion("adjusted_shopping_price <", value, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("adjusted_shopping_price <=", value, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceIn(List<BigDecimal> values) {
            addCriterion("adjusted_shopping_price in", values, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceNotIn(List<BigDecimal> values) {
            addCriterion("adjusted_shopping_price not in", values, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjusted_shopping_price between", value1, value2, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andAdjustedShoppingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("adjusted_shopping_price not between", value1, value2, "adjustedShoppingPrice");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateIsNull() {
            addCriterion("hope_effective_date is null");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateIsNotNull() {
            addCriterion("hope_effective_date is not null");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateEqualTo(Date value) {
            addCriterion("hope_effective_date =", value, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateNotEqualTo(Date value) {
            addCriterion("hope_effective_date <>", value, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateGreaterThan(Date value) {
            addCriterion("hope_effective_date >", value, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("hope_effective_date >=", value, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateLessThan(Date value) {
            addCriterion("hope_effective_date <", value, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateLessThanOrEqualTo(Date value) {
            addCriterion("hope_effective_date <=", value, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateIn(List<Date> values) {
            addCriterion("hope_effective_date in", values, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateNotIn(List<Date> values) {
            addCriterion("hope_effective_date not in", values, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateBetween(Date value1, Date value2) {
            addCriterion("hope_effective_date between", value1, value2, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeEffectiveDateNotBetween(Date value1, Date value2) {
            addCriterion("hope_effective_date not between", value1, value2, "hopeEffectiveDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateIsNull() {
            addCriterion("hope_expiry_date is null");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateIsNotNull() {
            addCriterion("hope_expiry_date is not null");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateEqualTo(Date value) {
            addCriterion("hope_expiry_date =", value, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateNotEqualTo(Date value) {
            addCriterion("hope_expiry_date <>", value, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateGreaterThan(Date value) {
            addCriterion("hope_expiry_date >", value, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateGreaterThanOrEqualTo(Date value) {
            addCriterion("hope_expiry_date >=", value, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateLessThan(Date value) {
            addCriterion("hope_expiry_date <", value, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateLessThanOrEqualTo(Date value) {
            addCriterion("hope_expiry_date <=", value, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateIn(List<Date> values) {
            addCriterion("hope_expiry_date in", values, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateNotIn(List<Date> values) {
            addCriterion("hope_expiry_date not in", values, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateBetween(Date value1, Date value2) {
            addCriterion("hope_expiry_date between", value1, value2, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andHopeExpiryDateNotBetween(Date value1, Date value2) {
            addCriterion("hope_expiry_date not between", value1, value2, "hopeExpiryDate");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonIsNull() {
            addCriterion("adjust_reason is null");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonIsNotNull() {
            addCriterion("adjust_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonEqualTo(String value) {
            addCriterion("adjust_reason =", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonNotEqualTo(String value) {
            addCriterion("adjust_reason <>", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonGreaterThan(String value) {
            addCriterion("adjust_reason >", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonGreaterThanOrEqualTo(String value) {
            addCriterion("adjust_reason >=", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonLessThan(String value) {
            addCriterion("adjust_reason <", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonLessThanOrEqualTo(String value) {
            addCriterion("adjust_reason <=", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonLike(String value) {
            addCriterion("adjust_reason like", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonNotLike(String value) {
            addCriterion("adjust_reason not like", value, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonIn(List<String> values) {
            addCriterion("adjust_reason in", values, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonNotIn(List<String> values) {
            addCriterion("adjust_reason not in", values, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonBetween(String value1, String value2) {
            addCriterion("adjust_reason between", value1, value2, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andAdjustReasonNotBetween(String value1, String value2) {
            addCriterion("adjust_reason not between", value1, value2, "adjustReason");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNull() {
            addCriterion("audit_id is null");
            return (Criteria) this;
        }

        public Criteria andAuditIdIsNotNull() {
            addCriterion("audit_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuditIdEqualTo(Long value) {
            addCriterion("audit_id =", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotEqualTo(Long value) {
            addCriterion("audit_id <>", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThan(Long value) {
            addCriterion("audit_id >", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdGreaterThanOrEqualTo(Long value) {
            addCriterion("audit_id >=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThan(Long value) {
            addCriterion("audit_id <", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdLessThanOrEqualTo(Long value) {
            addCriterion("audit_id <=", value, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdIn(List<Long> values) {
            addCriterion("audit_id in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotIn(List<Long> values) {
            addCriterion("audit_id not in", values, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdBetween(Long value1, Long value2) {
            addCriterion("audit_id between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andAuditIdNotBetween(Long value1, Long value2) {
            addCriterion("audit_id not between", value1, value2, "auditId");
            return (Criteria) this;
        }

        public Criteria andAduitStatusIsNull() {
            addCriterion("aduit_status is null");
            return (Criteria) this;
        }

        public Criteria andAduitStatusIsNotNull() {
            addCriterion("aduit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAduitStatusEqualTo(Integer value) {
            addCriterion("aduit_status =", value, "aduitStatus");
            return (Criteria) this;
        }

        public Criteria andAduitStatusNotEqualTo(Integer value) {
            addCriterion("aduit_status <>", value, "aduitStatus");
            return (Criteria) this;
        }

        public Criteria andAduitStatusGreaterThan(Integer value) {
            addCriterion("aduit_status >", value, "aduitStatus");
            return (Criteria) this;
        }

        public Criteria andAduitStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("aduit_status >=", value, "aduitStatus");
            return (Criteria) this;
        }

        public Criteria andAduitStatusLessThan(Integer value) {
            addCriterion("aduit_status <", value, "aduitStatus");
            return (Criteria) this;
        }

        public Criteria andAduitStatusLessThanOrEqualTo(Integer value) {
            addCriterion("aduit_status <=", value, "aduitStatus");
            return (Criteria) this;
        }

        public Criteria andAduitStatusIn(List<Integer> values) {
            addCriterion("aduit_status in", values, "aduitStatus");
            return (Criteria) this;
        }

        public Criteria andAduitStatusNotIn(List<Integer> values) {
            addCriterion("aduit_status not in", values, "aduitStatus");
            return (Criteria) this;
        }

        public Criteria andAduitStatusBetween(Integer value1, Integer value2) {
            addCriterion("aduit_status between", value1, value2, "aduitStatus");
            return (Criteria) this;
        }

        public Criteria andAduitStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("aduit_status not between", value1, value2, "aduitStatus");
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