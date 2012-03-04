/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
 
package com.company.project.mybatis;

import com.company.project.query.*;

import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import org.springframework.dao.DataAccessException;

import com.iwallet.biz.common.util.PageList;
import com.iwallet.biz.common.util.money.Money;
import com.company.project.dataobject.MyBatisUserInfoDO;
import com.company.project.daointerface.MyBatisUserInfoDAO;

/**
 * MyBatisUserInfoDAO
 * database table: USER_INFO
 */
public class MybatisMyBatisUserInfoDAO extends BaseIbatis3Dao implements MyBatisUserInfoDAO {


	/**
	 * 
	 * sql: 
	 * <pre>
	 INSERT 
    INTO
        USER_INFO
        (          USER_ID ,          USERNAME ,          PASSWORD ,          BIRTH_DATE ,          SEX ,          AGE          ) 
    VALUES
        (?,?,?,?,?,?)
	 * </pre>
	 */
	@SuppressWarnings("unchecked")
	public int UserInfo.insert(Long userId ,String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("username",username);
		param.put("password",password);
		param.put("birthDate",birthDate);
		param.put("sex",sex);
		param.put("age",age);
		return getSqlSessionTemplate().insert("MyBatisUserInfo.UserInfo.insert", param);
	}

	/**
	 * 
	 * sql: 
	 * <pre>
	 UPDATE
        USER_INFO 
    SET
        USERNAME = ? ,          PASSWORD = ? ,          BIRTH_DATE = ? ,          SEX = ? ,          AGE = ?          
    WHERE
        USER_ID = ?
	 * </pre>
	 */
	@SuppressWarnings("unchecked")
	public int UserInfo.update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("birthDate",birthDate);
		param.put("sex",sex);
		param.put("age",age);
		param.put("userId",userId);
		return getSqlSessionTemplate().update("MyBatisUserInfo.UserInfo.update", param);
	}

	/**
	 * 
	 * sql: 
	 * <pre>
	 DELETE 
    FROM
        USER_INFO 
    WHERE
        USER_ID = ?
	 * </pre>
	 */
	@SuppressWarnings("unchecked")
	public int UserInfo.delete(Long id) throws DataAccessException {
		return getSqlSessionTemplate().delete("MyBatisUserInfo.UserInfo.delete", id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>
	 SELECT
        USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                     
    FROM
        USER_INFO           
    WHERE
        USER_ID = ?
	 * </pre>
	 */
	@SuppressWarnings("unchecked")
	public UserInfo UserInfo.getById(Long id) throws DataAccessException {
		return (UserInfo)getSqlSessionTemplate().selectOne("MyBatisUserInfo.UserInfo.getById",id);
	}

	/**
	 * 
	 * sql: 
	 * <pre>
	 SELECT
        count(*) 
    FROM
        USER_INFO           
    WHERE
        USER_ID = ?                  
        AND USERNAME = ?                  
        AND PASSWORD = ?                  
        AND BIRTH_DATE >= ?                 
        AND BIRTH_DATE <= ?                    
        AND SEX = ?                  
        AND AGE = ?             
        AND sex = ?     
        AND age = ?     
        AND BIRTH_DATE = ?        
        and username in      (
            ?        
        )        
        and username in         (
            ?      
        )              
        and username in         (
            ?      
        )
	 * </pre>
	 */
	@SuppressWarnings("unchecked")
	public Long UserInfo.findPage.count(countQuery param) throws DataAccessException {
		return (Long)getSqlSessionTemplate().selectOne("MyBatisUserInfo.UserInfo.findPage.count",param);
	}

	/**
	 * 
	 * sql: 
	 * <pre>
	 SELECT
        USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE              
    FROM
        USER_INFO           
    WHERE
        USER_ID = ?                  
        AND USERNAME = ?                  
        AND PASSWORD = ?                  
        AND BIRTH_DATE >= ?                 
        AND BIRTH_DATE <= ?                    
        AND SEX = ?                  
        AND AGE = ?             
        AND sex = ?     
        AND age = ?     
        AND BIRTH_DATE = ?        
        and username in      (
            ?        
        )        
        and username in         (
            ?      
        )              
        and username in         (
            ?      
        )                   
    ORDER BY
        ?
	 * </pre>
	 */
	@SuppressWarnings("unchecked")
	public UserInfo UserInfo.findPage(findPageQuery param) throws DataAccessException {
		return (UserInfo)getSqlSessionTemplate().selectOne("MyBatisUserInfo.UserInfo.findPage",param);
	}

	/**
	 * 
	 * sql: 
	 * <pre>
	 SELECT
        USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                        
    FROM
        USER_INFO 
    where
        USERNAME = ?
	 * </pre>
	 */
	@SuppressWarnings("unchecked")
	public UserInfo UserInfo.getByUsername(String username) throws DataAccessException {
		return (UserInfo)getSqlSessionTemplate().selectOne("MyBatisUserInfo.UserInfo.getByUsername",username);
	}

	/**
	 * 
	 * sql: 
	 * <pre>
	 SELECT
        USER_ID,USERNAME,PASSWORD,BIRTH_DATE,SEX,AGE                        
    FROM
        USER_INFO 
    where
        AGE = ?
	 * </pre>
	 */
	@SuppressWarnings("unchecked")
	public UserInfo UserInfo.getByAge(Integer age) throws DataAccessException {
		return (UserInfo)getSqlSessionTemplate().selectOne("MyBatisUserInfo.UserInfo.getByAge",age);
	}

}

