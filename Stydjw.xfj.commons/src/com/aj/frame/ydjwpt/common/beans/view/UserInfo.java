package com.aj.frame.ydjwpt.common.beans.view;

import java.util.Date;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */
public class UserInfo extends com.aj.frame.beans.AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 4807812766749926422L;

	// Fields
	private Long objId;
	private Byte state;
	private Date createTime;
	/**
	 * 用户名，是首选登入标识性属性，在具有相同应用编号的有效记录范围内应保持唯一性
	 */
	private String userName;
	/**
	 * 用户真实姓名
	 */
	private String realName;
	/**
	 * 用户注册电话号码
	 */
	private String tel;
	/**
	 * 用户证件编号
	 */
	private String cardSn;
	/**
	 * 地区名称
	 */
	private String areaName;
	/**
	 * 部门名称
	 */
	private String deptName;
	/**
	 * 职级名称
	 */
	private String rankName;
	/**
	 * 警种名称
	 */
	private String policeTypeName;
	/**
	 * 类别名称
	 */
	private String userSortName;
	/**
	 * 角色名称，多个用逗号隔开
	 */
	private String userRoleNames;
	/**
	 * 设备使用情况，0-无自有设备也无共享设备；1-有设备无共享设备；2-有共享设备无自有设备；3-有自有设备也有共享设备；
	 */
	private Byte deviceUseState;
	/**
	 * 部门ID
	 */
	private Long deptId;
	/**
	 * 邮箱地址
	 */
	private String email;
	/**
	 * 用户性别：1 - 男；2 - 女；
	 */
	private Byte sex;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 逻辑删除时间
	 */
	private Date deleteTime;

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getCardSn() {
		return cardSn;
	}

	public void setCardSn(String cardSn) {
		this.cardSn = cardSn;
	}

	public String getRankName() {
		return rankName;
	}

	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public String getPoliceTypeName() {
		return policeTypeName;
	}

	public void setPoliceTypeName(String policeTypeName) {
		this.policeTypeName = policeTypeName;
	}

	public String getUserSortName() {
		return userSortName;
	}

	public void setUserSortName(String userSortName) {
		this.userSortName = userSortName;
	}

	public String getUserRoleNames() {
		return userRoleNames;
	}

	public void setUserRoleNames(String userRoleNames) {
		this.userRoleNames = userRoleNames;
	}

	public Byte getDeviceUseState() {
		return deviceUseState;
	}

	public void setDeviceUseState(Byte deviceUseState) {
		this.deviceUseState = deviceUseState;
	}

	public Long getDeptId() {
		return deptId;
	}

	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Byte getSex() {
		return sex;
	}

	public void setSex(Byte sex) {
		this.sex = sex;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getDeleteTime() {
		return deleteTime;
	}

	public void setDeleteTime(Date deleteTime) {
		this.deleteTime = deleteTime;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getUserName(),
				"" + this.getRealName() };
	}
}
