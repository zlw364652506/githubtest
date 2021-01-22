package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * BatchDevAreaRel entity. @author MyEclipse Persistence Tools
 */
public class BatchDevAreaRel extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -660770188416848298L;
	
	// Fields
	private Long objId;
	/**
	 * 发机批次ID
	 */
	private Long batchId;
	/**
	 * 地区ID
	 */
	private Long areaId;
	// Constructors
	/** default constructor */
	public BatchDevAreaRel() {
	}
	/** full constructor */
	public BatchDevAreaRel(Long batchId, Long areaId) {
		this.batchId = batchId;
		this.areaId = areaId;
	}
	// Property accessors
	public BatchDevAreaRel(Batch batch, Area area) {
		this.batchId = batch.getObjId();
		this.areaId = area.getObjId();
	}
	public BatchDevAreaRel(Batch batch) {
		this.batchId = batch.getObjId();
	}
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getBatchId() {
		return this.batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public Long getAreaId() {
		return this.areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getBatchId(), "" + this.getAreaId()};
	}
}
