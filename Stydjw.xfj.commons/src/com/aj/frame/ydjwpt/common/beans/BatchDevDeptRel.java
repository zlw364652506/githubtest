package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * BatchDevDeptRel entity. @author MyEclipse Persistence Tools
 */
public class BatchDevDeptRel extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -2623959375827777019L;
	
	// Fields
	private Long objId;
	/**
	 * 发机批次ID
	 */
	private Long batchId;
	/**
	 * 部门ID
	 */
	private Long deptId;
	// Constructors
	/** default constructor */
	public BatchDevDeptRel() {
	}
	/** full constructor */
	public BatchDevDeptRel(Long batchId, Long deptId) {
		this.batchId = batchId;
		this.deptId = deptId;
	}
	// Property accessors
	public BatchDevDeptRel(Batch batch, Dept dept) {
		this.batchId = batch.getObjId();
		this.deptId = dept.getObjId();
	}
	public BatchDevDeptRel(Batch batch) {
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
	public Long getDeptId() {
		return this.deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getBatchId(), "" + this.getDeptId()};
	}
}
