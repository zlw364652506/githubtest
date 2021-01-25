package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class AppCounterStat extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 4659248538078633477L;
	
	// Fields
	private Long objId;
	
	/**
	 * 计数器中文名称
	 */
	private String counterName;
	
	/**
	 * 计数器名称代码
	 */
	private String counterCode;
	
	/**
	 * app_主键
	 */
	private Long appId;
	
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	
	/**
	 * 地区主键
	 */
	private Long areaId;
	
	/**
	 * 计数开始时间，格式yyyymmddhh24miss
	 */
	private String startDate;
	
	/**
	 * 计数结束时间，格式yyyymmddhh24miss
	 */
	private String endDate;
	
	/**
	 * 统计数量
	 */
	private Long statCount;

	/**
	 * 创建时间
	 */
	private Date createTime;
	
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	
	//应用下载/访问次数
	private Long downloadCount;
	//装机量
	private Long installedCapacity;
	
	public Long getDownloadCount() {
		return downloadCount;
	}

	public void setDownloadCount(Long downloadCount) {
		this.downloadCount = downloadCount;
	}

	public Long getInstalledCapacity() {
		return installedCapacity;
	}

	public void setInstalledCapacity(Long installedCapacity) {
		this.installedCapacity = installedCapacity;
	}

	//填充对象 
	//App版本对象
	private AppVersion appVersion;
	
	public AppVersion getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(AppVersion appVersion) {
		this.appVersion = appVersion;
	}

	// Constructors
	/** default constructor */
	public AppCounterStat() {
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
	public String getCounterName() {
		return counterName;
	}

	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	public String getCounterCode() {
		return counterCode;
	}

	public void setCounterCode(String counterCode) {
		this.counterCode = counterCode;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public Long getStatCount() {
		return statCount;
	}

	public void setStatCount(Long statCount) {
		this.statCount = statCount;
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
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(), "" + this.getStatCount()};
	}
}
