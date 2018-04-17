package com.zyc.model.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TfqExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public TfqExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andTfqidIsNull() {
            addCriterion("TFQid is null");
            return (Criteria) this;
        }

        public Criteria andTfqidIsNotNull() {
            addCriterion("TFQid is not null");
            return (Criteria) this;
        }

        public Criteria andTfqidEqualTo(Integer value) {
            addCriterion("TFQid =", value, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqidNotEqualTo(Integer value) {
            addCriterion("TFQid <>", value, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqidGreaterThan(Integer value) {
            addCriterion("TFQid >", value, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TFQid >=", value, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqidLessThan(Integer value) {
            addCriterion("TFQid <", value, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqidLessThanOrEqualTo(Integer value) {
            addCriterion("TFQid <=", value, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqidIn(List<Integer> values) {
            addCriterion("TFQid in", values, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqidNotIn(List<Integer> values) {
            addCriterion("TFQid not in", values, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqidBetween(Integer value1, Integer value2) {
            addCriterion("TFQid between", value1, value2, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqidNotBetween(Integer value1, Integer value2) {
            addCriterion("TFQid not between", value1, value2, "tfqid");
            return (Criteria) this;
        }

        public Criteria andTfqtextIsNull() {
            addCriterion("TFQtext is null");
            return (Criteria) this;
        }

        public Criteria andTfqtextIsNotNull() {
            addCriterion("TFQtext is not null");
            return (Criteria) this;
        }

        public Criteria andTfqtextEqualTo(String value) {
            addCriterion("TFQtext =", value, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextNotEqualTo(String value) {
            addCriterion("TFQtext <>", value, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextGreaterThan(String value) {
            addCriterion("TFQtext >", value, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextGreaterThanOrEqualTo(String value) {
            addCriterion("TFQtext >=", value, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextLessThan(String value) {
            addCriterion("TFQtext <", value, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextLessThanOrEqualTo(String value) {
            addCriterion("TFQtext <=", value, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextLike(String value) {
            addCriterion("TFQtext like", value, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextNotLike(String value) {
            addCriterion("TFQtext not like", value, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextIn(List<String> values) {
            addCriterion("TFQtext in", values, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextNotIn(List<String> values) {
            addCriterion("TFQtext not in", values, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextBetween(String value1, String value2) {
            addCriterion("TFQtext between", value1, value2, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqtextNotBetween(String value1, String value2) {
            addCriterion("TFQtext not between", value1, value2, "tfqtext");
            return (Criteria) this;
        }

        public Criteria andTfqanswerIsNull() {
            addCriterion("TFQanswer is null");
            return (Criteria) this;
        }

        public Criteria andTfqanswerIsNotNull() {
            addCriterion("TFQanswer is not null");
            return (Criteria) this;
        }

        public Criteria andTfqanswerEqualTo(Boolean value) {
            addCriterion("TFQanswer =", value, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andTfqanswerNotEqualTo(Boolean value) {
            addCriterion("TFQanswer <>", value, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andTfqanswerGreaterThan(Boolean value) {
            addCriterion("TFQanswer >", value, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andTfqanswerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("TFQanswer >=", value, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andTfqanswerLessThan(Boolean value) {
            addCriterion("TFQanswer <", value, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andTfqanswerLessThanOrEqualTo(Boolean value) {
            addCriterion("TFQanswer <=", value, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andTfqanswerIn(List<Boolean> values) {
            addCriterion("TFQanswer in", values, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andTfqanswerNotIn(List<Boolean> values) {
            addCriterion("TFQanswer not in", values, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andTfqanswerBetween(Boolean value1, Boolean value2) {
            addCriterion("TFQanswer between", value1, value2, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andTfqanswerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("TFQanswer not between", value1, value2, "tfqanswer");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("startdate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("startdate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("startdate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("startdate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("startdate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("startdate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("startdate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("startdate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("startdate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("startdate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("startdate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("startdate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
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
        public Criterion(){
            super();
        }

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

    public void setOredCriteria(List<Criteria> oredCriteria) {
        this.oredCriteria = oredCriteria;
    }
}