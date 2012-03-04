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

/**
 *
 */
public class UserInfoServiceImpl implements  UserInfoService{
	private UserInfoDAO userInfoDAO;
	
	public void setUserInfoDAO(UserInfoDAO dao) {
		this.userInfoDAO = dao;
	}
	

	public java.lang.Long insert(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize ) throws DataAccessException {
		return userInfoDAO.insert(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize );
	}

	public java.lang.Long insertWithFunction(String username ,String password ,Integer startRow ,Integer pageSize ) throws DataAccessException {
		return userInfoDAO.insertWithFunction(String username ,String password ,Integer startRow ,Integer pageSize );
	}

	public int update(String username ,String password ) throws DataAccessException {
		return userInfoDAO.update(String username ,String password );
	}

	public UserInfo queryByUserId(Long userId ) throws DataAccessException {
		return userInfoDAO.queryByUserId(Long userId );
	}

	public CountUsernameResult countUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername ) throws DataAccessException {
		return userInfoDAO.countUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername );
	}

	public CountDynimicUsernameResult countDynimicUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername ) throws DataAccessException {
		return userInfoDAO.countDynimicUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername );
	}

	public int insertWithSelectKey(Long userId ,String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ) throws DataAccessException {
		return userInfoDAO.insertWithSelectKey(Long userId ,String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age );
	}

	public int update(String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ,Long userId ) throws DataAccessException {
		return userInfoDAO.update(String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ,Long userId );
	}

	public int delete(Long userId ) throws DataAccessException {
		return userInfoDAO.delete(Long userId );
	}

	public UserInfo getById(Long userId ) throws DataAccessException {
		return userInfoDAO.getById(Long userId );
	}

	public Long findPage.count(countQuery param) throws DataAccessException{
		return userInfoDAO.findPage.count(param);
	}

	public PageList findPage(FindPageQuery param) throws DataAccessException{
		return userInfoDAO.findPage(param);
	}

	public UserInfo getByUsername(String username ) throws DataAccessException {
		return userInfoDAO.getByUsername(String username );
	}

	public UserInfo getByAge(com.iwallet.biz.common.util.money.Money age ) throws DataAccessException {
		return userInfoDAO.getByAge(com.iwallet.biz.common.util.money.Money age );
	}

	public UserInfo subSelectNotOrderBy(String username ,com.iwallet.biz.common.util.money.Money sex ,String password ,java.sql.Date birthDate ) throws DataAccessException {
		return userInfoDAO.subSelectNotOrderBy(String username ,com.iwallet.biz.common.util.money.Money sex ,String password ,java.sql.Date birthDate );
	}

	public UserInfo fromSubQuery() throws DataAccessException {
		return userInfoDAO.fromSubQuery();
	}

	public PageList testSqlMap(Long userId ) throws DataAccessException {
		return userInfoDAO.testSqlMap(Long userId );
	}

	public PageList testSqlMapWithParamsReplace(Long userId ,String password ,String sexinsex ) throws DataAccessException {
		return userInfoDAO.testSqlMapWithParamsReplace(Long userId ,String password ,String sexinsex );
	}

	public UserInfo testNotParameter() throws DataAccessException {
		return userInfoDAO.testNotParameter();
	}

	public UserInfo testIncludeByRefid(com.iwallet.biz.common.util.money.Money age ) throws DataAccessException {
		return userInfoDAO.testIncludeByRefid(com.iwallet.biz.common.util.money.Money age );
	}

	public TestSelectColumnsWithQueryResult testSelectColumnsWithQuery(String pwd_in_select_query ,Long userId ) throws DataAccessException {
		return userInfoDAO.testSelectColumnsWithQuery(String pwd_in_select_query ,Long userId );
	}

	public TestRoleJoinRolePermissionJoinBlogResult testRoleJoinRolePermissionJoinBlog(Long roleId ,String roleName ) throws DataAccessException {
		return userInfoDAO.testRoleJoinRolePermissionJoinBlog(Long roleId ,String roleName );
	}

	public TestRoleJoinRolePermissionJoinBlogWithCustomParamResult testRoleJoinRolePermissionJoinBlogWithCustomParam(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoDAO.testRoleJoinRolePermissionJoinBlogWithCustomParam(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testGroupByPaging(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoDAO.testGroupByPaging(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testSetOperations(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoDAO.testSetOperations(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testMybatisOrderByPagingWithIf(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ) throws DataAccessException {
		return userInfoDAO.testMybatisOrderByPagingWithIf(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd );
	}

	public PageList testOpenClose(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,java.util.List<String> roleNames ) throws DataAccessException {
		return userInfoDAO.testOpenClose(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,java.util.List<String> roleNames );
	}

	public PageList testXmlEscape(Long roleId ,String roleName ) throws DataAccessException {
		return userInfoDAO.testXmlEscape(Long roleId ,String roleName );
	}

	public PageList testIncludeWhere(String username ,String password ,String secondUsername ,String noduplicationUsername ) throws DataAccessException {
		return userInfoDAO.testIncludeWhere(String username ,String password ,String secondUsername ,String noduplicationUsername );
	}

	public UserInfo testIncludeWhereWithNoPaging(String username ,String password ,String secondUsername ,String noduplicationUsername ) throws DataAccessException {
		return userInfoDAO.testIncludeWhereWithNoPaging(String username ,String password ,String secondUsername ,String noduplicationUsername );
	}

	public Long countByUserId(Long userId ) throws DataAccessException {
		return userInfoDAO.countByUserId(Long userId );
	}

	public PageList testMybatisForEach(TestMybatisForEachQuery param) throws DataAccessException{
		return userInfoDAO.testMybatisForEach(param);
	}

	public java.lang.Long insertWithNoSelectKey(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize ) throws DataAccessException {
		return userInfoDAO.insertWithNoSelectKey(Long user_id ,String username ,String password ,Integer startRow ,Integer pageSize );
	}

}



