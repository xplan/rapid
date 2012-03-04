package com.company.project.operation;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.iwallet.biz.common.util.money.Money;
import java.util.*;

public class TestMybatisForEachQuery extends PageQuery implements java.io.Serializable {
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
	private java.util.List<String> array;
	/** roleName */
	private java.util.List<String> list;
	/** content */
	private String contentIf1;
	/** content */
	private String contentIf2;
	/** content */
	private String contentIf3;
	/** content */
	private String contentIf4;
	/** content */
	private String contentIf5;
	
	public TestMybatisForEachQuery() {
	}
	
	public TestMybatisForEachQuery(Long roleId ,String roleName ,String content ,java.sql.Date modifiedBegin ,java.sql.Date modifiedEnd ,java.util.List<String> array ,java.util.List<String> list ,String contentIf1 ,String contentIf2 ,String contentIf3 ,String contentIf4 ,String contentIf5 ) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.content = content;
		this.modifiedBegin = modifiedBegin;
		this.modifiedEnd = modifiedEnd;
		this.array = array;
		this.list = list;
		this.contentIf1 = contentIf1;
		this.contentIf2 = contentIf2;
		this.contentIf3 = contentIf3;
		this.contentIf4 = contentIf4;
		this.contentIf5 = contentIf5;
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
	public java.util.List<String> getArray() {
		return array;
	}
	public void setArray(java.util.List<String> array) {
		this.array = array;
	}
	public java.util.List<String> getList() {
		return list;
	}
	public void setList(java.util.List<String> list) {
		this.list = list;
	}
	public String getContentIf1() {
		return contentIf1;
	}
	public void setContentIf1(String contentIf1) {
		this.contentIf1 = contentIf1;
	}
	public String getContentIf2() {
		return contentIf2;
	}
	public void setContentIf2(String contentIf2) {
		this.contentIf2 = contentIf2;
	}
	public String getContentIf3() {
		return contentIf3;
	}
	public void setContentIf3(String contentIf3) {
		this.contentIf3 = contentIf3;
	}
	public String getContentIf4() {
		return contentIf4;
	}
	public void setContentIf4(String contentIf4) {
		this.contentIf4 = contentIf4;
	}
	public String getContentIf5() {
		return contentIf5;
	}
	public void setContentIf5(String contentIf5) {
		this.contentIf5 = contentIf5;
	}
	
	
	
}
