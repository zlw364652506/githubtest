package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * RoleUserRel entity. @author MyEclipse Persistence Tools
 */
public class RoleUserRel extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -1761334379921653051L;
	
	// Fields
	private Long objId;
	/**
	 * 角色主键
	 */
	private Long roleId;
	/**
	 * 用户主键
	 */
	private Long userId;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public RoleUserRel() {
	}
	public RoleUserRel(User user) {
		this.userId = user.getObjId();
	}
	public RoleUserRel(UserExt user) {
		this.userId = user.getObjId();
	}
	public RoleUserRel(Role role, UserExt user) {
		this.roleId = role.getObjId();
		this.userId = user.getObjId();
	}
	/** full constructor */
	public RoleUserRel(Long roleId, Long userId, Byte state) {
		this.roleId = roleId;
		this.userId = userId;
		this.state = state;
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
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getRoleId(), "" + this.getUserId()};
	}
}
