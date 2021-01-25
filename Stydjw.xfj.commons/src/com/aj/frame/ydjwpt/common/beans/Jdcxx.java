package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * TJdcxx entity. @author MyEclipse Persistence Tools
 */
public class Jdcxx extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -5898792339893830549L;
	private Long objId;
	/**
	 * 盗抢机动车_主键
	 */
	private Long dqjdcId;
	/**
	 * 机动车序号
	 */
	private String xh;
	/**
	 * 号牌种类
	 */
	private String hpzl;
	/**
	 * 号牌号码
	 */
	private String hphm;
	/**
	 * 中文品牌
	 */
	private String clpp1;
	/**
	 * 车辆型号
	 */
	private String clxh;
	/**
	 * 英文品牌
	 */
	private String clpp2;
	/**
	 * 国产/进口
	 */
	private String gcjk;
	/**
	 * 制造国
	 */
	private String zzg;
	/**
	 * 制造厂名称
	 */
	private String zzcmc;
	/**
	 * 车辆识别代号
	 */
	private String clsbdh;
	/**
	 * 发动机号
	 */
	private String fdjh;
	/**
	 * 车辆类型
	 */
	private String cllx;
	/**
	 * 车身颜色
	 */
	private String csys;
	/**
	 * 使用性质
	 */
	private String syxz;
	/**
	 * 身份证明号码
	 */
	private String sfzmhm;
	/**
	 * 所有权
	 */
	private String syq;
	/**
	 * 初次登记日期
	 */
	private String ccdjrq;
	/**
	 * 最近定检日期
	 */
	private String djrq;
	/**
	 * 检验有效期止
	 */
	private String yxqz;
	/**
	 * 强制报废期止
	 */
	private String qzbfqz;
	/**
	 * 发证机关
	 */
	private String fzjg;
	/**
	 * 管理部门
	 */
	private String glbm;
	/**
	 * 发牌日期
	 */
	private String fprq;
	/**
	 * 发行驶证日期
	 */
	private String fzrq;
	/**
	 * 发登记证书日期
	 */
	private String fdjrq;
	/**
	 * 发合格证日期
	 */
	private String fhgzrq;
	/**
	 * 保险终止日期
	 */
	private String bxzzrq;
	/**
	 * 登记证书编号
	 */
	private String djzsbh;
	/**
	 * 档案编号
	 */
	private String dabh;
	/**
	 * 管理辖区
	 */
	private String xzqh;
	/**
	 * 机动车状态
	 */
	private String zt;
	/**
	 * 抵押标记， 0-未抵押，1-已抵押
	 */
	private String dybj;
	/**
	 * 经办人
	 */
	private String jbr;
	/**
	 * 车辆来源， 1注册2转入3过户
	 */
	private String clly;
	/**
	 * 注册流水号
	 */
	private String lsh;
	/**
	 * 发动机型号
	 */
	private String fdjxh;
	/**
	 * 燃料种类
	 */
	private String rlzl;
	/**
	 * 排量
	 */
	private String pl;
	/**
	 * 功率
	 */
	private String gl;
	/**
	 * 转向形式
	 */
	private String zxxs;
	/**
	 * 车外廓长
	 */
	private String cwkc;
	/**
	 * 车外廓宽
	 */
	private String cwkk;
	/**
	 * 车外廓高
	 */
	private String cwkg;
	/**
	 * 货箱内部长度
	 */
	private String hxnbcd;
	/**
	 * 货箱内部宽度
	 */
	private String hxnbkd;
	/**
	 * 货箱内部高度
	 */
	private String hxnbgd;
	/**
	 * 钢板弹簧片数
	 */
	private String gbthps;
	/**
	 * 轴数
	 */
	private String zs;
	/**
	 * 轴距
	 */
	private String zj;
	/**
	 * 前轮距
	 */
	private String qlj;
	/**
	 * 后轮距
	 */
	private String hlj;
	/**
	 * 轮胎规格
	 */
	private String ltgg;
	/**
	 * 轮胎数
	 */
	private String lts;
	/**
	 * 总质量
	 */
	private String zzl;
	/**
	 * 整备质量
	 */
	private String zbzl;
	/**
	 * 核定载质量
	 */
	private String hdzzl;
	/**
	 * 核定载客
	 */
	private String hdzk;
	/**
	 * 准牵引总质量
	 */
	private String zqyzl;
	/**
	 * 驾驶室前排载客人数
	 */
	private String qpzk;
	/**
	 * 驾驶室后排载客人数
	 */
	private String hpzk;
	/**
	 * 编号
	 */
	private String bh;
	/**
	 * 底盘ID
	 */
	private String dpid;
	/**
	 * 环保达标情况
	 */
	private String hbdbqk;
	/**
	 * 出厂日期
	 */
	private String ccrq;
	/**
	 * 获得方式
	 */
	private String hdfs;
	/**
	 * 来历凭证1
	 */
	private String llpz1;
	/**
	 * 凭证编号1
	 */
	private String pzbh1;
	/**
	 * 来历凭证2
	 */
	private String llpz2;
	/**
	 * 凭证编号2
	 */
	private String pzbh2;
	/**
	 * 销售单位
	 */
	private String xsdw;
	/**
	 * 销售价格
	 */
	private String xsjg;
	/**
	 * 销售日期
	 */
	private String xsrq;
	/**
	 * 进口凭证
	 */
	private String jkpz;
	/**
	 * 进口凭证号码
	 */
	private String jkpzhm;
	/**
	 * 合格证编号
	 */
	private String hgzbh;
	/**
	 * 纳税证明
	 */
	private String nszm;
	/**
	 * 纳税证明编号
	 */
	private String nszmbh;
	/**
	 * 相关资料
	 */
	private String xgzl;
	/**
	 * 前膜编号
	 */
	private String qmbh;
	/**
	 * 后膜编号
	 */
	private String hmbh;
	/**
	 * 备注
	 */
	private String bz;
	/**
	 * 承检单位
	 */
	private String cjdw;
	/**
	 * 检验结果
	 */
	private String jyjg;
	/**
	 * 保险凭证号
	 */
	private String bxpzh;
	/**
	 * 保险金额
	 */
	private String bxje;
	/**
	 * 生效日期
	 */
	private String sxrq;
	/**
	 * 终止日期
	 */
	private String zzrq;
	/**
	 * 保险公司
	 */
	private String bxgs;
	/**
	 * 原号牌种类
	 */
	private String yhpzl;
	/**
	 * 原号牌号码
	 */
	private String yhphm;
	/**
	 * 原使用性质
	 */
	private String ysyxz;
	/**
	 * 转出地
	 */
	private String zcd;
	/**
	 * 解除监管证明书
	 */
	private String jcjgzms;
	/**
	 * 转移类型
	 */
	private String zylx;
	/**
	 * 变更内容
	 */
	private String bgnr;
	/**
	 * 号段ID
	 */
	private String hdid;
	/**
	 * 补换领行驶证次数
	 */
	private String bzcs;
	/**
	 * 补换领号牌次数
	 */
	private String bpcs;
	/**
	 * 补登记证书次数
	 */
	private String bdjcs;
	/**
	 * 置登记证书行数
	 */
	private String zdjzshs;
	/**
	 * 签注日期
	 */
	private String qzrq;
	/**
	 * 身份证明名称
	 */
	private String sfzmmc;
	/**
	 * 机动车所有人
	 */
	private String syr;
	/**
	 * 住所行政区划
	 */
	private String zsxzqh;
	/**
	 * 住所详细地址
	 */
	private String zsxxdz;
	/**
	 * 住所邮政编码
	 */
	private String yzbm1;
	/**
	 * 联系电话
	 */
	private String lxdh;
	/**
	 * 暂住居住证明
	 */
	private String zzz;
	/**
	 * 暂住行政区划
	 */
	private String zzxzqh;
	/**
	 * 暂住详细地址
	 */
	private String zzxxdz;
	/**
	 * 暂住邮政编码
	 */
	private String yzbm2;
	/**
	 * 签发日期
	 */
	private String qfrq;
	/**
	 * 进口车厂牌型号
	 */
	private String jkccpxh;
	/**
	 * 进口车车身颜色
	 */
	private String jkccsys;
	/**
	 * 校验位
	 */
	private String jyw;
	/**
	 * 下载标记
	 */
	private String xzbj;
	/**
	 * 自定义状态
	 */
	private String zdyzt;
	/**
	 * 原机动车序号
	 */
	private String yxh;
	/**
	 * 查验人员
	 */
	private String cyry;
	/**
	 * 底盘合格证编号
	 */
	private String dphgzbh;
	/**
	 * 社区代码
	 */
	private String sqdm;
	/**
	 * 车辆用途
	 */
	private String clyt;
	/**
	 * 用途属性
	 */
	private String ytsx;
	/**
	 * 电子邮箱
	 */
	private String dzyx;
	/**
	 * 行驶证证芯编号
	 */
	private String xszbh;
	/**
	 * 手机号码
	 */
	private String sjhm;
	/**
	 * 检验合格标志1
	 */
	private String jyhgbzbh1;
	/**
	 * 检验合格标志2
	 */
	private String jyhgbzbh2;
	/**
	 * 残疾人(操纵)辅助装置产品型号
	 */
	private String cjrfzzzxh;
	/**
	 * 残疾人(操纵)辅助装置产品编号
	 */
	private String cjrfzzzbh;
	/**
	 * 单位编号
	 */
	private String dwbh;
	/**
	 * 更新日期
	 */
	private String gxrq;
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
	public Jdcxx() {
	}
	/** full constructor */
	public Jdcxx(Long dqjdcId, String xh, String hpzl, String hphm,
			String clpp1, String clxh, String clpp2, String gcjk, String zzg,
			String zzcmc, String clsbdh, String fdjh, String cllx, String csys,
			String syxz, String sfzmhm, String syq, String ccdjrq, String djrq,
			String yxqz, String qzbfqz, String fzjg, String glbm, String fprq,
			String fzrq, String fdjrq, String fhgzrq, String bxzzrq,
			String djzsbh, String dabh, String xzqh, String zt, String dybj,
			String jbr, String clly, String lsh, String fdjxh, String rlzl,
			String pl, String gl, String zxxs, String cwkc, String cwkk,
			String cwkg, String hxnbcd, String hxnbkd, String hxnbgd,
			String gbthps, String zs, String zj, String qlj, String hlj,
			String ltgg, String lts, String zzl, String zbzl, String hdzzl,
			String hdzk, String zqyzl, String qpzk, String hpzk, String bh,
			String dpid, String hbdbqk, String ccrq, String hdfs, String llpz1,
			String pzbh1, String llpz2, String pzbh2, String xsdw, String xsjg,
			String xsrq, String jkpz, String jkpzhm, String hgzbh, String nszm,
			String nszmbh, String xgzl, String qmbh, String hmbh, String bz,
			String cjdw, String jyjg, String bxpzh, String bxje, String sxrq,
			String zzrq, String bxgs, String yhpzl, String yhphm, String ysyxz,
			String zcd, String jcjgzms, String zylx, String bgnr, String hdid,
			String bzcs, String bpcs, String bdjcs, String zdjzshs,
			String qzrq, String sfzmmc, String syr, String zsxzqh,
			String zsxxdz, String yzbm1, String lxdh, String zzz,
			String zzxzqh, String zzxxdz, String yzbm2, String qfrq,
			String jkccpxh, String jkccsys, String jyw, String xzbj,
			String zdyzt, String yxh, String cyry, String dphgzbh, String sqdm,
			String clyt, String ytsx, String dzyx, String xszbh, String sjhm,
			String jyhgbzbh1, String jyhgbzbh2, String cjrfzzzxh,
			String cjrfzzzbh, String dwbh, String gxrq, Date updateTime,
			Date createTime) {
		this.dqjdcId = dqjdcId;
		this.xh = xh;
		this.hpzl = hpzl;
		this.hphm = hphm;
		this.clpp1 = clpp1;
		this.clxh = clxh;
		this.clpp2 = clpp2;
		this.gcjk = gcjk;
		this.zzg = zzg;
		this.zzcmc = zzcmc;
		this.clsbdh = clsbdh;
		this.fdjh = fdjh;
		this.cllx = cllx;
		this.csys = csys;
		this.syxz = syxz;
		this.sfzmhm = sfzmhm;
		this.syq = syq;
		this.ccdjrq = ccdjrq;
		this.djrq = djrq;
		this.yxqz = yxqz;
		this.qzbfqz = qzbfqz;
		this.fzjg = fzjg;
		this.glbm = glbm;
		this.fprq = fprq;
		this.fzrq = fzrq;
		this.fdjrq = fdjrq;
		this.fhgzrq = fhgzrq;
		this.bxzzrq = bxzzrq;
		this.djzsbh = djzsbh;
		this.dabh = dabh;
		this.xzqh = xzqh;
		this.zt = zt;
		this.dybj = dybj;
		this.jbr = jbr;
		this.clly = clly;
		this.lsh = lsh;
		this.fdjxh = fdjxh;
		this.rlzl = rlzl;
		this.pl = pl;
		this.gl = gl;
		this.zxxs = zxxs;
		this.cwkc = cwkc;
		this.cwkk = cwkk;
		this.cwkg = cwkg;
		this.hxnbcd = hxnbcd;
		this.hxnbkd = hxnbkd;
		this.hxnbgd = hxnbgd;
		this.gbthps = gbthps;
		this.zs = zs;
		this.zj = zj;
		this.qlj = qlj;
		this.hlj = hlj;
		this.ltgg = ltgg;
		this.lts = lts;
		this.zzl = zzl;
		this.zbzl = zbzl;
		this.hdzzl = hdzzl;
		this.hdzk = hdzk;
		this.zqyzl = zqyzl;
		this.qpzk = qpzk;
		this.hpzk = hpzk;
		this.bh = bh;
		this.dpid = dpid;
		this.hbdbqk = hbdbqk;
		this.ccrq = ccrq;
		this.hdfs = hdfs;
		this.llpz1 = llpz1;
		this.pzbh1 = pzbh1;
		this.llpz2 = llpz2;
		this.pzbh2 = pzbh2;
		this.xsdw = xsdw;
		this.xsjg = xsjg;
		this.xsrq = xsrq;
		this.jkpz = jkpz;
		this.jkpzhm = jkpzhm;
		this.hgzbh = hgzbh;
		this.nszm = nszm;
		this.nszmbh = nszmbh;
		this.xgzl = xgzl;
		this.qmbh = qmbh;
		this.hmbh = hmbh;
		this.bz = bz;
		this.cjdw = cjdw;
		this.jyjg = jyjg;
		this.bxpzh = bxpzh;
		this.bxje = bxje;
		this.sxrq = sxrq;
		this.zzrq = zzrq;
		this.bxgs = bxgs;
		this.yhpzl = yhpzl;
		this.yhphm = yhphm;
		this.ysyxz = ysyxz;
		this.zcd = zcd;
		this.jcjgzms = jcjgzms;
		this.zylx = zylx;
		this.bgnr = bgnr;
		this.hdid = hdid;
		this.bzcs = bzcs;
		this.bpcs = bpcs;
		this.bdjcs = bdjcs;
		this.zdjzshs = zdjzshs;
		this.qzrq = qzrq;
		this.sfzmmc = sfzmmc;
		this.syr = syr;
		this.zsxzqh = zsxzqh;
		this.zsxxdz = zsxxdz;
		this.yzbm1 = yzbm1;
		this.lxdh = lxdh;
		this.zzz = zzz;
		this.zzxzqh = zzxzqh;
		this.zzxxdz = zzxxdz;
		this.yzbm2 = yzbm2;
		this.qfrq = qfrq;
		this.jkccpxh = jkccpxh;
		this.jkccsys = jkccsys;
		this.jyw = jyw;
		this.xzbj = xzbj;
		this.zdyzt = zdyzt;
		this.yxh = yxh;
		this.cyry = cyry;
		this.dphgzbh = dphgzbh;
		this.sqdm = sqdm;
		this.clyt = clyt;
		this.ytsx = ytsx;
		this.dzyx = dzyx;
		this.xszbh = xszbh;
		this.sjhm = sjhm;
		this.jyhgbzbh1 = jyhgbzbh1;
		this.jyhgbzbh2 = jyhgbzbh2;
		this.cjrfzzzxh = cjrfzzzxh;
		this.cjrfzzzbh = cjrfzzzbh;
		this.dwbh = dwbh;
		this.gxrq = gxrq;
		this.updateTime = updateTime;
		this.createTime = createTime;
	}
	public Jdcxx(String hpzl, String hphm) {
		this.hpzl = hpzl;
		this.hphm = hphm;
	}
	public Jdcxx(String hphm) {
		this.hphm = hphm;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getDqjdcId() {
		return this.dqjdcId;
	}
	public void setDqjdcId(Long dqjdcId) {
		this.dqjdcId = dqjdcId;
	}
	public String getXh() {
		return this.xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
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
	public String getClpp1() {
		return this.clpp1;
	}
	public void setClpp1(String clpp1) {
		this.clpp1 = clpp1;
	}
	public String getClxh() {
		return this.clxh;
	}
	public void setClxh(String clxh) {
		this.clxh = clxh;
	}
	public String getClpp2() {
		return this.clpp2;
	}
	public void setClpp2(String clpp2) {
		this.clpp2 = clpp2;
	}
	public String getGcjk() {
		return this.gcjk;
	}
	public void setGcjk(String gcjk) {
		this.gcjk = gcjk;
	}
	public String getZzg() {
		return this.zzg;
	}
	public void setZzg(String zzg) {
		this.zzg = zzg;
	}
	public String getZzcmc() {
		return this.zzcmc;
	}
	public void setZzcmc(String zzcmc) {
		this.zzcmc = zzcmc;
	}
	public String getClsbdh() {
		return this.clsbdh;
	}
	public void setClsbdh(String clsbdh) {
		this.clsbdh = clsbdh;
	}
	public String getFdjh() {
		return this.fdjh;
	}
	public void setFdjh(String fdjh) {
		this.fdjh = fdjh;
	}
	public String getCllx() {
		return this.cllx;
	}
	public void setCllx(String cllx) {
		this.cllx = cllx;
	}
	public String getCsys() {
		return this.csys;
	}
	public void setCsys(String csys) {
		this.csys = csys;
	}
	public String getSyxz() {
		return this.syxz;
	}
	public void setSyxz(String syxz) {
		this.syxz = syxz;
	}
	public String getSfzmhm() {
		return this.sfzmhm;
	}
	public void setSfzmhm(String sfzmhm) {
		this.sfzmhm = sfzmhm;
	}
	public String getSyq() {
		return this.syq;
	}
	public void setSyq(String syq) {
		this.syq = syq;
	}
	public String getCcdjrq() {
		return this.ccdjrq;
	}
	public void setCcdjrq(String ccdjrq) {
		this.ccdjrq = ccdjrq;
	}
	public String getDjrq() {
		return this.djrq;
	}
	public void setDjrq(String djrq) {
		this.djrq = djrq;
	}
	public String getYxqz() {
		return this.yxqz;
	}
	public void setYxqz(String yxqz) {
		this.yxqz = yxqz;
	}
	public String getQzbfqz() {
		return this.qzbfqz;
	}
	public void setQzbfqz(String qzbfqz) {
		this.qzbfqz = qzbfqz;
	}
	public String getFzjg() {
		return this.fzjg;
	}
	public void setFzjg(String fzjg) {
		this.fzjg = fzjg;
	}
	public String getGlbm() {
		return this.glbm;
	}
	public void setGlbm(String glbm) {
		this.glbm = glbm;
	}
	public String getFprq() {
		return this.fprq;
	}
	public void setFprq(String fprq) {
		this.fprq = fprq;
	}
	public String getFzrq() {
		return this.fzrq;
	}
	public void setFzrq(String fzrq) {
		this.fzrq = fzrq;
	}
	public String getFdjrq() {
		return this.fdjrq;
	}
	public void setFdjrq(String fdjrq) {
		this.fdjrq = fdjrq;
	}
	public String getFhgzrq() {
		return this.fhgzrq;
	}
	public void setFhgzrq(String fhgzrq) {
		this.fhgzrq = fhgzrq;
	}
	public String getBxzzrq() {
		return this.bxzzrq;
	}
	public void setBxzzrq(String bxzzrq) {
		this.bxzzrq = bxzzrq;
	}
	public String getDjzsbh() {
		return this.djzsbh;
	}
	public void setDjzsbh(String djzsbh) {
		this.djzsbh = djzsbh;
	}
	public String getDabh() {
		return this.dabh;
	}
	public void setDabh(String dabh) {
		this.dabh = dabh;
	}
	public String getXzqh() {
		return this.xzqh;
	}
	public void setXzqh(String xzqh) {
		this.xzqh = xzqh;
	}
	public String getZt() {
		return this.zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public String getDybj() {
		return this.dybj;
	}
	public void setDybj(String dybj) {
		this.dybj = dybj;
	}
	public String getJbr() {
		return this.jbr;
	}
	public void setJbr(String jbr) {
		this.jbr = jbr;
	}
	public String getClly() {
		return this.clly;
	}
	public void setClly(String clly) {
		this.clly = clly;
	}
	public String getLsh() {
		return this.lsh;
	}
	public void setLsh(String lsh) {
		this.lsh = lsh;
	}
	public String getFdjxh() {
		return this.fdjxh;
	}
	public void setFdjxh(String fdjxh) {
		this.fdjxh = fdjxh;
	}
	public String getRlzl() {
		return this.rlzl;
	}
	public void setRlzl(String rlzl) {
		this.rlzl = rlzl;
	}
	public String getPl() {
		return this.pl;
	}
	public void setPl(String pl) {
		this.pl = pl;
	}
	public String getGl() {
		return this.gl;
	}
	public void setGl(String gl) {
		this.gl = gl;
	}
	public String getZxxs() {
		return this.zxxs;
	}
	public void setZxxs(String zxxs) {
		this.zxxs = zxxs;
	}
	public String getCwkc() {
		return this.cwkc;
	}
	public void setCwkc(String cwkc) {
		this.cwkc = cwkc;
	}
	public String getCwkk() {
		return this.cwkk;
	}
	public void setCwkk(String cwkk) {
		this.cwkk = cwkk;
	}
	public String getCwkg() {
		return this.cwkg;
	}
	public void setCwkg(String cwkg) {
		this.cwkg = cwkg;
	}
	public String getHxnbcd() {
		return this.hxnbcd;
	}
	public void setHxnbcd(String hxnbcd) {
		this.hxnbcd = hxnbcd;
	}
	public String getHxnbkd() {
		return this.hxnbkd;
	}
	public void setHxnbkd(String hxnbkd) {
		this.hxnbkd = hxnbkd;
	}
	public String getHxnbgd() {
		return this.hxnbgd;
	}
	public void setHxnbgd(String hxnbgd) {
		this.hxnbgd = hxnbgd;
	}
	public String getGbthps() {
		return this.gbthps;
	}
	public void setGbthps(String gbthps) {
		this.gbthps = gbthps;
	}
	public String getZs() {
		return this.zs;
	}
	public void setZs(String zs) {
		this.zs = zs;
	}
	public String getZj() {
		return this.zj;
	}
	public void setZj(String zj) {
		this.zj = zj;
	}
	public String getQlj() {
		return this.qlj;
	}
	public void setQlj(String qlj) {
		this.qlj = qlj;
	}
	public String getHlj() {
		return this.hlj;
	}
	public void setHlj(String hlj) {
		this.hlj = hlj;
	}
	public String getLtgg() {
		return this.ltgg;
	}
	public void setLtgg(String ltgg) {
		this.ltgg = ltgg;
	}
	public String getLts() {
		return this.lts;
	}
	public void setLts(String lts) {
		this.lts = lts;
	}
	public String getZzl() {
		return this.zzl;
	}
	public void setZzl(String zzl) {
		this.zzl = zzl;
	}
	public String getZbzl() {
		return this.zbzl;
	}
	public void setZbzl(String zbzl) {
		this.zbzl = zbzl;
	}
	public String getHdzzl() {
		return this.hdzzl;
	}
	public void setHdzzl(String hdzzl) {
		this.hdzzl = hdzzl;
	}
	public String getHdzk() {
		return this.hdzk;
	}
	public void setHdzk(String hdzk) {
		this.hdzk = hdzk;
	}
	public String getZqyzl() {
		return this.zqyzl;
	}
	public void setZqyzl(String zqyzl) {
		this.zqyzl = zqyzl;
	}
	public String getQpzk() {
		return this.qpzk;
	}
	public void setQpzk(String qpzk) {
		this.qpzk = qpzk;
	}
	public String getHpzk() {
		return this.hpzk;
	}
	public void setHpzk(String hpzk) {
		this.hpzk = hpzk;
	}
	public String getBh() {
		return this.bh;
	}
	public void setBh(String bh) {
		this.bh = bh;
	}
	public String getDpid() {
		return this.dpid;
	}
	public void setDpid(String dpid) {
		this.dpid = dpid;
	}
	public String getHbdbqk() {
		return this.hbdbqk;
	}
	public void setHbdbqk(String hbdbqk) {
		this.hbdbqk = hbdbqk;
	}
	public String getCcrq() {
		return this.ccrq;
	}
	public void setCcrq(String ccrq) {
		this.ccrq = ccrq;
	}
	public String getHdfs() {
		return this.hdfs;
	}
	public void setHdfs(String hdfs) {
		this.hdfs = hdfs;
	}
	public String getLlpz1() {
		return this.llpz1;
	}
	public void setLlpz1(String llpz1) {
		this.llpz1 = llpz1;
	}
	public String getPzbh1() {
		return this.pzbh1;
	}
	public void setPzbh1(String pzbh1) {
		this.pzbh1 = pzbh1;
	}
	public String getLlpz2() {
		return this.llpz2;
	}
	public void setLlpz2(String llpz2) {
		this.llpz2 = llpz2;
	}
	public String getPzbh2() {
		return this.pzbh2;
	}
	public void setPzbh2(String pzbh2) {
		this.pzbh2 = pzbh2;
	}
	public String getXsdw() {
		return this.xsdw;
	}
	public void setXsdw(String xsdw) {
		this.xsdw = xsdw;
	}
	public String getXsjg() {
		return this.xsjg;
	}
	public void setXsjg(String xsjg) {
		this.xsjg = xsjg;
	}
	public String getXsrq() {
		return this.xsrq;
	}
	public void setXsrq(String xsrq) {
		this.xsrq = xsrq;
	}
	public String getJkpz() {
		return this.jkpz;
	}
	public void setJkpz(String jkpz) {
		this.jkpz = jkpz;
	}
	public String getJkpzhm() {
		return this.jkpzhm;
	}
	public void setJkpzhm(String jkpzhm) {
		this.jkpzhm = jkpzhm;
	}
	public String getHgzbh() {
		return this.hgzbh;
	}
	public void setHgzbh(String hgzbh) {
		this.hgzbh = hgzbh;
	}
	public String getNszm() {
		return this.nszm;
	}
	public void setNszm(String nszm) {
		this.nszm = nszm;
	}
	public String getNszmbh() {
		return this.nszmbh;
	}
	public void setNszmbh(String nszmbh) {
		this.nszmbh = nszmbh;
	}
	public String getXgzl() {
		return this.xgzl;
	}
	public void setXgzl(String xgzl) {
		this.xgzl = xgzl;
	}
	public String getQmbh() {
		return this.qmbh;
	}
	public void setQmbh(String qmbh) {
		this.qmbh = qmbh;
	}
	public String getHmbh() {
		return this.hmbh;
	}
	public void setHmbh(String hmbh) {
		this.hmbh = hmbh;
	}
	public String getBz() {
		return this.bz;
	}
	public void setBz(String bz) {
		this.bz = bz;
	}
	public String getCjdw() {
		return this.cjdw;
	}
	public void setCjdw(String cjdw) {
		this.cjdw = cjdw;
	}
	public String getJyjg() {
		return this.jyjg;
	}
	public void setJyjg(String jyjg) {
		this.jyjg = jyjg;
	}
	public String getBxpzh() {
		return this.bxpzh;
	}
	public void setBxpzh(String bxpzh) {
		this.bxpzh = bxpzh;
	}
	public String getBxje() {
		return this.bxje;
	}
	public void setBxje(String bxje) {
		this.bxje = bxje;
	}
	public String getSxrq() {
		return this.sxrq;
	}
	public void setSxrq(String sxrq) {
		this.sxrq = sxrq;
	}
	public String getZzrq() {
		return this.zzrq;
	}
	public void setZzrq(String zzrq) {
		this.zzrq = zzrq;
	}
	public String getBxgs() {
		return this.bxgs;
	}
	public void setBxgs(String bxgs) {
		this.bxgs = bxgs;
	}
	public String getYhpzl() {
		return this.yhpzl;
	}
	public void setYhpzl(String yhpzl) {
		this.yhpzl = yhpzl;
	}
	public String getYhphm() {
		return this.yhphm;
	}
	public void setYhphm(String yhphm) {
		this.yhphm = yhphm;
	}
	public String getYsyxz() {
		return this.ysyxz;
	}
	public void setYsyxz(String ysyxz) {
		this.ysyxz = ysyxz;
	}
	public String getZcd() {
		return this.zcd;
	}
	public void setZcd(String zcd) {
		this.zcd = zcd;
	}
	public String getJcjgzms() {
		return this.jcjgzms;
	}
	public void setJcjgzms(String jcjgzms) {
		this.jcjgzms = jcjgzms;
	}
	public String getZylx() {
		return this.zylx;
	}
	public void setZylx(String zylx) {
		this.zylx = zylx;
	}
	public String getBgnr() {
		return this.bgnr;
	}
	public void setBgnr(String bgnr) {
		this.bgnr = bgnr;
	}
	public String getHdid() {
		return this.hdid;
	}
	public void setHdid(String hdid) {
		this.hdid = hdid;
	}
	public String getBzcs() {
		return this.bzcs;
	}
	public void setBzcs(String bzcs) {
		this.bzcs = bzcs;
	}
	public String getBpcs() {
		return this.bpcs;
	}
	public void setBpcs(String bpcs) {
		this.bpcs = bpcs;
	}
	public String getBdjcs() {
		return this.bdjcs;
	}
	public void setBdjcs(String bdjcs) {
		this.bdjcs = bdjcs;
	}
	public String getZdjzshs() {
		return this.zdjzshs;
	}
	public void setZdjzshs(String zdjzshs) {
		this.zdjzshs = zdjzshs;
	}
	public String getQzrq() {
		return this.qzrq;
	}
	public void setQzrq(String qzrq) {
		this.qzrq = qzrq;
	}
	public String getSfzmmc() {
		return this.sfzmmc;
	}
	public void setSfzmmc(String sfzmmc) {
		this.sfzmmc = sfzmmc;
	}
	public String getSyr() {
		return this.syr;
	}
	public void setSyr(String syr) {
		this.syr = syr;
	}
	public String getZsxzqh() {
		return this.zsxzqh;
	}
	public void setZsxzqh(String zsxzqh) {
		this.zsxzqh = zsxzqh;
	}
	public String getZsxxdz() {
		return this.zsxxdz;
	}
	public void setZsxxdz(String zsxxdz) {
		this.zsxxdz = zsxxdz;
	}
	public String getYzbm1() {
		return this.yzbm1;
	}
	public void setYzbm1(String yzbm1) {
		this.yzbm1 = yzbm1;
	}
	public String getLxdh() {
		return this.lxdh;
	}
	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	public String getZzz() {
		return this.zzz;
	}
	public void setZzz(String zzz) {
		this.zzz = zzz;
	}
	public String getZzxzqh() {
		return this.zzxzqh;
	}
	public void setZzxzqh(String zzxzqh) {
		this.zzxzqh = zzxzqh;
	}
	public String getZzxxdz() {
		return this.zzxxdz;
	}
	public void setZzxxdz(String zzxxdz) {
		this.zzxxdz = zzxxdz;
	}
	public String getYzbm2() {
		return this.yzbm2;
	}
	public void setYzbm2(String yzbm2) {
		this.yzbm2 = yzbm2;
	}
	public String getQfrq() {
		return this.qfrq;
	}
	public void setQfrq(String qfrq) {
		this.qfrq = qfrq;
	}
	public String getJkccpxh() {
		return this.jkccpxh;
	}
	public void setJkccpxh(String jkccpxh) {
		this.jkccpxh = jkccpxh;
	}
	public String getJkccsys() {
		return this.jkccsys;
	}
	public void setJkccsys(String jkccsys) {
		this.jkccsys = jkccsys;
	}
	public String getJyw() {
		return this.jyw;
	}
	public void setJyw(String jyw) {
		this.jyw = jyw;
	}
	public String getXzbj() {
		return this.xzbj;
	}
	public void setXzbj(String xzbj) {
		this.xzbj = xzbj;
	}
	public String getZdyzt() {
		return this.zdyzt;
	}
	public void setZdyzt(String zdyzt) {
		this.zdyzt = zdyzt;
	}
	public String getYxh() {
		return this.yxh;
	}
	public void setYxh(String yxh) {
		this.yxh = yxh;
	}
	public String getCyry() {
		return this.cyry;
	}
	public void setCyry(String cyry) {
		this.cyry = cyry;
	}
	public String getDphgzbh() {
		return this.dphgzbh;
	}
	public void setDphgzbh(String dphgzbh) {
		this.dphgzbh = dphgzbh;
	}
	public String getSqdm() {
		return this.sqdm;
	}
	public void setSqdm(String sqdm) {
		this.sqdm = sqdm;
	}
	public String getClyt() {
		return this.clyt;
	}
	public void setClyt(String clyt) {
		this.clyt = clyt;
	}
	public String getYtsx() {
		return this.ytsx;
	}
	public void setYtsx(String ytsx) {
		this.ytsx = ytsx;
	}
	public String getDzyx() {
		return this.dzyx;
	}
	public void setDzyx(String dzyx) {
		this.dzyx = dzyx;
	}
	public String getXszbh() {
		return this.xszbh;
	}
	public void setXszbh(String xszbh) {
		this.xszbh = xszbh;
	}
	public String getSjhm() {
		return this.sjhm;
	}
	public void setSjhm(String sjhm) {
		this.sjhm = sjhm;
	}
	public String getJyhgbzbh1() {
		return this.jyhgbzbh1;
	}
	public void setJyhgbzbh1(String jyhgbzbh1) {
		this.jyhgbzbh1 = jyhgbzbh1;
	}
	public String getJyhgbzbh2() {
		return this.jyhgbzbh2;
	}
	public void setJyhgbzbh2(String jyhgbzbh2) {
		this.jyhgbzbh2 = jyhgbzbh2;
	}
	public String getCjrfzzzxh() {
		return this.cjrfzzzxh;
	}
	public void setCjrfzzzxh(String cjrfzzzxh) {
		this.cjrfzzzxh = cjrfzzzxh;
	}
	public String getCjrfzzzbh() {
		return this.cjrfzzzbh;
	}
	public void setCjrfzzzbh(String cjrfzzzbh) {
		this.cjrfzzzbh = cjrfzzzbh;
	}
	public String getDwbh() {
		return this.dwbh;
	}
	public void setDwbh(String dwbh) {
		this.dwbh = dwbh;
	}
	public String getGxrq() {
		return this.gxrq;
	}
	public void setGxrq(String gxrq) {
		this.gxrq = gxrq;
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
