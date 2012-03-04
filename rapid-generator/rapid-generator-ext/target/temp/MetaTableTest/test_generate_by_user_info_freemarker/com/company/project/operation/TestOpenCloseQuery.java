package com.company.project.operation;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.iwallet.biz.common.util.money.Money;
import java.util.*;

public class TestOpenCloseQuery extends PageQuery implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/** roleId */
	private Long roleId;
	/** roleName */
	private String roleName;
	/** content */
	private String content;
	/** modified */
	private java.sql.Date modifiedBegin;
	/** modified */
	private java.sql.Date modifiedEnd;
	/** roleName */
	private java.util.List<String> role_name;
	/** roleName */
	private java.util.List<String> in_role_name;
	/** roleName */
	private java.util.List<String> not_in_role_name;
	/** roleName */
	private String rolename;
	/** roleName */
	private String rolenameArray;
	/** roleName */
	private String rolenameList;
	
	public TestOpenCloseQuery() {
	}
	
	public TestOpenCloseQuery(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,java.util.List<String> role_name ,java.util.List<String> in_role_name ,java.util.List<String> not_in_role_name ,String rolename ,String rolenameArray ,String rolenameList ) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.content = content;
		this.modifiedBegin = modifiedBegin;
		this.modifiedEnd = modifiedEnd;
		this.role_name = role_name;
		this.in_role_name = in_role_name;
		this.not_in_role_name = not_in_role_name;
		this.rolename = rolename;
		this.rolenameArray = rolenameArray;
		this.rolenameList = rolenameList;
	}
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public java.sql.Date getModifiedBegin() {
		return modifiedBegin;
	}
	public void setModifiedBegin(java.sql.Date modifiedBegin) {
		this.modifiedBegin = modifiedBegin;
	}
	public java.sql.Date getModifiedEnd() {
		return modifiedEnd;
	}
	public void setModifiedEnd(java.sql.Date modifiedEnd) {
		this.modifiedEnd = modifiedEnd;
	}
	public java.util.List<String> getRole_name() {
		return role_name;
	}
	public void setRole_name(java.util.List<String> role_name) {
		this.role_name = role_name;
	}
	public java.util.List<String> getIn_role_name() {
		return in_role_name;
	}
	public void setIn_role_name(java.util.List<String> in_role_name) {
		this.in_role_name = in_role_name;
	}
	public java.util.List<String> getNot_in_role_name() {
		return not_in_role_name;
	}
	public void setNot_in_role_name(java.util.List<String> not_in_role_name) {
		this.not_in_role_name = not_in_role_name;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRolenameArray() {
		return rolenameArray;
	}
	public void setRolenameArray(String rolenameArray) {
		this.rolenameArray = rolenameArray;
	}
	public String getRolenameList() {
		return rolenameList;
	}
	public void setRolenameList(String rolenameList) {
		this.rolenameList = rolenameList;
	}
	
	
	
}
