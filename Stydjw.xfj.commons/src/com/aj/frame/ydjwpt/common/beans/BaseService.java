package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * BaseService entity. @author MyEclipse Persistence Tools
 */
public class BaseService extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = -473155260832017939L;
	// Fields
	private Long objId;
	/**
	 * 基础服务名称
	 */
	private String serviceName;
	/**
	 * 基础服务描述
	 */
	private String serviceDescrib;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 资源服务地址IP地址、端口
	 */
	private String serviceIpAddress;
	/**
	 * 资源服务版本
	 */
	private String serviceVersion;
	/**
	 * 资源服务类别
	 */
	private String serviceType;
	/**
	 * 资源服务协议，001-RESTful WebService；002-SOAP WebService；003-FTP；004-JMS；
	 */
	private String serviceProtocol;

	// Constructors
	/** default constructor */
	public BaseService() {
	}

	public BaseService(Long objId) {
		this.objId = objId;
	}

	/** minimal constructor */
	public BaseService(String serviceName, Byte state) {
		this.serviceName = serviceName;
		this.state = state;
	}

	/** full constructor */
	public BaseService(String serviceName, String serviceDescrib, Byte state) {
		this.serviceName = serviceName;
		this.serviceDescrib = serviceDescrib;
		this.state = state;
	}

	public BaseService(String serviceName) {
		this.serviceName = serviceName;
	}

	// Property accessors
	public Long getObjId() {
		return this.objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceDescrib() {
		return this.serviceDescrib;
	}

	public void setServiceDescrib(String serviceDescrib) {
		this.serviceDescrib = serviceDescrib;
	}

	public Byte getState() {
		return this.state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getServiceIpAddress() {
		return serviceIpAddress;
	}

	public void setServiceIpAddress(String serviceIpAddress) {
		this.serviceIpAddress = serviceIpAddress;
	}

	public String getServiceVersion() {
		return serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceProtocol() {
		return serviceProtocol;
	}

	public void setServiceProtocol(String serviceProtocol) {
		this.serviceProtocol = serviceProtocol;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), this.getServiceName() };
	}
}
