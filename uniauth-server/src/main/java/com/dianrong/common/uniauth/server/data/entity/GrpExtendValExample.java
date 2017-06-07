package com.dianrong.common.uniauth.server.data.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GrpExtendValExample extends PageParam {
  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  protected String orderByClause;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  protected boolean distinct;

  /**
   * This field was generated by MyBatis Generator. This field corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  protected List<Criteria> oredCriteria;

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public GrpExtendValExample() {
    oredCriteria = new ArrayList<Criteria>();
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public void setOrderByClause(String orderByClause) {
    this.orderByClause = orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public String getOrderByClause() {
    return orderByClause;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public void setDistinct(boolean distinct) {
    this.distinct = distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public boolean isDistinct() {
    return distinct;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public List<Criteria> getOredCriteria() {
    return oredCriteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public void or(Criteria criteria) {
    oredCriteria.add(criteria);
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public Criteria or() {
    Criteria criteria = createCriteriaInternal();
    oredCriteria.add(criteria);
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public Criteria createCriteria() {
    Criteria criteria = createCriteriaInternal();
    if (oredCriteria.size() == 0) {
      oredCriteria.add(criteria);
    }
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  protected Criteria createCriteriaInternal() {
    Criteria criteria = new Criteria();
    return criteria;
  }

  /**
   * This method was generated by MyBatis Generator. This method corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
   */
  public void clear() {
    oredCriteria.clear();
    orderByClause = null;
    distinct = false;
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
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

    public Criteria andGrpIdIsNull() {
      addCriterion("grp_id is null");
      return (Criteria) this;
    }

    public Criteria andGrpIdIsNotNull() {
      addCriterion("grp_id is not null");
      return (Criteria) this;
    }

    public Criteria andGrpIdEqualTo(Integer value) {
      addCriterion("grp_id =", value, "grpId");
      return (Criteria) this;
    }

    public Criteria andGrpIdNotEqualTo(Integer value) {
      addCriterion("grp_id <>", value, "grpId");
      return (Criteria) this;
    }

    public Criteria andGrpIdGreaterThan(Integer value) {
      addCriterion("grp_id >", value, "grpId");
      return (Criteria) this;
    }

    public Criteria andGrpIdGreaterThanOrEqualTo(Integer value) {
      addCriterion("grp_id >=", value, "grpId");
      return (Criteria) this;
    }

    public Criteria andGrpIdLessThan(Integer value) {
      addCriterion("grp_id <", value, "grpId");
      return (Criteria) this;
    }

    public Criteria andGrpIdLessThanOrEqualTo(Integer value) {
      addCriterion("grp_id <=", value, "grpId");
      return (Criteria) this;
    }

    public Criteria andGrpIdIn(List<Integer> values) {
      addCriterion("grp_id in", values, "grpId");
      return (Criteria) this;
    }

    public Criteria andGrpIdNotIn(List<Integer> values) {
      addCriterion("grp_id not in", values, "grpId");
      return (Criteria) this;
    }

    public Criteria andGrpIdBetween(Integer value1, Integer value2) {
      addCriterion("grp_id between", value1, value2, "grpId");
      return (Criteria) this;
    }

    public Criteria andGrpIdNotBetween(Integer value1, Integer value2) {
      addCriterion("grp_id not between", value1, value2, "grpId");
      return (Criteria) this;
    }

    public Criteria andExtendIdIsNull() {
      addCriterion("extend_id is null");
      return (Criteria) this;
    }

    public Criteria andExtendIdIsNotNull() {
      addCriterion("extend_id is not null");
      return (Criteria) this;
    }

    public Criteria andExtendIdEqualTo(Long value) {
      addCriterion("extend_id =", value, "extendId");
      return (Criteria) this;
    }

    public Criteria andExtendIdNotEqualTo(Long value) {
      addCriterion("extend_id <>", value, "extendId");
      return (Criteria) this;
    }

    public Criteria andExtendIdGreaterThan(Long value) {
      addCriterion("extend_id >", value, "extendId");
      return (Criteria) this;
    }

    public Criteria andExtendIdGreaterThanOrEqualTo(Long value) {
      addCriterion("extend_id >=", value, "extendId");
      return (Criteria) this;
    }

    public Criteria andExtendIdLessThan(Long value) {
      addCriterion("extend_id <", value, "extendId");
      return (Criteria) this;
    }

    public Criteria andExtendIdLessThanOrEqualTo(Long value) {
      addCriterion("extend_id <=", value, "extendId");
      return (Criteria) this;
    }

    public Criteria andExtendIdIn(List<Long> values) {
      addCriterion("extend_id in", values, "extendId");
      return (Criteria) this;
    }

    public Criteria andExtendIdNotIn(List<Long> values) {
      addCriterion("extend_id not in", values, "extendId");
      return (Criteria) this;
    }

    public Criteria andExtendIdBetween(Long value1, Long value2) {
      addCriterion("extend_id between", value1, value2, "extendId");
      return (Criteria) this;
    }

    public Criteria andExtendIdNotBetween(Long value1, Long value2) {
      addCriterion("extend_id not between", value1, value2, "extendId");
      return (Criteria) this;
    }

    public Criteria andValueIsNull() {
      addCriterion("value is null");
      return (Criteria) this;
    }

    public Criteria andValueIsNotNull() {
      addCriterion("value is not null");
      return (Criteria) this;
    }

    public Criteria andValueEqualTo(String value) {
      addCriterion("value =", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueNotEqualTo(String value) {
      addCriterion("value <>", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueGreaterThan(String value) {
      addCriterion("value >", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueGreaterThanOrEqualTo(String value) {
      addCriterion("value >=", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueLessThan(String value) {
      addCriterion("value <", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueLessThanOrEqualTo(String value) {
      addCriterion("value <=", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueLike(String value) {
      addCriterion("value like", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueNotLike(String value) {
      addCriterion("value not like", value, "value");
      return (Criteria) this;
    }

    public Criteria andValueIn(List<String> values) {
      addCriterion("value in", values, "value");
      return (Criteria) this;
    }

    public Criteria andValueNotIn(List<String> values) {
      addCriterion("value not in", values, "value");
      return (Criteria) this;
    }

    public Criteria andValueBetween(String value1, String value2) {
      addCriterion("value between", value1, value2, "value");
      return (Criteria) this;
    }

    public Criteria andValueNotBetween(String value1, String value2) {
      addCriterion("value not between", value1, value2, "value");
      return (Criteria) this;
    }

    public Criteria andTenancyIdIsNull() {
      addCriterion("tenancy_id is null");
      return (Criteria) this;
    }

    public Criteria andTenancyIdIsNotNull() {
      addCriterion("tenancy_id is not null");
      return (Criteria) this;
    }

    public Criteria andTenancyIdEqualTo(Long value) {
      addCriterion("tenancy_id =", value, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andTenancyIdNotEqualTo(Long value) {
      addCriterion("tenancy_id <>", value, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andTenancyIdGreaterThan(Long value) {
      addCriterion("tenancy_id >", value, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andTenancyIdGreaterThanOrEqualTo(Long value) {
      addCriterion("tenancy_id >=", value, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andTenancyIdLessThan(Long value) {
      addCriterion("tenancy_id <", value, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andTenancyIdLessThanOrEqualTo(Long value) {
      addCriterion("tenancy_id <=", value, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andTenancyIdIn(List<Long> values) {
      addCriterion("tenancy_id in", values, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andTenancyIdNotIn(List<Long> values) {
      addCriterion("tenancy_id not in", values, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andTenancyIdBetween(Long value1, Long value2) {
      addCriterion("tenancy_id between", value1, value2, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andTenancyIdNotBetween(Long value1, Long value2) {
      addCriterion("tenancy_id not between", value1, value2, "tenancyId");
      return (Criteria) this;
    }

    public Criteria andCreateDateIsNull() {
      addCriterion("create_date is null");
      return (Criteria) this;
    }

    public Criteria andCreateDateIsNotNull() {
      addCriterion("create_date is not null");
      return (Criteria) this;
    }

    public Criteria andCreateDateEqualTo(Date value) {
      addCriterion("create_date =", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateNotEqualTo(Date value) {
      addCriterion("create_date <>", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateGreaterThan(Date value) {
      addCriterion("create_date >", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
      addCriterion("create_date >=", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateLessThan(Date value) {
      addCriterion("create_date <", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateLessThanOrEqualTo(Date value) {
      addCriterion("create_date <=", value, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateIn(List<Date> values) {
      addCriterion("create_date in", values, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateNotIn(List<Date> values) {
      addCriterion("create_date not in", values, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateBetween(Date value1, Date value2) {
      addCriterion("create_date between", value1, value2, "createDate");
      return (Criteria) this;
    }

    public Criteria andCreateDateNotBetween(Date value1, Date value2) {
      addCriterion("create_date not between", value1, value2, "createDate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateIsNull() {
      addCriterion("last_update is null");
      return (Criteria) this;
    }

    public Criteria andLastUpdateIsNotNull() {
      addCriterion("last_update is not null");
      return (Criteria) this;
    }

    public Criteria andLastUpdateEqualTo(Date value) {
      addCriterion("last_update =", value, "lastUpdate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateNotEqualTo(Date value) {
      addCriterion("last_update <>", value, "lastUpdate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateGreaterThan(Date value) {
      addCriterion("last_update >", value, "lastUpdate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateGreaterThanOrEqualTo(Date value) {
      addCriterion("last_update >=", value, "lastUpdate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateLessThan(Date value) {
      addCriterion("last_update <", value, "lastUpdate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateLessThanOrEqualTo(Date value) {
      addCriterion("last_update <=", value, "lastUpdate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateIn(List<Date> values) {
      addCriterion("last_update in", values, "lastUpdate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateNotIn(List<Date> values) {
      addCriterion("last_update not in", values, "lastUpdate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateBetween(Date value1, Date value2) {
      addCriterion("last_update between", value1, value2, "lastUpdate");
      return (Criteria) this;
    }

    public Criteria andLastUpdateNotBetween(Date value1, Date value2) {
      addCriterion("last_update not between", value1, value2, "lastUpdate");
      return (Criteria) this;
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated do_not_delete_during_merge Thu Jun 01 18:13:03 CST 2017
   */
  public static class Criteria extends GeneratedCriteria {

    protected Criteria() {
      super();
    }
  }

  /**
   * This class was generated by MyBatis Generator. This class corresponds to the database table
   * grp_extend_val
   *
   * @mbggenerated Thu Jun 01 18:13:03 CST 2017
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
