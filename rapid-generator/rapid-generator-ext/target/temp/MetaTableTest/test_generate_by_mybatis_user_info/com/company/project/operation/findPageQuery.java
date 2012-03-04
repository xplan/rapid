package com.company.project.operation;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.iwallet.biz.common.util.money.Money;
import java.util.*;

public class findPageQuery extends PageQuery implements java.io.Serializable {
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
	private Byte sex;
	/** 年龄 */
	private Integer age;
	/** 性别 */
	private Byte sexWhen;
	/** 年龄 */
	private Integer ageWhen;
	/** 生日 */
	private java.sql.Date birthDateOtherwise;
	/** 用户名 */
	private java.util.List<String> usernamesByItem;
	/** 用户名 */
	private java.util.List<String> usernamesByIndex;
	/** sortColumns */
	private String sortColumns;
	
	public findPageQuery() {
	}
	
	public findPageQuery(Long userId ,String username ,String password ,java.sql.Date birthDateBegin ,java.sql.Date birthDateEnd ,Byte sex ,Integer age ,Byte sexWhen ,Integer ageWhen ,java.sql.Date birthDateOtherwise ,java.util.List<String> usernamesByItem ,java.util.List<String> usernamesByIndex ,String sortColumns ) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.birthDateBegin = birthDateBegin;
		this.birthDateEnd = birthDateEnd;
		this.sex = sex;
		this.age = age;
		this.sexWhen = sexWhen;
		this.ageWhen = ageWhen;
		this.birthDateOtherwise = birthDateOtherwise;
		this.usernamesByItem = usernamesByItem;
		this.usernamesByIndex = usernamesByIndex;
		this.sortColumns = sortColumns;
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
	public Byte getSex() {
		return sex;
	}
	public void setSex(Byte sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Byte getSexWhen() {
		return sexWhen;
	}
	public void setSexWhen(Byte sexWhen) {
		this.sexWhen = sexWhen;
	}
	public Integer getAgeWhen() {
		return ageWhen;
	}
	public void setAgeWhen(Integer ageWhen) {
		this.ageWhen = ageWhen;
	}
	public java.sql.Date getBirthDateOtherwise() {
		return birthDateOtherwise;
	}
	public void setBirthDateOtherwise(java.sql.Date birthDateOtherwise) {
		this.birthDateOtherwise = birthDateOtherwise;
	}
	public java.util.List<String> getUsernamesByItem() {
		return usernamesByItem;
	}
	public void setUsernamesByItem(java.util.List<String> usernamesByItem) {
		this.usernamesByItem = usernamesByItem;
	}
	public java.util.List<String> getUsernamesByIndex() {
		return usernamesByIndex;
	}
	public void setUsernamesByIndex(java.util.List<String> usernamesByIndex) {
		this.usernamesByIndex = usernamesByIndex;
	}
	public String getSortColumns() {
		return sortColumns;
	}
	public void setSortColumns(String sortColumns) {
		this.sortColumns = sortColumns;
	}
	
	
	private UserInfoFindPageWhere userInfoFindPageWhere = new UserInfoFindPageWhere();
	public UserInfoFindPageWhere getUserInfoFindPageWhere() {
		return UserInfoFindPageWhere;
	}
	public void setUserInfoFindPageWhere(UserInfoFindPageWhere UserInfoFindPageWhere) {
		this.UserInfoFindPageWhere = UserInfoFindPageWhere;
	}		
	
	public Long getUserId() {
		return userInfoFindPageWhere.getUserId();
	}
	public void setUserId(Long userId) {
		this.userInfoFindPageWhere.setUserId(userId);
	}
	public String getUsername() {
		return userInfoFindPageWhere.getUsername();
	}
	public void setUsername(String username) {
		this.userInfoFindPageWhere.setUsername(username);
	}
	public String getPassword() {
		return userInfoFindPageWhere.getPassword();
	}
	public void setPassword(String password) {
		this.userInfoFindPageWhere.setPassword(password);
	}
	public java.sql.Date getBirthDateBegin() {
		return userInfoFindPageWhere.getBirthDateBegin();
	}
	public void setBirthDateBegin(java.sql.Date birthDateBegin) {
		this.userInfoFindPageWhere.setBirthDateBegin(birthDateBegin);
	}
	public java.sql.Date getBirthDateEnd() {
		return userInfoFindPageWhere.getBirthDateEnd();
	}
	public void setBirthDateEnd(java.sql.Date birthDateEnd) {
		this.userInfoFindPageWhere.setBirthDateEnd(birthDateEnd);
	}
	public Byte getSex() {
		return userInfoFindPageWhere.getSex();
	}
	public void setSex(Byte sex) {
		this.userInfoFindPageWhere.setSex(sex);
	}
	public Integer getAge() {
		return userInfoFindPageWhere.getAge();
	}
	public void setAge(Integer age) {
		this.userInfoFindPageWhere.setAge(age);
	}
	public Byte getSexWhen() {
		return userInfoFindPageWhere.getSexWhen();
	}
	public void setSexWhen(Byte sexWhen) {
		this.userInfoFindPageWhere.setSexWhen(sexWhen);
	}
	public Integer getAgeWhen() {
		return userInfoFindPageWhere.getAgeWhen();
	}
	public void setAgeWhen(Integer ageWhen) {
		this.userInfoFindPageWhere.setAgeWhen(ageWhen);
	}
	public java.sql.Date getBirthDateOtherwise() {
		return userInfoFindPageWhere.getBirthDateOtherwise();
	}
	public void setBirthDateOtherwise(java.sql.Date birthDateOtherwise) {
		this.userInfoFindPageWhere.setBirthDateOtherwise(birthDateOtherwise);
	}
	public java.util.List<String> getUsernamesByItem() {
		return userInfoFindPageWhere.getUsernamesByItem();
	}
	public void setUsernamesByItem(java.util.List<String> usernamesByItem) {
		this.userInfoFindPageWhere.setUsernamesByItem(usernamesByItem);
	}
	public java.util.List<String> getUsernamesByIndex() {
		return userInfoFindPageWhere.getUsernamesByIndex();
	}
	public void setUsernamesByIndex(java.util.List<String> usernamesByIndex) {
		this.userInfoFindPageWhere.setUsernamesByIndex(usernamesByIndex);
	}
	
}
