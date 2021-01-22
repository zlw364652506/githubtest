package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * ZtryInfo entity. @author MyEclipse Persistence Tools
 */
public class ZtryInfo extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 1114940899518960525L;
	private Long objId;
	/**
	 * 案件编号
	 */
	private String ajbh;
	/**
	 * 人员ID，对应综查库中DPSIID.YDJW_RK_ZTRY表
	 */
	private String ryid;
	/**
	 * 人员编号
	 */
	private String rybh;
	/**
	 * 身份证号码
	 */
	private String sfzh;
	/**
	 * 姓名
	 */
	private String xm;
	/**
	 * 性别，对应综查库中在逃人员XB_DM字段
	 */
	private String xb;
	/**
	 * 案件类别，对应综查库中在逃人员AJLB_DM
	 */
	private String ajlb;
	/**
	 * 身高
	 */
	private String sg;
	/**
	 * 口音，对应综查库中在逃人员KY_DM
	 */
	private String ky;
	/**
	 * 户籍区划，对应综查库中在逃人员HJD_QH
	 */
	private String hjqh;
	/**
	 * 户籍详址，对应综查库中在逃人员HJD_XZ
	 */
	private String hjxz;
	/**
	 * 现住区划，对应综查库中在逃人员XZD_QH
	 */
	private String xzqh;
	/**
	 * 现住详址，对应综查库中在逃人员XZD_XZ
	 */
	private String xzxz;
	/**
	 * 简要案情
	 */
	private String jyaq;
	/**
	 * 在逃类型，对应综查库中在逃人员ZTLX_DM
	 */
	private String ztlx;
	/**
	 * 逃跑日期
	 */
	private Date tprq;
	/**
	 * 立案单位区划，对应综查库中在逃人员LA_DWQH
	 */
	private String ladwqh;
	/**
	 * 立案单位详称，对应综查库中在逃人员LA_DWXC
	 */
	private String ladwxc;
	/**
	 * 联系方式，对应综查库中在逃人员ZB_LXFS值班联系方式
	 */
	private String lxfs;
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
	public ZtryInfo() {
	}
	/** full constructor */
	public ZtryInfo(String ajbh, String ryid, String sfzh, String xm, String xb,
			String ajlb, String sg, String ky, String hjqh, String hjxz,
			String xzqh, String xzxz, String jyaq, String ztlx, Date tprq,
			String ladwqh, String ladwxc, String lxfs, Date updateTime,
			Date createTime) {
		this.ajbh = ajbh;
		this.ryid = ryid;
		this.sfzh = sfzh;
		this.xm = xm;
		this.xb = xb;
		this.ajlb = ajlb;
		this.sg = sg;
		this.ky = ky;
		this.hjqh = hjqh;
		this.hjxz = hjxz;
		this.xzqh = xzqh;
		this.xzxz = xzxz;
		this.jyaq = jyaq;
		this.ztlx = ztlx;
		this.tprq = tprq;
		this.ladwqh = ladwqh;
		this.ladwxc = ladwxc;
		this.lxfs = lxfs;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	public ZtryInfo(String sfzh) {
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
	public String getRyid() {
		return this.ryid;
	}
	public void setRyid(String ryid) {
		this.ryid = ryid;
	}
	public String getRybh() {
		return rybh;
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
	public String getXm() {
		return this.xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public String getXb() {
		return this.xb;
	}
	public void setXb(String xb) {
		this.xb = xb;
	}
	public String getAjlb() {
		return this.ajlb;
	}
	public void setAjlb(String ajlb) {
		this.ajlb = ajlb;
	}
	public String getSg() {
		return this.sg;
	}
	public void setSg(String sg) {
		this.sg = sg;
	}
	public String getKy() {
		return this.ky;
	}
	public void setKy(String ky) {
		this.ky = ky;
	}
	public String getHjqh() {
		return this.hjqh;
	}
	public void setHjqh(String hjqh) {
		this.hjqh = hjqh;
	}
	public String getHjxz() {
		return this.hjxz;
	}
	public void setHjxz(String hjxz) {
		this.hjxz = hjxz;
	}
	public String getXzqh() {
		return this.xzqh;
	}
	public void setXzqh(String xzqh) {
		this.xzqh = xzqh;
	}
	public String getXzxz() {
		return this.xzxz;
	}
	public void setXzxz(String xzxz) {
		this.xzxz = xzxz;
	}
	public String getJyaq() {
		return this.jyaq;
	}
	public void setJyaq(String jyaq) {
		this.jyaq = jyaq;
	}
	public String getZtlx() {
		return this.ztlx;
	}
	public void setZtlx(String ztlx) {
		this.ztlx = ztlx;
	}
	public Date getTprq() {
		return this.tprq;
	}
	public void setTprq(Date tprq) {
		this.tprq = tprq;
	}
	public String getLadwqh() {
		return this.ladwqh;
	}
	public void setLadwqh(String ladwqh) {
		this.ladwqh = ladwqh;
	}
	public String getLadwxc() {
		return this.ladwxc;
	}
	public void setLadwxc(String ladwxc) {
		this.ladwxc = ladwxc;
	}
	public String getLxfs() {
		return this.lxfs;
	}
	public void setLxfs(String lxfs) {
		this.lxfs = lxfs;
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
