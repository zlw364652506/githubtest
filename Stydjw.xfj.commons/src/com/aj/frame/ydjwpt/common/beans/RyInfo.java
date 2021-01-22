package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * RyInfo entity. @author MyEclipse Persistence Tools
 */
public class RyInfo extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 1756785376735897467L;
	private Long objId;
	/**
	 * 违法犯罪人员_主键
	 */
	private Long wffzryId;
	/**
	 * 驾驶人_主键
	 */
	private Long jsrId;
	/**
	 * 在逃人员_主键
	 */
	private Long ztryId;
	/**
	 * 人员编号，对应综查库中DPSIID.YDJW_RK_CZRK表
	 */
	private Long ryid;
	/**
	 * 姓名
	 */
	private String xm;
	/**
	 * 性别
	 */
	private Byte xb;
	/**
	 * 民族
	 */
	private String mz;
	/**
	 * 身份证号码
	 */
	private String sfzh;
	/**
	 * 出生日期
	 */
	private String csrq;
	/**
	 * 文化程度
	 */
	private String whcd;
	/**
	 * 婚姻状况
	 */
	private String hyzk;
	/**
	 * 登记住址详址
	 */
	private String zzxz;
	/**
	 * 服务处所
	 */
	private String fwcs;
	/**
	 * 户号
	 */
	private String hh;
	/**
	 * 籍贯
	 */
	private String jg;
	/**
	 * 所属派出所机构代码
	 */
	private String sspcsjgdm;
	/**
	 * 所属派出所名称
	 */
	private String sspcsmc;
	/**
	 * 所属公安机关机构代码
	 */
	private String ssgajgjgdm;
	/**
	 * 所属公安机关名称
	 */
	private String ssgajgmc;
	/**
	 * 变动日期
	 */
	private String bdrq;
	/**
	 * 变动人员
	 */
	private String bdry;
	/**
	 * 核对日期
	 */
	private String hdrq;
	/**
	 * 别名绰号，以下来源警综三实采集
	 */
	private String bmch;
	/**
	 * 兵役状况
	 */
	private String byzk;
	/**
	 * 出生地，行政区划代码6位
	 */
	private String csd;
	/**
	 * 身高
	 */
	private String sg;
	/**
	 * 职业
	 */
	private String zydm;
	/**
	 * 职业中文描述
	 */
	private String zymc;
	/**
	 * 联系电话
	 */
	private String lxdh;
	/**
	 * 联系电话备注
	 */
	private String lxdhbz;
	/**
	 * 现住址详址
	 */
	private String xzzxz;
	/**
	 * 户籍地详址
	 */
	private String hjdxz;
	/**
	 * 户籍地区划
	 */
	private String hjdqh;
	/**
	 * 现住址区划
	 */
	private String xzzqh;
	/**
	 * 与户主关系
	 */
	private String yhzgx;
	/**
	 * 与户主关系中文名称
	 */
	private String yhzgxmc;
	/**
	 * 户口类别
	 */
	private String hklb;
	/**
	 * 变动原因
	 */
	private String bdyy;
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
	public RyInfo() {
	}
	
	public RyInfo(String sfzh) {
		this.sfzh = sfzh;
	}
	/** full constructor */
	public RyInfo(Long wffzryId, Long jsrId, Long ztryId, Long ryid,
			String xm, Byte xb, String mz, String sfzh, String csrq,
			String whcd, String hyzk, String zzxz, String fwcs, String hh,
			String jg, String sspcsjgdm, String sspcsmc, String ssgajgjgdm,
			String ssgajgmc, String bdrq, String bdry, String hdrq,
			String bmch, String byzk, String csd, String sg, String zydm,
			String zymc, String lxdh, String lxdhbz, String xzzxz,
			String hjdxz, String hjdqh, String xzzqh, String yhzgx,
			String yhzgxmc, String hklb, Date updateTime, Date createTime) {
		this.wffzryId = wffzryId;
		this.jsrId = jsrId;
		this.ztryId = ztryId;
		this.ryid = ryid;
		this.xm = xm;
		this.xb = xb;
		this.mz = mz;
		this.sfzh = sfzh;
		this.csrq = csrq;
		this.whcd = whcd;
		this.hyzk = hyzk;
		this.zzxz = zzxz;
		this.fwcs = fwcs;
		this.hh = hh;
		this.jg = jg;
		this.sspcsjgdm = sspcsjgdm;
		this.sspcsmc = sspcsmc;
		this.ssgajgjgdm = ssgajgjgdm;
		this.ssgajgmc = ssgajgmc;
		this.bdrq = bdrq;
		this.bdry = bdry;
		this.hdrq = hdrq;
		this.bmch = bmch;
		this.byzk = byzk;
		this.csd = csd;
		this.sg = sg;
		this.zydm = zydm;
		this.zymc = zymc;
		this.lxdh = lxdh;
		this.lxdhbz = lxdhbz;
		this.xzzxz = xzzxz;
		this.hjdxz = hjdxz;
		this.hjdqh = hjdqh;
		this.xzzqh = xzzqh;
		this.yhzgx = yhzgx;
		this.yhzgxmc = yhzgxmc;
		this.hklb = hklb;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getWffzryId() {
		return this.wffzryId;
	}
	public void setWffzryId(Long wffzryId) {
		this.wffzryId = wffzryId;
	}
	public Long getJsrId() {
		return this.jsrId;
	}
	public void setJsrId(Long jsrId) {
		this.jsrId = jsrId;
	}
	public Long getZtryId() {
		return this.ztryId;
	}
	public void setZtryId(Long ztryId) {
		this.ztryId = ztryId;
	}
	public Long getRyid() {
		return this.ryid;
	}
	public void setRyid(Long ryid) {
		this.ryid = ryid;
	}
	public String getXm() {
		return this.xm;
	}
	public void setXm(String xm) {
		this.xm = xm;
	}
	public Byte getXb() {
		return this.xb;
	}
	public void setXb(Byte xb) {
		this.xb = xb;
	}
	public String getMz() {
		return this.mz;
	}
	public void setMz(String mz) {
		this.mz = mz;
	}
	public String getSfzh() {
		return this.sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getCsrq() {
		return this.csrq;
	}
	public void setCsrq(String csrq) {
		this.csrq = csrq;
	}
	public String getWhcd() {
		return this.whcd;
	}
	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}
	public String getHyzk() {
		return this.hyzk;
	}
	public void setHyzk(String hyzk) {
		this.hyzk = hyzk;
	}
	public String getZzxz() {
		return this.zzxz;
	}
	public void setZzxz(String zzxz) {
		this.zzxz = zzxz;
	}
	public String getFwcs() {
		return this.fwcs;
	}
	public void setFwcs(String fwcs) {
		this.fwcs = fwcs;
	}
	public String getHh() {
		return this.hh;
	}
	public void setHh(String hh) {
		this.hh = hh;
	}
	public String getJg() {
		return this.jg;
	}
	public void setJg(String jg) {
		this.jg = jg;
	}
	public String getSspcsjgdm() {
		return this.sspcsjgdm;
	}
	public void setSspcsjgdm(String sspcsjgdm) {
		this.sspcsjgdm = sspcsjgdm;
	}
	public String getSspcsmc() {
		return this.sspcsmc;
	}
	public void setSspcsmc(String sspcsmc) {
		this.sspcsmc = sspcsmc;
	}
	public String getSsgajgjgdm() {
		return this.ssgajgjgdm;
	}
	public void setSsgajgjgdm(String ssgajgjgdm) {
		this.ssgajgjgdm = ssgajgjgdm;
	}
	public String getSsgajgmc() {
		return this.ssgajgmc;
	}
	public void setSsgajgmc(String ssgajgmc) {
		this.ssgajgmc = ssgajgmc;
	}
	public String getBdrq() {
		return this.bdrq;
	}
	public void setBdrq(String bdrq) {
		this.bdrq = bdrq;
	}
	public String getBdry() {
		return this.bdry;
	}
	public void setBdry(String bdry) {
		this.bdry = bdry;
	}
	public String getHdrq() {
		return this.hdrq;
	}
	public void setHdrq(String hdrq) {
		this.hdrq = hdrq;
	}
	public String getBmch() {
		return this.bmch;
	}
	public void setBmch(String bmch) {
		this.bmch = bmch;
	}
	public String getByzk() {
		return this.byzk;
	}
	public void setByzk(String byzk) {
		this.byzk = byzk;
	}
	public String getCsd() {
		return this.csd;
	}
	public void setCsd(String csd) {
		this.csd = csd;
	}
	public String getSg() {
		return this.sg;
	}
	public void setSg(String sg) {
		this.sg = sg;
	}
	public String getZydm() {
		return this.zydm;
	}
	public void setZydm(String zydm) {
		this.zydm = zydm;
	}
	public String getZymc() {
		return this.zymc;
	}
	public void setZymc(String zymc) {
		this.zymc = zymc;
	}
	public String getLxdh() {
		return this.lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getLxdhbz() {
		return this.lxdhbz;
	}
	public void setLxdhbz(String lxdhbz) {
		this.lxdhbz = lxdhbz;
	}
	public String getXzzxz() {
		return this.xzzxz;
	}
	public void setXzzxz(String xzzxz) {
		this.xzzxz = xzzxz;
	}
	public String getHjdxz() {
		return this.hjdxz;
	}
	public void setHjdxz(String hjdxz) {
		this.hjdxz = hjdxz;
	}
	public String getHjdqh() {
		return this.hjdqh;
	}
	public void setHjdqh(String hjdqh) {
		this.hjdqh = hjdqh;
	}
	public String getXzzqh() {
		return this.xzzqh;
	}
	public void setXzzqh(String xzzqh) {
		this.xzzqh = xzzqh;
	}
	public String getYhzgx() {
		return this.yhzgx;
	}
	public void setYhzgx(String yhzgx) {
		this.yhzgx = yhzgx;
	}
	public String getYhzgxmc() {
		return this.yhzgxmc;
	}
	public void setYhzgxmc(String yhzgxmc) {
		this.yhzgxmc = yhzgxmc;
	}
	public String getHklb() {
		return this.hklb;
	}
	public void setHklb(String hklb) {
		this.hklb = hklb;
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
	public String getBdyy() {
		return bdyy;
	}

	public void setBdyy(String bdyy) {
		this.bdyy = bdyy;
	}
	/* (non-Javadoc)
	 * @see com.aj.frame.beans.AJFrameBean#importantFieldValues()
	 */
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
	}
}
