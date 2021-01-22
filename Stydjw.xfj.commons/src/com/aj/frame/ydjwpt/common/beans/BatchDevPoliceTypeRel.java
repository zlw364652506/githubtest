package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * BatchDevPoliceTypeRel entity. @author MyEclipse Persistence Tools
 */
public class BatchDevPoliceTypeRel extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 7988766913425777635L;
	
	// Fields
	private Long objId;
	/**
	 * 发机批次ID
	 */
	private Long batchId;
	/**
	 * 警种ID
	 */
	private Long policeTypeId;
	// Constructors
	/** default constructor */
	public BatchDevPoliceTypeRel() {
	}
	/** full constructor */
	public BatchDevPoliceTypeRel(Long batchId, Long policeTypeId) {
		this.batchId = batchId;
		this.policeTypeId = policeTypeId;
	}
	// Property accessors
	public BatchDevPoliceTypeRel(Batch batch, PoliceType policeType) {
		this.batchId = batch.getObjId();
		this.policeTypeId = policeType.getObjId();
	}
	public BatchDevPoliceTypeRel(Batch batch) {
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
	public Long getPoliceTypeId() {
		return this.policeTypeId;
	}
	public void setPoliceTypeId(Long policeTypeId) {
		this.policeTypeId = policeTypeId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getBatchId(), "" + this.getPoliceTypeId()};
	}
}
