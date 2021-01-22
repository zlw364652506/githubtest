package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class StatCounter extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 2390522910650177669L;

	// Fields
	private Long objId;

	/**
	 * 计数器主键
	 */
	private Long counterId;

	/**
	 * 计数器中文名称
	 */
	private String counterName;

	/**
	 * APP应用主键
	 */
	private Long appId;

	/**
	 * APP应用名称
	 */
	private String appName;

	/**
	 * APP版本主键
	 */
	private Long appVersionId;

	/**
	 * APP版本名
	 */
	private String appVersionName;

	/**
	 * 警种主键
	 */
	private Long policeTypeId;

	/**
	 * 警种名称
	 */
	private String policeTypeName;

	/**
	 * 部门主键
	 */
	private Long deptId;

	/**
	 * 部门名称
	 */
	private String deptName;

	/**
	 * 地区主键
	 */
	private Long areaId;

	/**
	 * 地区名称
	 */
	private String areaName;

	/**
	 * 应用类型分类主键
	 */
	private Long appSortId;

	/**
	 * 应用类型分类名称
	 */
	private String appSortName;

	/**
	 * 分类标签主键
	 */
	private Long tagId;

	/**
	 * 分类标签名称
	 */
	private String tagName;

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

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getCounterId() {
		return counterId;
	}

	public void setCounterId(Long counterId) {
		this.counterId = counterId;
	}

	public String getCounterName() {
		return counterName;
	}

	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public Long getAppVersionId() {
		return appVersionId;
	}

	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}

	public String getAppVersionName() {
		return appVersionName;
	}

	public void setAppVersionName(String appVersionName) {
		this.appVersionName = appVersionName;
	}

	public Long getPoliceTypeId() {
		return policeTypeId;
	}

	public void setPoliceTypeId(Long policeTypeId) {
		this.policeTypeId = policeTypeId;
	}

	public String getPoliceTypeName() {
		return policeTypeName;
	}

	public void setPoliceTypeName(String policeTypeName) {
		this.policeTypeName = policeTypeName;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Long getAppSortId() {
		return appSortId;
	}

	public void setAppSortId(Long appSortId) {
		this.appSortId = appSortId;
	}

	public String getAppSortName() {
		return appSortName;
	}

	public void setAppSortName(String appSortName) {
		this.appSortName = appSortName;
	}

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
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
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getCounterName(),
				"" + this.getStatCount() };
	}
}
