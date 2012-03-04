/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
 
package com.company.project.ibatis;

import com.company.project.query.*;

import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.iwallet.biz.common.util.PageList;
import com.iwallet.biz.common.util.money.Money;
import com.company.project.dataobject.UserInfoDO;
import com.company.project.daointerface.UserInfoDAO;

/**
 * UserInfoDAO
 * database table: USER_INFO
 */
public class UserInfoDAO {

	private String insertSql;
	private String insertWithFunctionSql;
	private String updateSql;
	private String queryByUserIdSql;
	private String countUsernameSql;
	private String countDynimicUsernameSql;
	private String insertWithSelectKeySql;
	private String updateSql;
	private String deleteSql;
	private String getByIdSql;
	private String findPage.countSql;
	private String findPageSql;
	private String getByUsernameSql;
	private String getByAgeSql;
	private String subSelectNotOrderBySql;
	private String fromSubQuerySql;
	private String testSqlMapSql;
	private String testSqlMapWithParamsReplaceSql;
	private String testNotParameterSql;
	private String testIncludeByRefidSql;
	private String testSelectColumnsWithQuerySql;
	private String testRoleJoinRolePermissionJoinBlogSql;
	private String testRoleJoinRolePermissionJoinBlogWithCustomParamSql;
	private String testGroupByPagingSql;
	private String testSetOperationsSql;
	private String testMybatisOrderByPagingWithIfSql;
	private String testOpenCloseSql;
	private String testXmlEscapeSql;
	private String testIncludeWhereSql;
	private String testIncludeWhereWithNoPagingSql;
	private String countByUserIdSql;
	private String testMybatisForEachSql;
	private String insertWithNoSelectKeySql;

	public void setinsertSql(String insertSql){
		this.insertSql = insertSql;
	}
	
	public void setinsertWithFunctionSql(String insertWithFunctionSql){
		this.insertWithFunctionSql = insertWithFunctionSql;
	}
	
	public void setupdateSql(String updateSql){
		this.updateSql = updateSql;
	}
	
	public void setqueryByUserIdSql(String queryByUserIdSql){
		this.queryByUserIdSql = queryByUserIdSql;
	}
	
	public void setcountUsernameSql(String countUsernameSql){
		this.countUsernameSql = countUsernameSql;
	}
	
	public void setcountDynimicUsernameSql(String countDynimicUsernameSql){
		this.countDynimicUsernameSql = countDynimicUsernameSql;
	}
	
	public void setinsertWithSelectKeySql(String insertWithSelectKeySql){
		this.insertWithSelectKeySql = insertWithSelectKeySql;
	}
	
	public void setupdateSql(String updateSql){
		this.updateSql = updateSql;
	}
	
	public void setdeleteSql(String deleteSql){
		this.deleteSql = deleteSql;
	}
	
	public void setgetByIdSql(String getByIdSql){
		this.getByIdSql = getByIdSql;
	}
	
	public void setfindPage.countSql(String findPage.countSql){
		this.findPage.countSql = findPage.countSql;
	}
	
	public void setfindPageSql(String findPageSql){
		this.findPageSql = findPageSql;
	}
	
	public void setgetByUsernameSql(String getByUsernameSql){
		this.getByUsernameSql = getByUsernameSql;
	}
	
	public void setgetByAgeSql(String getByAgeSql){
		this.getByAgeSql = getByAgeSql;
	}
	
	public void setsubSelectNotOrderBySql(String subSelectNotOrderBySql){
		this.subSelectNotOrderBySql = subSelectNotOrderBySql;
	}
	
	public void setfromSubQuerySql(String fromSubQuerySql){
		this.fromSubQuerySql = fromSubQuerySql;
	}
	
	public void settestSqlMapSql(String testSqlMapSql){
		this.testSqlMapSql = testSqlMapSql;
	}
	
	public void settestSqlMapWithParamsReplaceSql(String testSqlMapWithParamsReplaceSql){
		this.testSqlMapWithParamsReplaceSql = testSqlMapWithParamsReplaceSql;
	}
	
	public void settestNotParameterSql(String testNotParameterSql){
		this.testNotParameterSql = testNotParameterSql;
	}
	
	public void settestIncludeByRefidSql(String testIncludeByRefidSql){
		this.testIncludeByRefidSql = testIncludeByRefidSql;
	}
	
	public void settestSelectColumnsWithQuerySql(String testSelectColumnsWithQuerySql){
		this.testSelectColumnsWithQuerySql = testSelectColumnsWithQuerySql;
	}
	
