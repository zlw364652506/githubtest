package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class AppWeekDownRank extends AJFrameNamedBeanAbstract {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3512448720163112332L;

	/**
	 * APP主键
	 */
	private Long appId;

	/**
	 * 下载量
	 */
	private Long downloadCount;
	/**
	 * 计数开始时间
	 */
	private String startDate;

	// Constructors
	/** default constructor */
	public AppWeekDownRank() {
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(), "" + this.getAppId(), "" + this.getDownloadCount(),
				"" + this.getStartDate() };
	}

}
