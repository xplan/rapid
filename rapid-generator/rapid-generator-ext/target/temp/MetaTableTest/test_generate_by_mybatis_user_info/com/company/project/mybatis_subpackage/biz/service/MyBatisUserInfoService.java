/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.company.project.biz.service;
import org.springframework.dao.DataAccessException;
import com.company.project.query.*;

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
public interface MyBatisUserInfoService {

	/**
	 * 
	 */
	public int UserInfo.insert(Long userId ,String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ) throws DataAccessException;
	/**
	 * 
	 */
	public int UserInfo.update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId ) throws DataAccessException;
	/**
	 * 
	 */
	public int UserInfo.delete(Long id ) throws DataAccessException;
	/**
	 * 
	 */
	public UserInfo UserInfo.getById(Long id ) throws DataAccessException;
	/**
	 * 
	 */
	public Long UserInfo.findPage.count(countQuery param) throws DataAccessException;
	/**
	 * 
	 */
	public UserInfo UserInfo.findPage(findPageQuery param) throws DataAccessException;
	/**
	 * 
	 */
	public UserInfo UserInfo.getByUsername(String username ) throws DataAccessException;
	/**
	 * 
	 */
	public UserInfo UserInfo.getByAge(Integer age ) throws DataAccessException;

}



