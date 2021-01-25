package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * TJsrInfo entity. @author MyEclipse Persistence Tools
 */
public class JsrInfo extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -7167136046012310002L;
	private Long objId;
	/**
	 * 档案编号
	 */
	private String dabh;
	/**
	 * 身份证明名称
	 */
	private String sfzmmc;
	/**
	 * 身份证明号码
	 */
	private String sfzmhm;
	/**
	 * 准驾车型
	 */
	private String zjcx;
	/**
	 * 原准驾车型
	 */
	private String yzjcx;
	/**
	 * 下一清分日期
	 */
	private String qfrq;
	/**
	 * 下一审验日期
	 */
	private String syrq;
	/**
	 * 初次领证日期
	 */
	private String cclzrq;
	/**
	 * 初次发证机关
	 */
	private String ccfzjg;
	/**
	 * 驾证期限
	 */
	private String jzqx;
	/**
	 * 有效期始
	 */
	private String yxqs;
	/**
	 * 有效期止
	 */
	private String yxqz;
	/**
	 * 累积记分
	 */
	private Short ljjf;
	/**
	 * 超分日期
	 */
	private String cfrq;
	/**
	 * 学习通知日期
	 */
	private String xxtzrq;
	/**
	 * 补证次数
	 */
	private Short bzcs;
	/**
	 * 驾驶证状态
	 */
	private String zt;
	/**
	 * 驾驶人来源
	 */
	private String ly;
	/**
	 * 驾校名称
	 */
	private String jxmc;
	/**
	 * 教练员
	 */
	private String jly;
	/**
	 * 行政区划
	 */
	private String xzqh;
	/**
	 * 乡镇区局
	 */
	private String xzqj;
	/**
	 * 发证日期
	 */
	private String fzrq;
	/**
	 * 经办人
	 */
	private String jbr;
	/**
	 * 管理部门
	 */
	private String glbm;
	/**
	 * 发证机关
	 */
	private String fzjg;
	/**
	 * 流水号
	 */
	private String lsh;
	/**
	 * 相关资料
	 */
	private String xgzl;
	/**
	 * 备注
	 */
	private String bz;
	/**
	 * 原档案编号
	 */
	private String ydabh;
	/**
	 * 社区代码
	 */
	private String sqdm;
	/**
	 * 证芯编号
	 */
	private String zxbh;
	/**
	 * 序号
	 */
	private String xh;
	/**
	 * 号码长度，1 15位身份证 2 18位身份证3 其它证件
	 */
	private String hmcd;
	/**
	 * 姓名
	 */
	private String xm;
	/**
	 * 性别1男2女
	 */
	private String xb;
	/**
	 * 出生日期
	 */
	private String csrq;
	/**
	 * 国籍
	 */
	private String gj;
	/**
	 * 登记住所行政区划
	 */
	private String djzsxzqh;
	/**
	 * 登记住所详细地址
	 */
	private String djzsxxdz;
	/**
	 * 联系住所行政区划
	 */
	private String lxzsxzqh;
	/**
	 * 联系住所详细地址
	 */
	private String lxzsxxdz;
	/**
	 * 联系住所邮政编码
	 */
	private String lxzsyzbm;
	/**
	 * 联系电话
	 */
	private String lxdh;
	/**
	 * 手机号码
	 */
	private String sjhm;
	/**
	 * 电子邮箱
	 */
	private String dzyx;
	/**
	 * 暂住证明
	 */
	private String zzzm;
	/**
	 * 暂住发证机关
	 */
	private String zzfzjg;
	/**
	 * 暂住发证日期
	 */
	private String zzfzrq;
	/**
	 * 是否本地
	 */
	private String sfbd;
	/**
	 * 属地信息
	 */
	private String dwbh;
	/**
	 * 审验有效期止
	 */
	private String syyxqz;
	/**
	 * 校车资格准驾车型
	 */
	private String xczjcx;
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
	public JsrInfo() {
	}
	/** minimal constructor */
	public JsrInfo(String sfzmhm, String zjcx, String yxqs, String yxqz,
			String zt) {
		this.sfzmhm = sfzmhm;
		this.zjcx = zjcx;
		this.yxqs = yxqs;
		this.yxqz = yxqz;
		this.zt = zt;
	}
	/** full constructor */
	public JsrInfo(String dabh, String sfzmmc, String sfzmhm, String zjcx,
			String yzjcx, String qfrq, String syrq, String cclzrq,
			String ccfzjg, String jzqx, String yxqs, String yxqz, Short ljjf,
			String cfrq, String xxtzrq, Short bzcs, String zt, String ly,
			String jxmc, String jly, String xzqh, String xzqj, String fzrq,
			String jbr, String glbm, String fzjg, String lsh, String xgzl,
			String bz, String ydabh, String sqdm, String zxbh, String xh,
			String hmcd, String xm, String xb, String csrq, String gj,
			String djzsxzqh, String djzsxxdz, String lxzsxzqh, String lxzsxxdz,
			String lxzsyzbm, String lxdh, String sjhm, String dzyx,
			String zzzm, String zzfzjg, String zzfzrq, String sfbd,
			String dwbh, String syyxqz, String xczjcx, Date updateTime,
			Date createTime) {
		this.dabh = dabh;
		this.sfzmmc = sfzmmc;
		this.sfzmhm = sfzmhm;
		this.zjcx = zjcx;
		this.yzjcx = yzjcx;
		this.qfrq = qfrq;
		this.syrq = syrq;
		this.cclzrq = cclzrq;
		this.ccfzjg = ccfzjg;
		this.jzqx = jzqx;
		this.yxqs = yxqs;
		this.yxqz = yxqz;
		this.ljjf = ljjf;
		this.cfrq = cfrq;
		this.xxtzrq = xxtzrq;
		this.bzcs = bzcs;
		this.zt = zt;
		this.ly = ly;
		this.jxmc = jxmc;
		this.jly = jly;
		this.xzqh = xzqh;
		this.xzqj = xzqj;
		this.fzrq = fzrq;
		this.jbr = jbr;
		this.glbm = glbm;
		this.fzjg = fzjg;
		this.lsh = lsh;
		this.xgzl = xgzl;
		this.bz = bz;
		this.ydabh = ydabh;
		this.sqdm = sqdm;
		this.zxbh = zxbh;
		this.xh = xh;
		this.hmcd = hmcd;
		this.xm = xm;
		this.xb = xb;
		this.csrq = csrq;
		this.gj = gj;
		this.djzsxzqh = djzsxzqh;
		this.djzsxxdz = djzsxxdz;
		this.lxzsxzqh = lxzsxzqh;
		this.lxzsxxdz = lxzsxxdz;
		this.lxzsyzbm = lxzsyzbm;
		this.lxdh = lxdh;
		this.sjhm = sjhm;
		this.dzyx = dzyx;
		this.zzzm = zzzm;
		this.zzfzjg = zzfzjg;
		this.zzfzrq = zzfzrq;
		this.sfbd = sfbd;
		this.dwbh = dwbh;
		this.syyxqz = syyxqz;
		this.xczjcx = xczjcx;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	public JsrInfo(String sfzmhm) {
		this.sfzmhm = sfzmhm;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getDabh() {
		return this.dabh;
	}
	public void setDabh(String dabh) {
		this.dabh = dabh;
	}
	public String getSfzmmc() {
		return this.sfzmmc;
	}
	public void setSfzmmc(String sfzmmc) {
		this.sfzmmc = sfzmmc;
	}
	public String getSfzmhm() {
		return this.sfzmhm;
	}
	public void setSfzmhm(String sfzmhm) {
		this.sfzmhm = sfzmhm;
	}
	public String getZjcx() {
		return this.zjcx;
	}
	public void setZjcx(String zjcx) {
		this.zjcx = zjcx;
	}
	public String getYzjcx() {
		return this.yzjcx;
	}
	public void setYzjcx(String yzjcx) {
		this.yzjcx = yzjcx;
	}
	public String getQfrq() {
		return this.qfrq;
	}
	public void setQfrq(String qfrq) {
		this.qfrq = qfrq;
	}
	public String getSyrq() {
		return this.syrq;
	}
	public void setSyrq(String syrq) {
		this.syrq = syrq;
	}
	public String getCclzrq() {
		return this.cclzrq;
	}
	public void setCclzrq(String cclzrq) {
		this.cclzrq = cclzrq;
	}
	public String getCcfzjg() {
		return this.ccfzjg;
	}
	public void setCcfzjg(String ccfzjg) {
		this.ccfzjg = ccfzjg;
	}
	public String getJzqx() {
		return this.jzqx;
	}
	public void setJzqx(String jzqx) {
		this.jzqx = jzqx;
	}
	public String getYxqs() {
		return this.yxqs;
	}
	public void setYxqs(String yxqs) {
		this.yxqs = yxqs;
	}
	public String getYxqz() {
		return this.yxqz;
	}
	public void setYxqz(String yxqz) {
		this.yxqz = yxqz;
	}
	public Short getLjjf() {
		return this.ljjf;
	}
	public void setLjjf(Short ljjf) {
		this.ljjf = ljjf;
	}
	public String getCfrq() {
		return this.cfrq;
	}
	public void setCfrq(String cfrq) {
		this.cfrq = cfrq;
	}
	public String getXxtzrq() {
		return this.xxtzrq;
	}
	public void setXxtzrq(String xxtzrq) {
		this.xxtzrq = xxtzrq;
	}
	public Short getBzcs() {
		return this.bzcs;
	}
	public void setBzcs(Short bzcs) {
		this.bzcs = bzcs;
	}
	public String getZt() {
		return this.zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public String getLy() {
		return this.ly;
	}
	public void setLy(String ly) {
		this.ly = ly;
	}
	public String getJxmc() {
		return this.jxmc;
	}
	public void setJxmc(String jxmc) {
		this.jxmc = jxmc;
	}
	public String getJly() {
		return this.jly;
	}
	public void setJly(String jly) {
		this.jly = jly;
	}
	public String getXzqh() {
		return this.xzqh;
	}
	public void setXzqh(String xzqh) {
		this.xzqh = xzqh;
	}
	public String getXzqj() {
		return this.xzqj;
	}
	public void setXzqj(String xzqj) {
		this.xzqj = xzqj;
	}
	public String getFzrq() {
		return this.fzrq;
	}
	public void setFzrq(String fzrq) {
		this.fzrq = fzrq;
	}
	public String getJbr() {
		return this.jbr;
	}
	public void setJbr(String jbr) {
		this.jbr = jbr;
	}
	public String getGlbm() {
		return this.glbm;
	}
	public void setGlbm(String glbm) {
		this.glbm = glbm;
	}
	public String getFzjg() {
		return this.fzjg;
	}
	public void setFzjg(String fzjg) {
		this.fzjg = fzjg;
	}
	public String getLsh() {
		return this.lsh;
	}
	public void setLsh(String lsh) {
		this.lsh = lsh;
	}
	public String getXgzl() {
		return this.xgzl;
	}
	public void setXgzl(String xgzl) {
		this.xgzl = xgzl;
	}
	public String getBz() {
		return this.bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public String getYdabh() {
		return this.ydabh;
	}
	public void setYdabh(String ydabh) {
		this.ydabh = ydabh;
	}
	public String getSqdm() {
		return this.sqdm;
	}
	public void setSqdm(String sqdm) {
		this.sqdm = sqdm;
	}
	public String getZxbh() {
		return this.zxbh;
	}
	public void setZxbh(String zxbh) {
		this.zxbh = zxbh;
	}
	public String getXh() {
		return this.xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getHmcd() {
		return this.hmcd;
	}
	public void setHmcd(String hmcd) {
		this.hmcd = hmcd;
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
	public String getCsrq() {
		return this.csrq;
	}
	public void setCsrq(String csrq) {
		this.csrq = csrq;
	}
	public String getGj() {
		return this.gj;
	}
	public void setGj(String gj) {
		this.gj = gj;
	}
	public String getDjzsxzqh() {
		return this.djzsxzqh;
	}
	public void setDjzsxzqh(String djzsxzqh) {
		this.djzsxzqh = djzsxzqh;
	}
	public String getDjzsxxdz() {
		return this.djzsxxdz;
	}
	public void setDjzsxxdz(String djzsxxdz) {
		this.djzsxxdz = djzsxxdz;
	}
	public String getLxzsxzqh() {
		return this.lxzsxzqh;
	}
	public void setLxzsxzqh(String lxzsxzqh) {
		this.lxzsxzqh = lxzsxzqh;
	}
	public String getLxzsxxdz() {
		return this.lxzsxxdz;
	}
	public void setLxzsxxdz(String lxzsxxdz) {
		this.lxzsxxdz = lxzsxxdz;
	}
	public String getLxzsyzbm() {
		return this.lxzsyzbm;
	}
	public void setLxzsyzbm(String lxzsyzbm) {
		this.lxzsyzbm = lxzsyzbm;
	}
	public String getLxdh() {
		return this.lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getSjhm() {
		return this.sjhm;
	}
	public void setSjhm(String sjhm) {
		this.sjhm = sjhm;
	}
	public String getDzyx() {
		return this.dzyx;
	}
	public void setDzyx(String dzyx) {
		this.dzyx = dzyx;
	}
	public String getZzzm() {
		return this.zzzm;
	}
	public void setZzzm(String zzzm) {
		this.zzzm = zzzm;
	}
	public String getZzfzjg() {
		return this.zzfzjg;
	}
	public void setZzfzjg(String zzfzjg) {
		this.zzfzjg = zzfzjg;
	}
	public String getZzfzrq() {
		return this.zzfzrq;
	}
	public void setZzfzrq(String zzfzrq) {
		this.zzfzrq = zzfzrq;
	}
	public String getSfbd() {
		return this.sfbd;
	}
	public void setSfbd(String sfbd) {
		this.sfbd = sfbd;
	}
	public String getDwbh() {
		return this.dwbh;
	}
	public void setDwbh(String dwbh) {
		this.dwbh = dwbh;
	}
	public String getSyyxqz() {
		return this.syyxqz;
	}
	public void setSyyxqz(String syyxqz) {
		this.syyxqz = syyxqz;
	}
	public String getXczjcx() {
		return this.xczjcx;
	}
	public void setXczjcx(String xczjcx) {
		this.xczjcx = xczjcx;
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
