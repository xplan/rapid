
package com.company.project.operation;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.iwallet.biz.common.util.money.Money;
import java.util.*;

public class TestSelectColumnsWithQueryResult implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/** 用户ID */
	private Long userId;
	/** 用户名 */
	private String username;
	/** pwdFromSelectQuery */
	private String pwdFromSelectQuery;

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
	
	public void setPwdFromSelectQuery(String pwdFromSelectQuery) {
		this.pwdFromSelectQuery = pwdFromSelectQuery;
	}
	
	public String getPwdFromSelectQuery() {
		return this.pwdFromSelectQuery;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
