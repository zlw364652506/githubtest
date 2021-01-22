package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * ZpInfo entity. @author MyEclipse Persistence Tools
 */
public class ZpInfo extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 8938749677982161247L;
	private Long objId;
	/**
	 * 所属业务类型，1-常驻人口；2-车辆；3-案件；
	 */
	private Byte bussinessType;
	/**
	 * 关联业务主键ID
	 */
	private Long bussinessId;
	/**
	 * 关联业务对象的关键属性值
	 */
	private String keyValue;
	private byte[] pictrueContent;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	// Constructors
	/** default constructor */
	public ZpInfo() {
	}
	/** full constructor */
	public ZpInfo(Byte bussinessType, Long bussinessId, byte[] pictrueContent,
			Date createTime) {
		this.bussinessType = bussinessType;
		this.bussinessId = bussinessId;
		this.pictrueContent = pictrueContent;
		this.createTime = createTime;
	}
	public ZpInfo(String keyValue) {
		this.keyValue = keyValue;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
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
	public byte[] getPictrueContent() {
		return this.pictrueContent;
	}
	public void setPictrueContent(byte[] pictrueContent) {
		this.pictrueContent = pictrueContent;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getKeyValue() {
		return keyValue;
	}
	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}
	/* (non-Javadoc)
	 * @see com.aj.frame.beans.AJFrameBean#importantFieldValues()
	 */
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
	}
}
