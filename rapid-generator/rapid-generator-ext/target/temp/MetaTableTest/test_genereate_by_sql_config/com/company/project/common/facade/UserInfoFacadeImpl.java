/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.company.project.common.facade;

import com.company.project.biz.service.UserInfoService;
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
public class UserInfoFacadeImpl implements  UserInfoFacade{
	private UserInfoService userInfoService;
	
	public void setUserInfoService(UserInfoService Service) {
		this.userInfoService = Service;
	}
	

	public java.lang.Long insert(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize ) throws DataAccessException {
		return userInfoService.insert(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize );
	}

	public java.lang.Long insertWithFunction(String username ,String password ,Integer startRow ,Integer pageSize ) throws DataAccessException {
		return userInfoService.insertWithFunction(String username ,String password ,Integer startRow ,Integer pageSize );
	}

	public int update(String username ,String password ) throws DataAccessException {
		return userInfoService.update(String username ,String password );
	}

	public UserInfo queryByUserId(Long userId ) throws DataAccessException {
		return userInfoService.queryByUserId(Long userId );
	}

	public CountUsernameResult countUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername ) throws DataAccessException {
		return userInfoService.countUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername );
	}

	public CountDynimicUsernameResult countDynimicUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername ) throws DataAccessException {
		return userInfoService.countDynimicUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername );
	}

	public int insertWithSelectKey(Long userId ,String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ) throws DataAccessException {
		return userInfoService.insertWithSelectKey(Long userId ,String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age );
	}

	public int update(String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ,Long userId ) throws DataAccessException {
		return userInfoService.update(String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ,Long userId );
	}

	public int delete(Long userId ) throws DataAccessException {
		return userInfoService.delete(Long userId );
	}

	public UserInfo getById(Long userId ) throws DataAccessException {
		return userInfoService.getById(Long userId );
	}

	public Long findPage.count(countQuery param) throws DataAccessException{
		return userInfoService.findPage.count(param);
	}

	public PageList findPage(FindPageQuery param) throws DataAccessException{
		return userInfoService.findPage(param);
	}

	public UserInfo getByUsername(String username ) throws DataAccessException {
		return userInfoService.getByUsername(String username );
	}

	public UserInfo getByAge(com.iwallet.biz.common.util.money.Money age ) throws DataAccessException {
		return userInfoService.getByAge(com.iwallet.biz.common.util.money.Money age );
	}

	public UserInfo subSelectNotOrderBy(String username ,com.iwallet.biz.common.util.money.Money sex ,String password ,java.sql.Date birthDate ) throws DataAccessException {
		return userInfoService.subSelectNotOrderBy(String username ,com.iwallet.biz.common.util.money.Money sex ,String password ,java.sql.Date birthDate );
	}

	public UserInfo fromSubQuery() throws DataAccessException {
		return userInfoService.fromSubQuery();
	}

	public PageList testSqlMap(Long userId ) throws DataAccessException {
		return userInfoService.testSqlMap(Long userId );
	}

	public PageList testSqlMapWithParamsReplace(Long userId ,String password ,String sexinsex ) throws DataAccessException {
		return userInfoService.testSqlMapWithParamsReplace(Long userId ,String password ,String sexinsex );
	}

	public UserInfo testNotParameter() throws DataAccessException {
		return userInfoService.testNotParameter();
	}

	public UserInfo testIncludeByRefid(com.iwallet.biz.common.util.money.Money age ) throws DataAccessException {
		return userInfoService.testIncludeByRefid(com.iwallet.biz.common.util.money.Money age );
	}

	public TestSelectColumnsWithQueryResult testSelectColumnsWithQuery(String pwd_in_select_query ,Long userId ) throws DataAccessException {
		return userInfoService.testSelectColumnsWithQuery(String pwd_in_select_query ,Long userId );
	}

	public TestRoleJoinRolePermissionJoinBlogResult testRoleJoinRolePermissionJoinBlog(Long roleId ,String roleName ) throws DataAccessException {
		return userInfoService.testRoleJoinRolePermissionJoinBlog(Long roleId ,String roleName );
	}

	public TestRoleJoinRolePermissionJoinBlogWithCustomParamResult testRoleJoinRolePermissionJoinBlogWithCustomParam(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoService.testRoleJoinRolePermissionJoinBlogWithCustomParam(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testGroupByPaging(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoService.testGroupByPaging(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testSetOperations(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoService.testSetOperations(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testMybatisOrderByPagingWithIf(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoService.testMybatisOrderByPagingWithIf(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testOpenClose(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,java.util.List<String> roleNames ) throws DataAccessException {
		return userInfoService.testOpenClose(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,java.util.List<String> roleNames );
	}

	public PageList testXmlEscape(Long roleId ,String roleName ) throws DataAccessException {
		return userInfoService.testXmlEscape(Long roleId ,String roleName );
	}

	public PageList testIncludeWhere(String username ,String password ,String secondUsername ,String noduplicationUsername ) throws DataAccessException {
		return userInfoService.testIncludeWhere(String username ,String password ,String secondUsername ,String noduplicationUsername );
	}

	public UserInfo testIncludeWhereWithNoPaging(String username ,String password ,String secondUsername ,String noduplicationUsername ) throws DataAccessException {
		return userInfoService.testIncludeWhereWithNoPaging(String username ,String password ,String secondUsername ,String noduplicationUsername );
	}

	public Long countByUserId(Long userId ) throws DataAccessException {
		return userInfoService.countByUserId(Long userId );
	}

	public PageList testMybatisForEach(TestMybatisForEachQuery param) throws DataAccessException{
		return userInfoService.testMybatisForEach(param);
	}

	public java.lang.Long insertWithNoSelectKey(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize ) throws DataAccessException {
		return userInfoService.insertWithNoSelectKey(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize );
	}

}



