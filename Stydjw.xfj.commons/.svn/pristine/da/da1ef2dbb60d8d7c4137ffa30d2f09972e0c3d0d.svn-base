package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * ZpSlt entity. @author MyEclipse Persistence Tools
 */
public class ZpSlt extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -5038637711767980559L;
	private Long objId;
	/**
	 * 照片主键
	 */
	private Long zpId;
	/**
	 * 所属业务类型，1-常驻人口；2-车辆；3-案件；
	 */
	private Byte bussinessType;
	/**
	 * 关联业务主键ID
	 */
	private Long bussinessId;
	private byte[] sltContent;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	// Constructors
	/** default constructor */
	public ZpSlt() {
	}
	/** minimal constructor */
	public ZpSlt(Long zpId) {
		this.zpId = zpId;
	}
	/** full constructor */
	public ZpSlt(Long zpId, Byte bussinessType, Long bussinessId,
			byte[] sltContent, Date createTime) {
		this.zpId = zpId;
		this.bussinessType = bussinessType;
		this.bussinessId = bussinessId;
		this.sltContent = sltContent;
		this.createTime = createTime;
	}
	public ZpSlt(ZpInfo zpinfo) {
		this.zpId = zpinfo.getObjId();
		this.bussinessType = zpinfo.getBussinessType();
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getZpId() {
		return this.zpId;
	}
	public void setZpId(Long zpId) {
		this.zpId = zpId;
	}
	public Byte getBussinessType() {
		return this.bussinessType;
	}
	public void setBussinessType(Byte bussinessType) {
		this.bussinessType = bussinessType;
	}
	public Long getBussinessId() {
		return this.bussinessId;
	}
	public void setBussinessId(Long bussinessId) {
		this.bussinessId = bussinessId;
	}
	public byte[] getSltContent() {
		return this.sltContent;
	}
	public void setSltContent(byte[] sltContent) {
		this.sltContent = sltContent;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/* (non-Javadoc)
	 * @see com.aj.frame.beans.AJFrameBean#importantFieldValues()
	 */
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
	}
}
