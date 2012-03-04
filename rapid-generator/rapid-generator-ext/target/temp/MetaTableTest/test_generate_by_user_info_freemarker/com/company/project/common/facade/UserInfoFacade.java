/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.company.project.common.facade;
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
public interface UserInfoFacade {

	/**
	 * 根据订单号查询订单
	 */
	public int update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public int delete(Long userId ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public UserInfo getById(Long userId ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public PageList testGroupByPaging(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public PageList testSetOperations(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public PageList testOpenClose(TestOpenCloseQuery param) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public PageList testOpenClose_with_list(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,Long r ) throws DataAccessException;

}



