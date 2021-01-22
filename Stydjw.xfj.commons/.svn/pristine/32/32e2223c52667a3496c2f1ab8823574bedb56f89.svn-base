package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * TerminalDevAuth entity. @author MyEclipse Persistence Tools
 */
public class TerminalDevAuth extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 4206004345781998925L;
	private Long objId;
	/**
	 * 手机主键
	 */
	private Long terminalDevId;
	/**
	 * 手机卡主键
	 */
	private Long simId;
	/**
	 * 加密卡主键
	 */
	private Long encryptionCardId;
	/**
	 * 用户主键
	 */
	private Long userId;
	/**
	 * 绑定时间
	 */
	private Date createTime;
	/**
	 * 状态 ，0-已注销（逻辑删除）；1-已授权（正常）；2-待授权；3-已挂失；4-已禁用；5-用户被注销；6-未匹配；
	 */
	private Byte state;
	/**
	 * 警号
	 */
	private String userName;
	/**
	 * 警号对应的部门编码
	 */
	private String deptCode;
	
	/**
	 * 状态更新时间
	 */
	private Date updateTime;
	/**
	 * 异常说明，记录三卡匹配说明
	 */
	private String abnormal;
	//扩展对象
	private MobileTerminalDev mobileTerminalDev;
	private SimCard simCard;
	private EncryptionCard encryptionCard;
	private UserExt user;
	private Long devAuthHistoryId;
	private TerminalDevAuthHistory devAuthHistory;
	// Constructors
	/** default constructor */
	public TerminalDevAuth() {
	}
	public TerminalDevAuth(User user) {
		this.userId = user.getObjId();
	}
	public TerminalDevAuth(UserExt user) {
		this.userId = user.getObjId();
	}
	public TerminalDevAuth(User user, Byte state) {
		this.userId = user.getObjId();
		this.state = state;
	}
	public TerminalDevAuth(UserExt user, Byte state) {
		this.userId = user.getObjId();
		this.state = state;
	}
	/** minimal constructor */
	public TerminalDevAuth(Long terminalDevId, Long simId,
			Long encryptionCardId, Long userId, Byte state, Date updateTime) {
		this.terminalDevId = terminalDevId;
		this.simId = simId;
		this.encryptionCardId = encryptionCardId;
		this.userId = userId;
		this.state = state;
		this.updateTime = updateTime;
	}
	/** full constructor */
	public TerminalDevAuth(Long terminalDevId, Long simId,
			Long encryptionCardId, Long userId, Date createTime, Byte state,
			Date updateTime) {
		this.terminalDevId = terminalDevId;
		this.simId = simId;
		this.encryptionCardId = encryptionCardId;
		this.userId = userId;
		this.createTime = createTime;
		this.state = state;
		this.updateTime = updateTime;
	}
	// Property accessors
	public TerminalDevAuth(SimCard sim) {
		this.simId = sim.getObjId();
	}
	public TerminalDevAuth(MobileTerminalDev device) {
		this.terminalDevId = device.getObjId();
	}
	public TerminalDevAuth(Byte state) {
		this.state = state;
	}
	public TerminalDevAuth(EncryptionCard enc) {
		this.encryptionCardId = enc.getObjId();
	}
	public TerminalDevAuth(SimCard sim, User user) {
		this.simId = sim.getObjId();
		this.userId = user.getObjId();
	}
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getTerminalDevId() {
		return this.terminalDevId;
	}
	public void setTerminalDevId(Long terminalDevId) {
		this.terminalDevId = terminalDevId;
	}
	public Long getSimId() {
		return this.simId;
	}
	public void setSimId(Long simId) {
		this.simId = simId;
	}
	public Long getEncryptionCardId() {
		return this.encryptionCardId;
	}
	public void setEncryptionCardId(Long encryptionCardId) {
		this.encryptionCardId = encryptionCardId;
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getAbnormal() {
		return abnormal;
	}
	public void setAbnormal(String abnormal) {
		this.abnormal = abnormal;
	}
	public MobileTerminalDev getMobileTerminalDev() {
		return mobileTerminalDev;
	}
	public void setMobileTerminalDev(MobileTerminalDev mobileTerminalDev) {
		this.mobileTerminalDev = mobileTerminalDev;
	}
	public SimCard getSimCard() {
		return simCard;
	}
	public void setSimCard(SimCard simCard) {
		this.simCard = simCard;
	}
	public EncryptionCard getEncryptionCard() {
		return encryptionCard;
	}
	public void setEncryptionCard(EncryptionCard encryptionCard) {
		this.encryptionCard = encryptionCard;
	}
	public UserExt getUser() {
		return user;
	}
	public void setUser(UserExt user) {
		this.user = user;
	}
	public Long getDevAuthHistoryId() {
		return devAuthHistoryId;
	}
	public void setDevAuthHistoryId(Long devAuthHistoryId) {
		this.devAuthHistoryId = devAuthHistoryId;
	}
	public TerminalDevAuthHistory getDevAuthHistory() {
		return devAuthHistory;
	}
	public void setDevAuthHistory(TerminalDevAuthHistory devAuthHistory) {
		this.devAuthHistory = devAuthHistory;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getSimId(), "" + this.getEncryptionCardId(), "" + this.getTerminalDevId(), "" + this.getUserId(), "" + this.getState(),"" + this.getAbnormal()};
	}
}
