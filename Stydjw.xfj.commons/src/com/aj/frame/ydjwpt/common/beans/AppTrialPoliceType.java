package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * AppTrialPoliceType entity. @author MyEclipse Persistence Tools
 */
public class AppTrialPoliceType extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 5423334258483679622L;
	
	// Fields
	private Long objId;
	/**
	 * 警钟主键
	 */
	private Long policeTypeId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	// Constructors
	/** default constructor */
	public AppTrialPoliceType() {
	}
	/** full constructor */
	public AppTrialPoliceType(Long policeTypeId, Long appVersionId) {
		this.policeTypeId = policeTypeId;
		this.appVersionId = appVersionId;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getPoliceTypeId() {
		return this.policeTypeId;
	}
	public void setPoliceTypeId(Long policeTypeId) {
		this.policeTypeId = policeTypeId;
	}
	public Long getAppVersionId() {
		return this.appVersionId;
	}
	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(), "" + this.getPoliceTypeId()};
	}
}
