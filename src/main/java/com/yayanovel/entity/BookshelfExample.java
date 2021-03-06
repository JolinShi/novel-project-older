package com.yayanovel.entity;

import java.util.ArrayList;
import java.util.List;

public class BookshelfExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    public BookshelfExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
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
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
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

        public Criteria andBookshelfIdIsNull() {
            addCriterion("BOOKSHELF_ID is null");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdIsNotNull() {
            addCriterion("BOOKSHELF_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdEqualTo(Long value) {
            addCriterion("BOOKSHELF_ID =", value, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdNotEqualTo(Long value) {
            addCriterion("BOOKSHELF_ID <>", value, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdGreaterThan(Long value) {
            addCriterion("BOOKSHELF_ID >", value, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BOOKSHELF_ID >=", value, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdLessThan(Long value) {
            addCriterion("BOOKSHELF_ID <", value, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdLessThanOrEqualTo(Long value) {
            addCriterion("BOOKSHELF_ID <=", value, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdIn(List<Long> values) {
            addCriterion("BOOKSHELF_ID in", values, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdNotIn(List<Long> values) {
            addCriterion("BOOKSHELF_ID not in", values, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdBetween(Long value1, Long value2) {
            addCriterion("BOOKSHELF_ID between", value1, value2, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfIdNotBetween(Long value1, Long value2) {
            addCriterion("BOOKSHELF_ID not between", value1, value2, "bookshelfId");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidIsNull() {
            addCriterion("BOOKSHELF_UID is null");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidIsNotNull() {
            addCriterion("BOOKSHELF_UID is not null");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidEqualTo(String value) {
            addCriterion("BOOKSHELF_UID =", value, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidNotEqualTo(String value) {
            addCriterion("BOOKSHELF_UID <>", value, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidGreaterThan(String value) {
            addCriterion("BOOKSHELF_UID >", value, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidGreaterThanOrEqualTo(String value) {
            addCriterion("BOOKSHELF_UID >=", value, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidLessThan(String value) {
            addCriterion("BOOKSHELF_UID <", value, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidLessThanOrEqualTo(String value) {
            addCriterion("BOOKSHELF_UID <=", value, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidLike(String value) {
            addCriterion("BOOKSHELF_UID like", value, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidNotLike(String value) {
            addCriterion("BOOKSHELF_UID not like", value, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidIn(List<String> values) {
            addCriterion("BOOKSHELF_UID in", values, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidNotIn(List<String> values) {
            addCriterion("BOOKSHELF_UID not in", values, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidBetween(String value1, String value2) {
            addCriterion("BOOKSHELF_UID between", value1, value2, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andBookshelfUidNotBetween(String value1, String value2) {
            addCriterion("BOOKSHELF_UID not between", value1, value2, "bookshelfUid");
            return (Criteria) this;
        }

        public Criteria andUserUidIsNull() {
            addCriterion("USER_UID is null");
            return (Criteria) this;
        }

        public Criteria andUserUidIsNotNull() {
            addCriterion("USER_UID is not null");
            return (Criteria) this;
        }

        public Criteria andUserUidEqualTo(String value) {
            addCriterion("USER_UID =", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotEqualTo(String value) {
            addCriterion("USER_UID <>", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThan(String value) {
            addCriterion("USER_UID >", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidGreaterThanOrEqualTo(String value) {
            addCriterion("USER_UID >=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThan(String value) {
            addCriterion("USER_UID <", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLessThanOrEqualTo(String value) {
            addCriterion("USER_UID <=", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidLike(String value) {
            addCriterion("USER_UID like", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotLike(String value) {
            addCriterion("USER_UID not like", value, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidIn(List<String> values) {
            addCriterion("USER_UID in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotIn(List<String> values) {
            addCriterion("USER_UID not in", values, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidBetween(String value1, String value2) {
            addCriterion("USER_UID between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andUserUidNotBetween(String value1, String value2) {
            addCriterion("USER_UID not between", value1, value2, "userUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidIsNull() {
            addCriterion("NOVEL_UID is null");
            return (Criteria) this;
        }

        public Criteria andNovelUidIsNotNull() {
            addCriterion("NOVEL_UID is not null");
            return (Criteria) this;
        }

        public Criteria andNovelUidEqualTo(String value) {
            addCriterion("NOVEL_UID =", value, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidNotEqualTo(String value) {
            addCriterion("NOVEL_UID <>", value, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidGreaterThan(String value) {
            addCriterion("NOVEL_UID >", value, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidGreaterThanOrEqualTo(String value) {
            addCriterion("NOVEL_UID >=", value, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidLessThan(String value) {
            addCriterion("NOVEL_UID <", value, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidLessThanOrEqualTo(String value) {
            addCriterion("NOVEL_UID <=", value, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidLike(String value) {
            addCriterion("NOVEL_UID like", value, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidNotLike(String value) {
            addCriterion("NOVEL_UID not like", value, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidIn(List<String> values) {
            addCriterion("NOVEL_UID in", values, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidNotIn(List<String> values) {
            addCriterion("NOVEL_UID not in", values, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidBetween(String value1, String value2) {
            addCriterion("NOVEL_UID between", value1, value2, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelUidNotBetween(String value1, String value2) {
            addCriterion("NOVEL_UID not between", value1, value2, "novelUid");
            return (Criteria) this;
        }

        public Criteria andNovelNameIsNull() {
            addCriterion("NOVEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNovelNameIsNotNull() {
            addCriterion("NOVEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNovelNameEqualTo(String value) {
            addCriterion("NOVEL_NAME =", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotEqualTo(String value) {
            addCriterion("NOVEL_NAME <>", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameGreaterThan(String value) {
            addCriterion("NOVEL_NAME >", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameGreaterThanOrEqualTo(String value) {
            addCriterion("NOVEL_NAME >=", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameLessThan(String value) {
            addCriterion("NOVEL_NAME <", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameLessThanOrEqualTo(String value) {
            addCriterion("NOVEL_NAME <=", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameLike(String value) {
            addCriterion("NOVEL_NAME like", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotLike(String value) {
            addCriterion("NOVEL_NAME not like", value, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameIn(List<String> values) {
            addCriterion("NOVEL_NAME in", values, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotIn(List<String> values) {
            addCriterion("NOVEL_NAME not in", values, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameBetween(String value1, String value2) {
            addCriterion("NOVEL_NAME between", value1, value2, "novelName");
            return (Criteria) this;
        }

        public Criteria andNovelNameNotBetween(String value1, String value2) {
            addCriterion("NOVEL_NAME not between", value1, value2, "novelName");
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
     * This class corresponds to the database table bookshelf
     *
     * @mbg.generated do_not_delete_during_merge Sun Aug 29 22:50:28 CST 2021
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table bookshelf
     *
     * @mbg.generated Sun Aug 29 22:50:28 CST 2021
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