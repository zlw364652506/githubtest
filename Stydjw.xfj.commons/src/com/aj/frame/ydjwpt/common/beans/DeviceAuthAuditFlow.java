package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * DeviceAuthAuditFlow entity. @author MyEclipse Persistence Tools
 */
public class DeviceAuthAuditFlow extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -5349545940122834971L;
	
	// Fields
	private Long objId;
	/**
	 * 审核人
	 */
	private Long auditorId;
	/**
	 * 审核时间
	 */
	private Date auditTime;
	/**
	 * 备注
	 */
	private String illustrate;
	/**
	 * 被审核前授权状态
	 */
	private Byte oldAuthState;
	/**
	 * 被审核后授权状态
	 */
	private Byte newAuthState;
	/**
	 * 被审核设备授权
	 */
	private Long devAuthId;
	/**
	 * 申请时间
	 */
	private Date addTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public DeviceAuthAuditFlow() {
	}
	
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	
	public Long getAuditorId() {
		return auditorId;
	}

	public void setAuditorId(Long auditorId) {
		this.auditorId = auditorId;
	}

	public Date getAuditTime() {
		return auditTime;
	}

	public void setAuditTime(Date auditTime) {
		this.auditTime = auditTime;
	}

	public String getIllustrate() {
		return illustrate;
	}

	public void setIllustrate(String illustrate) {
		this.illustrate = illustrate;
	}

	public Byte getOldAuthState() {
		return oldAuthState;
	}

	public void setOldAuthState(Byte oldAuthState) {
		this.oldAuthState = oldAuthState;
	}

	public Byte getNewAuthState() {
		return newAuthState;
	}

	public void setNewAuthState(Byte newAuthState) {
		this.newAuthState = newAuthState;
	}

	public Long getDevAuthId() {
		return devAuthId;
	}

	public void setDevAuthId(Long devAuthId) {
		this.devAuthId = devAuthId;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAuditorId(), "" + this.getDevAuthId()};
	}
}
