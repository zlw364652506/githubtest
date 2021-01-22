package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * WffzRyInfo entity. @author MyEclipse Persistence Tools
 */
public class WffzRyInfo extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 962489964966156786L;
	private Long objId;
	/**
	 * 案件编号
	 */
	private String ajbh;
	/**
	 * 人员编号，对应综查库中DPSIID.YDJW_RK_WFFZRY表
	 */
	private String rybh;
	/**
	 * 身份证，对应综查库中在违法犯罪人员XYR_ZJHM
	 */
	private String sfzh;
	/**
	 * 违法事实，对应综查库中在违法犯罪人员XYR_WFSS
	 */
	private String wfss;
	/**
	 * 姓名，对应综查库中在违法犯罪人员XYR_XM
	 */
	private String xm;
	/**
	 * 现住地址，对应综查库中在违法犯罪人员XZZ
	 */
	private String xzdz;
	/**
	 * 性别，对应综查库中在违法犯罪人员XYR_XB
	 */
	private String xb;
	/**
	 * 民族，对应综查库中在违法犯罪人员XYR_MZ
	 */
	private String mz;
	/**
	 * 户籍详址，对应综查库中在违法犯罪人员XYR_HJXZ
	 */
	private String hjxz;
	/**
	 * 案件类别，对应综查库中在违法犯罪人员XYR_AJLB
	 */
	private String ajlb;
	/**
	 * 更新时间
	 */
	private Date updateTime;
	/**
	 * 创建时间
	 */
	private Date createTime;
	//扩展属性
	private Boolean hasSlt;
	private Boolean hasZp;
	// Constructors
	/** default constructor */
	public WffzRyInfo() {
	}
	/** full constructor */
	public WffzRyInfo(String ajbh, String rybh, String sfzh, String wfss,
			String xm, String xzdz, String xb, String mz, String hjxz,
			String ajlb, Date updateTime, Date createTime) {
		this.ajbh = ajbh;
		this.rybh = rybh;
		this.sfzh = sfzh;
		this.wfss = wfss;
		this.xm = xm;
		this.xzdz = xzdz;
		this.xb = xb;
		this.mz = mz;
		this.hjxz = hjxz;
		this.ajlb = ajlb;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	public WffzRyInfo(String sfzh) {
		this.sfzh = sfzh;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getAjbh() {
		return this.ajbh;
	}
	public void setAjbh(String ajbh) {
		this.ajbh = ajbh;
	}
	public String getRybh() {
		return this.rybh;
	}
	public void setRybh(String rybh) {
		this.rybh = rybh;
	}
	public String getSfzh() {
		return this.sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getWfss() {
		return this.wfss;
	}
	public void setWfss(String wfss) {
		this.wfss = wfss;
	}
	public String getXm() {
		return this.xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getXzdz() {
		return this.xzdz;
	}
	public void setXzdz(String xzdz) {
		this.xzdz = xzdz;
	}
	public String getXb() {
		return this.xb;
	}
	public void setXb(String xb) {
		this.xb = xb;
	}
	public String getMz() {
		return this.mz;
	}
	public void setMz(String mz) {
		this.mz = mz;
	}
	public String getHjxz() {
		return this.hjxz;
	}
	public void setHjxz(String hjxz) {
		this.hjxz = hjxz;
	}
	public String getAjlb() {
		return this.ajlb;
	}
	public void setAjlb(String ajlb) {
		this.ajlb = ajlb;
	}
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Boolean getHasSlt() {
		return hasSlt;
	}
	public void setHasSlt(Boolean hasSlt) {
		this.hasSlt = hasSlt;
	}
	public Boolean getHasZp() {
		return hasZp;
	}
	public void setHasZp(Boolean hasZp) {
		this.hasZp = hasZp;
	}
	/* (non-Javadoc)
	 * @see com.aj.frame.beans.AJFrameBean#importantFieldValues()
	 */
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
	}
}
