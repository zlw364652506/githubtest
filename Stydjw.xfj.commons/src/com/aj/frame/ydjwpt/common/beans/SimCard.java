package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * SimCard entity. @author MyEclipse Persistence Tools
 */
public class SimCard extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -2159778871318181575L;
	private Long objId;
	/**
	 * 发机名单主键
	 */
	private Long batchId;
	/**
	 * 电话号码
	 */
	private String phoneNum;
	/**
	 * sim卡号（imsi）
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
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * SIM卡ICCID
	 */
	private String iccid;
	/**
	 * 手机号归属地
	 */
	private String belongTo;
	
	//扩展对象
	private Batch batch;
	// Constructors
	/** default constructor */
	public SimCard() {
	}
	public SimCard(String simNum) {
		this.simNum = simNum;
	}
	/** minimal constructor */
	public SimCard(Long batchId, String phoneNum, String simNum,
			String operator, Date createTime, Byte state) {
		this.batchId = batchId;
		this.phoneNum = phoneNum;
		this.simNum = simNum;
		this.operator = operator;
		this.createTime = createTime;
		this.state = state;
	}
	/** full constructor */
	public SimCard(Long batchId, String phoneNum, String simNum,
			String operator, String idCard, Date createTime, Byte state) {
		this.batchId = batchId;
		this.phoneNum = phoneNum;
		this.simNum = simNum;
		this.operator = operator;
		this.idCard = idCard;
		this.createTime = createTime;
		this.state = state;
	}
	// Property accessors
	public SimCard(Batch batch) {
		this.batchId = batch.getObjId();
	}
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getBatchId() {
		return this.batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
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
	public Batch getBatch() {
		return batch;
	}
	public void setBatch(Batch batch) {
		this.batch = batch;
	}
	public String getIccid() {
		return iccid;
	}
	public void setIccid(String iccid) {
		this.iccid = iccid;
	}
	public String getBelongTo() {
		return belongTo;
	}
	public void setBelongTo(String belongTo) {
		this.belongTo = belongTo;
	}
	@Override
	public String[] importantFieldValues() {
		// TODO Auto-generated method stub
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getSimNum(), this.getPhoneNum()};
	}
}
