/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.company.project.common.facade;

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
public class MyBatisUserInfoFacadeImpl implements  MyBatisUserInfoFacade{
	private MyBatisUserInfoService myBatisUserInfoService;
	
	public void setMyBatisUserInfoService(MyBatisUserInfoService Service) {
		this.myBatisUserInfoService = Service;
	}
	

	public int UserInfo.insert(Long userId ,String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ) throws DataAccessException {
		return myBatisUserInfoService.UserInfo.insert(Long userId ,String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age );
	}

	public int UserInfo.update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId ) throws DataAccessException {
		return myBatisUserInfoService.UserInfo.update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId );
	}

	public int UserInfo.delete(Long id ) throws DataAccessException {
		return myBatisUserInfoService.UserInfo.delete(Long id );
	}

	public UserInfo UserInfo.getById(Long id ) throws DataAccessException {
		return myBatisUserInfoService.UserInfo.getById(Long id );
	}

	public Long UserInfo.findPage.count(countQuery param) throws DataAccessException{
		return myBatisUserInfoService.UserInfo.findPage.count(param);
	}

	public UserInfo UserInfo.findPage(findPageQuery param) throws DataAccessException{
		return myBatisUserInfoService.UserInfo.findPage(param);
	}

	public UserInfo UserInfo.getByUsername(String username ) throws DataAccessException {
		return myBatisUserInfoService.UserInfo.getByUsername(String username );
	}

	public UserInfo UserInfo.getByAge(Integer age ) throws DataAccessException {
		return myBatisUserInfoService.UserInfo.getByAge(Integer age );
	}

}



