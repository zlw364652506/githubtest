package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Company entity. @author MyEclipse Persistence Tools
 */
public class UserSort extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -9151586365078294556L;
	
	// Fields
	private Long objId;
	
	/**
	 * 类别名称
	 */
	private String name;
	/**
	 * 类别代码
	 */
	private String code;
	
	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	
	
	// Constructors
	/** default constructor */
	public UserSort() {
	}
	public Long getObjId() {
		return objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Byte getState() {
		return state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getName()};
	}
}
