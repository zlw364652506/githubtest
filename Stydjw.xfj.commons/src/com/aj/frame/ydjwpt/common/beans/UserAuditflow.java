package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * UserAuditflow entity. @author MyEclipse Persistence Tools
 */
public class UserAuditflow extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 7310648673275289321L;
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
	 * 被审核用户
	 */
	private Long userId;
	/**
	 * 被审核前用户状态
	 */
	private Byte oldUserState;
	/**
	 * 被审核后用户状态
	 */
	private Byte newUserState;
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
	public UserAuditflow() {
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Byte getOldUserState() {
		return oldUserState;
	}

	public void setOldUserState(Byte oldUserState) {
		this.oldUserState = oldUserState;
	}

	public Byte getNewUserState() {
		return newUserState;
	}

	public void setNewUserState(Byte newUserState) {
		this.newUserState = newUserState;
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
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAuditorId(), "" + this.getUserId()};
	}
}
