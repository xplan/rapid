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

	private String updateSql;
	private String deleteSql;
	private String getByIdSql;
	private String testGroupByPagingSql;
	private String testSetOperationsSql;
	private String testOpenCloseSql;
	private String testOpenClose_with_listSql;

	public void setupdateSql(String updateSql){
		this.updateSql = updateSql;
	}
	
	public void setdeleteSql(String deleteSql){
		this.deleteSql = deleteSql;
	}
	
	public void setgetByIdSql(String getByIdSql){
		this.getByIdSql = getByIdSql;
	}
	
	public void settestGroupByPagingSql(String testGroupByPagingSql){
		this.testGroupByPagingSql = testGroupByPagingSql;
	}
	
	public void settestSetOperationsSql(String testSetOperationsSql){
		this.testSetOperationsSql = testSetOperationsSql;
	}
	
	public void settestOpenCloseSql(String testOpenCloseSql){
		this.testOpenCloseSql = testOpenCloseSql;
	}
	
	public void settestOpenClose_with_listSql(String testOpenClose_with_listSql){
		this.testOpenClose_with_listSql = testOpenClose_with_listSql;
	}
	


	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public int update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId) throws DataAccessException {
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
	public PageList testOpenClose(TestOpenCloseQuery param) throws DataAccessException {
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testOpenClose",param);
	}

	/**
	 * 根据订单号查询订单
	 */
	@SuppressWarnings("unchecked")
	public PageList testOpenClose_with_list(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,Long r,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		param.put("r",r);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testOpenClose_with_list",param,pageNo,pageSize);
	}

}

