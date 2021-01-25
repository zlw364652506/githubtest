package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class TerminalType extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 4659248538078633477L;

	// Fields
	private Long objId;

	/**
	 * 终端类型名称
	 */
	private String terminalTypeName;

	/**
	 * 终端类型代码
	 */
	private String terminalTypeCode;

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
	public TerminalType() {
	}

	// Property accessors
	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public String getTerminalTypeName() {
		return terminalTypeName;
	}

	public void setTerminalTypeName(String terminalTypeName) {
		this.terminalTypeName = terminalTypeName;
	}

	public String getTerminalTypeCode() {
		return terminalTypeCode;
	}

	public void setTerminalTypeCode(String terminalTypeCode) {
		this.terminalTypeCode = terminalTypeCode;
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
				"" + this.getObjId(), "" + this.getTerminalTypeName(),
				"" + this.getTerminalTypeCode() };
	}

}
