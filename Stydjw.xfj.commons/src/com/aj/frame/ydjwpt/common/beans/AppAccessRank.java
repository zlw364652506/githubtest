package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class AppAccessRank extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 4659248538078633477L;

	// Fields
	/**
	 * APP主键
	 */
	private Long appId;

	/**
	 * 访问量
	 */
	private Long accessCount;

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getAccessCount() {
		return accessCount;
	}

	public void setAccessCount(Long accessCount) {
		this.accessCount = accessCount;
	}

	@Override
	public String[] importantFieldValues() {
		// TODO Auto-generated method stub
		return new String[] {this.getClass().getSimpleName(), "" + this.getAccessCount(), "" + this.getAppId()};
	}

	


	

}
