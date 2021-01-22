package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * MyFavorites entity. @author MyEclipse Persistence Tools
 */
public class ThirdOperationBehaviorLog extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -319809836379427299L;
	
	// Fields
	private Long objId;
	/**
	 * 操作用户账号
	 */
	private String userCode;
	/**
	 * 操作用户姓名
	 */
	private String userName;
	/**
	 * 所属部门代码
	 */
	private String deptCode;
	/**
	 * 所属部门名称
	 */
	private String deptName;
	/**
	 * app名称，命名规则为 [服务范围][省份名称] [地市名称][应用名称] 例如：全－广东省－广州市－人员核查应用
	 */
	private String appName;
	/**
	 * APP包名，每个APP对应唯一包名
	 */
	private String packageName;
	/**
	 * APP版本
	 */
	private String appVersion;
	/**
	 * 终端设备编码
	 */
	private String deviceSn;
	/**
	 * 终端型号名称，如：华为P30
	 */
	private String modelName;
	/**
	 * 操作系统名称，预定义的规范名称
	 */
	private String osName;
	/**
	 * 操作系统版本号，纯数字的主副版本号，如：4.2
	 */
	private String osVersion;
	/**
	 * 操作时间
	 */
	private Date optTime;
	/**
	 * 功能模块
	 */
	private String funcionModule;
	/**
	 * 操作事件
	 */
	private String optEvent;
	/**
	 * 操作对象，对应操作事件的参数，如查询关键字等
	 */
	private String optObject;
	/**
	 * 操作来源，1-APP；2-WEB；9-其他；
	 */
	private Byte optSource;
	/**
	 * 经度
	 */
	private String longtitude;
	/**
	 * 维度
	 */
	private String latitude;
	/**
	 * 地址描述
	 */
	private String address;
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


	public String getUserCode() {
		return userCode;
	}


	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getDeptCode() {
		return deptCode;
	}


	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getAppName() {
		return appName;
	}


	public void setAppName(String appName) {
		this.appName = appName;
	}


	public String getPackageName() {
		return packageName;
	}


	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}


	public String getAppVersion() {
		return appVersion;
	}


	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}


	public String getDeviceSn() {
		return deviceSn;
	}


	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}


	public String getModelName() {
		return modelName;
	}


	public void setModelName(String modelName) {
		this.modelName = modelName;
	}


	public String getOsName() {
		return osName;
	}


	public void setOsName(String osName) {
		this.osName = osName;
	}


	public String getOsVersion() {
		return osVersion;
	}


	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}


	public Date getOptTime() {
		return optTime;
	}


	public void setOptTime(Date optTime) {
		this.optTime = optTime;
	}


	public String getFuncionModule() {
		return funcionModule;
	}


	public void setFuncionModule(String funcionModule) {
		this.funcionModule = funcionModule;
	}


	public String getOptEvent() {
		return optEvent;
	}


	public void setOptEvent(String optEvent) {
		this.optEvent = optEvent;
	}


	public String getOptObject() {
		return optObject;
	}


	public void setOptObject(String optObject) {
		this.optObject = optObject;
	}


	public Byte getOptSource() {
		return optSource;
	}


	public void setOptSource(Byte optSource) {
		this.optSource = optSource;
	}


	public String getLongtitude() {
		return longtitude;
	}


	public void setLongtitude(String longtitude) {
		this.longtitude = longtitude;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Byte getState() {
		return state;
	}


	public void setState(Byte state) {
		this.state = state;
	}


	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getUserName(), "" + this.getFuncionModule()};
	}
}
