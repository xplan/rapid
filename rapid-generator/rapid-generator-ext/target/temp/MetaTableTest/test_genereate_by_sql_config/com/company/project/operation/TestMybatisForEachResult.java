
package com.company.project.operation;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.iwallet.biz.common.util.money.Money;
import java.util.*;

public class TestMybatisForEachResult implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/** roleId */
	private Long roleId;
	/** sumUserId */
	private java.math.BigDecimal sumUserId;

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public Long getRoleId() {
		return this.roleId;
	}
	
	public void setSumUserId(java.math.BigDecimal sumUserId) {
		this.sumUserId = sumUserId;
	}
	
	public java.math.BigDecimal getSumUserId() {
		return this.sumUserId;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
