package com.zyc.model.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaperconfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public PaperconfigExample() {
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

        public Criteria andPaperconfigidIsNull() {
            addCriterion("paperconfigid is null");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidIsNotNull() {
            addCriterion("paperconfigid is not null");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidEqualTo(Integer value) {
            addCriterion("paperconfigid =", value, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidNotEqualTo(Integer value) {
            addCriterion("paperconfigid <>", value, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidGreaterThan(Integer value) {
            addCriterion("paperconfigid >", value, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidGreaterThanOrEqualTo(Integer value) {
            addCriterion("paperconfigid >=", value, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidLessThan(Integer value) {
            addCriterion("paperconfigid <", value, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidLessThanOrEqualTo(Integer value) {
            addCriterion("paperconfigid <=", value, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidIn(List<Integer> values) {
            addCriterion("paperconfigid in", values, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidNotIn(List<Integer> values) {
            addCriterion("paperconfigid not in", values, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidBetween(Integer value1, Integer value2) {
            addCriterion("paperconfigid between", value1, value2, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPaperconfigidNotBetween(Integer value1, Integer value2) {
            addCriterion("paperconfigid not between", value1, value2, "paperconfigid");
            return (Criteria) this;
        }

        public Criteria andPapernameIsNull() {
            addCriterion("papername is null");
            return (Criteria) this;
        }

        public Criteria andPapernameIsNotNull() {
            addCriterion("papername is not null");
            return (Criteria) this;
        }

        public Criteria andPapernameEqualTo(String value) {
            addCriterion("papername =", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotEqualTo(String value) {
            addCriterion("papername <>", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameGreaterThan(String value) {
            addCriterion("papername >", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameGreaterThanOrEqualTo(String value) {
            addCriterion("papername >=", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLessThan(String value) {
            addCriterion("papername <", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLessThanOrEqualTo(String value) {
            addCriterion("papername <=", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameLike(String value) {
            addCriterion("papername like", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotLike(String value) {
            addCriterion("papername not like", value, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameIn(List<String> values) {
            addCriterion("papername in", values, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotIn(List<String> values) {
            addCriterion("papername not in", values, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameBetween(String value1, String value2) {
            addCriterion("papername between", value1, value2, "papername");
            return (Criteria) this;
        }

        public Criteria andPapernameNotBetween(String value1, String value2) {
            addCriterion("papername not between", value1, value2, "papername");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNull() {
            addCriterion("subjectid is null");
            return (Criteria) this;
        }

        public Criteria andSubjectidIsNotNull() {
            addCriterion("subjectid is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectidEqualTo(Integer value) {
            addCriterion("subjectid =", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotEqualTo(Integer value) {
            addCriterion("subjectid <>", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThan(Integer value) {
            addCriterion("subjectid >", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("subjectid >=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThan(Integer value) {
            addCriterion("subjectid <", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidLessThanOrEqualTo(Integer value) {
            addCriterion("subjectid <=", value, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidIn(List<Integer> values) {
            addCriterion("subjectid in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotIn(List<Integer> values) {
            addCriterion("subjectid not in", values, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidBetween(Integer value1, Integer value2) {
            addCriterion("subjectid between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andSubjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("subjectid not between", value1, value2, "subjectid");
            return (Criteria) this;
        }

        public Criteria andScqnumIsNull() {
            addCriterion("scqnum is null");
            return (Criteria) this;
        }

        public Criteria andScqnumIsNotNull() {
            addCriterion("scqnum is not null");
            return (Criteria) this;
        }

        public Criteria andScqnumEqualTo(Integer value) {
            addCriterion("scqnum =", value, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqnumNotEqualTo(Integer value) {
            addCriterion("scqnum <>", value, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqnumGreaterThan(Integer value) {
            addCriterion("scqnum >", value, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("scqnum >=", value, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqnumLessThan(Integer value) {
            addCriterion("scqnum <", value, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqnumLessThanOrEqualTo(Integer value) {
            addCriterion("scqnum <=", value, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqnumIn(List<Integer> values) {
            addCriterion("scqnum in", values, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqnumNotIn(List<Integer> values) {
            addCriterion("scqnum not in", values, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqnumBetween(Integer value1, Integer value2) {
            addCriterion("scqnum between", value1, value2, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqnumNotBetween(Integer value1, Integer value2) {
            addCriterion("scqnum not between", value1, value2, "scqnum");
            return (Criteria) this;
        }

        public Criteria andScqvalueIsNull() {
            addCriterion("scqvalue is null");
            return (Criteria) this;
        }

        public Criteria andScqvalueIsNotNull() {
            addCriterion("scqvalue is not null");
            return (Criteria) this;
        }

        public Criteria andScqvalueEqualTo(Double value) {
            addCriterion("scqvalue =", value, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andScqvalueNotEqualTo(Double value) {
            addCriterion("scqvalue <>", value, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andScqvalueGreaterThan(Double value) {
            addCriterion("scqvalue >", value, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andScqvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("scqvalue >=", value, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andScqvalueLessThan(Double value) {
            addCriterion("scqvalue <", value, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andScqvalueLessThanOrEqualTo(Double value) {
            addCriterion("scqvalue <=", value, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andScqvalueIn(List<Double> values) {
            addCriterion("scqvalue in", values, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andScqvalueNotIn(List<Double> values) {
            addCriterion("scqvalue not in", values, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andScqvalueBetween(Double value1, Double value2) {
            addCriterion("scqvalue between", value1, value2, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andScqvalueNotBetween(Double value1, Double value2) {
            addCriterion("scqvalue not between", value1, value2, "scqvalue");
            return (Criteria) this;
        }

        public Criteria andMcqnumIsNull() {
            addCriterion("mcqnum is null");
            return (Criteria) this;
        }

        public Criteria andMcqnumIsNotNull() {
            addCriterion("mcqnum is not null");
            return (Criteria) this;
        }

        public Criteria andMcqnumEqualTo(Integer value) {
            addCriterion("mcqnum =", value, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcqnumNotEqualTo(Integer value) {
            addCriterion("mcqnum <>", value, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcqnumGreaterThan(Integer value) {
            addCriterion("mcqnum >", value, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcqnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("mcqnum >=", value, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcqnumLessThan(Integer value) {
            addCriterion("mcqnum <", value, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcqnumLessThanOrEqualTo(Integer value) {
            addCriterion("mcqnum <=", value, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcqnumIn(List<Integer> values) {
            addCriterion("mcqnum in", values, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcqnumNotIn(List<Integer> values) {
            addCriterion("mcqnum not in", values, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcqnumBetween(Integer value1, Integer value2) {
            addCriterion("mcqnum between", value1, value2, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcqnumNotBetween(Integer value1, Integer value2) {
            addCriterion("mcqnum not between", value1, value2, "mcqnum");
            return (Criteria) this;
        }

        public Criteria andMcavalueIsNull() {
            addCriterion("mcavalue is null");
            return (Criteria) this;
        }

        public Criteria andMcavalueIsNotNull() {
            addCriterion("mcavalue is not null");
            return (Criteria) this;
        }

        public Criteria andMcavalueEqualTo(Double value) {
            addCriterion("mcavalue =", value, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andMcavalueNotEqualTo(Double value) {
            addCriterion("mcavalue <>", value, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andMcavalueGreaterThan(Double value) {
            addCriterion("mcavalue >", value, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andMcavalueGreaterThanOrEqualTo(Double value) {
            addCriterion("mcavalue >=", value, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andMcavalueLessThan(Double value) {
            addCriterion("mcavalue <", value, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andMcavalueLessThanOrEqualTo(Double value) {
            addCriterion("mcavalue <=", value, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andMcavalueIn(List<Double> values) {
            addCriterion("mcavalue in", values, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andMcavalueNotIn(List<Double> values) {
            addCriterion("mcavalue not in", values, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andMcavalueBetween(Double value1, Double value2) {
            addCriterion("mcavalue between", value1, value2, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andMcavalueNotBetween(Double value1, Double value2) {
            addCriterion("mcavalue not between", value1, value2, "mcavalue");
            return (Criteria) this;
        }

        public Criteria andTfqnumIsNull() {
            addCriterion("tfqnum is null");
            return (Criteria) this;
        }

        public Criteria andTfqnumIsNotNull() {
            addCriterion("tfqnum is not null");
            return (Criteria) this;
        }

        public Criteria andTfqnumEqualTo(Integer value) {
            addCriterion("tfqnum =", value, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqnumNotEqualTo(Integer value) {
            addCriterion("tfqnum <>", value, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqnumGreaterThan(Integer value) {
            addCriterion("tfqnum >", value, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("tfqnum >=", value, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqnumLessThan(Integer value) {
            addCriterion("tfqnum <", value, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqnumLessThanOrEqualTo(Integer value) {
            addCriterion("tfqnum <=", value, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqnumIn(List<Integer> values) {
            addCriterion("tfqnum in", values, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqnumNotIn(List<Integer> values) {
            addCriterion("tfqnum not in", values, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqnumBetween(Integer value1, Integer value2) {
            addCriterion("tfqnum between", value1, value2, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqnumNotBetween(Integer value1, Integer value2) {
            addCriterion("tfqnum not between", value1, value2, "tfqnum");
            return (Criteria) this;
        }

        public Criteria andTfqvalueIsNull() {
            addCriterion("tfqvalue is null");
            return (Criteria) this;
        }

        public Criteria andTfqvalueIsNotNull() {
            addCriterion("tfqvalue is not null");
            return (Criteria) this;
        }

        public Criteria andTfqvalueEqualTo(Double value) {
            addCriterion("tfqvalue =", value, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andTfqvalueNotEqualTo(Double value) {
            addCriterion("tfqvalue <>", value, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andTfqvalueGreaterThan(Double value) {
            addCriterion("tfqvalue >", value, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andTfqvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("tfqvalue >=", value, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andTfqvalueLessThan(Double value) {
            addCriterion("tfqvalue <", value, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andTfqvalueLessThanOrEqualTo(Double value) {
            addCriterion("tfqvalue <=", value, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andTfqvalueIn(List<Double> values) {
            addCriterion("tfqvalue in", values, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andTfqvalueNotIn(List<Double> values) {
            addCriterion("tfqvalue not in", values, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andTfqvalueBetween(Double value1, Double value2) {
            addCriterion("tfqvalue between", value1, value2, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andTfqvalueNotBetween(Double value1, Double value2) {
            addCriterion("tfqvalue not between", value1, value2, "tfqvalue");
            return (Criteria) this;
        }

        public Criteria andPqnumIsNull() {
            addCriterion("pqnum is null");
            return (Criteria) this;
        }

        public Criteria andPqnumIsNotNull() {
            addCriterion("pqnum is not null");
            return (Criteria) this;
        }

        public Criteria andPqnumEqualTo(Integer value) {
            addCriterion("pqnum =", value, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqnumNotEqualTo(Integer value) {
            addCriterion("pqnum <>", value, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqnumGreaterThan(Integer value) {
            addCriterion("pqnum >", value, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("pqnum >=", value, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqnumLessThan(Integer value) {
            addCriterion("pqnum <", value, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqnumLessThanOrEqualTo(Integer value) {
            addCriterion("pqnum <=", value, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqnumIn(List<Integer> values) {
            addCriterion("pqnum in", values, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqnumNotIn(List<Integer> values) {
            addCriterion("pqnum not in", values, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqnumBetween(Integer value1, Integer value2) {
            addCriterion("pqnum between", value1, value2, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqnumNotBetween(Integer value1, Integer value2) {
            addCriterion("pqnum not between", value1, value2, "pqnum");
            return (Criteria) this;
        }

        public Criteria andPqvalueIsNull() {
            addCriterion("pqvalue is null");
            return (Criteria) this;
        }

        public Criteria andPqvalueIsNotNull() {
            addCriterion("pqvalue is not null");
            return (Criteria) this;
        }

        public Criteria andPqvalueEqualTo(Double value) {
            addCriterion("pqvalue =", value, "pqvalue");
            return (Criteria) this;
        }

        public Criteria andPqvalueNotEqualTo(Double value) {
            addCriterion("pqvalue <>", value, "pqvalue");
            return (Criteria) this;
        }

        public Criteria andPqvalueGreaterThan(Double value) {
            addCriterion("pqvalue >", value, "pqvalue");
            return (Criteria) this;
        }

        public Criteria andPqvalueGreaterThanOrEqualTo(Double value) {
            addCriterion("pqvalue >=", value, "pqvalue");
            return (Criteria) this;
        }

        public Criteria andPqvalueLessThan(Double value) {
            addCriterion("pqvalue <", value, "pqvalue");
            return (Criteria) this;
        }

        public Criteria andPqvalueLessThanOrEqualTo(Double value) {
            addCriterion("pqvalue <=", value, "pqvalue");
            return (Criteria) this;
        }

        public Criteria andPqvalueIn(List<Double> values) {
            addCriterion("pqvalue in", values, "pqvalue");
            return (Criteria) this;
        }

        public Criteria andPqvalueNotIn(List<Double> values) {
            addCriterion("pqvalue not in", values, "pqvalue");
            return (Criteria) this;
        }

        public Criteria andPqvalueBetween(Double value1, Double value2) {
            addCriterion("pqvalue between", value1, value2, "pqvalue");
            return (Criteria) this;
        }

        public Criteria andPqvalueNotBetween(Double value1, Double value2) {
            addCriterion("pqvalue not between", value1, value2, "pqvalue");
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