package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFile;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Attachment entity. @author MyEclipse Persistence Tools
 */
public class Attachment extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -1963135889654085904L;
	private Long objId;
	/**
	 * APP评测ID
	 */
	private Long appEvaluatId;
	/**
	 * 描述
	 */
	private String describe;
	/**
	 * 序号
	 */
	private String sn;
	/**
	 * 地址，附件存放路径
	 */
	private String url;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	//扩展对象
	private AJFile ajfile;
	// Constructors
	/** default constructor */
	public Attachment() {
	}
	/** minimal constructor */
	public Attachment(Long appEvaluatId, String sn, String url,
			Date createTime, Byte state) {
		this.appEvaluatId = appEvaluatId;
		this.sn = sn;
		this.url = url;
		this.createTime = createTime;
		this.state = state;
	}
	/** full constructor */
	public Attachment(Long appEvaluatId, String describe, String sn,
			String url, Date createTime, Byte state) {
		this.appEvaluatId = appEvaluatId;
		this.describe = describe;
		this.sn = sn;
		this.url = url;
		this.createTime = createTime;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getAppEvaluatId() {
		return this.appEvaluatId;
	}
	public void setAppEvaluatId(Long appEvaluatId) {
		this.appEvaluatId = appEvaluatId;
	}
	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public AJFile getAjfile() {
		return ajfile;
	}
	public void setAjfile(AJFile ajfile) {
		this.ajfile = ajfile;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppEvaluatId()};
	}
}
