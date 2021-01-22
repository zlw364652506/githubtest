package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;

public class AppStoreInfo extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 4659248538078633477L;

	// Fields
	private Long objId;

	/**
	 * 众创平台生成的该应用市场编号
	 */
	private String appStoreId;

	/**
	 * 应用市场名称
	 */
	private String appStoreName;

	/**
	 * 开发商主键
	 */
	private Long serviceDeveloperId;

	/**
	 * 所属区域的组织机构主键
	 */
	private Long deptId;

	/**
	 * 管理员用户主键
	 */
	private Long adminUserId;

	/**
	 * 描述
	 */
	private String description;

	/**
	 * 主动上报所使用的IP地址
	 */
	private String reportIpAddress;

	/**
	 * 主动获取所使用的IP地址及端口
	 */
	private String queryIpAddress;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	
	//扩展属性
	/**
	 * 管理员
	 */
	private User adminUser;
	/**
	 * 开发商
	 */
	private Company developerCompany;
	/**
	 * 所属区域的组织机构
	 */
	private Dept dept;

	public User getAdminUser() {
		return adminUser;
	}

	public void setAdminUser(User adminUser) {
		this.adminUser = adminUser;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	// Constructors
	/** default constructor */
	public AppStoreInfo() {
	}

	// Property accessors
	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public String getAppStoreId() {
		return appStoreId;
	}

	public void setAppStoreId(String appStoreId) {
		this.appStoreId = appStoreId;
	}

	public String getAppStoreName() {
		return appStoreName;
	}

	public void setAppStoreName(String appStoreName) {
		this.appStoreName = appStoreName;
	}

	public Long getServiceDeveloperId() {
		return serviceDeveloperId;
	}

	public void setServiceDeveloperId(Long serviceDeveloperId) {
		this.serviceDeveloperId = serviceDeveloperId;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public Long getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(Long adminUserId) {
		this.adminUserId = adminUserId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getReportIpAddress() {
		return reportIpAddress;
	}

	public void setReportIpAddress(String reportIpAddress) {
		this.reportIpAddress = reportIpAddress;
	}

	public String getQueryIpAddress() {
		return queryIpAddress;
	}

	public void setQueryIpAddress(String queryIpAddress) {
		this.queryIpAddress = queryIpAddress;
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

	public Company getDeveloperCompany() {
		return developerCompany;
	}

	public void setDeveloperCompany(Company developerCompany) {
		this.developerCompany = developerCompany;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getAppStoreId(),
				"" + this.getAppStoreName() };
	}

}
