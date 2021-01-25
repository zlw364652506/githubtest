package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * AppAreaRelation entity. @author MyEclipse Persistence Tools
 */
public class AppAreaRelation extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 6414449484050990045L;
	
	// Fields
	private Long objId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	/**
	 * 地区主键
	 */
	private Long areaId;
	// Constructors
	/** default constructor */
	public AppAreaRelation() {
	}
	/** full constructor */
	public AppAreaRelation(Long appVersionId, Long areaId) {
		this.appVersionId = appVersionId;
		this.areaId = areaId;
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
	public Long getAreaId() {
		return this.areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(), "" + this.getAreaId()};
	}
}
