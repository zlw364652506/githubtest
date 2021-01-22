package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * AppVersionPicture entity. @author MyEclipse Persistence Tools
 */
public class AppVersionPicture extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 357300755176968493L;
	
	// Fields
	private Long objId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;//app版本主键
	/**
	 * 描述
	 */
	private String describe;
	/**
	 * 图片数据
	 */
	private byte[] imageData;
	/**
	 * 序号
	 */
	private Byte sn;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 资源类型，1-图片；2-视频；
	 */
	private Byte resourceType;
	/**
	 * 资源名称
	 */
	private String resourceName;
	/**
	 * 资源URL
	 */
	private String resourceUrl;
	/**
	 * 最后操作时间
	 */
	private Date lastOptTime;
	
	// Constructors
	/** default constructor */
	public AppVersionPicture() {
	}
	/** minimal constructor */
	public AppVersionPicture(Long appVersionId, byte[] imageData, Byte state) {
		this.appVersionId = appVersionId;
		this.imageData = imageData;
		this.state = state;
	}
	/** full constructor */
	public AppVersionPicture(Long appVersionId, String describe,
			byte[] imageData, Byte sn, Byte state) {
		this.appVersionId = appVersionId;
		this.describe = describe;
		this.imageData = imageData;
		this.sn = sn;
		this.state = state;
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
	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public byte[] getImageData() {
		return this.imageData;
	}
	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}
	public Byte getSn() {
		return this.sn;
	}
	public void setSn(Byte sn) {
		this.sn = sn;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public Byte getResourceType() {
		return resourceType;
	}
	public void setResourceType(Byte resourceType) {
		this.resourceType = resourceType;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceUrl() {
		return resourceUrl;
	}
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	public Date getLastOptTime() {
		return lastOptTime;
	}
	public void setLastOptTime(Date lastOptTime) {
		this.lastOptTime = lastOptTime;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(), "" + this.getSn()};
	}
}
