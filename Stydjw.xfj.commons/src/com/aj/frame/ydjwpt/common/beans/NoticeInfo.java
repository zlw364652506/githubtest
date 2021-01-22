package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * NoticeInfo entity. @author MyEclipse Persistence Tools
 */
public class NoticeInfo extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 6469173386785016058L;
	private Long objId;
	/**
	 * 标题
	 */
	private String title;
	/**
	 * 内容
	 */
	private String info;
	private byte[] attData;
	/**
	 * 本地资源URL
	 */
	private String resourceUrl;
	/**
	 * 发布时间
	 */
	private Date createTime;
	/**
	 * 发送
	 */
	private Long senderId;
	/**
	 * 总发送人数
	 */
	private Long sentCount;
	/**
	 * 已接收人数
	 */
	private Long receivedCount;
	/**
	 * 已阅读人数
	 */
	private Long readedCount;
	/**
	 * 重要级别 1- 一般消息；2-保密消息
	 */
	private Byte importLevel;//重要级别 1- 一般消息；2-保密消息
	/**
	 * 附件类型，区分本消息体中的附件类型 1-图片；2-语音；
	 */
	private Integer attType;//附件类型，区分本消息体中的附件类型 1-图片；2-语音；
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 消息通知业务类型，0-默认系统非业务类通知；1-APP意见反馈；2-APP意见反馈回复；3-开发者账户申请待审核；4-新发APP申请待审核；5-更新APP申请待审核；6-新发app申请评测；7-更新app申请评测；8-开发者帐号审核通过；9-新发app申请审核通过；10-新发app申请审核未通过；11-更新app申请审核通过；12-更新app申请审核未通过；13-新发/更新app申请评测未通过；14-调用的基础服务被停用；15-平台管理员下架APP；16-平台管理员撤回版本；17-用户设备授权记录待授权；18-终端共享用户待授权；
	 */
	private Byte busType;
	// Constructors
	// 扩展属性
	private User sender;
	public User getSender() {
		return sender;
	}
	public void setSender(User sender) {
		this.sender = sender;
	}
	/** default constructor */
	public NoticeInfo() {
	}
	public NoticeInfo(Byte state) {
		this.state = state;
	}
	public NoticeInfo(User sender) {
		this.senderId = sender.getObjId();
	}
	public NoticeInfo(UserExt sender) {
		this.senderId = sender.getObjId();
	}
	/** minimal constructor */
	public NoticeInfo(String info, Date createTime, Long senderId,
			Byte importLevel, Byte state) {
		this.info = info;
		this.createTime = createTime;
		this.senderId = senderId;
		this.importLevel = importLevel;
		this.state = state;
	}
	/** full constructor */
	public NoticeInfo(String title, String info, byte[] attData,
			Date createTime, Long senderId, Long sentCount,
			Long receivedCount, Long readedCount,
			Byte importLevel, Integer attType, Byte state) {
		this.title = title;
		this.info = info;
		this.attData = attData;
		this.createTime = createTime;
		this.senderId = senderId;
		this.sentCount = sentCount;
		this.receivedCount = receivedCount;
		this.readedCount = readedCount;
		this.importLevel = importLevel;
		this.attType = attType;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfo() {
		return this.info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public byte[] getAttData() {
		return this.attData;
	}
	public void setAttData(byte[] attData) {
		this.attData = attData;
	}
	public String getResourceUrl() {
		return resourceUrl;
	}
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getSenderId() {
		return this.senderId;
	}
	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}
	public Long getSentCount() {
		return this.sentCount;
	}
	public void setSentCount(Long sentCount) {
		this.sentCount = sentCount;
	}
	public Long getReceivedCount() {
		return this.receivedCount;
	}
	public void setReceivedCount(Long receivedCount) {
		this.receivedCount = receivedCount;
	}
	public Long getReadedCount() {
		return this.readedCount;
	}
	public void setReadedCount(Long readedCount) {
		this.readedCount = readedCount;
	}
	public Byte getImportLevel() {
		return this.importLevel;
	}
	public void setImportLevel(Byte importLevel) {
		this.importLevel = importLevel;
	}
	public Integer getAttType() {
		return this.attType;
	}
	public void setAttType(Integer attType) {
		this.attType = attType;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public Byte getBusType() {
		return busType;
	}
	public void setBusType(Byte busType) {
		this.busType = busType;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getSenderId(), this.getTitle()};
	}
}
