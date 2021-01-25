package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * TerminalInstallAppRecord entity. @author MyEclipse Persistence Tools
 */
public class TerminalInstallAppRecord extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 3899016251106266334L;
	
	// Fields
	private Long objId;
	/**
	 * 终端设备主键
	 */
	private Long terminalId;
	/**
	 * APP应用主键
	 */
	private Long appId;
	/**
	 * APP版本主键
	 */
	private Long appVersionId;
	/**
	 * 用户主键
	 */
	private Long userId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态 ，0-已注销（逻辑删除）；1-已授权（正常）；2-待授权；3-已挂失；4-已禁用；5-用户被注销；6-未匹配；
	 */
	private Byte state;

	// Constructors
	/** default constructor */
	public TerminalInstallAppRecord() {
	}

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}

	public Long getAppId() {
		return appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
	}

	public Long getAppVersionId() {
		return appVersionId;
	}

	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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
				"" + this.getObjId(),
				"" + this.getUserId(), "" + this.getState() };
	}
}
