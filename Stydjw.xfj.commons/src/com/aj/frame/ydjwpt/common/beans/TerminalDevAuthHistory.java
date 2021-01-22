package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * TerminalDevAuthHistory entity. @author MyEclipse Persistence Tools
 */
public class TerminalDevAuthHistory extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 1053538532235326550L;
	// Fields
	private Long objId;
	/**
	 * 手机卡ID
	 */
	private Long simId;
	/**
	 * 电话号码
	 */
	private String phoneNum;
	/**
	 * sim卡号
	 */
	private String simNum;
	/**
	 * 运营商代码，只允许指定唯一的运营上代码
	 */
	private String operator;
	/**
	 * 身份证号码
	 */
	private String idCard;
	/**
	 * 终端ID
	 */
	private Long deviceId;
	/**
	 * 终端串号
	 */
	private String imei;
	/**
	 * 操作系统版本号，操作系统的纯数字完整版本号
	 */
	private String osVersion;
	/**
	 * 操作系统名称，预定义的规范名称
	 */
	private String osName;
	/**
	 * 厂商
	 */
	private String brand;
	/**
	 * 型号名称，如：荣耀
	 */
	private String modelName;
	/**
	 * 型号编号，与从物理机器上提取的型号内容一致
	 */
	private String modelSn;
	/**
	 * 发机批次ID
	 */
	private Long batchId;
	/**
	 * 加密卡ID
	 */
	private Long encryptionCardId;
	/**
	 * 加密的的物理串号
	 */
	private String tfSn;
	/**
	 * 加密卡的认证识别串号
	 */
	private String tfAuthSn;
	/**
	 * 证书编号
	 */
	private String tfCertSn;
	/**
	 * 用户ID
	 */
	private Long userId;
	/**
	 * 用户名，是首选登入标识性属性，在具有相同应用编号的有效记录范围内应保持唯一性。
	 */
	private String userName;
	/**
	 * 用户真实姓名
	 */
	private String userRealName;
	/**
	 * 用户注册电话号码
	 */
	private String userTel;
	/**
	 * 用户昵称
	 */
	private String userNick;
	/**
	 * 部门名称
	 */
	private String deptCode;
	/**
	 * 部门代码
	 */
	private String deptName;
	/**
	 * 授权对象ID
	 */
	private Long deviceAuthId;
	/**
	 * 变更时间
	 */
	private Date updateTime;
	/**
	 * 变更前的授权状态
	 */
	private Byte oldAuthState;
	/**
	 * 变更后的授权状态
	 */
	private Byte newAuthSatte;
	/**
	 * 操作人ID
	 */
	private Long operateUserId;
	/**
	 * 操作人用户名
	 */
	private String operateUserName;
	/**
	 * 操作人名称
	 */
	private String operateRealName;
	/**
	 * 操作人所属部门名称
	 */
	private String operateDeptName;
	/**
	 * 操作人所属部门代码
	 */
	private String operateDeptCode;
	/**
	 * 记录状态，0 - 逻辑删除；1 - 正常；
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public TerminalDevAuthHistory() {
	}
	/** minimal constructor */
	public TerminalDevAuthHistory(Date updateTime, Byte oldAuthState,
			Byte newAuthSatte, Long operateUserId, String operateUserName,
			Byte state) {
		this.updateTime = updateTime;
		this.oldAuthState = oldAuthState;
		this.newAuthSatte = newAuthSatte;
		this.operateUserId = operateUserId;
		this.operateUserName = operateUserName;
		this.state = state;
	}
	/** full constructor */
	public TerminalDevAuthHistory(Long simId, String phoneNum, String simNum,
			String operator, String idCard, Long deviceId, String imei,
			String osVersion, String osName, String brand, String modelName,
			String modelSn, Long batchId, Long encryptionCardId, String tfSn,
			String authSn, String certSn, Long userId, String userName,
			String userRealName, String userTel, String userNick,
			String deptCode, String deptName, Long deviceAuthId,
			Date updateTime, Byte oldAuthState, Byte newAuthSatte,
			Long operateUserId, String operateUserName, String operateRealName,
			String operateDeptName, String operateDeptCode, Byte state) {
		this.simId = simId;
		this.phoneNum = phoneNum;
		this.simNum = simNum;
		this.operator = operator;
		this.idCard = idCard;
		this.deviceId = deviceId;
		this.imei = imei;
		this.osVersion = osVersion;
		this.osName = osName;
		this.brand = brand;
		this.modelName = modelName;
		this.modelSn = modelSn;
		this.batchId = batchId;
		this.encryptionCardId = encryptionCardId;
		this.tfSn = tfSn;
		this.tfAuthSn = authSn;
		this.tfCertSn = certSn;
		this.userId = userId;
		this.userName = userName;
		this.userRealName = userRealName;
		this.userTel = userTel;
		this.userNick = userNick;
		this.deptCode = deptCode;
		this.deptName = deptName;
		this.deviceAuthId = deviceAuthId;
		this.updateTime = updateTime;
		this.oldAuthState = oldAuthState;
		this.newAuthSatte = newAuthSatte;
		this.operateUserId = operateUserId;
		this.operateUserName = operateUserName;
		this.operateRealName = operateRealName;
		this.operateDeptName = operateDeptName;
		this.operateDeptCode = operateDeptCode;
		this.state = state;
	}
	// Property accessors
	public TerminalDevAuthHistory(User user) {
		this.userId = user.getObjId();
		this.userName = user.getUserName();
	}
	public TerminalDevAuthHistory(TerminalDevAuth auth) {
		this.deviceAuthId = auth.getObjId();
	}
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getSimId() {
		return this.simId;
	}
	public void setSimId(Long simId) {
		this.simId = simId;
	}
	public String getPhoneNum() {
		return this.phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getSimNum() {
		return this.simNum;
	}
	public void setSimNum(String simNum) {
		this.simNum = simNum;
	}
	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public String getIdCard() {
		return this.idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Long getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}
	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getOsVersion() {
		return this.osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getOsName() {
		return this.osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelSn() {
		return this.modelSn;
	}
	public void setModelSn(String modelSn) {
		this.modelSn = modelSn;
	}
	public Long getBatchId() {
		return this.batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public Long getEncryptionCardId() {
		return this.encryptionCardId;
	}
	public void setEncryptionCardId(Long encryptionCardId) {
		this.encryptionCardId = encryptionCardId;
	}
	public String getTfSn() {
		return this.tfSn;
	}
	public void setTfSn(String tfSn) {
		this.tfSn = tfSn;
	}
	public String getTfAuthSn() {
		return this.tfAuthSn;
	}
	public void setTfAuthSn(String tfAuthSn) {
		this.tfAuthSn = tfAuthSn;
	}
	public String getTfCertSn() {
		return this.tfCertSn;
	}
	public void setTfCertSn(String certSn) {
		this.tfCertSn = certSn;
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserRealName() {
		return this.userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	public String getUserTel() {
		return this.userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserNick() {
		return this.userNick;
	}
	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getDeptCode() {
		return this.deptCode;
	}
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return this.deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Long getDeviceAuthId() {
		return this.deviceAuthId;
	}
	public void setDeviceAuthId(Long deviceAuthId) {
		this.deviceAuthId = deviceAuthId;
	}
	public Date getUpdateTime() {
		return this.updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Byte getOldAuthState() {
		return this.oldAuthState;
	}
	public void setOldAuthState(Byte oldAuthState) {
		this.oldAuthState = oldAuthState;
	}
	public Byte getNewAuthSatte() {
		return this.newAuthSatte;
	}
	public void setNewAuthSatte(Byte newAuthSatte) {
		this.newAuthSatte = newAuthSatte;
	}
	public Long getOperateUserId() {
		return this.operateUserId;
	}
	public void setOperateUserId(Long operateUserId) {
		this.operateUserId = operateUserId;
	}
	public String getOperateUserName() {
		return this.operateUserName;
	}
	public void setOperateUserName(String operateUserName) {
		this.operateUserName = operateUserName;
	}
	public String getOperateRealName() {
		return this.operateRealName;
	}
	public void setOperateRealName(String operateRealName) {
		this.operateRealName = operateRealName;
	}
	public String getOperateDeptName() {
		return this.operateDeptName;
	}
	public void setOperateDeptName(String operateDeptName) {
		this.operateDeptName = operateDeptName;
	}
	public String getOperateDeptCode() {
		return this.operateDeptCode;
	}
	public void setOperateDeptCode(String operateDeptCode) {
		this.operateDeptCode = operateDeptCode;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getOperateUserName(), "" + this.getOldAuthState(), "" + this.getNewAuthSatte()};
	}
}
