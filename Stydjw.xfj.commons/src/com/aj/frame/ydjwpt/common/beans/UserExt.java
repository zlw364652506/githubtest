package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import java.util.List;
import com.aj.frame.um.usm.beans.User;
/**
 * UserExt entity. @author MyEclipse Persistence Tools
 */
public class UserExt extends com.aj.frame.beans.AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 5620172777666766007L;
	private Long objId;
	/**
	 * 警种主键
	 */
	private Long policeTypeId;
	/**
	 * 职级主键
	 */
	private Long rankId;
	/**
	 * 地区主键
	 */
	private Long areaId;
	/**
	 * 部门主键
	 */
	private Long deptId;
	/**
	 * 公司主键
	 */
	private Long companyId;
	/**
	 * 主管部门主键
	 */
	private Long chargeDeptId;
	/**
	 * 用户类别主键
	 */
	private Long userSortId;
	/**
	 * 岗位主鍵（实际是字典表主键， select * from t_dictionary where sort_code='GW'）
	 */
	private Long gwId;
	/**
	 * 责任民警主键
	 */
	private Long responsiblePoliceId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 逻辑删除时间
	 */
	private Date deleteTime;
	
	/**
	 * 登录次数
	 */
	private Long loginSum;
	
	// 以下是扩展属性
	private List<Role> roles;
	private PoliceType policeType;
	private Rank rank;
	private Area area;
	private Dept dept;
	private Company company;
	private User user;
	private List<Function> canDoFunctions;
	private Dept chargeDept;
	private UserSort userSort;
	/**
	 * 设备使用情况
	 */
	private Byte deviceUseState;
	/**
	 * 设备使用情况
	 */
	public Byte getDeviceUseState() {
		return deviceUseState;
	}
	/**
	 * 设备使用情况
	 */
	public void setDeviceUseState(Byte deviceUseState) {
		this.deviceUseState = deviceUseState;
	}
	// Constructors
	public List<Function> getCanDoFunctions() {
		return canDoFunctions;
	}
	public void setCanDoFunctions(List<Function> canDoFunctions) {
		this.canDoFunctions = canDoFunctions;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public PoliceType getPoliceType() {
		return policeType;
	}
	public void setPoliceType(PoliceType policeType) {
		this.policeType = policeType;
	}
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	/** default constructor */
	public UserExt() {
	}
	public UserExt(Long objId) {
		this.objId = objId;
	}
	public UserExt(User user) {
		this.user = user;
		this.objId = user.getObjId();
	}
	/** minimal constructor */
	public UserExt(Long policeTypeId, Long rankId, Long areaId,
			Long deptId) {
		this.policeTypeId = policeTypeId;
		this.rankId = rankId;
		this.areaId = areaId;
		this.deptId = deptId;
	}
	/** full constructor */
	public UserExt(Long policeTypeId, Long rankId, Long areaId,
			Long deptId, Long companyId) {
		this.policeTypeId = policeTypeId;
		this.rankId = rankId;
		this.areaId = areaId;
		this.deptId = deptId;
		this.companyId = companyId;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getPoliceTypeId() {
		return this.policeTypeId;
	}
	public void setPoliceTypeId(Long policeTypeId) {
		this.policeTypeId = policeTypeId;
	}
	public Long getRankId() {
		return this.rankId;
	}
	public void setRankId(Long rankId) {
		this.rankId = rankId;
	}
	public Long getAreaId() {
		return this.areaId;
	}
	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}
	public Long getDeptId() {
		return this.deptId;
	}
	public void setDeptId(Long deptId) {
		this.deptId = deptId;
	}
	public Long getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public Long getChargeDeptId() {
		return chargeDeptId;
	}
	public void setChargeDeptId(Long chargeDeptId) {
		this.chargeDeptId = chargeDeptId;
	}
	public Dept getChargeDept() {
		return chargeDept;
	}
	public void setChargeDept(Dept chargeDept) {
		this.chargeDept = chargeDept;
	}
	public Long getUserSortId() {
		return userSortId;
	}
	public void setUserSortId(Long userSortId) {
		this.userSortId = userSortId;
	}
	public UserSort getUserSort() {
		return userSort;
	}
	public void setUserSort(UserSort userSort) {
		this.userSort = userSort;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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
	public Long getLoginSum() {
		return loginSum;
	}
	public void setLoginSum(Long loginSum) {
		this.loginSum = loginSum;
	}
	public Long getGwId() {
		return gwId;
	}
	public void setGwId(Long gwId) {
		this.gwId = gwId;
	}
	public Long getResponsiblePoliceId() {
		return responsiblePoliceId;
	}
	public void setResponsiblePoliceId(Long responsiblePoliceId) {
		this.responsiblePoliceId = responsiblePoliceId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
	}
}
