/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
 
package com.company.project.ibatis;

import com.company.project.operation.*;
import com.company.project.dataobject.*;

import java.util.List;
import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.iwallet.biz.common.util.PageList;
import com.iwallet.biz.common.util.money.Money;
import com.company.project.dataobject.UserInfoDO;
import com.company.project.daointerface.UserInfoDAO;

/**
 * UserInfoDAO
 * database table: USER_INFO
 */
public class IbatisUserInfoDAO extends SqlMapClientDaoSupport implements UserInfoDAO {


	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         user_info         (user_id,username,password)      values         (?,?,?)</pre>
	 */
	public java.lang.Long insert(UserInfoDO userInfo) throws DataAccessException {
		if(userInfo == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("UserInfo.insert", userInfo);
		return userInfo.getUserId();
	}

	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         user_info         (age,username,password,birth_date,sex,user_id)      values         ('23',?,?,curdate(),'12','123111')</pre>
	 */
	public java.lang.Long insertWithFunction(UserInfoDO userInfo) throws DataAccessException {
		if(userInfo == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("UserInfo.insertWithFunction", userInfo);
		return userInfo.getUserId();
	}

	/**
	 * 更新一条交易资金单据记录 
	 * sql: 
	 * <pre>UPDATE         user_info      SET         username = ?,password = ?         WHERE         username = ?</pre>
	 */
	public int update(UserInfoDO userInfo) throws DataAccessException {
		if(userInfo == null) {
			throw new IllegalArgumentException("Can't update by a null data object.");
		}
		return getSqlMapClientTemplate().update("UserInfo.update", userInfo);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         *         from         user_info         where         user_id = ?</pre>
	 */
	public UserInfoDO queryByUserId(Long userId) throws DataAccessException {
		return (UserInfoDO)getSqlMapClientTemplate().queryForObject("UserInfo.queryByUserId",userId);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         count(username) username_cnt,sum(age) sum_age         from         user_info         where         user_id = ?          and age = ?          and sex = ?          and username > ?          and username < ?</pre>
	 */
	public CountUsernameResult countUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("age",age);
		param.put("sex",sex);
		param.put("maxUsername",maxUsername);
		param.put("minUsername",minUsername);
		return (CountUsernameResult)getSqlMapClientTemplate().queryForObject("UserInfo.countUsername",param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         count(username) username_cnt,sum(age) sum_age         from         user_info         where         user_id = ?          and age = ?          and sex = ?          and username > ?          and username < ?</pre>
	 */
	public CountDynimicUsernameResult countDynimicUsername(Long userId ,com.iwallet.biz.common.util.money.Money age ,com.iwallet.biz.common.util.money.Money sex ,String maxUsername ,String minUsername) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("age",age);
		param.put("sex",sex);
		param.put("maxUsername",maxUsername);
		param.put("minUsername",minUsername);
		return (CountDynimicUsernameResult)getSqlMapClientTemplate().queryForObject("UserInfo.countDynimicUsername",param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>INSERT      INTO         USER_INFO         (           USER_ID ,           USERNAME ,           PASSWORD ,           BIRTH_DATE ,           SEX ,           AGE           )      VALUES         (?,?,?,?,?,?)</pre>
	 */
	public int insertWithSelectKey(Long userId ,String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("username",username);
		param.put("password",password);
		param.put("birthDate",birthDate);
		param.put("sex",sex);
		param.put("age",age);
		return getSqlMapClientTemplate().insert("UserInfo.insertWithSelectKey", param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>UPDATE         USER_INFO      SET         USERNAME = ? ,          PASSWORD = ? ,          BIRTH_DATE = ? ,          SEX = ? ,          AGE = ?               WHERE         USER_ID = ?</pre>
	 */
	public int update(String username ,String password ,java.sql.Date birthDate ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ,Long userId) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("birthDate",birthDate);
		param.put("sex",sex);
		param.put("age",age);
		param.put("userId",userId);
		return getSqlMapClientTemplate().update("UserInfo.update", param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>DELETE      FROM         USER_INFO      WHERE         USER_ID = ?</pre>
	 */
	public int delete(Long userId) throws DataAccessException {
		return getSqlMapClientTemplate().delete("UserInfo.delete", userId);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>SELECT         USER_ID ,USERNAME ,PASSWORD ,BIRTH_DATE ,SEX ,AGE                      FROM         USER_INFO                WHERE         USER_ID = ?</pre>
	 */
	public UserInfoDO getById(Long userId) throws DataAccessException {
		return (UserInfoDO)getSqlMapClientTemplate().queryForObject("UserInfo.getById",userId);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>SELECT         count(*)      FROM         USER_INFO            WHERE         USER_ID = ?                              AND                 USERNAME = ?                              AND                 PASSWORD = ?                              AND                 BIRTH_DATE >= ?                              AND                 BIRTH_DATE <= ?                              AND                 SEX = ?                              AND                 AGE = ?</pre>
	 */
	public Long findPage.count(countQuery param) throws DataAccessException {
		return (Long)getSqlMapClientTemplate().queryForObject("UserInfo.findPage.count",param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>SELECT         USER_ID ,USERNAME ,PASSWORD ,BIRTH_DATE ,SEX ,AGE      FROM         USER_INFO             WHERE         USER_ID = ?                              AND                 USERNAME = ?                              AND                 PASSWORD = ?                              AND                 BIRTH_DATE >= ?                              AND                 BIRTH_DATE <= ?                              AND                 SEX = ?                              AND                 AGE = ?                              AND           age in           (             ?                  )                           AND           (             age = ?                  )                                   ORDER BY         ?</pre>
	 */
	public PageList findPage(FindPageQuery param) throws DataAccessException {
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.findPage",param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>SELECT         USER_ID ,USERNAME ,PASSWORD ,BIRTH_DATE ,SEX ,AGE                FROM         USER_INFO      WHERE         USERNAME = ?</pre>
	 */
	public UserInfoDO getByUsername(String username) throws DataAccessException {
		return (UserInfoDO)getSqlMapClientTemplate().queryForObject("UserInfo.getByUsername",username);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>SELECT         USER_ID ,USERNAME ,PASSWORD ,BIRTH_DATE ,SEX ,AGE                FROM         USER_INFO      WHERE         AGE = ?</pre>
	 */
	public UserInfoDO getByAge(com.iwallet.biz.common.util.money.Money age) throws DataAccessException {
		return (UserInfoDO)getSqlMapClientTemplate().queryForObject("UserInfo.getByAge",age);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>SELECT         USER_ID ,USERNAME ,PASSWORD ,BIRTH_DATE ,SEX ,AGE                FROM         USER_INFO      WHERE         AGE in (             select                 age              from                 User_info              where                 username = ?         )                   AND sex in (             select                 age              from                 User_info              where                 sex = ?                  and password = ?                  and BIRTH_DATE = ?         )</pre>
	 */
	public UserInfoDO subSelectNotOrderBy(String username ,com.iwallet.biz.common.util.money.Money sex ,String password ,java.sql.Date birthDate) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("sex",sex);
		param.put("password",password);
		param.put("birthDate",birthDate);
		return (UserInfoDO)getSqlMapClientTemplate().queryForObject("UserInfo.subSelectNotOrderBy",param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>SELECT         USER_ID ,USERNAME ,PASSWORD ,BIRTH_DATE ,SEX ,AGE                FROM         (select             *          from             user_info)</pre>
	 */
	public UserInfoDO fromSubQuery() throws DataAccessException {
		return (UserInfoDO)getSqlMapClientTemplate().queryForObject("UserInfo.fromSubQuery",null);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         *      from         user_info      where         user_id = ?</pre>
	 */
	public PageList testSqlMap(Long userId,int pageSize,int pageNo) throws DataAccessException {
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testSqlMap",userId,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         *      from         user_info      where         user_id = ?          and password = ?</pre>
	 */
	public PageList testSqlMapWithParamsReplace(Long userId,String password,String sexinsex,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("userId",userId);
		param.put("password",password);
		param.put("sexinsex",sexinsex);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testSqlMapWithParamsReplace",param,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>SELECT         USER_ID ,USERNAME ,PASSWORD ,BIRTH_DATE ,SEX ,AGE        FROM         USER_INFO</pre>
	 */
	public UserInfoDO testNotParameter() throws DataAccessException {
		return (UserInfoDO)getSqlMapClientTemplate().queryForObject("UserInfo.testNotParameter",null);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>SELECT         USER_ID ,USERNAME ,PASSWORD ,BIRTH_DATE ,SEX ,AGE                  FROM         USER_INFO      WHERE         AGE = ?</pre>
	 */
	public UserInfoDO testIncludeByRefid(com.iwallet.biz.common.util.money.Money age) throws DataAccessException {
		return (UserInfoDO)getSqlMapClientTemplate().queryForObject("UserInfo.testIncludeByRefid",age);
	}

	/**
	 * 测试select中还有select
	 * sql: 
	 * <pre>select         USER_ID,USERNAME,(select             password          from             user_info          where             password = ? ) pwd_from_select_query         from         user_info         where         user_id = ?</pre>
	 */
	public TestSelectColumnsWithQueryResult testSelectColumnsWithQuery(String pwd_in_select_query ,Long userId) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("pwd_in_select_query",pwd_in_select_query);
		param.put("userId",userId);
		return (TestSelectColumnsWithQueryResult)getSqlMapClientTemplate().queryForObject("UserInfo.testSelectColumnsWithQuery",param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         *      from         role r             inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?</pre>
	 */
	public TestRoleJoinRolePermissionJoinBlogResult testRoleJoinRolePermissionJoinBlog(Long roleId ,String roleName) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		return (TestRoleJoinRolePermissionJoinBlogResult)getSqlMapClientTemplate().queryForObject("UserInfo.testRoleJoinRolePermissionJoinBlog",param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r             inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id</pre>
	 */
	public TestRoleJoinRolePermissionJoinBlogWithCustomParamResult testRoleJoinRolePermissionJoinBlogWithCustomParam(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		return (TestRoleJoinRolePermissionJoinBlogWithCustomParamResult)getSqlMapClientTemplate().queryForObject("UserInfo.testRoleJoinRolePermissionJoinBlogWithCustomParam",param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r             inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id</pre>
	 */
	public PageList testGroupByPaging(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testGroupByPaging",param,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r                inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id                    UNION     select         r.role_id,sum(r.user_id) sum_user_id      from         role r                   inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id                    UNION     ALL      select         r.role_id,sum(r.user_id) sum_user_id      from         role r                   inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id            MINUS       select             r.role_id,sum(r.user_id) sum_user_id          from             role r                       inner join             role_permission rp                  on r.role_id = rp.role_id                left join             blog b                  on b.user_id = r.user_id               where             r.role_id = ?                     and r.role_name = ?                    and b.content like ?                    and r.modified between ? and ?                group by             r.role_id               EXCEPT        select                 r.role_id,sum(r.user_id) sum_user_id              from                 role r                           inner join                 role_permission rp                      on r.role_id = rp.role_id                    left join                 blog b                      on b.user_id = r.user_id                   where                 r.role_id = ?                         and r.role_name = ?                        and b.content like ?                        and r.modified between ? and ?                    group by                 r.role_id               INTERSECT         select                     r.role_id,sum(r.user_id) sum_user_id                  from                     role r                               inner join                     role_permission rp                          on r.role_id = rp.role_id                        left join                     blog b                          on b.user_id = r.user_id                       where                     r.role_id = ?                             and r.role_name = ?                            and b.content like ?                            and r.modified between ? and ?                        group by                     r.role_id</pre>
	 */
	public PageList testSetOperations(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testSetOperations",param,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r             inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id                          order by         r.role_id                              order by         sum_user_id                        order by         r.role_id                     order by         r.role_id                     order by         r.role_id</pre>
	 */
	public PageList testMybatisOrderByPagingWithIf(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testMybatisOrderByPagingWithIf",param,pageNo,pageSize);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r             inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?                   and r.role_name in  (             ?         )            group by         r.role_id</pre>
	 */
	public PageList testOpenClose(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,java.util.List<String> roleNames,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		param.put("content",content);
		param.put("modifiedBegin",modifiedBegin);
		param.put("modifiedEnd",modifiedEnd);
		param.put("roleNames",roleNames);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testOpenClose",param,pageNo,pageSize);
	}

	/**
	 * 测试xml escape
	 * sql: 
	 * <pre>select         *      from         role r            where         r.role_id < ?                 and r.role_name > ?</pre>
	 */
	public PageList testXmlEscape(Long roleId,String roleName,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("roleId",roleId);
		param.put("roleName",roleName);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testXmlEscape",param,pageNo,pageSize);
	}

	/**
	 * 测试testIncludeWhere
	 * sql: 
	 * <pre>select         *      from         user_info r            where         1=1                    and username > ?                and password = ?                             and username > ?                and password = ?                             and username = ?                             and username > ?                and password = ?                   and username = ?                    and username = ?</pre>
	 */
	public PageList testIncludeWhere(String username,String password,String secondUsername,String noduplicationUsername,int pageSize,int pageNo) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("secondUsername",secondUsername);
		param.put("noduplicationUsername",noduplicationUsername);
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testIncludeWhere",param,pageNo,pageSize);
	}

	/**
	 * 测试testIncludeWhere
	 * sql: 
	 * <pre>select         *      from         user_info r            where         1=1                    and username > ?                and password = ?                             and username > ?                and password = ?                             and username = ?                             and username > ?                and password = ?                   and username = ?                    and username = ?</pre>
	 */
	public UserInfoDO testIncludeWhereWithNoPaging(String username ,String password ,String secondUsername ,String noduplicationUsername) throws DataAccessException {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("secondUsername",secondUsername);
		param.put("noduplicationUsername",noduplicationUsername);
		return (UserInfoDO)getSqlMapClientTemplate().queryForObject("UserInfo.testIncludeWhereWithNoPaging",param);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         count(*)         from         user_info         where         user_id = ?</pre>
	 */
	public Long countByUserId(Long userId) throws DataAccessException {
		return (Long)getSqlMapClientTemplate().queryForObject("UserInfo.countByUserId",userId);
	}

	/**
	 * 根据订单号查询订单
	 * sql: 
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r             inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id             where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?                and r.role_name in  (             ?         )                and r.role_name in  (             ?         )                        and b.content = ?                                  and b.content = ?                            and b.content = ?                         and b.content = ?                         and b.content = ?                                   group by         r.role_id</pre>
	 */
	public PageList testMybatisForEach(TestMybatisForEachQuery param) throws DataAccessException {
		return (PageList)PageQueryUtils.pageQuery(getSqlMapClientTemplate(),"UserInfo.testMybatisForEach",param);
	}

	/**
	 * 
	 * sql: 
	 * <pre>INSERT      INTO         user_info         (user_id,username,password)      values         (?,?,?)</pre>
	 */
	public java.lang.Long insertWithNoSelectKey(UserInfoDO userInfo) throws DataAccessException {
		if(userInfo == null) {
			throw new IllegalArgumentException("Can't insert a null data object into db.");
		}
		getSqlMapClientTemplate().insert("UserInfo.insertWithNoSelectKey", userInfo);
		return userInfo.getUserId();
	}

}

