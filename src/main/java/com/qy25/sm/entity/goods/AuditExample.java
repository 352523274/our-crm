package com.qy25.sm.entity.goods;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditExample() {
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

        public Criteria andAuditUserNameIsNull() {
            addCriterion("audit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNotNull() {
            addCriterion("audit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameEqualTo(String value) {
            addCriterion("audit_user_name =", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotEqualTo(String value) {
            addCriterion("audit_user_name <>", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThan(String value) {
            addCriterion("audit_user_name >", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_user_name >=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThan(String value) {
            addCriterion("audit_user_name <", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("audit_user_name <=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLike(String value) {
            addCriterion("audit_user_name like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotLike(String value) {
            addCriterion("audit_user_name not like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIn(List<String> values) {
            addCriterion("audit_user_name in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotIn(List<String> values) {
            addCriterion("audit_user_name not in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameBetween(String value1, String value2) {
            addCriterion("audit_user_name between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("audit_user_name not between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNull() {
            addCriterion("audit_date is null");
            return (Criteria) this;
        }

        public Criteria andAuditDateIsNotNull() {
            addCriterion("audit_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuditDateEqualTo(Date value) {
            addCriterion("audit_date =", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotEqualTo(Date value) {
            addCriterion("audit_date <>", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThan(Date value) {
            addCriterion("audit_date >", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_date >=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThan(Date value) {
            addCriterion("audit_date <", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateLessThanOrEqualTo(Date value) {
            addCriterion("audit_date <=", value, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateIn(List<Date> values) {
            addCriterion("audit_date in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotIn(List<Date> values) {
            addCriterion("audit_date not in", values, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateBetween(Date value1, Date value2) {
            addCriterion("audit_date between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditDateNotBetween(Date value1, Date value2) {
            addCriterion("audit_date not between", value1, value2, "auditDate");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeIsNull() {
            addCriterion("audit_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeIsNotNull() {
            addCriterion("audit_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeEqualTo(Date value) {
            addCriterion("audit_start_time =", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeNotEqualTo(Date value) {
            addCriterion("audit_start_time <>", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeGreaterThan(Date value) {
            addCriterion("audit_start_time >", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_start_time >=", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeLessThan(Date value) {
            addCriterion("audit_start_time <", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_start_time <=", value, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeIn(List<Date> values) {
            addCriterion("audit_start_time in", values, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeNotIn(List<Date> values) {
            addCriterion("audit_start_time not in", values, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeBetween(Date value1, Date value2) {
            addCriterion("audit_start_time between", value1, value2, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_start_time not between", value1, value2, "auditStartTime");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNull() {
            addCriterion("audit_result is null");
            return (Criteria) this;
        }

        public Criteria andAuditResultIsNotNull() {
            addCriterion("audit_result is not null");
            return (Criteria) this;
        }

        public Criteria andAuditResultEqualTo(Byte value) {
            addCriterion("audit_result =", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotEqualTo(Byte value) {
            addCriterion("audit_result <>", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThan(Byte value) {
            addCriterion("audit_result >", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_result >=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThan(Byte value) {
            addCriterion("audit_result <", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultLessThanOrEqualTo(Byte value) {
            addCriterion("audit_result <=", value, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultIn(List<Byte> values) {
            addCriterion("audit_result in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotIn(List<Byte> values) {
            addCriterion("audit_result not in", values, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultBetween(Byte value1, Byte value2) {
            addCriterion("audit_result between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditResultNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_result not between", value1, value2, "auditResult");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaIsNull() {
            addCriterion("audit_idea is null");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaIsNotNull() {
            addCriterion("audit_idea is not null");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaEqualTo(String value) {
            addCriterion("audit_idea =", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaNotEqualTo(String value) {
            addCriterion("audit_idea <>", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaGreaterThan(String value) {
            addCriterion("audit_idea >", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaGreaterThanOrEqualTo(String value) {
            addCriterion("audit_idea >=", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaLessThan(String value) {
            addCriterion("audit_idea <", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaLessThanOrEqualTo(String value) {
            addCriterion("audit_idea <=", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaLike(String value) {
            addCriterion("audit_idea like", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaNotLike(String value) {
            addCriterion("audit_idea not like", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaIn(List<String> values) {
            addCriterion("audit_idea in", values, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaNotIn(List<String> values) {
            addCriterion("audit_idea not in", values, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaBetween(String value1, String value2) {
            addCriterion("audit_idea between", value1, value2, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaNotBetween(String value1, String value2) {
            addCriterion("audit_idea not between", value1, value2, "auditIdea");
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