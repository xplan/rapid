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
        	
	public void test_insert() {
		
	}
	public void test_insertWithFunction() {
		
	}
	public void test_update() {
		
	}
	public void test_queryByUserId() {
		
	}
	public void test_countUsername() {
		
	}
	public void test_countDynimicUsername() {
		
	}
	public void test_insertWithSelectKey() {
		
	}
	public void test_update() {
		
	}
	public void test_delete() {
		
	}
	public void test_getById() {
		
	}
	public void test_findPage.count() {
		
	}
	public void test_findPage() {
		
	}
	public void test_getByUsername() {
		
	}
	public void test_getByAge() {
		
	}
	public void test_subSelectNotOrderBy() {
		
	}
	public void test_fromSubQuery() {
		
	}
	public void test_testSqlMap() {
		
	}
	public void test_testSqlMapWithParamsReplace() {
		
	}
	public void test_testNotParameter() {
		
	}
	public void test_testIncludeByRefid() {
		
	}
	public void test_testSelectColumnsWithQuery() {
		
	}
	public void test_testRoleJoinRolePermissionJoinBlog() {
		
	}
	public void test_testRoleJoinRolePermissionJoinBlogWithCustomParam() {
		
	}
	public void test_testGroupByPaging() {
		
	}
	public void test_testSetOperations() {
		
	}
	public void test_testMybatisOrderByPagingWithIf() {
		
	}
	public void test_testOpenClose() {
		
	}
	public void test_testXmlEscape() {
		
	}
	public void test_testIncludeWhere() {
		
	}
	public void test_testIncludeWhereWithNoPaging() {
		
	}
	public void test_countByUserId() {
		
	}
	public void test_testMybatisForEach() {
		
	}
	public void test_insertWithNoSelectKey() {
		
	}

}



