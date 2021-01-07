package com.qy25.sm.entity.goods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andFirstGoodsIdIsNull() {
            addCriterion("first_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdIsNotNull() {
            addCriterion("first_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdEqualTo(Long value) {
            addCriterion("first_goods_id =", value, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdNotEqualTo(Long value) {
            addCriterion("first_goods_id <>", value, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdGreaterThan(Long value) {
            addCriterion("first_goods_id >", value, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("first_goods_id >=", value, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdLessThan(Long value) {
            addCriterion("first_goods_id <", value, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("first_goods_id <=", value, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdIn(List<Long> values) {
            addCriterion("first_goods_id in", values, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdNotIn(List<Long> values) {
            addCriterion("first_goods_id not in", values, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdBetween(Long value1, Long value2) {
            addCriterion("first_goods_id between", value1, value2, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andFirstGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("first_goods_id not between", value1, value2, "firstGoodsId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNull() {
            addCriterion("gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGiftIdIsNotNull() {
            addCriterion("gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGiftIdEqualTo(Long value) {
            addCriterion("gift_id =", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotEqualTo(Long value) {
            addCriterion("gift_id <>", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThan(Long value) {
            addCriterion("gift_id >", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdGreaterThanOrEqualTo(Long value) {
            addCriterion("gift_id >=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThan(Long value) {
            addCriterion("gift_id <", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdLessThanOrEqualTo(Long value) {
            addCriterion("gift_id <=", value, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdIn(List<Long> values) {
            addCriterion("gift_id in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotIn(List<Long> values) {
            addCriterion("gift_id not in", values, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdBetween(Long value1, Long value2) {
            addCriterion("gift_id between", value1, value2, "giftId");
            return (Criteria) this;
        }

        public Criteria andGiftIdNotBetween(Long value1, Long value2) {
            addCriterion("gift_id not between", value1, value2, "giftId");
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

        public Criteria andGoodsBrandIdIsNull() {
            addCriterion("goods_brand_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdIsNotNull() {
            addCriterion("goods_brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdEqualTo(Long value) {
            addCriterion("goods_brand_id =", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotEqualTo(Long value) {
            addCriterion("goods_brand_id <>", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdGreaterThan(Long value) {
            addCriterion("goods_brand_id >", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_brand_id >=", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdLessThan(Long value) {
            addCriterion("goods_brand_id <", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_brand_id <=", value, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdIn(List<Long> values) {
            addCriterion("goods_brand_id in", values, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotIn(List<Long> values) {
            addCriterion("goods_brand_id not in", values, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdBetween(Long value1, Long value2) {
            addCriterion("goods_brand_id between", value1, value2, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_brand_id not between", value1, value2, "goodsBrandId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdIsNull() {
            addCriterion("goods_catagory_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdIsNotNull() {
            addCriterion("goods_catagory_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdEqualTo(Long value) {
            addCriterion("goods_catagory_id =", value, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdNotEqualTo(Long value) {
            addCriterion("goods_catagory_id <>", value, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdGreaterThan(Long value) {
            addCriterion("goods_catagory_id >", value, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_catagory_id >=", value, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdLessThan(Long value) {
            addCriterion("goods_catagory_id <", value, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_catagory_id <=", value, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdIn(List<Long> values) {
            addCriterion("goods_catagory_id in", values, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdNotIn(List<Long> values) {
            addCriterion("goods_catagory_id not in", values, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdBetween(Long value1, Long value2) {
            addCriterion("goods_catagory_id between", value1, value2, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsCatagoryIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_catagory_id not between", value1, value2, "goodsCatagoryId");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIsNull() {
            addCriterion("goods_model is null");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIsNotNull() {
            addCriterion("goods_model is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsModelEqualTo(String value) {
            addCriterion("goods_model =", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotEqualTo(String value) {
            addCriterion("goods_model <>", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelGreaterThan(String value) {
            addCriterion("goods_model >", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelGreaterThanOrEqualTo(String value) {
            addCriterion("goods_model >=", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLessThan(String value) {
            addCriterion("goods_model <", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLessThanOrEqualTo(String value) {
            addCriterion("goods_model <=", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelLike(String value) {
            addCriterion("goods_model like", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotLike(String value) {
            addCriterion("goods_model not like", value, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelIn(List<String> values) {
            addCriterion("goods_model in", values, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotIn(List<String> values) {
            addCriterion("goods_model not in", values, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelBetween(String value1, String value2) {
            addCriterion("goods_model between", value1, value2, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsModelNotBetween(String value1, String value2) {
            addCriterion("goods_model not between", value1, value2, "goodsModel");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdIsNull() {
            addCriterion("goods_color_Id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdIsNotNull() {
            addCriterion("goods_color_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdEqualTo(Long value) {
            addCriterion("goods_color_Id =", value, "goodsColorId");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdNotEqualTo(Long value) {
            addCriterion("goods_color_Id <>", value, "goodsColorId");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdGreaterThan(Long value) {
            addCriterion("goods_color_Id >", value, "goodsColorId");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_color_Id >=", value, "goodsColorId");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdLessThan(Long value) {
            addCriterion("goods_color_Id <", value, "goodsColorId");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_color_Id <=", value, "goodsColorId");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdIn(List<Long> values) {
            addCriterion("goods_color_Id in", values, "goodsColorId");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdNotIn(List<Long> values) {
            addCriterion("goods_color_Id not in", values, "goodsColorId");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdBetween(Long value1, Long value2) {
            addCriterion("goods_color_Id between", value1, value2, "goodsColorId");
            return (Criteria) this;
        }

        public Criteria andGoodsColorIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_color_Id not between", value1, value2, "goodsColorId");
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

        public Criteria andTranceMessageIsNull() {
            addCriterion("trance_message is null");
            return (Criteria) this;
        }

        public Criteria andTranceMessageIsNotNull() {
            addCriterion("trance_message is not null");
            return (Criteria) this;
        }

        public Criteria andTranceMessageEqualTo(String value) {
            addCriterion("trance_message =", value, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageNotEqualTo(String value) {
            addCriterion("trance_message <>", value, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageGreaterThan(String value) {
            addCriterion("trance_message >", value, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageGreaterThanOrEqualTo(String value) {
            addCriterion("trance_message >=", value, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageLessThan(String value) {
            addCriterion("trance_message <", value, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageLessThanOrEqualTo(String value) {
            addCriterion("trance_message <=", value, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageLike(String value) {
            addCriterion("trance_message like", value, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageNotLike(String value) {
            addCriterion("trance_message not like", value, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageIn(List<String> values) {
            addCriterion("trance_message in", values, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageNotIn(List<String> values) {
            addCriterion("trance_message not in", values, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageBetween(String value1, String value2) {
            addCriterion("trance_message between", value1, value2, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andTranceMessageNotBetween(String value1, String value2) {
            addCriterion("trance_message not between", value1, value2, "tranceMessage");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdIsNull() {
            addCriterion("goods_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdIsNotNull() {
            addCriterion("goods_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdEqualTo(String value) {
            addCriterion("goods_supplier_id =", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotEqualTo(String value) {
            addCriterion("goods_supplier_id <>", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdGreaterThan(String value) {
            addCriterion("goods_supplier_id >", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_supplier_id >=", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdLessThan(String value) {
            addCriterion("goods_supplier_id <", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdLessThanOrEqualTo(String value) {
            addCriterion("goods_supplier_id <=", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdLike(String value) {
            addCriterion("goods_supplier_id like", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotLike(String value) {
            addCriterion("goods_supplier_id not like", value, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdIn(List<String> values) {
            addCriterion("goods_supplier_id in", values, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotIn(List<String> values) {
            addCriterion("goods_supplier_id not in", values, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdBetween(String value1, String value2) {
            addCriterion("goods_supplier_id between", value1, value2, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andGoodsSupplierIdNotBetween(String value1, String value2) {
            addCriterion("goods_supplier_id not between", value1, value2, "goodsSupplierId");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIsNull() {
            addCriterion("purchase_dept is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIsNotNull() {
            addCriterion("purchase_dept is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptEqualTo(String value) {
            addCriterion("purchase_dept =", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptNotEqualTo(String value) {
            addCriterion("purchase_dept <>", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptGreaterThan(String value) {
            addCriterion("purchase_dept >", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptGreaterThanOrEqualTo(String value) {
            addCriterion("purchase_dept >=", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptLessThan(String value) {
            addCriterion("purchase_dept <", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptLessThanOrEqualTo(String value) {
            addCriterion("purchase_dept <=", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptLike(String value) {
            addCriterion("purchase_dept like", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptNotLike(String value) {
            addCriterion("purchase_dept not like", value, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptIn(List<String> values) {
            addCriterion("purchase_dept in", values, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptNotIn(List<String> values) {
            addCriterion("purchase_dept not in", values, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptBetween(String value1, String value2) {
            addCriterion("purchase_dept between", value1, value2, "purchaseDept");
            return (Criteria) this;
        }

        public Criteria andPurchaseDeptNotBetween(String value1, String value2) {
            addCriterion("purchase_dept not between", value1, value2, "purchaseDept");
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