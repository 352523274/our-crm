package com.qy25.sm.entity.goods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiftExample() {
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

        public Criteria andGiftsNameIsNull() {
            addCriterion("gifts_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftsNameIsNotNull() {
            addCriterion("gifts_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsNameEqualTo(String value) {
            addCriterion("gifts_name =", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotEqualTo(String value) {
            addCriterion("gifts_name <>", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameGreaterThan(String value) {
            addCriterion("gifts_name >", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameGreaterThanOrEqualTo(String value) {
            addCriterion("gifts_name >=", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameLessThan(String value) {
            addCriterion("gifts_name <", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameLessThanOrEqualTo(String value) {
            addCriterion("gifts_name <=", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameLike(String value) {
            addCriterion("gifts_name like", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotLike(String value) {
            addCriterion("gifts_name not like", value, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameIn(List<String> values) {
            addCriterion("gifts_name in", values, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotIn(List<String> values) {
            addCriterion("gifts_name not in", values, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameBetween(String value1, String value2) {
            addCriterion("gifts_name between", value1, value2, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsNameNotBetween(String value1, String value2) {
            addCriterion("gifts_name not between", value1, value2, "giftsName");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdIsNull() {
            addCriterion("gifts_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdIsNotNull() {
            addCriterion("gifts_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdEqualTo(Long value) {
            addCriterion("gifts_brand_id =", value, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdNotEqualTo(Long value) {
            addCriterion("gifts_brand_id <>", value, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdGreaterThan(Long value) {
            addCriterion("gifts_brand_id >", value, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gifts_brand_id >=", value, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdLessThan(Long value) {
            addCriterion("gifts_brand_id <", value, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("gifts_brand_id <=", value, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdIn(List<Long> values) {
            addCriterion("gifts_brand_id in", values, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdNotIn(List<Long> values) {
            addCriterion("gifts_brand_id not in", values, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdBetween(Long value1, Long value2) {
            addCriterion("gifts_brand_id between", value1, value2, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("gifts_brand_id not between", value1, value2, "giftsBrandId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdIsNull() {
            addCriterion("gifts_catagory_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdIsNotNull() {
            addCriterion("gifts_catagory_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdEqualTo(Long value) {
            addCriterion("gifts_catagory_id =", value, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdNotEqualTo(Long value) {
            addCriterion("gifts_catagory_id <>", value, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdGreaterThan(Long value) {
            addCriterion("gifts_catagory_id >", value, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gifts_catagory_id >=", value, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdLessThan(Long value) {
            addCriterion("gifts_catagory_id <", value, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdLessThanOrEqualTo(Long value) {
            addCriterion("gifts_catagory_id <=", value, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdIn(List<Long> values) {
            addCriterion("gifts_catagory_id in", values, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdNotIn(List<Long> values) {
            addCriterion("gifts_catagory_id not in", values, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdBetween(Long value1, Long value2) {
            addCriterion("gifts_catagory_id between", value1, value2, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsCatagoryIdNotBetween(Long value1, Long value2) {
            addCriterion("gifts_catagory_id not between", value1, value2, "giftsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGiftsModelIsNull() {
            addCriterion("gifts_model is null");
            return (Criteria) this;
        }

        public Criteria andGiftsModelIsNotNull() {
            addCriterion("gifts_model is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsModelEqualTo(String value) {
            addCriterion("gifts_model =", value, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelNotEqualTo(String value) {
            addCriterion("gifts_model <>", value, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelGreaterThan(String value) {
            addCriterion("gifts_model >", value, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelGreaterThanOrEqualTo(String value) {
            addCriterion("gifts_model >=", value, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelLessThan(String value) {
            addCriterion("gifts_model <", value, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelLessThanOrEqualTo(String value) {
            addCriterion("gifts_model <=", value, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelLike(String value) {
            addCriterion("gifts_model like", value, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelNotLike(String value) {
            addCriterion("gifts_model not like", value, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelIn(List<String> values) {
            addCriterion("gifts_model in", values, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelNotIn(List<String> values) {
            addCriterion("gifts_model not in", values, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelBetween(String value1, String value2) {
            addCriterion("gifts_model between", value1, value2, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsModelNotBetween(String value1, String value2) {
            addCriterion("gifts_model not between", value1, value2, "giftsModel");
            return (Criteria) this;
        }

        public Criteria andGiftsColorIsNull() {
            addCriterion("gifts_color is null");
            return (Criteria) this;
        }

        public Criteria andGiftsColorIsNotNull() {
            addCriterion("gifts_color is not null");
            return (Criteria) this;
        }

        public Criteria andGiftsColorEqualTo(String value) {
            addCriterion("gifts_color =", value, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorNotEqualTo(String value) {
            addCriterion("gifts_color <>", value, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorGreaterThan(String value) {
            addCriterion("gifts_color >", value, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorGreaterThanOrEqualTo(String value) {
            addCriterion("gifts_color >=", value, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorLessThan(String value) {
            addCriterion("gifts_color <", value, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorLessThanOrEqualTo(String value) {
            addCriterion("gifts_color <=", value, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorLike(String value) {
            addCriterion("gifts_color like", value, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorNotLike(String value) {
            addCriterion("gifts_color not like", value, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorIn(List<String> values) {
            addCriterion("gifts_color in", values, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorNotIn(List<String> values) {
            addCriterion("gifts_color not in", values, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorBetween(String value1, String value2) {
            addCriterion("gifts_color between", value1, value2, "giftsColor");
            return (Criteria) this;
        }

        public Criteria andGiftsColorNotBetween(String value1, String value2) {
            addCriterion("gifts_color not between", value1, value2, "giftsColor");
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

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
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

        public Criteria andShoppingPriceEqualTo(BigDecimal value) {
            addCriterion("shopping_price =", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotEqualTo(BigDecimal value) {
            addCriterion("shopping_price <>", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThan(BigDecimal value) {
            addCriterion("shopping_price >", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("shopping_price >=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThan(BigDecimal value) {
            addCriterion("shopping_price <", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("shopping_price <=", value, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceIn(List<BigDecimal> values) {
            addCriterion("shopping_price in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotIn(List<BigDecimal> values) {
            addCriterion("shopping_price not in", values, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shopping_price between", value1, value2, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andShoppingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("shopping_price not between", value1, value2, "shoppingPrice");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdIsNull() {
            addCriterion("purchase_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdIsNotNull() {
            addCriterion("purchase_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdEqualTo(Long value) {
            addCriterion("purchase_dept_id =", value, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdNotEqualTo(Long value) {
            addCriterion("purchase_dept_id <>", value, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdGreaterThan(Long value) {
            addCriterion("purchase_dept_id >", value, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("purchase_dept_id >=", value, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdLessThan(Long value) {
            addCriterion("purchase_dept_id <", value, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("purchase_dept_id <=", value, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdIn(List<Long> values) {
            addCriterion("purchase_dept_id in", values, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdNotIn(List<Long> values) {
            addCriterion("purchase_dept_id not in", values, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdBetween(Long value1, Long value2) {
            addCriterion("purchase_dept_id between", value1, value2, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("purchase_dept_id not between", value1, value2, "purchaseDeptId");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNull() {
            addCriterion("purchase_price is null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIsNotNull() {
            addCriterion("purchase_price is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("purchase_price =", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("purchase_price <>", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("purchase_price >", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price >=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThan(BigDecimal value) {
            addCriterion("purchase_price <", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("purchase_price <=", value, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("purchase_price in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("purchase_price not in", values, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price between", value1, value2, "purchasePrice");
            return (Criteria) this;
        }

        public Criteria andPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("purchase_price not between", value1, value2, "purchasePrice");
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

        public Criteria andMinStockIsNull() {
            addCriterion("min_stock is null");
            return (Criteria) this;
        }

        public Criteria andMinStockIsNotNull() {
            addCriterion("min_stock is not null");
            return (Criteria) this;
        }

        public Criteria andMinStockEqualTo(Long value) {
            addCriterion("min_stock =", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockNotEqualTo(Long value) {
            addCriterion("min_stock <>", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockGreaterThan(Long value) {
            addCriterion("min_stock >", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockGreaterThanOrEqualTo(Long value) {
            addCriterion("min_stock >=", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockLessThan(Long value) {
            addCriterion("min_stock <", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockLessThanOrEqualTo(Long value) {
            addCriterion("min_stock <=", value, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockIn(List<Long> values) {
            addCriterion("min_stock in", values, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockNotIn(List<Long> values) {
            addCriterion("min_stock not in", values, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockBetween(Long value1, Long value2) {
            addCriterion("min_stock between", value1, value2, "minStock");
            return (Criteria) this;
        }

        public Criteria andMinStockNotBetween(Long value1, Long value2) {
            addCriterion("min_stock not between", value1, value2, "minStock");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseIsNull() {
            addCriterion("can_purchase is null");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseIsNotNull() {
            addCriterion("can_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseEqualTo(Boolean value) {
            addCriterion("can_purchase =", value, "canPurchase");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseNotEqualTo(Boolean value) {
            addCriterion("can_purchase <>", value, "canPurchase");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseGreaterThan(Boolean value) {
            addCriterion("can_purchase >", value, "canPurchase");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseGreaterThanOrEqualTo(Boolean value) {
            addCriterion("can_purchase >=", value, "canPurchase");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseLessThan(Boolean value) {
            addCriterion("can_purchase <", value, "canPurchase");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseLessThanOrEqualTo(Boolean value) {
            addCriterion("can_purchase <=", value, "canPurchase");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseIn(List<Boolean> values) {
            addCriterion("can_purchase in", values, "canPurchase");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseNotIn(List<Boolean> values) {
            addCriterion("can_purchase not in", values, "canPurchase");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseBetween(Boolean value1, Boolean value2) {
            addCriterion("can_purchase between", value1, value2, "canPurchase");
            return (Criteria) this;
        }

        public Criteria andCanPurchaseNotBetween(Boolean value1, Boolean value2) {
            addCriterion("can_purchase not between", value1, value2, "canPurchase");
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