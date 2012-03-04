package com.company.project.operation;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.iwallet.biz.common.util.money.Money;
import java.util.*;

public class FindPageQuery extends PageQuery implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/** 用户ID */
	private Long userId;
	/** 用户名 */
	private String username;
	/** 用户密码 */
	private String password;
	/** 生日 */
	private java.sql.Date birthDateBegin;
	/** 生日 */
	private java.sql.Date birthDateEnd;
	/** 性别 */
	private com.iwallet.biz.common.util.money.Money sex;
	/** 年龄 */
	private com.iwallet.biz.common.util.money.Money age;
	/** 年龄 */
	private java.util.List<com.iwallet.biz.common.util.money.Money> includeAges;
	/** 年龄 */
	private java.util.List<com.iwallet.biz.common.util.money.Money> orIncludeAges;
	/** orderBy */
	private String orderBy;
	
	public FindPageQuery() {
	}
	
	public FindPageQuery(Long userId ,String username ,String password ,java.sql.Date birthDateBegin ,java.sql.Date birthDateEnd ,com.iwallet.biz.common.util.money.Money sex ,com.iwallet.biz.common.util.money.Money age ,java.util.List<com.iwallet.biz.common.util.money.Money> includeAges ,java.util.List<com.iwallet.biz.common.util.money.Money> orIncludeAges ,String orderBy ) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.birthDateBegin = birthDateBegin;
		this.birthDateEnd = birthDateEnd;
		this.sex = sex;
		this.age = age;
		this.includeAges = includeAges;
		this.orIncludeAges = orIncludeAges;
		this.orderBy = orderBy;
	}
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public java.sql.Date getBirthDateBegin() {
		return birthDateBegin;
	}
	public void setBirthDateBegin(java.sql.Date birthDateBegin) {
		this.birthDateBegin = birthDateBegin;
	}
	public java.sql.Date getBirthDateEnd() {
		return birthDateEnd;
	}
	public void setBirthDateEnd(java.sql.Date birthDateEnd) {
		this.birthDateEnd = birthDateEnd;
	}
	public com.iwallet.biz.common.util.money.Money getSex() {
		return sex;
	}
	public void setSex(com.iwallet.biz.common.util.money.Money sex) {
		this.sex = sex;
	}
	public com.iwallet.biz.common.util.money.Money getAge() {
		return age;
	}
	public void setAge(com.iwallet.biz.common.util.money.Money age) {
		this.age = age;
	}
	public java.util.List<com.iwallet.biz.common.util.money.Money> getIncludeAges() {
		return includeAges;
	}
	public void setIncludeAges(java.util.List<com.iwallet.biz.common.util.money.Money> includeAges) {
		this.includeAges = includeAges;
	}
	public java.util.List<com.iwallet.biz.common.util.money.Money> getOrIncludeAges() {
		return orIncludeAges;
	}
	public void setOrIncludeAges(java.util.List<com.iwallet.biz.common.util.money.Money> orIncludeAges) {
		this.orIncludeAges = orIncludeAges;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	
	
	
}
