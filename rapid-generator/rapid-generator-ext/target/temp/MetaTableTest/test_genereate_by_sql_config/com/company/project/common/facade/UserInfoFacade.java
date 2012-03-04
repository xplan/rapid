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
	 * 
	 */
	public java.lang.Long insert(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize ) throws DataAccessException;
	/**
	 * 
	 */
	public java.lang.Long insertWithFunction(String username ,String password ,Integer startRow ,Integer pageSize ) throws DataAccessException;
	/**
	 * 更新一条交易资金单据记录 
	 */
	public int update(String username ,String password ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public UserInfo queryByUserId(Long userId ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public CountUsernameResult countUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public CountDynimicUsernameResult countDynimicUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public int insertWithSelectKey(Long userId ,String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public int update(String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ,Long userId ) throws DataAccessException;
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
	public Long findPage.count(countQuery param) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public PageList findPage(FindPageQuery param) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public UserInfo getByUsername(String username ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public UserInfo getByAge(com.iwallet.biz.common.util.money.Money age ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public UserInfo subSelectNotOrderBy(String username ,com.iwallet.biz.common.util.money.Money sex ,String password ,java.sql.Date birthDate ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public UserInfo fromSubQuery() throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public PageList testSqlMap(Long userId ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public PageList testSqlMapWithParamsReplace(Long userId ,String password ,String sexinsex ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public UserInfo testNotParameter() throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public UserInfo testIncludeByRefid(com.iwallet.biz.common.util.money.Money age ) throws DataAccessException;
	/**
	 * 测试select中还有select
	 */
	public TestSelectColumnsWithQueryResult testSelectColumnsWithQuery(String pwd_in_select_query ,Long userId ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public TestRoleJoinRolePermissionJoinBlogResult testRoleJoinRolePermissionJoinBlog(Long roleId ,String roleName ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public TestRoleJoinRolePermissionJoinBlogWithCustomParamResult testRoleJoinRolePermissionJoinBlogWithCustomParam(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException;
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
	public PageList testMybatisOrderByPagingWithIf(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public PageList testOpenClose(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,java.util.List<String> roleNames ) throws DataAccessException;
	/**
	 * 测试xml escape
	 */
	public PageList testXmlEscape(Long roleId ,String roleName ) throws DataAccessException;
	/**
	 * 测试testIncludeWhere
	 */
	public PageList testIncludeWhere(String username ,String password ,String secondUsername ,String noduplicationUsername ) throws DataAccessException;
	/**
	 * 测试testIncludeWhere
	 */
	public UserInfo testIncludeWhereWithNoPaging(String username ,String password ,String secondUsername ,String noduplicationUsername ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public Long countByUserId(Long userId ) throws DataAccessException;
	/**
	 * 根据订单号查询订单
	 */
	public PageList testMybatisForEach(TestMybatisForEachQuery param) throws DataAccessException;
	/**
	 * 
	 */
	public java.lang.Long insertWithNoSelectKey(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize ) throws DataAccessException;

}



