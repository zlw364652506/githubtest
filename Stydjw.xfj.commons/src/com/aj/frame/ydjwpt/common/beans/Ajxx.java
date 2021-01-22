package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Ajxx entity. @author MyEclipse Persistence Tools
 */
public class Ajxx extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 89810794799085850L;
	private Long objId;
	/**
	 * 案件编号
	 */
	private String ajbh;
	/**
	 * 报警单编号
	 */
	private String bjdbh;
	/**
	 * 行政区划
	 */
	private String xzqh;
	/**
	 * 接警单编号
	 */
	private String jjdbh;
	/**
	 * 关联接警单编号
	 */
	private String gljjdbh;
	/**
	 * 发案地域
	 */
	private String fady;
	/**
	 * 发案时间上限
	 */
	private String fasjsx;
	/**
	 * 发案时间下限
	 */
	private String fasjxx;
	/**
	 * 简要案情
	 */
	private String jyaq;
	/**
	 * 立案单位
	 */
	private String ladw;
	/**
	 * 受理单位
	 */
	private String sldw;
	/**
	 * 案件状态
	 */
	private String ajzt;
	/**
	 * 主办人
	 */
	private String zbr;
	/**
	 * 报警方式代码
	 */
	private Byte bjfsdm;
	/**
	 * 接警类型代码
	 */
	private Byte jjlxdm;
	/**
	 * 接警单处理类型代码
	 */
	private Byte cllxdm;
	/**
	 * 接警单位代码
	 */
	private String jjdwdm;
	/**
	 * 接警员工号
	 */
	private String jjygh;
	/**
	 * 接警员姓名
	 */
	private String jjyxm;
	/**
	 * 接警台编号
	 */
	private String jjtbh;
	/**
	 * 接警台IP地址
	 */
	private String jjtip;
	/**
	 * 呼入时间
	 */
	private String hrsj;
	/**
	 * 报警时间
	 */
	private String bjsj;
	/**
	 * 话终时间
	 */
	private String hzsj;
	/**
	 * 呼入时长
	 */
	private Short hrsc;
	/**
	 * 接警时长
	 */
	private Short jjsc;
	/**
	 * 报警电话
	 */
	private String bjdh;
	/**
	 * 用户姓名
	 */
	private String yhxm;
	/**
	 * 用户地址
	 */
	private String yhdz;
	/**
	 * 接警录音号
	 */
	private String jjlyh;
	/**
	 * 报警人姓名
	 */
	private String bjrxm;
	/**
	 * 报警人性别
	 */
	private Boolean bjrxb;
	/**
	 * 报警人联系电话
	 */
	private String lxdh;
	/**
	 * 报警人联系住址或单位
	 */
	private String zzdw;
	/**
	 * 案发地点
	 */
	private String afdd;
	/**
	 * 水源信息
	 */
	private String syxx;
	/**
	 * 周边信息
	 */
	private String zbxx;
	/**
	 * 报警内容
	 */
	private String bjnr;
	/**
	 * 案发点灯杆编号
	 */
	private String afddgbh;
	/**
	 * 管辖单位代码
	 */
	private String gxdwdm;
	/**
	 * 报警类别代码
	 */
	private String bjlbdm;
	/**
	 * 报警类型代码
	 */
	private String bjlxdm;
	/**
	 * 报警细类代码
	 */
	private String bjxldm;
	/**
	 * 报警车号牌种类
	 */
	private Byte bjchpzl;
	/**
	 * 报警车牌号
	 */
	private String bjcph;
	/**
	 * 被困人数
	 */
	private Short bkrs;
	/**
	 * 受伤人数
	 */
	private Short ssrs;
	/**
	 * 死亡人数
	 */
	private Short swrs;
	/**
	 * 燃烧建筑类型代码
	 */
	private Byte rsjzlxdm;
	/**
	 * 起火部位代码
	 */
	private Byte qhbwdm;
	/**
	 * 燃烧建筑结构代码
	 */
	private Byte rsjzjgdm;
	/**
	 * 起火楼层
	 */
	private Byte qhlc;
	/**
	 * 燃烧物质遍号
	 */
	private Byte rswzbh;
	/**
	 * 有否危险品
	 */
	private Boolean yfwxp;
	/**
	 * 燃烧面积
	 */
	private String rsmj;
	/**
	 * 警情级别
	 */
	private Boolean jqjb;
	/**
	 * 灾害等级
	 */
	private Boolean zhdj;
	/**
	 * 上传标志
	 */
	private Boolean scbz;
	/**
	 * X坐标
	 */
	private String xzb;
	/**
	 * Y坐标
	 */
	private String yzb;
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
	public Ajxx() {
	}
	/** full constructor */
	public Ajxx(String ajbh, String bjdbh, String xzqh, String jjdbh,
			String gljjdbh, String fady, String fasjsx, String fasjxx,
			String jyaq, String ladw, String sldw, String ajzt, String zbr,
			Byte bjfsdm, Byte jjlxdm, Byte cllxdm, String jjdwdm, String jjygh,
			String jjyxm, String jjtbh, String jjtip, String hrsj, String bjsj,
			String hzsj, Short hrsc, Short jjsc, String bjdh, String yhxm,
			String yhdz, String jjlyh, String bjrxm, Boolean bjrxb,
			String lxdh, String zzdw, String afdd, String syxx, String zbxx,
			String bjnr, String afddgbh, String gxdwdm, String bjlbdm,
			String bjlxdm, String bjxldm, Byte bjchpzl, String bjcph,
			Short bkrs, Short ssrs, Short swrs, Byte rsjzlxdm, Byte qhbwdm,
			Byte rsjzjgdm, Byte qhlc, Byte rswzbh, Boolean yfwxp, String rsmj,
			Boolean jqjb, Boolean zhdj, Boolean scbz, String xzb, String yzb,
			Date updateTime, Date createTime) {
		this.ajbh = ajbh;
		this.bjdbh = bjdbh;
		this.xzqh = xzqh;
		this.jjdbh = jjdbh;
		this.gljjdbh = gljjdbh;
		this.fady = fady;
		this.fasjsx = fasjsx;
		this.fasjxx = fasjxx;
		this.jyaq = jyaq;
		this.ladw = ladw;
		this.sldw = sldw;
		this.ajzt = ajzt;
		this.zbr = zbr;
		this.bjfsdm = bjfsdm;
		this.jjlxdm = jjlxdm;
		this.cllxdm = cllxdm;
		this.jjdwdm = jjdwdm;
		this.jjygh = jjygh;
		this.jjyxm = jjyxm;
		this.jjtbh = jjtbh;
		this.jjtip = jjtip;
		this.hrsj = hrsj;
		this.bjsj = bjsj;
		this.hzsj = hzsj;
		this.hrsc = hrsc;
		this.jjsc = jjsc;
		this.bjdh = bjdh;
		this.yhxm = yhxm;
		this.yhdz = yhdz;
		this.jjlyh = jjlyh;
		this.bjrxm = bjrxm;
		this.bjrxb = bjrxb;
		this.lxdh = lxdh;
		this.zzdw = zzdw;
		this.afdd = afdd;
		this.syxx = syxx;
		this.zbxx = zbxx;
		this.bjnr = bjnr;
		this.afddgbh = afddgbh;
		this.gxdwdm = gxdwdm;
		this.bjlbdm = bjlbdm;
		this.bjlxdm = bjlxdm;
		this.bjxldm = bjxldm;
		this.bjchpzl = bjchpzl;
		this.bjcph = bjcph;
		this.bkrs = bkrs;
		this.ssrs = ssrs;
		this.swrs = swrs;
		this.rsjzlxdm = rsjzlxdm;
		this.qhbwdm = qhbwdm;
		this.rsjzjgdm = rsjzjgdm;
		this.qhlc = qhlc;
		this.rswzbh = rswzbh;
		this.yfwxp = yfwxp;
		this.rsmj = rsmj;
		this.jqjb = jqjb;
		this.zhdj = zhdj;
		this.scbz = scbz;
		this.xzb = xzb;
		this.yzb = yzb;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	public Ajxx(String ajbh) {
		this.ajbh = ajbh;
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
	public String getBjdbh() {
		return this.bjdbh;
	}
	public void setBjdbh(String bjdbh) {
		this.bjdbh = bjdbh;
	}
	public String getXzqh() {
		return this.xzqh;
	}
	public void setXzqh(String xzqh) {
		this.xzqh = xzqh;
	}
	public String getJjdbh() {
		return this.jjdbh;
	}
	public void setJjdbh(String jjdbh) {
		this.jjdbh = jjdbh;
	}
	public String getGljjdbh() {
		return this.gljjdbh;
	}
	public void setGljjdbh(String gljjdbh) {
		this.gljjdbh = gljjdbh;
	}
	public String getFady() {
		return this.fady;
	}
	public void setFady(String fady) {
		this.fady = fady;
	}
	public String getFasjsx() {
		return this.fasjsx;
	}
	public void setFasjsx(String fasjsx) {
		this.fasjsx = fasjsx;
	}
	public String getFasjxx() {
		return this.fasjxx;
	}
	public void setFasjxx(String fasjxx) {
		this.fasjxx = fasjxx;
	}
	public String getJyaq() {
		return this.jyaq;
	}
	public void setJyaq(String jyaq) {
		this.jyaq = jyaq;
	}
	public String getLadw() {
		return this.ladw;
	}
	public void setLadw(String ladw) {
		this.ladw = ladw;
	}
	public String getSldw() {
		return this.sldw;
	}
	public void setSldw(String sldw) {
		this.sldw = sldw;
	}
	public String getAjzt() {
		return this.ajzt;
	}
	public void setAjzt(String ajzt) {
		this.ajzt = ajzt;
	}
	public String getZbr() {
		return this.zbr;
	}
	public void setZbr(String zbr) {
		this.zbr = zbr;
	}
	public Byte getBjfsdm() {
		return this.bjfsdm;
	}
	public void setBjfsdm(Byte bjfsdm) {
		this.bjfsdm = bjfsdm;
	}
	public Byte getJjlxdm() {
		return this.jjlxdm;
	}
	public void setJjlxdm(Byte jjlxdm) {
		this.jjlxdm = jjlxdm;
	}
	public Byte getCllxdm() {
		return this.cllxdm;
	}
	public void setCllxdm(Byte cllxdm) {
		this.cllxdm = cllxdm;
	}
	public String getJjdwdm() {
		return this.jjdwdm;
	}
	public void setJjdwdm(String jjdwdm) {
		this.jjdwdm = jjdwdm;
	}
	public String getJjygh() {
		return this.jjygh;
	}
	public void setJjygh(String jjygh) {
		this.jjygh = jjygh;
	}
	public String getJjyxm() {
		return this.jjyxm;
	}
	public void setJjyxm(String jjyxm) {
		this.jjyxm = jjyxm;
	}
	public String getJjtbh() {
		return this.jjtbh;
	}
	public void setJjtbh(String jjtbh) {
		this.jjtbh = jjtbh;
	}
	public String getJjtip() {
		return this.jjtip;
	}
	public void setJjtip(String jjtip) {
		this.jjtip = jjtip;
	}
	public String getHrsj() {
		return this.hrsj;
	}
	public void setHrsj(String hrsj) {
		this.hrsj = hrsj;
	}
	public String getBjsj() {
		return this.bjsj;
	}
	public void setBjsj(String bjsj) {
		this.bjsj = bjsj;
	}
	public String getHzsj() {
		return this.hzsj;
	}
	public void setHzsj(String hzsj) {
		this.hzsj = hzsj;
	}
	public Short getHrsc() {
		return this.hrsc;
	}
	public void setHrsc(Short hrsc) {
		this.hrsc = hrsc;
	}
	public Short getJjsc() {
		return this.jjsc;
	}
	public void setJjsc(Short jjsc) {
		this.jjsc = jjsc;
	}
	public String getBjdh() {
		return this.bjdh;
	}
	public void setBjdh(String bjdh) {
		this.bjdh = bjdh;
	}
	public String getYhxm() {
		return this.yhxm;
	}
	public void setYhxm(String yhxm) {
		this.yhxm = yhxm;
	}
	public String getYhdz() {
		return this.yhdz;
	}
	public void setYhdz(String yhdz) {
		this.yhdz = yhdz;
	}
	public String getJjlyh() {
		return this.jjlyh;
	}
	public void setJjlyh(String jjlyh) {
		this.jjlyh = jjlyh;
	}
	public String getBjrxm() {
		return this.bjrxm;
	}
	public void setBjrxm(String bjrxm) {
		this.bjrxm = bjrxm;
	}
	public Boolean getBjrxb() {
		return this.bjrxb;
	}
	public void setBjrxb(Boolean bjrxb) {
		this.bjrxb = bjrxb;
	}
	public String getLxdh() {
		return this.lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getZzdw() {
		return this.zzdw;
	}
	public void setZzdw(String zzdw) {
		this.zzdw = zzdw;
	}
	public String getAfdd() {
		return this.afdd;
	}
	public void setAfdd(String afdd) {
		this.afdd = afdd;
	}
	public String getSyxx() {
		return this.syxx;
	}
	public void setSyxx(String syxx) {
		this.syxx = syxx;
	}
	public String getZbxx() {
		return this.zbxx;
	}
	public void setZbxx(String zbxx) {
		this.zbxx = zbxx;
	}
	public String getBjnr() {
		return this.bjnr;
	}
	public void setBjnr(String bjnr) {
		this.bjnr = bjnr;
	}
	public String getAfddgbh() {
		return this.afddgbh;
	}
	public void setAfddgbh(String afddgbh) {
		this.afddgbh = afddgbh;
	}
	public String getGxdwdm() {
		return this.gxdwdm;
	}
	public void setGxdwdm(String gxdwdm) {
		this.gxdwdm = gxdwdm;
	}
	public String getBjlbdm() {
		return this.bjlbdm;
	}
	public void setBjlbdm(String bjlbdm) {
		this.bjlbdm = bjlbdm;
	}
	public String getBjlxdm() {
		return this.bjlxdm;
	}
	public void setBjlxdm(String bjlxdm) {
		this.bjlxdm = bjlxdm;
	}
	public String getBjxldm() {
		return this.bjxldm;
	}
	public void setBjxldm(String bjxldm) {
		this.bjxldm = bjxldm;
	}
	public Byte getBjchpzl() {
		return this.bjchpzl;
	}
	public void setBjchpzl(Byte bjchpzl) {
		this.bjchpzl = bjchpzl;
	}
	public String getBjcph() {
		return this.bjcph;
	}
	public void setBjcph(String bjcph) {
		this.bjcph = bjcph;
	}
	public Short getBkrs() {
		return this.bkrs;
	}
	public void setBkrs(Short bkrs) {
		this.bkrs = bkrs;
	}
	public Short getSsrs() {
		return this.ssrs;
	}
	public void setSsrs(Short ssrs) {
		this.ssrs = ssrs;
	}
	public Short getSwrs() {
		return this.swrs;
	}
	public void setSwrs(Short swrs) {
		this.swrs = swrs;
	}
	public Byte getRsjzlxdm() {
		return this.rsjzlxdm;
	}
	public void setRsjzlxdm(Byte rsjzlxdm) {
		this.rsjzlxdm = rsjzlxdm;
	}
	public Byte getQhbwdm() {
		return this.qhbwdm;
	}
	public void setQhbwdm(Byte qhbwdm) {
		this.qhbwdm = qhbwdm;
	}
	public Byte getRsjzjgdm() {
		return this.rsjzjgdm;
	}
	public void setRsjzjgdm(Byte rsjzjgdm) {
		this.rsjzjgdm = rsjzjgdm;
	}
	public Byte getQhlc() {
		return this.qhlc;
	}
	public void setQhlc(Byte qhlc) {
		this.qhlc = qhlc;
	}
	public Byte getRswzbh() {
		return this.rswzbh;
	}
	public void setRswzbh(Byte rswzbh) {
		this.rswzbh = rswzbh;
	}
	public Boolean getYfwxp() {
		return this.yfwxp;
	}
	public void setYfwxp(Boolean yfwxp) {
		this.yfwxp = yfwxp;
	}
	public String getRsmj() {
		return this.rsmj;
	}
	public void setRsmj(String rsmj) {
		this.rsmj = rsmj;
	}
	public Boolean getJqjb() {
		return this.jqjb;
	}
	public void setJqjb(Boolean jqjb) {
		this.jqjb = jqjb;
	}
	public Boolean getZhdj() {
		return this.zhdj;
	}
	public void setZhdj(Boolean zhdj) {
		this.zhdj = zhdj;
	}
	public Boolean getScbz() {
		return this.scbz;
	}
	public void setScbz(Boolean scbz) {
		this.scbz = scbz;
	}
	public String getXzb() {
		return this.xzb;
	}
	public void setXzb(String xzb) {
		this.xzb = xzb;
	}
	public String getYzb() {
		return this.yzb;
	}
	public void setYzb(String yzb) {
		this.yzb = yzb;
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
