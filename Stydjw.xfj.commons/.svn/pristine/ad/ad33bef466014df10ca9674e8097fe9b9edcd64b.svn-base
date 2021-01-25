package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * BatchDevTypeRel entity. @author MyEclipse Persistence Tools
 */
public class BatchDevTypeRel extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -2177097215178584840L;
	
	// Fields
	private Long objId;
	/**
	 * 发机批次ID
	 */
	private Long batchId;
	/**
	 * 机型ID
	 */
	private Long modeId;
	// Constructors
	/** default constructor */
	public BatchDevTypeRel() {
	}
	/** full constructor */
	public BatchDevTypeRel(Long batchId, Long modeId) {
		this.batchId = batchId;
		this.modeId = modeId;
	}
	// Property accessors
	public BatchDevTypeRel(Batch batch, DevType type) {
		this.batchId = batch.getObjId();
		this.modeId = type.getObjId();
	}
	public BatchDevTypeRel(Batch batch) {
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
	public Long getModeId() {
		return this.modeId;
	}
	public void setModeId(Long modeId) {
		this.modeId = modeId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getBatchId(), "" + this.getModeId()};
	}
}
