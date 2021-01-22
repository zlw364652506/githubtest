package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * AppTrialUser entity. @author MyEclipse Persistence Tools
 */
public class AppTrialUser extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 8278548811776944587L;
	
	// Fields
	private Long objId;
	/**
	 * 试用用户ID
	 */
	private Long userId;
	/**
	 * APP版本ID
	 */
	private Long appVresionId;
	// Constructors
	/** default constructor */
	public AppTrialUser() {
	}
	public AppTrialUser(User user) {
		this.userId = user.getObjId();
	}
	public AppTrialUser(UserExt user) {
		this.userId = user.getObjId();
	}
	/** full constructor */
	public AppTrialUser(Long userId, Long appVresionId) {
		this.userId = userId;
		this.appVresionId = appVresionId;
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
	public Long getAppVresionId() {
		return this.appVresionId;
	}
	public void setAppVresionId(Long appVresionId) {
		this.appVresionId = appVresionId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVresionId(), "" + this.getUserId()};
	}
}
