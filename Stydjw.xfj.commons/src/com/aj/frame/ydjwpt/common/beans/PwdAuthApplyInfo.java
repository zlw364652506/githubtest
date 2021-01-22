package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class PwdAuthApplyInfo extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 1367414435198624305L;

	// Fields
	private Long objId;

	/**
	 * 实名认证单据主键
	 */
	private Long authId;

	/**
	 * 口令类型
	 */
	private Byte pwdType;

	/**
	 * 口令内容
	 */
	private String pwdContent;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;

	/**
	 * 备注
	 */
	private String remark;

	// Constructors
	/** default constructor */
	public PwdAuthApplyInfo() {
	}

	// Property accessors
	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
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

	public Long getAuthId() {
		return authId;
	}

	public void setAuthId(Long authId) {
		this.authId = authId;
	}

	public Byte getPwdType() {
		return pwdType;
	}

	public void setPwdType(Byte pwdType) {
		this.pwdType = pwdType;
	}

	public String getPwdContent() {
		return pwdContent;
	}

	public void setPwdContent(String pwdContent) {
		this.pwdContent = pwdContent;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getPwdType(),
				"" + this.getPwdContent() };
	}

}
