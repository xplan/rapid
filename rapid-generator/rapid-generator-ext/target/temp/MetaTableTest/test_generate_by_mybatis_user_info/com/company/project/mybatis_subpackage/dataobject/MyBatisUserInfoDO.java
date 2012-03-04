package com.company.project.dataobject;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import com.iwallet.biz.common.util.money.Money;
import java.util.*;

public class MyBatisUserInfoDO implements java.io.Serializable {
	
	/**
	 * 用户ID 		db_column: USER_ID 
	 */
	private Long userId;
	/**
	 * 用户名 		db_column: USERNAME 
	 */
	private String username;
	/**
	 * 用户密码 		db_column: PASSWORD 
	 */
	private String password;
	/**
	 * 生日 		db_column: BIRTH_DATE 
	 */
	private Date birthDate;
	/**
	 * 性别 		db_column: SEX 
	 */
	private Byte sex;
	/**
	 * 年龄 		db_column: AGE 
	 */
	private Integer age;

	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Long getUserId() {
		return this.userId;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public Date getBirthDate() {
		return this.birthDate;
	}
	
	public void setSex(Byte sex) {
		this.sex = sex;
	}
	
	public Byte getSex() {
		return this.sex;
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Integer getAge() {
		return this.age;
	}

	public String toString() {
		return new ToStringBuilder(this)
			.append("UserId",getUserId())
			.append("Username",getUsername())
			.append("Password",getPassword())
			.append("BirthDate",getBirthDate())
			.append("Sex",getSex())
			.append("Age",getAge())
			.toString();
	}
	
	public int hashCode() {
		return new HashCodeBuilder()
			.append(getUserId())
			.toHashCode();
	}
	
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(this == obj) return true;
		if(obj instanceof MyBatisUserInfoDO == false) return false;
		MyBatisUserInfoDO other = (MyBatisUserInfoDO)obj;
		return new EqualsBuilder()
			.append(getUserId(),other.getUserId())
			.isEquals();
	}
}

