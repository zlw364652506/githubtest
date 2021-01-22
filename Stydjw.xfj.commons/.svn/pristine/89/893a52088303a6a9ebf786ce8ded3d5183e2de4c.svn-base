package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * AppDeveloperApplyFlow entity. @author MyEclipse Persistence Tools
 */
public class AppDeveloperApplyFlow extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 4164601408309204351L;
	
	// Fields
	private Long objId;
	/**
	 * 审核人
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
	 * 被审核用户
	 */
	private Long developerId;
	/**
	 * 被审核用户状态
	 */
	private Byte developerStatus;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 用户扩展对象
	 */
	private UserExt userext;
	/**
	 * 登陆账号
	 */
	private String userName;
	/**
	 * 密码
	 */
	private String loginPwd;
	/**
	 * 姓名
	 */
	private String realName;
	/**
	 * 电话
	 */
	private String tel;
	/**
	 * 公司
	 */
	private String companyName;
	/**
	 * 主管单位
	 */
	private Long chargeDeptId;
	/**
	 * 是否现有账号
	 */
	private Byte hasAccount;
	/**
	 * 申请时间
	 */
	private Date addTime;
	private Dept dept;
	// Constructors
	/** default constructor */
	public AppDeveloperApplyFlow() {
	}
	public AppDeveloperApplyFlow(User developer) {
		this.developerId = developer.getObjId();
	}
	public AppDeveloperApplyFlow(UserExt developer) {
		this.developerId = developer.getObjId();
	}
	/** minimal constructor */
	public AppDeveloperApplyFlow(Long userId, Date applyTime,
			Long developerId, Byte developerStatus, Byte state) {
		this.userId = userId;
		this.applyTime = applyTime;
		this.developerId = developerId;
		this.developerStatus = developerStatus;
		this.state = state;
	}
	/** full constructor */
	public AppDeveloperApplyFlow(Long objId, Long userId, Date applyTime,
			String illustrate, Long developerId, Byte developerStatus, Byte state,
			String userName, String loginPwd, String realName, String tel,
			String companyName, Long chargeDeptId, Byte hasAccount, Date addTime) {
		this.objId = objId;
		this.userId = userId;
		this.applyTime = applyTime;
		this.illustrate = illustrate;
		this.developerId = developerId;
		this.developerStatus = developerStatus;
		this.state = state;
		this.userName = userName;
		this.loginPwd = loginPwd;
		this.realName = realName;
		this.tel = tel;
		this.companyName = companyName;
		this.chargeDeptId = chargeDeptId;
		this.hasAccount = hasAccount;
		this.addTime = addTime;
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
	public Long getDeveloperId() {
		return this.developerId;
	}
	public void setDeveloperId(Long developerId) {
		this.developerId = developerId;
	}
	public Byte getDeveloperStatus() {
		return this.developerStatus;
	}
	public void setDeveloperStatus(Byte developerStatus) {
		this.developerStatus = developerStatus;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}	
	
	public UserExt getUserext() {
		return userext;
	}
	public void setUserext(UserExt userext) {
		this.userext = userext;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Long getChargeDeptId() {
		return chargeDeptId;
	}
	public void setChargeDeptId(Long chargeDeptId) {
		this.chargeDeptId = chargeDeptId;
	}
	public Byte getHasAccount() {
		return hasAccount;
	}
	public void setHasAccount(Byte hasAccount) {
		this.hasAccount = hasAccount;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getDeveloperId(), "" + this.getUserId()};
	}
}
