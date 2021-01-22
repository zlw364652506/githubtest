package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * PoliceType entity. @author MyEclipse Persistence Tools
 */
public class PoliceType extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -799679409098399893L;
	
	// Fields
	private Long objId;
	/**
	 * 警种名称
	 */
	private String name;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public PoliceType() {
	}
	/** full constructor */
	public PoliceType(String name, Byte state) {
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
