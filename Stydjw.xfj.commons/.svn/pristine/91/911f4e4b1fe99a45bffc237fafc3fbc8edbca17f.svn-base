package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * UserDownAppRecord entity. @author MyEclipse Persistence Tools
 */
public class UserDownAppRecord extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -3215860905471524802L;
	// Fields
	private Long objId;
	/**
	 * 下载用户ID
	 */
	private Long userId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	/**
	 * 移动终端设备主键
	 */
	private Long terminalId;
	/**
	 * 下载请求时间
	 */
	private Date requestTime;
	/**
	 * 下载完成时间
	 */
	private Date finishTime;
	// Constructors
	/** default constructor */
	public UserDownAppRecord() {
	}
	/** full constructor */
	public UserDownAppRecord(Long userId, Long appVersionId,
			Date requestTime, Date finishTime) {
		this.userId = userId;
		this.appVersionId = appVersionId;
		this.requestTime = requestTime;
		this.finishTime = finishTime;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getAppVersionId() {
		return this.appVersionId;
	}
	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}
	public Date getRequestTime() {
		return this.requestTime;
	}
	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}
	public Date getFinishTime() {
		return this.finishTime;
	}
	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}
	public Long getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(Long terminalId) {
		this.terminalId = terminalId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(), "" + this.getUserId()};
	}
}
