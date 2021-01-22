package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * QuickFunction entity. @author MyEclipse Persistence Tools
 */
public class QuickFunction extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -1601883410057216867L;
	
	// Fields
	private Long objId;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 模块ID
	 */
	private Long moduleId;
	/**
	 * 序号
	 */
	private String xh;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public QuickFunction() {
	}
	/** minimal constructor */
	public QuickFunction(Long userId, Long moduleId, Byte state) {
		this.userId = userId;
		this.moduleId = moduleId;
		this.state = state;
	}
	/** full constructor */
	public QuickFunction(Long userId, Long moduleId, String xh, Byte state) {
		this.userId = userId;
		this.moduleId = moduleId;
		this.xh = xh;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getModuleId() {
		return this.moduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}
	public String getXh() {
		return this.xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getModuleId(), "" + this.getUserId()};
	}
}
