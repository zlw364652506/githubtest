package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * NoticeInfoRecord entity. @author MyEclipse Persistence Tools
 */
public class NoticeInfoRecord extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -4221474780574266852L;
	private Long objId;
	/**
	 * 通知消息ID
	 */
	private Long noticeId;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 接收者
	 */
	private Long receiverId;
	/**
	 * 接收时间
	 */
	private Date receiveTime;
	/**
	 * 查看时间
	 */
	private Date readTime;
	/**
	 * 记录生成时间
	 */
	private Date createTime;
	/**
	 * 消息通知业务类型，0-默认系统非业务类通知；1-APP意见反馈；2-APP意见反馈回复；3-开发者账户申请待审核；4-新发APP申请待审核；5-更新APP申请待审核；6-新发app申请评测；7-更新app申请评测；8-开发者帐号审核通过；9-新发app申请审核通过；10-新发app申请审核未通过；11-更新app申请审核通过；12-更新app申请审核未通过；13-新发/更新app申请评测未通过；14-调用的基础服务被停用；15-平台管理员下架APP；16-平台管理员撤回版本；17-用户设备授权记录待授权；18-终端共享用户待授权；
	 */
	private Byte busType;
	/**
	 * 是否查看 0-未查看；1-已查看；
	 */
	private Boolean readed;
	/**
	 * 是否接收 0-未接收；1-已接收；
	 */
	private Boolean received;
	/**
	 * 重要级别 1- 一般消息；2-保密消息
	 */
	private Byte importLevel;
	/**
	 * 群发主键ID
	 */
	private Long groupId;
	
	//扩展对象
	private UserExt receiver;
	private NoticeInfo noticeInfo;
	// Constructors
	/** default constructor */
	public NoticeInfoRecord() {
	}
	public NoticeInfoRecord(Byte busType) {
		this.busType = busType;
	}
	public NoticeInfoRecord(User receiver) {
		this.receiverId = receiver.getObjId();
	}
	public NoticeInfoRecord(UserExt receiver) {
		this.receiverId = receiver.getObjId();
	}
	/** minimal constructor */
	public NoticeInfoRecord(Long noticeId, Byte state,
			Long receiverId, Date createTime, Byte busType) {
		this.noticeId = noticeId;
		this.state = state;
		this.receiverId = receiverId;
		this.createTime = createTime;
		this.busType = busType;
	}
	/** full constructor */
	public NoticeInfoRecord(Long noticeId, Byte state,
			Long receiverId, Date receiveTime, Date readTime,
			Date createTime, Byte busType) {
		this.noticeId = noticeId;
		this.state = state;
		this.receiverId = receiverId;
		this.receiveTime = receiveTime;
		this.readTime = readTime;
		this.createTime = createTime;
		this.busType = busType;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getNoticeId() {
		return this.noticeId;
	}
	public void setNoticeId(Long noticeId) {
		this.noticeId = noticeId;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public Long getReceiverId() {
		return this.receiverId;
	}
	public void setReceiverId(Long receiverId) {
		this.receiverId = receiverId;
	}
	public Date getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
	public Date getReadTime() {
		return this.readTime;
	}
	public void setReadTime(Date readTime) {
		this.readTime = readTime;
	}
	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Byte getBusType() {
		return this.busType;
	}
	public void setBusType(Byte busType) {
		this.busType = busType;
	}
	public Boolean getReaded() {
		return readed;
	}
	public void setReaded(Boolean readed) {
		this.readed = readed;
	}
	public Boolean getReceived() {
		return received;
	}
	public void setReceived(Boolean received) {
		this.received = received;
	}
	public Byte getImportLevel() {
		return importLevel;
	}
	public void setImportLevel(Byte importLevel) {
		this.importLevel = importLevel;
	}
	public UserExt getReceiver() {
		return receiver;
	}
	public void setReceiver(UserExt receiver) {
		this.receiver = receiver;
	}
	public NoticeInfo getNoticeInfo() {
		return noticeInfo;
	}
	public void setNoticeInfo(NoticeInfo noticeInfo) {
		this.noticeInfo = noticeInfo;
	}
	public Long getGroupId() {
		return groupId;
	}
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getNoticeId(), "" + this.getReceiverId()};
	}
}
