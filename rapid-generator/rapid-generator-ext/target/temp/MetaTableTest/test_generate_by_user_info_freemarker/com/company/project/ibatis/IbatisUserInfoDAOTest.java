/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
 
package com.company.project.ibatis;

import com.company.project.operation.*;

import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import org.springframework.dao.DataAccessException;

import com.iwallet.biz.common.util.PageList;
import com.iwallet.biz.common.util.money.Money;
import com.company.project.dataobject.UserInfoDO;
import com.company.project.daointerface.UserInfoDAO;

import org.nuxeo.runtime.test.autowire.annotation.XAutoWire;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 *
 */
public class IbatisUserInfoDAOTest extends BaseDaoTestCase {
	@XAutoWire(XAutoWire.BY_NAME)
	protected IbatisUserInfoDAO UserInfoDAO;

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }
        	
	public void test_update() {
		
	}
	public void test_delete() {
		
	}
	public void test_getById() {
		
	}
	public void test_testGroupByPaging() {
		
	}
	public void test_testSetOperations() {
		
	}
	public void test_testOpenClose() {
		
	}
	public void test_testOpenClose_with_list() {
		
	}

}



