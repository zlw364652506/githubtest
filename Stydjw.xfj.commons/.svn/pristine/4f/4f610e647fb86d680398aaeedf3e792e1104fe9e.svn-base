package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Dictonary entity. @author MyEclipse Persistence Tools
 */
public class Dictonary extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -8475457742148971956L;
	
	// Fields
	private Long objId;
	/**
	 * 父ID
	 */
	private Long pid;
	/**
	 * 代码
	 */
	private String dicCode;
	/**
	 * 名称
	 */
	private String dicName;
	/**
	 * 类别代码
	 */
	private String sortCode;
	/**
	 * 类别名称
	 */
	private String sortName;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 排序
	 */
	private Long orderIndex;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public Dictonary() {
	}
	/** full constructor */
	public Dictonary(String dicCode, String dicName, String sortCode,
			String sortName, Date createTime, Byte state) {
		this.dicCode = dicCode;
		this.dicName = dicName;
		this.sortCode = sortCode;
		this.sortName = sortName;
		this.createTime = createTime;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getDicCode() {
		return this.dicCode;
	}
	public void setDicCode(String dicCode) {
		this.dicCode = dicCode;
	}
	public String getDicName() {
		return this.dicName;
	}
	public void setDicName(String dicName) {
		this.dicName = dicName;
	}
	public String getSortCode() {
		return this.sortCode;
	}
	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}
	public String getSortName() {
		return this.sortName;
	}
	public void setSortName(String sortName) {
		this.sortName = sortName;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Long orderIndex) {
		this.orderIndex = orderIndex;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getSortCode(), this.getDicCode()};
	}
}
