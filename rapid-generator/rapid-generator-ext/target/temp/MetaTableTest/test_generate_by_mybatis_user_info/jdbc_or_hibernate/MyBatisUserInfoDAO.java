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
import com.company.project.dataobject.MyBatisUserInfoDO;
import com.company.project.daointerface.MyBatisUserInfoDAO;

/**
 * MyBatisUserInfoDAO
 * database table: USER_INFO
 */
public class MyBatisUserInfoDAO {

	private String UserInfo.insertSql;
	private String UserInfo.updateSql;
	private String UserInfo.deleteSql;
	private String UserInfo.getByIdSql;
	private String UserInfo.findPage.countSql;
	private String UserInfo.findPageSql;
	private String UserInfo.getByUsernameSql;
	private String UserInfo.getByAgeSql;

	public void setUserInfo.insertSql(String UserInfo.insertSql){
		this.UserInfo.insertSql = UserInfo.insertSql;
	}
	
	public void setUserInfo.updateSql(String UserInfo.updateSql){
		this.UserInfo.updateSql = UserInfo.updateSql;
	}
	
	public void setUserInfo.deleteSql(String UserInfo.deleteSql){
		this.UserInfo.deleteSql = UserInfo.deleteSql;
	}
	
	public void setUserInfo.getByIdSql(String UserInfo.getByIdSql){
		this.UserInfo.getByIdSql = UserInfo.getByIdSql;
	}
	
	public void setUserInfo.findPage.countSql(String UserInfo.findPage.countSql){
		this.UserInfo.findPage.countSql = UserInfo.findPage.countSql;
	}
	
	public void setUserInfo.findPageSql(String UserInfo.findPageSql){
		this.UserInfo.findPageSql = UserInfo.findPageSql;
	}
	
	public void setUserInfo.getByUsernameSql(String UserInfo.getByUsernameSql){
		this.UserInfo.getByUsernameSql = UserInfo.getByUsernameSql;
	}
	
	public void setUserInfo.getByAgeSql(String UserInfo.getByAgeSql){
		this.UserInfo.getByAgeSql = UserInfo.getByAgeSql;
	}
	


	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public int UserInfo.insert(Long userId ,String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("username",username);
		param.put("password",password);
		param.put("birthDate",birthDate);
		param.put("sex",sex);
		param.put("age",age);
		return getSqlMapClientTemplate().insert("MyBatisUserInfo.UserInfo.insert", param);
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public int UserInfo.update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("birthDate",birthDate);
		param.put("sex",sex);
		param.put("age",age);
		param.put("userId",userId);
		return getSqlMapClientTemplate().update("MyBatisUserInfo.UserInfo.update", param);
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public int UserInfo.delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("MyBatisUserInfo.UserInfo.delete", id);
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public UserInfo UserInfo.getById(Long id) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.getById",id);
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public Long UserInfo.findPage.count(countQuery param) throws DataAccessException {
		return (Long)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.findPage.count",param);
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public UserInfo UserInfo.findPage(findPageQuery param) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.findPage",param);
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public UserInfo UserInfo.getByUsername(String username) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.getByUsername",username);
	}

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public UserInfo UserInfo.getByAge(Integer age) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.getByAge",age);
	}

}

