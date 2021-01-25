package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class RealNameAuth extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 1367414435198624305L;

	// Fields
	private Long objId;

	/**
	 * 实名用户主键
	 */
	private Long userId;

	/**
	 * 认证方式，1-证件认证；2-证书；3-口令；4-银行卡；5-生物特征；
	 */
	private Byte authType;

	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 身份证号码
	 */
	private String idcardNo;

	/**
	 * 手机号码
	 */
	private String mobileNumber;

	/**
	 * 申请时间
	 */
	private Date createTime;

	/**
	 * 审核人
	 */
	private Long auditUserId;
	/**
	 * 审核时间
	 */
	private Date auditTime;

	/**
	 * 审核状态，1-通过；2-不通过；
	 */
	private Byte auditState;

	/**
	 * 审核内容
	 */
	private String auditContent;

	/**
	 * 状态 ，0-失效（认证失败或重新认证）；1-正常（认证成功）；2-认证申请中；
	 */
	private Byte state;

	/**
	 * 备注
	 */
	private String remark;

	// Constructors
	/** default constructor */
	public RealNameAuth() {
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

	public Byte getAuthType() {
		return authType;
	}

	public void setAuthType(Byte authType) {
		this.authType = authType;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getIdcardNo() {
		return idcardNo;
	}

	public void setIdcardNo(String idcardNo) {
		this.idcardNo = idcardNo;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getAuditUserId() {
		return auditUserId;
	}

	public void setAuditUserId(Long auditUserId) {
		this.auditUserId = auditUserId;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public Byte getAuditState() {
		return auditState;
	}

	public void setAuditState(Byte auditState) {
		this.auditState = auditState;
	}

	public String getAuditContent() {
		return auditContent;
	}

	public void setAuditContent(String auditContent) {
		this.auditContent = auditContent;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
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
				"" + this.getObjId(), "" + this.getRealName(),
				"" + this.getIdcardNo() };
	}

}
