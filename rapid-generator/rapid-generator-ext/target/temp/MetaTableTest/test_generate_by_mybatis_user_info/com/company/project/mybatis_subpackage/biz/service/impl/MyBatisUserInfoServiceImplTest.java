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
import com.company.project.dataobject.MyBatisUserInfoDO;

import org.nuxeo.runtime.test.autowire.annotation.XAutoWire;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class MyBatisUserInfoServiceImplTest extends BaseBizTestCase{

	@XAutoWire(XAutoWire.BY_NAME)
	protected MyBatisUserInfoService myBatisUserInfoService;
	
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }
    	





	public void test_UserInfo.findPage.count() throws DataAccessException{
		
		//myBatisUserInfoService.UserInfo.findPage.count(param);
	}

	public void test_UserInfo.findPage() throws DataAccessException{
		
		//myBatisUserInfoService.UserInfo.findPage(param);
	}



}



