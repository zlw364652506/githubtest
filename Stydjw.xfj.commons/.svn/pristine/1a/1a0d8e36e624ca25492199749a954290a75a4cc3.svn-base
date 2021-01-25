package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * AppAdaptDevice entity. @author MyEclipse Persistence Tools
 */
public class AppAdaptDevice extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 2235411411058470791L;
	
	// Fields
	private Long objId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	/**
	 * 机型ID
	 */
	private Long devTypeId;
	// Constructors
	/** default constructor */
	public AppAdaptDevice() {
	}
	/** full constructor */
	public AppAdaptDevice(Long appVersionId, Long devTypeId) {
		this.appVersionId = appVersionId;
		this.devTypeId = devTypeId;
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
	public Long getDevTypeId() {
		return this.devTypeId;
	}
	public void setDevTypeId(Long devTypeId) {
		this.devTypeId = devTypeId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(), "" + this.getDevTypeId()};
	}
}
