package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * AppUsePortNum entity. @author MyEclipse Persistence Tools
 */
public class AppUsePortNum extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -5648097585306383104L;
	private Long objId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	/**
	 * 端口号
	 */
	private Long portNum;
	/**
	 * IP地址
	 */
	private String ipAddress;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	//扩展对象
	private AppVersion appVersion;
	// Constructors
	/** default constructor */
	public AppUsePortNum() {
	}
	/** full constructor */
	public AppUsePortNum(Long appVersionId, Long portNum, Byte state) {
		this.appVersionId = appVersionId;
		this.portNum = portNum;
		this.state = state;
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
	public Long getPortNum() {
		return this.portNum;
	}
	public void setPortNum(Long portNum) {
		this.portNum = portNum;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public AppVersion getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(AppVersion appVersion) {
		this.appVersion = appVersion;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(), "" + this.getPortNum()};
	}
}
