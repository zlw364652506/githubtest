package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * AuthDevAllocShareUserRel entity. @author MyEclipse Persistence Tools
 */
public class AuthDevAllocShareUserRel extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -2812843957096542492L;
	private Long objId;
	/**
	 * 终端设备授权主键
	 */
	private Long devAuthId;
	/**
	 * 用户主键
	 */
	private Long userId;
	/**
	 * 授权时间
	 */
	private Date authTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	//扩展对象
	private TerminalDevAuth terminalDevAuth;
	private UserExt userExt;
	// Constructors
	/** default constructor */
	public AuthDevAllocShareUserRel() {
	}
	public AuthDevAllocShareUserRel(TerminalDevAuth defAuth) {
		this.devAuthId = defAuth.getObjId();
	}
	public AuthDevAllocShareUserRel(User shareUser) {
		this.userId = shareUser.getObjId();
	}
	public AuthDevAllocShareUserRel(UserExt shareUser) {
		this.userId = shareUser.getObjId();
	}
	/** full constructor */
	public AuthDevAllocShareUserRel(Long devAuthId, Long userId,
			Date authTime, Byte state) {
		this.devAuthId = devAuthId;
		this.userId = userId;
		this.authTime = authTime;
		this.state = state;
	}
	// Property accessors
	public AuthDevAllocShareUserRel(TerminalDevAuth auth, User user) {
		this.devAuthId = auth.getObjId();
		this.userId = user.getObjId();
	}
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getDevAuthId() {
		return this.devAuthId;
	}
	public void setDevAuthId(Long devAuthId) {
		this.devAuthId = devAuthId;
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getAuthTime() {
		return this.authTime;
	}
	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public TerminalDevAuth getTerminalDevAuth() {
		return terminalDevAuth;
	}
	public void setTerminalDevAuth(TerminalDevAuth terminalDevAuth) {
		this.terminalDevAuth = terminalDevAuth;
	}
	public UserExt getUserExt() {
		return userExt;
	}
	public void setUserExt(UserExt userExt) {
		this.userExt = userExt;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getDevAuthId(), "" + this.getUserId()};
	}
}
