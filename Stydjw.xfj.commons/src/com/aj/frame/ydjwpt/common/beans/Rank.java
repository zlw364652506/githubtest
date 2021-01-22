package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Rank entity. @author MyEclipse Persistence Tools
 */
public class Rank extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 4012113018110195130L;
	
	// Fields
	private Long objId;
	/**
	 * 职级名称
	 */
	private String name;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 序号
	 */
	private Byte orderIndex;
	// Constructors
	public Byte getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Byte orderIndex) {
		this.orderIndex = orderIndex;
	}
	/** default constructor */
	public Rank() {
	}
	/** full constructor */
	public Rank(String name, Byte state) {
		this.name = name;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getName()};
	}
}
