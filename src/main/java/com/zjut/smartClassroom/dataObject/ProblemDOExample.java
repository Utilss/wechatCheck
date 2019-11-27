package com.zjut.smartClassroom.dataObject;

import java.util.ArrayList;
import java.util.List;

public class ProblemDOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProblemDOExample() {
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

        public Criteria andProblemIdIsNull() {
            addCriterion("problem_id is null");
            return (Criteria) this;
        }

        public Criteria andProblemIdIsNotNull() {
            addCriterion("problem_id is not null");
            return (Criteria) this;
        }

        public Criteria andProblemIdEqualTo(Integer value) {
            addCriterion("problem_id =", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotEqualTo(Integer value) {
            addCriterion("problem_id <>", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThan(Integer value) {
            addCriterion("problem_id >", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_id >=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThan(Integer value) {
            addCriterion("problem_id <", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdLessThanOrEqualTo(Integer value) {
            addCriterion("problem_id <=", value, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdIn(List<Integer> values) {
            addCriterion("problem_id in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotIn(List<Integer> values) {
            addCriterion("problem_id not in", values, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdBetween(Integer value1, Integer value2) {
            addCriterion("problem_id between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_id not between", value1, value2, "problemId");
            return (Criteria) this;
        }

        public Criteria andProblemInformationIsNull() {
            addCriterion("problem_information is null");
            return (Criteria) this;
        }

        public Criteria andProblemInformationIsNotNull() {
            addCriterion("problem_information is not null");
            return (Criteria) this;
        }

        public Criteria andProblemInformationEqualTo(String value) {
            addCriterion("problem_information =", value, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationNotEqualTo(String value) {
            addCriterion("problem_information <>", value, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationGreaterThan(String value) {
            addCriterion("problem_information >", value, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationGreaterThanOrEqualTo(String value) {
            addCriterion("problem_information >=", value, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationLessThan(String value) {
            addCriterion("problem_information <", value, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationLessThanOrEqualTo(String value) {
            addCriterion("problem_information <=", value, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationLike(String value) {
            addCriterion("problem_information like", value, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationNotLike(String value) {
            addCriterion("problem_information not like", value, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationIn(List<String> values) {
            addCriterion("problem_information in", values, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationNotIn(List<String> values) {
            addCriterion("problem_information not in", values, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationBetween(String value1, String value2) {
            addCriterion("problem_information between", value1, value2, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemInformationNotBetween(String value1, String value2) {
            addCriterion("problem_information not between", value1, value2, "problemInformation");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesIsNull() {
            addCriterion("problem_choices is null");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesIsNotNull() {
            addCriterion("problem_choices is not null");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesEqualTo(String value) {
            addCriterion("problem_choices =", value, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesNotEqualTo(String value) {
            addCriterion("problem_choices <>", value, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesGreaterThan(String value) {
            addCriterion("problem_choices >", value, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesGreaterThanOrEqualTo(String value) {
            addCriterion("problem_choices >=", value, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesLessThan(String value) {
            addCriterion("problem_choices <", value, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesLessThanOrEqualTo(String value) {
            addCriterion("problem_choices <=", value, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesLike(String value) {
            addCriterion("problem_choices like", value, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesNotLike(String value) {
            addCriterion("problem_choices not like", value, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesIn(List<String> values) {
            addCriterion("problem_choices in", values, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesNotIn(List<String> values) {
            addCriterion("problem_choices not in", values, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesBetween(String value1, String value2) {
            addCriterion("problem_choices between", value1, value2, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemChoicesNotBetween(String value1, String value2) {
            addCriterion("problem_choices not between", value1, value2, "problemChoices");
            return (Criteria) this;
        }

        public Criteria andProblemExplainIsNull() {
            addCriterion("problem_explain is null");
            return (Criteria) this;
        }

        public Criteria andProblemExplainIsNotNull() {
            addCriterion("problem_explain is not null");
            return (Criteria) this;
        }

        public Criteria andProblemExplainEqualTo(String value) {
            addCriterion("problem_explain =", value, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainNotEqualTo(String value) {
            addCriterion("problem_explain <>", value, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainGreaterThan(String value) {
            addCriterion("problem_explain >", value, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainGreaterThanOrEqualTo(String value) {
            addCriterion("problem_explain >=", value, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainLessThan(String value) {
            addCriterion("problem_explain <", value, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainLessThanOrEqualTo(String value) {
            addCriterion("problem_explain <=", value, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainLike(String value) {
            addCriterion("problem_explain like", value, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainNotLike(String value) {
            addCriterion("problem_explain not like", value, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainIn(List<String> values) {
            addCriterion("problem_explain in", values, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainNotIn(List<String> values) {
            addCriterion("problem_explain not in", values, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainBetween(String value1, String value2) {
            addCriterion("problem_explain between", value1, value2, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemExplainNotBetween(String value1, String value2) {
            addCriterion("problem_explain not between", value1, value2, "problemExplain");
            return (Criteria) this;
        }

        public Criteria andProblemAnsIsNull() {
            addCriterion("problem_ans is null");
            return (Criteria) this;
        }

        public Criteria andProblemAnsIsNotNull() {
            addCriterion("problem_ans is not null");
            return (Criteria) this;
        }

        public Criteria andProblemAnsEqualTo(Integer value) {
            addCriterion("problem_ans =", value, "problemAns");
            return (Criteria) this;
        }

        public Criteria andProblemAnsNotEqualTo(Integer value) {
            addCriterion("problem_ans <>", value, "problemAns");
            return (Criteria) this;
        }

        public Criteria andProblemAnsGreaterThan(Integer value) {
            addCriterion("problem_ans >", value, "problemAns");
            return (Criteria) this;
        }

        public Criteria andProblemAnsGreaterThanOrEqualTo(Integer value) {
            addCriterion("problem_ans >=", value, "problemAns");
            return (Criteria) this;
        }

        public Criteria andProblemAnsLessThan(Integer value) {
            addCriterion("problem_ans <", value, "problemAns");
            return (Criteria) this;
        }

        public Criteria andProblemAnsLessThanOrEqualTo(Integer value) {
            addCriterion("problem_ans <=", value, "problemAns");
            return (Criteria) this;
        }

        public Criteria andProblemAnsIn(List<Integer> values) {
            addCriterion("problem_ans in", values, "problemAns");
            return (Criteria) this;
        }

        public Criteria andProblemAnsNotIn(List<Integer> values) {
            addCriterion("problem_ans not in", values, "problemAns");
            return (Criteria) this;
        }

        public Criteria andProblemAnsBetween(Integer value1, Integer value2) {
            addCriterion("problem_ans between", value1, value2, "problemAns");
            return (Criteria) this;
        }

        public Criteria andProblemAnsNotBetween(Integer value1, Integer value2) {
            addCriterion("problem_ans not between", value1, value2, "problemAns");
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