package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class AppChooseTags extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 4850269903367699232L;

	// Fields
	private Long objId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	/**
	 * 标签ID
	 */
	private Long tagId;
	/**
	 * 标签名称(冗余)
	 */
	private String name;
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
	public AppChooseTags() {
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

	public Long getTagId() {
		return tagId;
	}

	public void setTagId(Long tagId) {
		this.tagId = tagId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
				"" + this.getTagId() };
	}
}
