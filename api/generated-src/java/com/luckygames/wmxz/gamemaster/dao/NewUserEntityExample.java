package com.luckygames.wmxz.gamemaster.dao;

import com.luckygames.wmxz.gamemaster.model.enums.Status;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NewUserEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewUserEntityExample() {
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

        public Criteria andStatusIsNull() {
            addCriterion("`status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Status value) {
            addCriterion("`status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Status value) {
            addCriterion("`status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Status value) {
            addCriterion("`status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Status value) {
            addCriterion("`status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Status value) {
            addCriterion("`status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Status value) {
            addCriterion("`status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Status> values) {
            addCriterion("`status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Status> values) {
            addCriterion("`status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Status value1, Status value2) {
            addCriterion("`status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Status value1, Status value2) {
            addCriterion("`status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNull() {
            addCriterion("server_id is null");
            return (Criteria) this;
        }

        public Criteria andServerIdIsNotNull() {
            addCriterion("server_id is not null");
            return (Criteria) this;
        }

        public Criteria andServerIdEqualTo(Long value) {
            addCriterion("server_id =", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotEqualTo(Long value) {
            addCriterion("server_id <>", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThan(Long value) {
            addCriterion("server_id >", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("server_id >=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThan(Long value) {
            addCriterion("server_id <", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdLessThanOrEqualTo(Long value) {
            addCriterion("server_id <=", value, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdIn(List<Long> values) {
            addCriterion("server_id in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotIn(List<Long> values) {
            addCriterion("server_id not in", values, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdBetween(Long value1, Long value2) {
            addCriterion("server_id between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerIdNotBetween(Long value1, Long value2) {
            addCriterion("server_id not between", value1, value2, "serverId");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNull() {
            addCriterion("`server_name` is null");
            return (Criteria) this;
        }

        public Criteria andServerNameIsNotNull() {
            addCriterion("`server_name` is not null");
            return (Criteria) this;
        }

        public Criteria andServerNameEqualTo(String value) {
            addCriterion("`server_name` =", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotEqualTo(String value) {
            addCriterion("`server_name` <>", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThan(String value) {
            addCriterion("`server_name` >", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameGreaterThanOrEqualTo(String value) {
            addCriterion("`server_name` >=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThan(String value) {
            addCriterion("`server_name` <", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLessThanOrEqualTo(String value) {
            addCriterion("`server_name` <=", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameLike(String value) {
            addCriterion("`server_name` like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotLike(String value) {
            addCriterion("`server_name` not like", value, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameIn(List<String> values) {
            addCriterion("`server_name` in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotIn(List<String> values) {
            addCriterion("`server_name` not in", values, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameBetween(String value1, String value2) {
            addCriterion("`server_name` between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andServerNameNotBetween(String value1, String value2) {
            addCriterion("`server_name` not between", value1, value2, "serverName");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Long value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Long value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Long value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Long value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Long value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Long> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Long> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Long value1, Long value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Long value1, Long value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("channel_name is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("channel_name is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("channel_name =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("channel_name <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("channel_name >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("channel_name >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("channel_name <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("channel_name <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("channel_name like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("channel_name not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("channel_name in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("channel_name not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("channel_name between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("channel_name not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andFirstChargeCountIsNull() {
            addCriterion("first_charge_count is null");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountIsNotNull() {
            addCriterion("first_charge_count is not null");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountEqualTo(Integer value) {
            addCriterion("first_charge_count =", value, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountNotEqualTo(Integer value) {
            addCriterion("first_charge_count <>", value, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountGreaterThan(Integer value) {
            addCriterion("first_charge_count >", value, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_charge_count >=", value, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountLessThan(Integer value) {
            addCriterion("first_charge_count <", value, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountLessThanOrEqualTo(Integer value) {
            addCriterion("first_charge_count <=", value, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountIn(List<Integer> values) {
            addCriterion("first_charge_count in", values, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountNotIn(List<Integer> values) {
            addCriterion("first_charge_count not in", values, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountBetween(Integer value1, Integer value2) {
            addCriterion("first_charge_count between", value1, value2, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andFirstChargeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("first_charge_count not between", value1, value2, "firstChargeCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountIsNull() {
            addCriterion("new_user_count is null");
            return (Criteria) this;
        }

        public Criteria andNewUserCountIsNotNull() {
            addCriterion("new_user_count is not null");
            return (Criteria) this;
        }

        public Criteria andNewUserCountEqualTo(Integer value) {
            addCriterion("new_user_count =", value, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountNotEqualTo(Integer value) {
            addCriterion("new_user_count <>", value, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountGreaterThan(Integer value) {
            addCriterion("new_user_count >", value, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_user_count >=", value, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountLessThan(Integer value) {
            addCriterion("new_user_count <", value, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountLessThanOrEqualTo(Integer value) {
            addCriterion("new_user_count <=", value, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountIn(List<Integer> values) {
            addCriterion("new_user_count in", values, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountNotIn(List<Integer> values) {
            addCriterion("new_user_count not in", values, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountBetween(Integer value1, Integer value2) {
            addCriterion("new_user_count between", value1, value2, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewUserCountNotBetween(Integer value1, Integer value2) {
            addCriterion("new_user_count not between", value1, value2, "newUserCount");
            return (Criteria) this;
        }

        public Criteria andNewPaySumIsNull() {
            addCriterion("new_pay_sum is null");
            return (Criteria) this;
        }

        public Criteria andNewPaySumIsNotNull() {
            addCriterion("new_pay_sum is not null");
            return (Criteria) this;
        }

        public Criteria andNewPaySumEqualTo(Integer value) {
            addCriterion("new_pay_sum =", value, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPaySumNotEqualTo(Integer value) {
            addCriterion("new_pay_sum <>", value, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPaySumGreaterThan(Integer value) {
            addCriterion("new_pay_sum >", value, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPaySumGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_pay_sum >=", value, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPaySumLessThan(Integer value) {
            addCriterion("new_pay_sum <", value, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPaySumLessThanOrEqualTo(Integer value) {
            addCriterion("new_pay_sum <=", value, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPaySumIn(List<Integer> values) {
            addCriterion("new_pay_sum in", values, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPaySumNotIn(List<Integer> values) {
            addCriterion("new_pay_sum not in", values, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPaySumBetween(Integer value1, Integer value2) {
            addCriterion("new_pay_sum between", value1, value2, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPaySumNotBetween(Integer value1, Integer value2) {
            addCriterion("new_pay_sum not between", value1, value2, "newPaySum");
            return (Criteria) this;
        }

        public Criteria andNewPayRateIsNull() {
            addCriterion("new_pay_rate is null");
            return (Criteria) this;
        }

        public Criteria andNewPayRateIsNotNull() {
            addCriterion("new_pay_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNewPayRateEqualTo(BigDecimal value) {
            addCriterion("new_pay_rate =", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateNotEqualTo(BigDecimal value) {
            addCriterion("new_pay_rate <>", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateGreaterThan(BigDecimal value) {
            addCriterion("new_pay_rate >", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("new_pay_rate >=", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateLessThan(BigDecimal value) {
            addCriterion("new_pay_rate <", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("new_pay_rate <=", value, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateIn(List<BigDecimal> values) {
            addCriterion("new_pay_rate in", values, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateNotIn(List<BigDecimal> values) {
            addCriterion("new_pay_rate not in", values, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_pay_rate between", value1, value2, "newPayRate");
            return (Criteria) this;
        }

        public Criteria andNewPayRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("new_pay_rate not between", value1, value2, "newPayRate");
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