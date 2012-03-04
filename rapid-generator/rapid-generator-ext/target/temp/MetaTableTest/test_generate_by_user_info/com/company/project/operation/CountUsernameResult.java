
package com.company.project.operation;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.iwallet.biz.common.util.money.Money;
import java.util.*;

public class CountUsernameResult implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/** usernameCnt */
	private Long usernameCnt;
	/** sumAge */
	private Long sumAge;

	public void setUsernameCnt(Long usernameCnt) {
		this.usernameCnt = usernameCnt;
	}
	
	public Long getUsernameCnt() {
		return this.usernameCnt;
	}
	
	public void setSumAge(Long sumAge) {
		this.sumAge = sumAge;
	}
	
	public Long getSumAge() {
		return this.sumAge;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
