package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * RyJdcRel entity. @author MyEclipse Persistence Tools
 */
public class RyJdcRel extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 3246492355245090779L;
	private Long objId;
	/**
	 * 人员主键
	 */
	private Long ryId;
	/**
	 * 车辆主键
	 */
	private Long jdcId;
	// Constructors
	/** default constructor */
	public RyJdcRel() {
	}
	/** full constructor */
	public RyJdcRel(Long ryId, Long jdcId) {
		this.ryId = ryId;
		this.jdcId = jdcId;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getRyId() {
		return this.ryId;
	}
	public void setRyId(Long ryId) {
		this.ryId = ryId;
	}
	public Long getJdcId() {
		return this.jdcId;
	}
	public void setJdcId(Long jdcId) {
		this.jdcId = jdcId;
	}
	/* (non-Javadoc)
	 * @see com.aj.frame.beans.AJFrameBean#importantFieldValues()
	 */
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
	}
}
