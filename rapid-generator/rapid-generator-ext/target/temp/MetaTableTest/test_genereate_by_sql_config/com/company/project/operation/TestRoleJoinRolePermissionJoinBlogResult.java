
package com.company.project.operation;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import com.iwallet.biz.common.util.money.Money;
import java.util.*;

public class TestRoleJoinRolePermissionJoinBlogResult implements java.io.Serializable {
	private static final long serialVersionUID = -5216457518046898601L;
	
	/** roleId */
	private Long roleId;
	/** roleName */
	private String roleName;
	/** resourceId */
	private Long resourceId;
	/** userId */
	private Long userId;
	/** roleDesc */
	private String roleDesc;
	/** created */
	private java.sql.Date created;
	/** modified */
	private java.sql.Date modified;
	/** roleId */
	private Long roleId;
	/** permissoinId */
	private Long permissoinId;
	/** blogId */
	private Long blogId;
	/** userId */
	private Long userId;
	/** username */
	private String username;
	/** created */
	private java.sql.Date created;
	/** modified */
	private java.sql.Date modified;
	/** title */
	private String title;
	/** content */
	private String content;
	/** contentLength */
	private Integer contentLength;
	/** status */
	private String status;

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public Long getRoleId() {
		return this.roleId;
	}
	
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	public String getRoleName() {
		return this.roleName;
	}
	
	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}
	
	public Long getResourceId() {
		return this.resourceId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public Long getUserId() {
		return this.userId;
	}
	
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	
	public String getRoleDesc() {
		return this.roleDesc;
	}
	
	public void setCreated(java.sql.Date created) {
		this.created = created;
	}
	
	public java.sql.Date getCreated() {
		return this.created;
	}
	
	public void setModified(java.sql.Date modified) {
		this.modified = modified;
	}
	
	public java.sql.Date getModified() {
		return this.modified;
	}
	
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	public Long getRoleId() {
		return this.roleId;
	}
	
	public void setPermissoinId(Long permissoinId) {
		this.permissoinId = permissoinId;
	}
	
	public Long getPermissoinId() {
		return this.permissoinId;
	}
	
	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}
	
	public Long getBlogId() {
		return this.blogId;
	}
	
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
	
	public void setCreated(java.sql.Date created) {
		this.created = created;
	}
	
	public java.sql.Date getCreated() {
		return this.created;
	}
	
	public void setModified(java.sql.Date modified) {
		this.modified = modified;
	}
	
	public java.sql.Date getModified() {
		return this.modified;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public void setContentLength(Integer contentLength) {
		this.contentLength = contentLength;
	}
	
	public Integer getContentLength() {
		return this.contentLength;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return this.status;
	}
	

	public String toString() {
		return ToStringBuilder.reflectionToString(this,ToStringStyle.MULTI_LINE_STYLE);
	}
	
}
