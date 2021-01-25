package com.aj.frame.ydjwpt.common.beans;
import java.math.BigDecimal;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * DqJdcxx entity. @author MyEclipse Persistence Tools
 */
public class DqJdcxx extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -3363521294953987415L;
	private Long objId;
	/**
	 * 号牌种类，对应综查库中DPSIID.YDJW_WP_BDQJDC表
	 */
	private String hpzl;
	/**
	 * 号牌号码
	 */
	private String hphm;
	/**
	 * 车辆类型
	 */
	private String cllx;
	/**
	 * 车辆品牌
	 */
	private String clpp;
	/**
	 * 车辆型号
	 */
	private String clxh;
	/**
	 * 车身颜色
	 */
	private String csys;
	/**
	 * 机动车所有人
	 */
	private String syr;
	/**
	 * 发动机号
	 */
	private String fdjh;
	/**
	 * 车架号
	 */
	private String cjh;
	/**
	 * 车辆识别代号
	 */
	private String clsbdh;
	/**
	 * 立案时间
	 */
	private Date lasj;
	/**
	 * 是否保险
	 */
	private String sfbx;
	/**
	 * 立案单位，对应综查库中在被盗抢车辆LA_DWMC
	 */
	private String ladw;
	/**
	 * 受理时间，对应综查库中在被盗抢车辆LA_SJ
	 */
	private Date slsj;
	/**
	 * 受理单位，对应综查库中在被盗抢车辆SL_DWMC
	 */
	private String sldw;
	/**
	 * 报案人
	 */
	private String bar;
	/**
	 * 立案单位电话，对应综查库中在被盗抢车辆LA_DH
	 */
	private String ladwdh;
	/**
	 * 删除标记
	 */
	private BigDecimal ndel;
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
	public DqJdcxx() {
	}
	/** minimal constructor */
	public DqJdcxx(String hpzl, String hphm) {
		this.hpzl = hpzl;
		this.hphm = hphm;
	}
	/** full constructor */
	public DqJdcxx(String hpzl, String hphm, String sfbx, String ladw,
			Date slsj, String sldw, String bar, String ladwdh,
			Date updateTime, Date createTime) {
		this.hpzl = hpzl;
		this.hphm = hphm;
		this.sfbx = sfbx;
		this.ladw = ladw;
		this.slsj = slsj;
		this.sldw = sldw;
		this.bar = bar;
		this.ladwdh = ladwdh;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	public DqJdcxx(String hphm) {
		this.hphm = hphm;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getHpzl() {
		return this.hpzl;
	}
	public void setHpzl(String hpzl) {
		this.hpzl = hpzl;
	}
	public String getHphm() {
		return this.hphm;
	}
	public void setHphm(String hphm) {
		this.hphm = hphm;
	}
	public String getSfbx() {
		return this.sfbx;
	}
	public void setSfbx(String sfbx) {
		this.sfbx = sfbx;
	}
	public String getLadw() {
		return this.ladw;
	}
	public void setLadw(String ladw) {
		this.ladw = ladw;
	}
	public Date getSlsj() {
		return this.slsj;
	}
	public void setSlsj(Date slsj) {
		this.slsj = slsj;
	}
	public String getSldw() {
		return this.sldw;
	}
	public void setSldw(String sldw) {
		this.sldw = sldw;
	}
	public String getBar() {
		return this.bar;
	}
	public void setBar(String bar) {
		this.bar = bar;
	}
	public String getLadwdh() {
		return this.ladwdh;
	}
	public void setLadwdh(String ladwdh) {
		this.ladwdh = ladwdh;
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
	public String getCllx() {
		return cllx;
	}
	public void setCllx(String cllx) {
		this.cllx = cllx;
	}
	public String getClpp() {
		return clpp;
	}
	public void setClpp(String clpp) {
		this.clpp = clpp;
	}
	public String getClxh() {
		return clxh;
	}
	public void setClxh(String clxh) {
		this.clxh = clxh;
	}
	public String getCsys() {
		return csys;
	}
	public void setCsys(String csys) {
		this.csys = csys;
	}
	public String getSyr() {
		return syr;
	}
	public void setSyr(String syr) {
		this.syr = syr;
	}
	public String getFdjh() {
		return fdjh;
	}
	public void setFdjh(String fdjh) {
		this.fdjh = fdjh;
	}
	public String getCjh() {
		return cjh;
	}
	public void setCjh(String cjh) {
		this.cjh = cjh;
	}
	public String getClsbdh() {
		return clsbdh;
	}
	public void setClsbdh(String clsbdh) {
		this.clsbdh = clsbdh;
	}
	public Date getLasj() {
		return lasj;
	}
	public void setLasj(Date lasj) {
		this.lasj = lasj;
	}
	public BigDecimal getNdel() {
		return ndel;
	}
	public void setNdel(BigDecimal ndel) {
		this.ndel = ndel;
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
