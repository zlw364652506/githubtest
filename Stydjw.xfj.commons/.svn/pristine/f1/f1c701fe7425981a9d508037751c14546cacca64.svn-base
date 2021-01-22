package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Role entity. @author MyEclipse Persistence Tools
 */
public class Role extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 3710217464390529207L;
	
	// Fields
	private Long objId;
	/**
	 * 角色名称
	 */
	private String roleName;
	/**
	 * 描述
	 */
	private String roleDesc;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public Role() {
	}
	/** minimal constructor */
	public Role(Byte state) {
		this.state = state;
	}
	/** full constructor */
	public Role(String roleName, String roleDesc, Byte state) {
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getRoleName() {
		return this.roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDesc() {
		return this.roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getRoleName()};
	}
}
