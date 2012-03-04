/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.company.project.daointerface;
import org.springframework.dao.DataAccessException;
import com.company.project.operation.*;
import com.company.project.dataobject.*;

import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.iwallet.biz.common.util.PageList;
import com.iwallet.biz.common.util.money.Money;

/**
 * 
 *
 */
public interface MyBatisUserInfoDAO {


	/**
	 * 
	 * sql:
	 * <pre>INSERT      INTO         USER_INFO         (          USER_ID ,          USERNAME ,          PASSWORD ,          BIRTH_DATE ,          SEX ,          AGE          )      VALUES         (?,?,?,?,?,?)</pre> 
	 */
	public int UserInfo.insert(Long userId ,String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>UPDATE         USER_INFO      SET         USERNAME = ? ,          PASSWORD = ? ,          BIRTH_DATE = ? ,          SEX = ? ,          AGE = ?               WHERE         USER_ID = ?</pre> 
	 */
	public int UserInfo.update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>DELETE      FROM         USER_INFO      WHERE         USER_ID = ?</pre> 
	 */
	public int UserInfo.delete(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                          FROM         USER_INFO                WHERE         USER_ID = ?</pre> 
	 */
	public UserInfo UserInfo.getById(Long id) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         count(*)      FROM         USER_INFO                WHERE         USER_ID = ?                           AND USERNAME = ?                           AND PASSWORD = ?                           AND BIRTH_DATE >= ?                          AND BIRTH_DATE <= ?                             AND SEX = ?                           AND AGE = ?                      AND sex = ?              AND age = ?              AND BIRTH_DATE = ?                 and username in      (             ?                 )                 and username in         (             ?               )                       and username in         (             ?               )</pre> 
	 */
	public Long UserInfo.findPage.count(countQuery param) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                   FROM         USER_INFO                WHERE         USER_ID = ?                           AND USERNAME = ?                           AND PASSWORD = ?                           AND BIRTH_DATE >= ?                          AND BIRTH_DATE <= ?                             AND SEX = ?                           AND AGE = ?                      AND sex = ?              AND age = ?              AND BIRTH_DATE = ?                 and username in      (             ?                 )                 and username in         (             ?               )                       and username in         (             ?               )                        ORDER BY         ?</pre> 
	 */
	public UserInfo UserInfo.findPage(findPageQuery param) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                             FROM         USER_INFO      where         USERNAME = ?</pre> 
	 */
	public UserInfo UserInfo.getByUsername(String username) throws DataAccessException;

	/**
	 * 
	 * sql:
	 * <pre>SELECT         USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                             FROM         USER_INFO      where         AGE = ?</pre> 
	 */
	public UserInfo UserInfo.getByAge(Integer age) throws DataAccessException;

}



