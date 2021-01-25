package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * AppUseBaseService entity. @author MyEclipse Persistence Tools
 */
public class AppUseBaseService extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 3203049918900935911L;
	
	// Fields
	private Long objId;
	/**
	 * 基础服务_主键
	 */
	private Long serviceId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	// Constructors
	
	
	/**
	 * 禁用状态
	 */
	private Byte state;
	/** default constructor */
	public AppUseBaseService() {
	}
	public AppUseBaseService(Long serviceId) {
		this.serviceId = serviceId;
	}
	/** full constructor */
	public AppUseBaseService(Long serviceId, Long appVersionId) {
		this.serviceId = serviceId;
		this.appVersionId = appVersionId;
	}
	public AppUseBaseService(AppVersion appVer) {
		this.appVersionId = appVer.getObjId();
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getServiceId() {
		return this.serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public Long getAppVersionId() {
		return this.appVersionId;
	}
	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}
	public Byte getState() {
		return state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(), "" + this.getServiceId()};
	}
}
