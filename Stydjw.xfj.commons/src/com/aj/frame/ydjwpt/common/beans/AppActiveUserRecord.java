package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class AppActiveUserRecord extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 612034942280539959L;
	// Fields
	private Long objId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	/**
	 * 活跃用户ID
	 */
	private Long userId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	
	private Long userCount;
	
	public Long getUserCount() {
		return userCount;
	}

	public void setUserCount(Long userCount) {
		this.userCount = userCount;
	}

	private AppVersion appVersion;

	public AppVersion getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(AppVersion appVersion) {
		this.appVersion = appVersion;
	}

	// Constructors
	/** default constructor */
	public AppActiveUserRecord() {
	}

	/** full constructor */
	public AppActiveUserRecord(Long appVersionId, Long userId) {
		this.appVersionId = appVersionId;
		this.userId = userId;
	}

	// Property accessors
	public Long getObjId() {
		return this.objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getAppVersionId() {
		return this.appVersionId;
	}

	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getAppVersionId(),
				"" + this.getUserId() };
	}
}
