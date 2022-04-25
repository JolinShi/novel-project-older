package com.yayanovel.entity;

import java.util.ArrayList;
import java.util.List;

public class NovelCategoryExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public NovelCategoryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("CATEGORY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("CATEGORY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("CATEGORY_ID =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("CATEGORY_ID <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("CATEGORY_ID >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CATEGORY_ID >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("CATEGORY_ID <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("CATEGORY_ID <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("CATEGORY_ID in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("CATEGORY_ID not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("CATEGORY_ID between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("CATEGORY_ID not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryUidIsNull() {
            addCriterion("CATEGORY_UID is null");
            return (Criteria) this;
        }

        public Criteria andCategoryUidIsNotNull() {
            addCriterion("CATEGORY_UID is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryUidEqualTo(String value) {
            addCriterion("CATEGORY_UID =", value, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidNotEqualTo(String value) {
            addCriterion("CATEGORY_UID <>", value, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidGreaterThan(String value) {
            addCriterion("CATEGORY_UID >", value, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_UID >=", value, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidLessThan(String value) {
            addCriterion("CATEGORY_UID <", value, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_UID <=", value, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidLike(String value) {
            addCriterion("CATEGORY_UID like", value, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidNotLike(String value) {
            addCriterion("CATEGORY_UID not like", value, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidIn(List<String> values) {
            addCriterion("CATEGORY_UID in", values, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidNotIn(List<String> values) {
            addCriterion("CATEGORY_UID not in", values, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidBetween(String value1, String value2) {
            addCriterion("CATEGORY_UID between", value1, value2, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryUidNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_UID not between", value1, value2, "categoryUid");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("CATEGORY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("CATEGORY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("CATEGORY_NAME =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("CATEGORY_NAME <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("CATEGORY_NAME >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("CATEGORY_NAME <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("CATEGORY_NAME <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("CATEGORY_NAME like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("CATEGORY_NAME not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("CATEGORY_NAME in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("CATEGORY_NAME not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("CATEGORY_NAME not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andText1IsNull() {
            addCriterion("TEXT1 is null");
            return (Criteria) this;
        }

        public Criteria andText1IsNotNull() {
            addCriterion("TEXT1 is not null");
            return (Criteria) this;
        }

        public Criteria andText1EqualTo(String value) {
            addCriterion("TEXT1 =", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotEqualTo(String value) {
            addCriterion("TEXT1 <>", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThan(String value) {
            addCriterion("TEXT1 >", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1GreaterThanOrEqualTo(String value) {
            addCriterion("TEXT1 >=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThan(String value) {
            addCriterion("TEXT1 <", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1LessThanOrEqualTo(String value) {
            addCriterion("TEXT1 <=", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Like(String value) {
            addCriterion("TEXT1 like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotLike(String value) {
            addCriterion("TEXT1 not like", value, "text1");
            return (Criteria) this;
        }

        public Criteria andText1In(List<String> values) {
            addCriterion("TEXT1 in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotIn(List<String> values) {
            addCriterion("TEXT1 not in", values, "text1");
            return (Criteria) this;
        }

        public Criteria andText1Between(String value1, String value2) {
            addCriterion("TEXT1 between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText1NotBetween(String value1, String value2) {
            addCriterion("TEXT1 not between", value1, value2, "text1");
            return (Criteria) this;
        }

        public Criteria andText2IsNull() {
            addCriterion("TEXT2 is null");
            return (Criteria) this;
        }

        public Criteria andText2IsNotNull() {
            addCriterion("TEXT2 is not null");
            return (Criteria) this;
        }

        public Criteria andText2EqualTo(String value) {
            addCriterion("TEXT2 =", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotEqualTo(String value) {
            addCriterion("TEXT2 <>", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThan(String value) {
            addCriterion("TEXT2 >", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2GreaterThanOrEqualTo(String value) {
            addCriterion("TEXT2 >=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThan(String value) {
            addCriterion("TEXT2 <", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2LessThanOrEqualTo(String value) {
            addCriterion("TEXT2 <=", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Like(String value) {
            addCriterion("TEXT2 like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotLike(String value) {
            addCriterion("TEXT2 not like", value, "text2");
            return (Criteria) this;
        }

        public Criteria andText2In(List<String> values) {
            addCriterion("TEXT2 in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotIn(List<String> values) {
            addCriterion("TEXT2 not in", values, "text2");
            return (Criteria) this;
        }

        public Criteria andText2Between(String value1, String value2) {
            addCriterion("TEXT2 between", value1, value2, "text2");
            return (Criteria) this;
        }

        public Criteria andText2NotBetween(String value1, String value2) {
            addCriterion("TEXT2 not between", value1, value2, "text2");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table novel_category
     *
     * @mbg.generated do_not_delete_during_merge Sun Sep 19 21:47:33 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table novel_category
     *
     * @mbg.generated Sun Sep 19 21:47:33 CST 2021
     */
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