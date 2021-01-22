package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * NoticeGroupRecord entity. @author MyEclipse Persistence Tools
 */
public class NoticeGroupRecord extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 7895254605716487043L;

	private Long objId;
	/**
	 * 通知消息ID
	 */
	private Long noticeId;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 群类型，1-部门；2-地区；
	 */
	private Byte groupType;
	/**
	 * 群类型，1-部门；2-地区；
	 */
	private Byte groupScope;
	/**
	 * 记录生成时间
	 */
	private Date createTime;

	// 扩展对象
	private UserExt receiver;
	private NoticeInfo noticeInfo;
	
	
	/** default constructor */
	public NoticeGroupRecord() {
	}

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(Long noticeId) {
		this.noticeId = noticeId;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Byte getGroupType() {
		return groupType;
	}

	public void setGroupType(Byte groupType) {
		this.groupType = groupType;
	}

	public Byte getGroupScope() {
		return groupScope;
	}

	public void setGroupScope(Byte groupScope) {
		this.groupScope = groupScope;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public UserExt getReceiver() {
		return receiver;
	}

	public void setReceiver(UserExt receiver) {
		this.receiver = receiver;
	}

	public NoticeInfo getNoticeInfo() {
		return noticeInfo;
	}

	public void setNoticeInfo(NoticeInfo noticeInfo) {
		this.noticeInfo = noticeInfo;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getNoticeId()};
	}
}
