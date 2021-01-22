package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class AppAdaptTerminalType extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 4850269903367699232L;

	// Fields
	private Long objId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	/**
	 * 终端类型ID
	 */
	private Long terminalTypeId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;

	// Constructors
	/** default constructor */
	public AppAdaptTerminalType() {
	}

	/** full constructor */
	public AppAdaptTerminalType(Long appVersionId, Long terminalTypeId) {
		this.appVersionId = appVersionId;
		this.terminalTypeId = terminalTypeId;
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

	public Long getTerminalTypeId() {
		return terminalTypeId;
	}

	public void setTerminalTypeId(Long terminalTypeId) {
		this.terminalTypeId = terminalTypeId;
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
				"" + this.getObjId(), "" + this.getAppVersionId(),
				"" + this.getTerminalTypeId() };
	}
}
