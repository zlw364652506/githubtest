package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * EncryptionCard entity. @author MyEclipse Persistence Tools
 */
public class EncryptionCard extends AJFrameNamedBeanAbstract {
	private static final long serialVersionUID = -3883370529800190710L;
	// Fields
	private Long objId;
	/**
	 * 加密的的物理串号
	 */
	private String tfSn;
	/**
	 * 加密卡的认证识别串号
	 */
	private String authSn;
	/**
	 * 证书编号
	 */
	private String certSn;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 证书用户ID
	 */
	private Long certUserId;
	// 扩展属性
	private User certUser;
	public User getCertUser() {
		return certUser;
	}
	public void setCertUser(User certUser) {
		this.certUser = certUser;
	}
	// Constructors
	/** default constructor */
	public EncryptionCard() {
	}
	/** minimal constructor */
	public EncryptionCard(String tfSn, String certSn, Date createTime,
			Byte state, Long certUserId) {
		this.tfSn = tfSn;
		this.certSn = certSn;
		this.createTime = createTime;
		this.state = state;
		this.certUserId = certUserId;
	}
	public EncryptionCard(String tfSn, String authSn, String certSn) {
		this.tfSn = tfSn;
		this.authSn = authSn;
		this.certSn = certSn;
	}
	/** full constructor */
	public EncryptionCard(String tfSn, String authSn, String certSn,
			Date createTime, Byte state, Long certUserId) {
		this.tfSn = tfSn;
		this.authSn = authSn;
		this.certSn = certSn;
		this.createTime = createTime;
		this.state = state;
		this.certUserId = certUserId;
	}
	// Property accessors
	public EncryptionCard(String tfSn) {
		this.tfSn = tfSn;
	}
	public EncryptionCard(Long objId) {
		this.objId = objId;
	}
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getTfSn() {
		return this.tfSn;
	}
	public void setTfSn(String tfSn) {
		this.tfSn = tfSn;
	}
	public String getAuthSn() {
		return this.authSn;
	}
	public void setAuthSn(String authSn) {
		this.authSn = authSn;
	}
	public String getCertSn() {
		return this.certSn;
	}
	public void setCertSn(String certSn) {
		this.certSn = certSn;
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
	public Long getCertUserId() {
		return this.certUserId;
	}
	public void setCertUserId(Long certUserId) {
		this.certUserId = certUserId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getTfSn(), this.getCertSn(), this.getAuthSn()};
	}
}
