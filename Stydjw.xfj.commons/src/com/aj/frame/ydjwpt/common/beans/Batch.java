package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import java.util.List;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Batch entity. @author MyEclipse Persistence Tools
 */
public class Batch extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 8574040432069668953L;
	private Long objId;
	/**
	 * 运营商代码，多个运营商代码之间用半角','分隔
	 */
	private String operatorCods;
	/**
	 * 发机数量
	 */
	private Long count;
	/**
	 * 已授权数
	 */
	private Long authCount;
	/**
	 * 已匹配数
	 */
	private Long matchCount;
	/**
	 * 发机日期
	 */
	private Date fjTime;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 发机设备批次统计
	 */
	private BatchStat BatchStat;
	public BatchStat getBatchStat() {
		return BatchStat;
	}
	public void setBatchStat(BatchStat batchStat) {
		BatchStat = batchStat;
	}
	//扩展对象
	private List<PoliceType> policeTypes;
	private List<DevType> devTypes;
	private List<Dept> depts;
	private List<Area> areas;
	// Constructors
	/** default constructor */
	public Batch() {
	}
	/** minimal constructor */
	public Batch(String operatorCods, Long count, Date fjTime,
			Byte state) {
		this.operatorCods = operatorCods;
		this.count = count;
		this.fjTime = fjTime;
		this.state = state;
	}
	/** full constructor */
	public Batch(String operatorCods, Long count, Long authCount,
			Long matchCount, Date fjTime, String remark, Byte state) {
		this.operatorCods = operatorCods;
		this.count = count;
		this.authCount = authCount;
		this.matchCount = matchCount;
		this.fjTime = fjTime;
		this.remark = remark;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getOperatorCods() {
		return this.operatorCods;
	}
	public void setOperatorCods(String operatorCods) {
		this.operatorCods = operatorCods;
	}
	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	public Long getAuthCount() {
		return this.authCount;
	}
	public void setAuthCount(Long authCount) {
		this.authCount = authCount;
	}
	public Long getMatchCount() {
		return this.matchCount;
	}
	public void setMatchCount(Long matchCount) {
		this.matchCount = matchCount;
	}
	public Date getFjTime() {
		return this.fjTime;
	}
	public void setFjTime(Date fjTime) {
		this.fjTime = fjTime;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public List<PoliceType> getPoliceTypes() {
		return policeTypes;
	}
	public void setPoliceTypes(List<PoliceType> policeTypes) {
		this.policeTypes = policeTypes;
	}
	public List<DevType> getDevTypes() {
		return devTypes;
	}
	public void setDevTypes(List<DevType> devTypes) {
		this.devTypes = devTypes;
	}
	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	@Override
	public String[] importantFieldValues() {
		// TODO Auto-generated method stub
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getCount(), "" + this.getFjTime()};
	}
}
