package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * AppApplyFlow entity. @author MyEclipse Persistence Tools
 */
public class AppApplyFlow extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -1556985400188899907L;
	
	// Fields
	private Long objId;
	/**
	 * app版本ID
	 */
	private Long appVersionId;
	/**
	 * 审核人用户ID
	 */
	private Long userId;
	/**
	 * 审核时间
	 */
	private Date applyTime;
	/**
	 * 备注
	 */
	private String illustrate;
	/**
	 * app版本审核前的状态
	 */
	private Byte appVerOldState;
	/**
	 * app版本审核后的状态
	 */
	private Byte appVerNewState;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	//审核人
	private User user;
	// Constructors
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	/** default constructor */
	public AppApplyFlow() {
	}
	/** minimal constructor */
	public AppApplyFlow(Long appVersionId, Long userId, Date applyTime, Byte appVerOldState, Byte appVerNewState, Byte state) {
		this.appVersionId = appVersionId;
		this.userId = userId;
		this.applyTime = applyTime;
		this.appVerOldState = appVerOldState;
		this.appVerNewState = appVerNewState;
		this.state = state;
	}
	/** full constructor */
	public AppApplyFlow(Long appVersionId, Long userId, Date applyTime, String illustrate, Byte appVerOldState,
			Byte appVerNewState, Byte state) {
		this.appVersionId = appVersionId;
		this.userId = userId;
		this.applyTime = applyTime;
		this.illustrate = illustrate;
		this.appVerOldState = appVerOldState;
		this.appVerNewState = appVerNewState;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getAppVersionId() {
		return this.appVersionId;
	}
	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getIllustrate() {
		return this.illustrate;
	}
	public void setIllustrate(String illustrate) {
		this.illustrate = illustrate;
	}
	public Byte getAppVerOldState() {
		return this.appVerOldState;
	}
	public void setAppVerOldState(Byte appVerOldState) {
		this.appVerOldState = appVerOldState;
	}
	public Byte getAppVerNewState() {
		return this.appVerNewState;
	}
	public void setAppVerNewState(Byte appVerNewState) {
		this.appVerNewState = appVerNewState;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(),
				"" + this.getUserId() };
	}
}
