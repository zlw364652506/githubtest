package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Area entity. @author MyEclipse Persistence Tools
 */
public class Area extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -6246121083110439483L;
	
	// Fields
	private Long objId;
	/**
	 * 地区名称
	 */
	private String name;
	/**
	 * 地区行政区划代码
	 */
	private String areaCode;
	/**
	 * 上级地区主键
	 */
	private Long pid;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public Area() {
	}
	/** minimal constructor */
	public Area(Byte state) {
		this.state = state;
	}
	/** full constructor */
	public Area(String name, Long pid, Byte state) {
		this.name = name;
		this.pid = pid;
		this.state = state;
	}
	// Property accessors
	public Area(String name) {
		this.name = name;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
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
	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getPid(), this.getName()};
	}
}
