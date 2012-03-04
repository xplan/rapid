/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
 
package com.company.project.ibatis;

import com.company.project.operation.*;
import com.company.project.dataobject.*;

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
public class IbatisMyBatisUserInfoDAO extends SqlMapClientDaoSupport implements MyBatisUserInfoDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         USER_INFO         (          USER_ID ,          USERNAME ,          PASSWORD ,          BIRTH_DATE ,          SEX ,          AGE          )      VALUES         (?,?,?,?,?,?)</pre>
	 */
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
	 * sql: 
	 * <pre>UPDATE         USER_INFO      SET         USERNAME = ? ,          PASSWORD = ? ,          BIRTH_DATE = ? ,          SEX = ? ,          AGE = ?               WHERE         USER_ID = ?</pre>
	 */
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
	 * sql: 
	 * <pre>DELETE      FROM         USER_INFO      WHERE         USER_ID = ?</pre>
	 */
	public int UserInfo.delete(Long id) throws DataAccessException {
		return getSqlMapClientTemplate().delete("MyBatisUserInfo.UserInfo.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                          FROM         USER_INFO                WHERE         USER_ID = ?</pre>
	 */
	public UserInfo UserInfo.getById(Long id) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.getById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         count(*)      FROM         USER_INFO                WHERE         USER_ID = ?                           AND USERNAME = ?                           AND PASSWORD = ?                           AND BIRTH_DATE >= ?                          AND BIRTH_DATE <= ?                             AND SEX = ?                           AND AGE = ?                      AND sex = ?              AND age = ?              AND BIRTH_DATE = ?                 and username in      (             ?                 )                 and username in         (             ?               )                       and username in         (             ?               )</pre>
	 */
	public Long UserInfo.findPage.count(countQuery param) throws DataAccessException {
		return (Long)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.findPage.count",param);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                   FROM         USER_INFO                WHERE         USER_ID = ?                           AND USERNAME = ?                           AND PASSWORD = ?                           AND BIRTH_DATE >= ?                          AND BIRTH_DATE <= ?                             AND SEX = ?                           AND AGE = ?                      AND sex = ?              AND age = ?              AND BIRTH_DATE = ?                 and username in      (             ?                 )                 and username in         (             ?               )                       and username in         (             ?               )                        ORDER BY         ?</pre>
	 */
	public UserInfo UserInfo.findPage(findPageQuery param) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.findPage",param);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                             FROM         USER_INFO      where         USERNAME = ?</pre>
	 */
	public UserInfo UserInfo.getByUsername(String username) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.getByUsername",username);
	}

	/**
	 * 
	 * sql: 
	 * <pre>SELECT         USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                             FROM         USER_INFO      where         AGE = ?</pre>
	 */
	public UserInfo UserInfo.getByAge(Integer age) throws DataAccessException {
		return (UserInfo)getSqlMapClientTemplate().queryForObject("MyBatisUserInfo.UserInfo.getByAge",age);
	}

}

