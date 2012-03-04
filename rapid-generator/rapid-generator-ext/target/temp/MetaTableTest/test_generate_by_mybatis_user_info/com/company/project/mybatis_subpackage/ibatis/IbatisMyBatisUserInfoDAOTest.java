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
import com.company.project.dataobject.MyBatisUserInfoDO;
import com.company.project.daointerface.MyBatisUserInfoDAO;

import org.nuxeo.runtime.test.autowire.annotation.XAutoWire;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 
 *
 */
public class IbatisMyBatisUserInfoDAOTest extends BaseDaoTestCase {
	@XAutoWire(XAutoWire.BY_NAME)
	protected IbatisMyBatisUserInfoDAO MyBatisUserInfoDAO;

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }
        	
	public void test_UserInfo.insert() {
		
	}
	public void test_UserInfo.update() {
		
	}
	public void test_UserInfo.delete() {
		
	}
	public void test_UserInfo.getById() {
		
	}
	public void test_UserInfo.findPage.count() {
		
	}
	public void test_UserInfo.findPage() {
		
	}
	public void test_UserInfo.getByUsername() {
		
	}
	public void test_UserInfo.getByAge() {
		
	}

}