	public void settestRoleJoinRolePermissionJoinBlogSql(String testRoleJoinRolePermissionJoinBlogSql){
		this.testRoleJoinRolePermissionJoinBlogSql = testRoleJoinRolePermissionJoinBlogSql;
	}
	
	public void settestRoleJoinRolePermissionJoinBlogWithCustomParamSql(String testRoleJoinRolePermissionJoinBlogWithCustomParamSql){
		this.testRoleJoinRolePermissionJoinBlogWithCustomParamSql = testRoleJoinRolePermissionJoinBlogWithCustomParamSql;
	}
	
	public void settestGroupByPagingSql(String testGroupByPagingSql){
		this.testGroupByPagingSql = testGroupByPagingSql;
	}
	
	public void settestSetOperationsSql(String testSetOperationsSql){
		this.testSetOperationsSql = testSetOperationsSql;
	}
	
	public void settestMybatisOrderByPagingWithIfSql(String testMybatisOrderByPagingWithIfSql){
		this.testMybatisOrderByPagingWithIfSql = testMybatisOrderByPagingWithIfSql;
	}
	
	public void settestOpenCloseSql(String testOpenCloseSql){
		this.testOpenCloseSql = testOpenCloseSql;
	}
	
	public void settestXmlEscapeSql(String testXmlEscapeSql){
		this.testXmlEscapeSql = testXmlEscapeSql;
	}
	
	public void settestIncludeWhereSql(String testIncludeWhereSql){
		this.testIncludeWhereSql = testIncludeWhereSql;
	}
	
	public void settestIncludeWhereWithNoPagingSql(String testIncludeWhereWithNoPagingSql){
		this.testIncludeWhereWithNoPagingSql = testIncludeWhereWithNoPagingSql;
	}
	
	public void setcountByUserIdSql(String countByUserIdSql){
		this.countByUserIdSql = countByUserIdSql;
	}
	
	public void settestMybatisForEachSql(String testMybatisForEachSql){
		this.testMybatisForEachSql = testMybatisForEachSql;
	}
	
