package org.leesia.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AgeDistributionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AgeDistributionCriteria() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMinAgeIsNull() {
            addCriterion("MIN_AGE is null");
            return (Criteria) this;
        }

        public Criteria andMinAgeIsNotNull() {
            addCriterion("MIN_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andMinAgeEqualTo(Integer value) {
            addCriterion("MIN_AGE =", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeNotEqualTo(Integer value) {
            addCriterion("MIN_AGE <>", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeGreaterThan(Integer value) {
            addCriterion("MIN_AGE >", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MIN_AGE >=", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeLessThan(Integer value) {
            addCriterion("MIN_AGE <", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeLessThanOrEqualTo(Integer value) {
            addCriterion("MIN_AGE <=", value, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeIn(List<Integer> values) {
            addCriterion("MIN_AGE in", values, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeNotIn(List<Integer> values) {
            addCriterion("MIN_AGE not in", values, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeBetween(Integer value1, Integer value2) {
            addCriterion("MIN_AGE between", value1, value2, "minAge");
            return (Criteria) this;
        }

        public Criteria andMinAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("MIN_AGE not between", value1, value2, "minAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeIsNull() {
            addCriterion("MAX_AGE is null");
            return (Criteria) this;
        }

        public Criteria andMaxAgeIsNotNull() {
            addCriterion("MAX_AGE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxAgeEqualTo(Integer value) {
            addCriterion("MAX_AGE =", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeNotEqualTo(Integer value) {
            addCriterion("MAX_AGE <>", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeGreaterThan(Integer value) {
            addCriterion("MAX_AGE >", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAX_AGE >=", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeLessThan(Integer value) {
            addCriterion("MAX_AGE <", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeLessThanOrEqualTo(Integer value) {
            addCriterion("MAX_AGE <=", value, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeIn(List<Integer> values) {
            addCriterion("MAX_AGE in", values, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeNotIn(List<Integer> values) {
            addCriterion("MAX_AGE not in", values, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeBetween(Integer value1, Integer value2) {
            addCriterion("MAX_AGE between", value1, value2, "maxAge");
            return (Criteria) this;
        }

        public Criteria andMaxAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("MAX_AGE not between", value1, value2, "maxAge");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNull() {
            addCriterion("DISTRIBUTION is null");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNotNull() {
            addCriterion("DISTRIBUTION is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionEqualTo(Double value) {
            addCriterion("DISTRIBUTION =", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotEqualTo(Double value) {
            addCriterion("DISTRIBUTION <>", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThan(Double value) {
            addCriterion("DISTRIBUTION >", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThanOrEqualTo(Double value) {
            addCriterion("DISTRIBUTION >=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThan(Double value) {
            addCriterion("DISTRIBUTION <", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThanOrEqualTo(Double value) {
            addCriterion("DISTRIBUTION <=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionIn(List<Double> values) {
            addCriterion("DISTRIBUTION in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotIn(List<Double> values) {
            addCriterion("DISTRIBUTION not in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionBetween(Double value1, Double value2) {
            addCriterion("DISTRIBUTION between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotBetween(Double value1, Double value2) {
            addCriterion("DISTRIBUTION not between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNull() {
            addCriterion("CREATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIsNotNull() {
            addCriterion("CREATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeEqualTo(Date value) {
            addCriterion("CREATE_DATETIME =", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <>", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThan(Date value) {
            addCriterion("CREATE_DATETIME >", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME >=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThan(Date value) {
            addCriterion("CREATE_DATETIME <", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATETIME <=", value, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeIn(List<Date> values) {
            addCriterion("CREATE_DATETIME in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotIn(List<Date> values) {
            addCriterion("CREATE_DATETIME not in", values, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andCreateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATETIME not between", value1, value2, "createDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNull() {
            addCriterion("UPDATE_DATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIsNotNull() {
            addCriterion("UPDATE_DATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME =", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <>", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThan(Date value) {
            addCriterion("UPDATE_DATETIME >", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME >=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThan(Date value) {
            addCriterion("UPDATE_DATETIME <", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATETIME <=", value, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotIn(List<Date> values) {
            addCriterion("UPDATE_DATETIME not in", values, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME between", value1, value2, "updateDatetime");
            return (Criteria) this;
        }

        public Criteria andUpdateDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATETIME not between", value1, value2, "updateDatetime");
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