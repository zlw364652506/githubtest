package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class AppTag extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 4659248538078633477L;

	// Fields
	private Long objId;

	/**
	 * 分类主键
	 */
	private Long catogoryId;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 图标
	 */
	private byte[] icon;

	/**
	 * 图标地址
	 */
	private String iconUrl;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 最后操作时间
	 */
	private Date lastOptTime;
	/**
	 * 对应的分类标签目录对象
	 */
	private AppTagCategory appTagCategory;

	public AppTagCategory getAppTagCategory() {
		return appTagCategory;
	}

	public void setAppTagCategory(AppTagCategory appTagCategory) {
		this.appTagCategory = appTagCategory;
	}

	// Constructors
	/** default constructor */
	public AppTag() {
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

	public Long getCatogoryId() {
		return catogoryId;
	}

	public void setCatogoryId(Long catogoryId) {
		this.catogoryId = catogoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getIcon() {
		return icon;
	}

	public void setIcon(byte[] icon) {
		this.icon = icon;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public Date getLastOptTime() {
		return lastOptTime;
	}

	public void setLastOptTime(Date lastOptTime) {
		this.lastOptTime = lastOptTime;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getName(),
				"" + this.getCatogoryId() };
	}

}
