/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.company.project.biz.service.impl;

import com.company.project.biz.service.MyBatisUserInfoService;
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
 */
public class MyBatisUserInfoServiceImpl implements  MyBatisUserInfoService{
	private MyBatisUserInfoDAO myBatisUserInfoDAO;
	
	public void setMyBatisUserInfoDAO(MyBatisUserInfoDAO dao) {
		this.myBatisUserInfoDAO = dao;
	}
	

	public int UserInfo.insert(Long userId ,String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ) throws DataAccessException {
		return myBatisUserInfoDAO.UserInfo.insert(Long userId ,String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age );
	}

	public int UserInfo.update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId ) throws DataAccessException {
		return myBatisUserInfoDAO.UserInfo.update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId );
	}

	public int UserInfo.delete(Long id ) throws DataAccessException {
		return myBatisUserInfoDAO.UserInfo.delete(Long id );
	}

	public UserInfo UserInfo.getById(Long id ) throws DataAccessException {
		return myBatisUserInfoDAO.UserInfo.getById(Long id );
	}

	public Long UserInfo.findPage.count(countQuery param) throws DataAccessException{
		return myBatisUserInfoDAO.UserInfo.findPage.count(param);
	}

	public UserInfo UserInfo.findPage(findPageQuery param) throws DataAccessException{
		return myBatisUserInfoDAO.UserInfo.findPage(param);
	}

	public UserInfo UserInfo.getByUsername(String username ) throws DataAccessException {
		return myBatisUserInfoDAO.UserInfo.getByUsername(String username );
	}

	public UserInfo UserInfo.getByAge(Integer age ) throws DataAccessException {
		return myBatisUserInfoDAO.UserInfo.getByAge(Integer age );
	}

}



