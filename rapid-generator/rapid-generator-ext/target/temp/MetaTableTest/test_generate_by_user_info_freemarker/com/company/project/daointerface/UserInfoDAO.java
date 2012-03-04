/*
 * Alipay.com Inc.
 * Copyright (c) 2010 All Rights Reserved.
 */
package com.company.project.daointerface;
import org.springframework.dao.DataAccessException;
import com.company.project.operation.*;
import com.company.project.dataobject.*;

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
public interface UserInfoDAO {


	/**
	 * 根据订单号查询订单
	 * sql:
	 * <pre>UPDATE         USER_INFO      SET         USERNAME = ? ,          PASSWORD = ? ,          BIRTH_DATE = ? ,          SEX = ? ,          AGE = ?               WHERE         USER_ID = ?</pre> 
	 */
	public int update(String username ,String password ,java.sql.Date birthDate ,Byte sex ,Integer age ,Long userId) throws DataAccessException;

	/**
	 * 根据订单号查询订单
	 * sql:
	 * <pre>DELETE      FROM         USER_INFO      WHERE         USER_ID = ?</pre> 
	 */
	public int delete(Long userId) throws DataAccessException;

	/**
	 * 根据订单号查询订单
	 * sql:
	 * <pre>SELECT         USER_ID ,USERNAME ,PASSWORD ,BIRTH_DATE ,SEX ,AGE                      FROM         USER_INFO                WHERE         USER_ID = ?</pre> 
	 */
	public UserInfoDO getById(Long userId) throws DataAccessException;

	/**
	 * 根据订单号查询订单
	 * sql:
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r             inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id</pre> 
	 */
	public PageList testGroupByPaging(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,int pageSize,int pageNo) throws DataAccessException;

	/**
	 * 根据订单号查询订单
	 * sql:
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r                inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id                    UNION     select         r.role_id,sum(r.user_id) sum_user_id      from         role r                   inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id                    UNION     ALL      select         r.role_id,sum(r.user_id) sum_user_id      from         role r                   inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?            group by         r.role_id               MINUS       select             r.role_id,sum(r.user_id) sum_user_id          from             role r                       inner join             role_permission rp                  on r.role_id = rp.role_id                left join             blog b                  on b.user_id = r.user_id               where             r.role_id = ?                     and r.role_name = ?                    and b.content like ?                    and r.modified between ? and ?                group by             r.role_id               EXCEPT        select                 r.role_id,sum(r.user_id) sum_user_id              from                 role r                           inner join                 role_permission rp                      on r.role_id = rp.role_id                    left join                 blog b                      on b.user_id = r.user_id                   where                 r.role_id = ?                         and r.role_name = ?                        and b.content like ?                        and r.modified between ? and ?                    group by                 r.role_id               INTERSECT         select                     r.role_id,sum(r.user_id) sum_user_id                  from                     role r                               inner join                     role_permission rp                          on r.role_id = rp.role_id                        left join                     blog b                          on b.user_id = r.user_id                       where                     r.role_id = ?                             and r.role_name = ?                            and b.content like ?                            and r.modified between ? and ?                        group by                     r.role_id</pre> 
	 */
	public PageList testSetOperations(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,int pageSize,int pageNo) throws DataAccessException;

	/**
	 * 根据订单号查询订单
	 * sql:
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r             inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?                             and r.role_name in (             ?         )                                       and r.role_name in (             ?         )                             and r.role_name not in (             ?         )                                       and r.role_name = ?                             and r.role_name = ?                             and r.role_name = ?                                                      and r.role_id = ?                                 and r.role_id = ?                                 and r.role_id = ?                   group by         r.role_id</pre> 
	 */
	public PageList testOpenClose(TestOpenCloseQuery param) throws DataAccessException;

	/**
	 * 根据订单号查询订单
	 * sql:
	 * <pre>select         r.role_id,sum(r.user_id) sum_user_id      from         role r             inner join         role_permission rp              on r.role_id = rp.role_id            left join         blog b              on b.user_id = r.user_id           where         r.role_id = ?                 and r.role_name = ?                and b.content like ?                and r.modified between ? and ?                   and r.role_name in (             ?                  )                group by         r.role_id</pre> 
	 */
	public PageList testOpenClose_with_list(Long roleId,String roleName,String content,java.sql.Date modifiedBegin,java.sql.Date modifiedEnd,Long r,int pageSize,int pageNo) throws DataAccessException;

}



