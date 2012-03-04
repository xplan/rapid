

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class TestSelectWithTwoColumnsResult implements java.io.Serializable {

	private Long sumAge;
	private Long cnt;

	public void setSumAge(Long value) {
		this.sumAge = value;
	}
	
	public Long getSumAge() {
		return this.sumAge;
	}
	public void setCnt(Long value) {
		this.cnt = value;
	}
	
	public Long getCnt() {
		return this.cnt;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
