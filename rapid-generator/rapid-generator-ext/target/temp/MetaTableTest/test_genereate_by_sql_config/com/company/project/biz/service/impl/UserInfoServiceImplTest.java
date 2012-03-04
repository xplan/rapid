/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.company.project.biz.service.impl;

import com.company.project.biz.service.UserInfoService;
import org.springframework.dao.DataAccessException;
import com.company.project.query.*;

import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.iwallet.biz.common.util.PageList;
import com.iwallet.biz.common.util.money.Money;
import com.company.project.dataobject.UserInfoDO;

import org.nuxeo.runtime.test.autowire.annotation.XAutoWire;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 */
public class UserInfoServiceImplTest extends BaseBizTestCase{

	@XAutoWire(XAutoWire.BY_NAME)
	protected UserInfoService userInfoService;
	
    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }
    	











	public void test_findPage.count() throws DataAccessException{
		
		//userInfoService.findPage.count(param);
	}

	public void test_findPage() throws DataAccessException{
		
		//userInfoService.findPage(param);
	}




















	public void test_testMybatisForEach() throws DataAccessException{
		
		//userInfoService.testMybatisForEach(param);
	}


}