	public void setinsertWithNoSelectKeySql(String insertWithNoSelectKeySql){
		this.insertWithNoSelectKeySql = insertWithNoSelectKeySql;
	}
	


	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public java.lang.Long insert(UserInfoDO userInfo) throws DataAccessException {
		if(userInfo == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("UserInfo.insert", userInfo);
		return userInfo.getUserId();
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public java.lang.Long insertWithFunction(UserInfoDO userInfo) throws DataAccessException {
		if(userInfo == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("UserInfo.insertWithFunction", userInfo);
		return userInfo.getUserId();
	}

	/**
	 * 更新一条交易资金单据记录 
	 */
	@SuppressWarnings("unchecked")
	public int update(UserInfoDO userInfo) throws DataAccessException {
		if(userInfo == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return getSqlMapClientTemplate().update("UserInfo.update", userInfo);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public UserInfo queryByUserId(Long userId) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("UserInfo.queryByUserId",userId);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public CountUsernameResult countUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("age",age);
		param.put("sex",sex);
		param.put("maxUsername",maxUsername);
		param.put("minUsername",minUsername);
		return (CountUsernameResult)getSqlMapClientTemplate().queryForObject("UserInfo.countUsername",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public CountDynimicUsernameResult countDynimicUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("age",age);
		param.put("sex",sex);
		param.put("maxUsername",maxUsername);
		param.put("minUsername",minUsername);
		return (CountDynimicUsernameResult)getSqlMapClientTemplate().queryForObject("UserInfo.countDynimicUsername",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public int insertWithSelectKey(Long userId ,String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("username",username);
		param.put("password",password);
		param.put("birthDate",birthDate);
		param.put("sex",sex);
		param.put("age",age);
		return getSqlMapClientTemplate().insert("UserInfo.insertWithSelectKey", param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public int update(String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ,Long userId) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("birthDate",birthDate);
		param.put("sex",sex);
		param.put("age",age);
		param.put("userId",userId);
		return getSqlMapClientTemplate().update("UserInfo.update", param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public int delete(Long userId) throws DataAccessException {
		return getSqlMapClientTemplate().delete("UserInfo.delete", userId);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public UserInfo getById(Long userId) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("UserInfo.getById",userId);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public Long findPage.count(countQuery param) throws DataAccessException {
		return (Long)getSqlMapClientTemplate().queryForObject("UserInfo.findPage.count",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public PageList findPage(FindPageQuery param) throws DataAccessException {
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.findPage",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public UserInfo getByUsername(String username) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("UserInfo.getByUsername",username);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public UserInfo getByAge(com.iwallet.biz.common.util.money.Money age) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("UserInfo.getByAge",age);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public UserInfo subSelectNotOrderBy(String username ,com.iwallet.biz.common.util.money.Money sex ,String password ,java.sql.Date birthDate) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("sex",sex);
		param.put("password",password);
		param.put("birthDate",birthDate);
		return (UserInfo)getSqlMapClientTemplate().queryForObject("UserInfo.subSelectNotOrderBy",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public UserInfo fromSubQuery() throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("UserInfo.fromSubQuery",null);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public PageList testSqlMap(Long userId,int pageSize,int pageNo) throws DataAccessException {
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testSqlMap",userId,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public PageList testSqlMapWithParamsReplace(Long userId,String password,String sexinsex,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("password",password);
		param.put("sexinsex",sexinsex);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testSqlMapWithParamsReplace",param,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public UserInfo testNotParameter() throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("UserInfo.testNotParameter",null);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public UserInfo testIncludeByRefid(com.iwallet.biz.common.util.money.Money age) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("UserInfo.testIncludeByRefid",age);
	}

	/**
	 * 测试select中还有select
	 */
	@SuppressWarnings("unchecked")
	public TestSelectColumnsWithQueryResult testSelectColumnsWithQuery(String pwd_in_select_query ,Long userId) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("pwd_in_select_query",pwd_in_select_query);
		param.put("userId",userId);
		return (TestSelectColumnsWithQueryResult)getSqlMapClientTemplate().queryForObject("UserInfo.testSelectColumnsWithQuery",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public TestRoleJoinRolePermissionJoinBlogResult testRoleJoinRolePermissionJoinBlog(Long roleId ,String roleName) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		return (TestRoleJoinRolePermissionJoinBlogResult)getSqlMapClientTemplate().queryForObject("UserInfo.testRoleJoinRolePermissionJoinBlog",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public TestRoleJoinRolePermissionJoinBlogWithCustomParamResult testRoleJoinRolePermissionJoinBlogWithCustomParam(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		return (TestRoleJoinRolePermissionJoinBlogWithCustomParamResult)getSqlMapClientTemplate().queryForObject("UserInfo.testRoleJoinRolePermissionJoinBlogWithCustomParam",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public PageList testGroupByPaging(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testGroupByPaging",param,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public PageList testSetOperations(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testSetOperations",param,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public PageList testMybatisOrderByPagingWithIf(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testMybatisOrderByPagingWithIf",param,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public PageList testOpenClose(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,java.util.List<String> roleNames,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		param.put("roleNames",roleNames);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testOpenClose",param,pageNo,pageSize);
	}

	/**
	 * 测试xml escape
	 */
	@SuppressWarnings("unchecked")
	public PageList testXmlEscape(Long roleId,String roleName,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testXmlEscape",param,pageNo,pageSize);
	}

	/**
	 * 测试testIncludeWhere
	 */
	@SuppressWarnings("unchecked")
	public PageList testIncludeWhere(String username,String password,String secondUsername,String noduplicationUsername,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("secondUsername",secondUsername);
		param.put("noduplicationUsername",noduplicationUsername);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testIncludeWhere",param,pageNo,pageSize);
	}

	/**
	 * 测试testIncludeWhere
	 */
	@SuppressWarnings("unchecked")
	public UserInfo testIncludeWhereWithNoPaging(String username ,String password ,String secondUsername ,String noduplicationUsername) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("secondUsername",secondUsername);
		param.put("noduplicationUsername",noduplicationUsername);
		return (UserInfo)getSqlMapClientTemplate().queryForObject("UserInfo.testIncludeWhereWithNoPaging",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public Long countByUserId(Long userId) throws DataAccessException {
		return (Long)getSqlMapClientTemplate().queryForObject("UserInfo.countByUserId",userId);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public PageList testMybatisForEach(TestMybatisForEachQuery param) throws DataAccessException {
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testMybatisForEach",param);
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public java.lang.Long insertWithNoSelectKey(UserInfoDO userInfo) throws DataAccessException {
		if(userInfo == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("UserInfo.insertWithNoSelectKey", userInfo);
		return userInfo.getUserId();
	}

}

