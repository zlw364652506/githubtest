package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class IdcardAuthApplyInfo extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 1367414435198624305L;

	// Fields
	private Long objId;

	/**
	 * 实名认证单据主键
	 */
	private Long authId;

	/**
	 * 证件类型
	 */
	private Byte idcardType;

	/**
	 * 证件号码
	 */
	private String idcardNo;

	/**
	 * 发证组织机关
	 */
	private String issuingOrg;

	/**
	 * 有效日期始
	 */
	private Date startDate;

	/**
	 * 有效日期止
	 */
	private Date endDate;

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
	public IdcardAuthApplyInfo() {
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

	public Byte getIdcardType() {
		return idcardType;
	}

	public void setIdcardType(Byte idcardType) {
		this.idcardType = idcardType;
	}

	public String getIdcardNo() {
		return idcardNo;
	}

	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	public String getIssuingOrg() {
		return issuingOrg;
	}

	public void setIssuingOrg(String issuingOrg) {
		this.issuingOrg = issuingOrg;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
				"" + this.getObjId(), "" + this.getIdcardType(),
				"" + this.getIdcardNo() };
	}

}
