package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class AppDownRank extends AJFrameNamedBeanAbstract {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3640752159859775566L;

	/**
	 * APP主键
	 */
	private Long appId;

	/**
	 * 下载量
	 */
	private Long downloadCount;

	// Constructors
	/** default constructor */
	public AppDownRank() {
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getDownloadCount() {
		return downloadCount;
	}

	public void setDownloadCount(Long downloadCount) {
		this.downloadCount = downloadCount;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(), "" + this.getAppId(), "" + this.getDownloadCount() };
	}

}
