package com.zyc.model.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FilterpathExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FilterpathExample() {
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

        public Criteria andFilteridIsNull() {
            addCriterion("filterid is null");
            return (Criteria) this;
        }

        public Criteria andFilteridIsNotNull() {
            addCriterion("filterid is not null");
            return (Criteria) this;
        }

        public Criteria andFilteridEqualTo(Integer value) {
            addCriterion("filterid =", value, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilteridNotEqualTo(Integer value) {
            addCriterion("filterid <>", value, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilteridGreaterThan(Integer value) {
            addCriterion("filterid >", value, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilteridGreaterThanOrEqualTo(Integer value) {
            addCriterion("filterid >=", value, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilteridLessThan(Integer value) {
            addCriterion("filterid <", value, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilteridLessThanOrEqualTo(Integer value) {
            addCriterion("filterid <=", value, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilteridIn(List<Integer> values) {
            addCriterion("filterid in", values, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilteridNotIn(List<Integer> values) {
            addCriterion("filterid not in", values, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilteridBetween(Integer value1, Integer value2) {
            addCriterion("filterid between", value1, value2, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilteridNotBetween(Integer value1, Integer value2) {
            addCriterion("filterid not between", value1, value2, "filterid");
            return (Criteria) this;
        }

        public Criteria andFilterpathIsNull() {
            addCriterion("filterPath is null");
            return (Criteria) this;
        }

        public Criteria andFilterpathIsNotNull() {
            addCriterion("filterPath is not null");
            return (Criteria) this;
        }

        public Criteria andFilterpathEqualTo(String value) {
            addCriterion("filterPath =", value, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathNotEqualTo(String value) {
            addCriterion("filterPath <>", value, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathGreaterThan(String value) {
            addCriterion("filterPath >", value, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathGreaterThanOrEqualTo(String value) {
            addCriterion("filterPath >=", value, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathLessThan(String value) {
            addCriterion("filterPath <", value, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathLessThanOrEqualTo(String value) {
            addCriterion("filterPath <=", value, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathLike(String value) {
            addCriterion("filterPath like", value, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathNotLike(String value) {
            addCriterion("filterPath not like", value, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathIn(List<String> values) {
            addCriterion("filterPath in", values, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathNotIn(List<String> values) {
            addCriterion("filterPath not in", values, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathBetween(String value1, String value2) {
            addCriterion("filterPath between", value1, value2, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterpathNotBetween(String value1, String value2) {
            addCriterion("filterPath not between", value1, value2, "filterpath");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityIsNull() {
            addCriterion("filterAuthority is null");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityIsNotNull() {
            addCriterion("filterAuthority is not null");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityEqualTo(String value) {
            addCriterion("filterAuthority =", value, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityNotEqualTo(String value) {
            addCriterion("filterAuthority <>", value, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityGreaterThan(String value) {
            addCriterion("filterAuthority >", value, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityGreaterThanOrEqualTo(String value) {
            addCriterion("filterAuthority >=", value, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityLessThan(String value) {
            addCriterion("filterAuthority <", value, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityLessThanOrEqualTo(String value) {
            addCriterion("filterAuthority <=", value, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityLike(String value) {
            addCriterion("filterAuthority like", value, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityNotLike(String value) {
            addCriterion("filterAuthority not like", value, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityIn(List<String> values) {
            addCriterion("filterAuthority in", values, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityNotIn(List<String> values) {
            addCriterion("filterAuthority not in", values, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityBetween(String value1, String value2) {
            addCriterion("filterAuthority between", value1, value2, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterauthorityNotBetween(String value1, String value2) {
            addCriterion("filterAuthority not between", value1, value2, "filterauthority");
            return (Criteria) this;
        }

        public Criteria andFilterroleIsNull() {
            addCriterion("filterRole is null");
            return (Criteria) this;
        }

        public Criteria andFilterroleIsNotNull() {
            addCriterion("filterRole is not null");
            return (Criteria) this;
        }

        public Criteria andFilterroleEqualTo(String value) {
            addCriterion("filterRole =", value, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleNotEqualTo(String value) {
            addCriterion("filterRole <>", value, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleGreaterThan(String value) {
            addCriterion("filterRole >", value, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleGreaterThanOrEqualTo(String value) {
            addCriterion("filterRole >=", value, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleLessThan(String value) {
            addCriterion("filterRole <", value, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleLessThanOrEqualTo(String value) {
            addCriterion("filterRole <=", value, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleLike(String value) {
            addCriterion("filterRole like", value, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleNotLike(String value) {
            addCriterion("filterRole not like", value, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleIn(List<String> values) {
            addCriterion("filterRole in", values, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleNotIn(List<String> values) {
            addCriterion("filterRole not in", values, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleBetween(String value1, String value2) {
            addCriterion("filterRole between", value1, value2, "filterrole");
            return (Criteria) this;
        }

        public Criteria andFilterroleNotBetween(String value1, String value2) {
            addCriterion("filterRole not between", value1, value2, "filterrole");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
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
        public Criterion(){
            super();
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