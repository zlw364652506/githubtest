package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;
import java.util.List;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */
public class Dept extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 8163155301053484346L;
	
	public final static int CodeLength = 12;
	// Fields
	private Long objId;
	/**
	 * 地区对象_主键
	 */
	private Long areaId;
	/**
	 * 部门代码
	 */
	private String deptCode;
	/**
	 * 部门名称
	 */
	private String deptName;
	/**
	 * 负责人用户ID，主管领导
	 */
	private Long principalId;
	/**
	 * 联系电话
	 */
	private String tel;
	/**
	 * 上级部门id
	 */
	private Long pid;
	/**
	 * 详细地址
	 */
	private String addr;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 警种主键
	 */
	private Long policeTypeId;
	/**
	 * 部门传真
	 */
	private String deptFax;
	/**
	 * 部门领导
	 */
	private Long leaderId;
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

	// 扩展对象
	private Area area;
	private Dept pDept;
	// 下级部门
	private List<Dept> xjBmxxs;
	// 警种
	private PoliceType policeType;

	// Constructors
	public Dept getpDept() {
		return pDept;
	}

	public void setpDept(Dept pDept) {
		this.pDept = pDept;
	}

	/** default constructor */
	public Dept() {
	}

	/** minimal constructor */
	public Dept(Long areaId, String deptCode, Byte state) {
		this.areaId = areaId;
		this.deptCode = deptCode;
		this.state = state;
	}

	/** full constructor */
	public Dept(Long areaId, String deptCode, String deptName,
			Long principalId, String tel, Long pid, String addr, Byte state) {
		this.areaId = areaId;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.principalId = principalId;
		this.tel = tel;
		this.pid = pid;
		this.addr = addr;
		this.state = state;
	}

	// Property accessors
	public Dept(String deptCode) {
		this.deptCode = deptCode;
	}

	public Dept(String deptName, String deptCode) {
		this.deptName = deptName;
		this.deptCode = deptCode;
	}

	public Long getObjId() {
		return this.objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getAreaId() {
		return this.areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getDeptCode() {
		return this.deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Long getPrincipalId() {
		return this.principalId;
	}

	public void setPrincipalId(Long principalId) {
		this.principalId = principalId;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Byte getState() {
		return this.state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public List<Dept> getXjBmxxs() {
		return xjBmxxs;
	}

	public void setXjBmxxs(List<Dept> xjBmxxs) {
		this.xjBmxxs = xjBmxxs;
	}

	public Long getPoliceTypeId() {
		return policeTypeId;
	}

	public void setPoliceTypeId(Long policeTypeId) {
		this.policeTypeId = policeTypeId;
	}

	public String getDeptFax() {
		return deptFax;
	}

	public void setDeptFax(String deptFax) {
		this.deptFax = deptFax;
	}

	public Long getLeaderId() {
		return leaderId;
	}

	public void setLeaderId(Long leaderId) {
		this.leaderId = leaderId;
	}
	
	public PoliceType getPoliceType() {
		return policeType;
	}
	
	public void setPoliceType(PoliceType policeType) {
		this.policeType = policeType;
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

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getPid(), this.getDeptName(),
				this.getDeptCode() };
	}
}
