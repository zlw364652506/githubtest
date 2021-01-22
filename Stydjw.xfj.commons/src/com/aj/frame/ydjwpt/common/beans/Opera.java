package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Opera entity. @author MyEclipse Persistence Tools
 */
public class Opera extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 8679312231164753479L;
	
	// Fields
	private Long objId;
	/**
	 * 主键
	 */
	private Long roleId;
	/**
	 * 主键
	 */
	private Long funId;
	/**
	 * 操作行为，0-无效；1-有效；掩码方式
	 */
	private Integer opera;
	// Constructors
	/** default constructor */
	public Opera() {
	}
	public Opera(Role role, Function func, Integer opera) {
		this.roleId = role.getObjId();
		this.funId = func.getObjId();
		this.opera = opera;
	}
	/** full constructor */
	public Opera(Long roleId, Long funId, Integer opera) {
		this.roleId = roleId;
		this.funId = funId;
		this.opera = opera;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public Long getFunId() {
		return this.funId;
	}
	public void setFunId(Long funId) {
		this.funId = funId;
	}
	public Integer getOpera() {
		return this.opera;
	}
	public void setOpera(Integer opera) {
		this.opera = opera;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getRoleId(), "" + this.getFunId()};
	}
}
