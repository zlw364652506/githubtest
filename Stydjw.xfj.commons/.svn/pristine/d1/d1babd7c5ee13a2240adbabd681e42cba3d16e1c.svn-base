package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class BiologicalAuthApplyInfo extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = -9125186167218550124L;

	// Fields
	private Long objId;

	/**
	 * 实名认证单据主键
	 */
	private Long authId;

	/**
	 * 生物特征类型
	 */
	private Byte biologicalType;

	/**
	 * 生物特征1
	 */
	private String biologicalContent1;

	/**
	 * 生物特征2
	 */
	private String biologicalContent2;

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
	public BiologicalAuthApplyInfo() {
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

	public Byte getBiologicalType() {
		return biologicalType;
	}

	public void setBiologicalType(Byte biologicalType) {
		this.biologicalType = biologicalType;
	}

	public String getBiologicalContent1() {
		return biologicalContent1;
	}

	public void setBiologicalContent1(String biologicalContent1) {
		this.biologicalContent1 = biologicalContent1;
	}

	public String getBiologicalContent2() {
		return biologicalContent2;
	}

	public void setBiologicalContent2(String biologicalContent2) {
		this.biologicalContent2 = biologicalContent2;
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
				"" + this.getObjId(), "" + this.getBiologicalType(),
				"" + this.getBiologicalContent1() };
	}

}
