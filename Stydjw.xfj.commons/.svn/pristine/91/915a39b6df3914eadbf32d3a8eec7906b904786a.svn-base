package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class TerminalUserUsePortAuth extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 4659248538078633477L;

	// Fields
	private Long objId;

	/**
	 * 被授权用户主键
	 */
	private Long userId;

	/**
	 * 终端设备主键
	 */
	private Long terminalId;

	/**
	 * 授权时间
	 */
	private Date authTime;

	/**
	 * 失效时间
	 */
	private Date invalidTime;

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

	// Constructors
	/** default constructor */
	public TerminalUserUsePortAuth() {
	}

	// Property accessors
	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}

	public Date getAuthTime() {
		return authTime;
	}

	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}

	public Date getInvalidTime() {
		return invalidTime;
	}

	public void setInvalidTime(Date invalidTime) {
		this.invalidTime = invalidTime;
	}

	public Long getPortNum() {
		return portNum;
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
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getUserId(),
				"" + this.getTerminalId(), "" + this.getIpAddress(),
				"" + this.getPortNum() };
	}

}
