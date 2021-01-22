package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * AppComment entity. @author MyEclipse Persistence Tools
 */
public class AppComment extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -547392916385446882L;
	private Long objId;
	/**
	 * app版本主键
	 */
	private Long appVersionId;
	/**
	 * 评论人
	 */
	private Long userId;
	/**
	 * 评论时间
	 */
	private Date commentTime;
	/**
	 * 评论内容
	 */
	private String commentContent;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	//扩展对象
	private AppVersion appVersion;
	private AppScore appScore;
	private User user;
	private UserExt userExt;
	
	public UserExt getUserExt() {
		return userExt;
	}
	public void setUserExt(UserExt userExt) {
		this.userExt = userExt;
	}
	// Constructors
	/** default constructor */
	public AppComment() {
	}
	/** minimal constructor */
	public AppComment(Long appVersionId, Long userId, Date commentTime,
			Byte state) {
		this.appVersionId = appVersionId;
		this.userId = userId;
		this.commentTime = commentTime;
		this.state = state;
	}
	/** full constructor */
	public AppComment(Long appVersionId, Long userId, Date commentTime,
			String commentContent, Byte state) {
		this.appVersionId = appVersionId;
		this.userId = userId;
		this.commentTime = commentTime;
		this.commentContent = commentContent;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getAppVersionId() {
		return this.appVersionId;
	}
	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getCommentTime() {
		return this.commentTime;
	}
	public void setCommentTime(Date commentTime) {
		this.commentTime = commentTime;
	}
	public String getCommentContent() {
		return this.commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public AppVersion getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(AppVersion appVersion) {
		this.appVersion = appVersion;
	}
	public AppScore getAppScore() {
		return appScore;
	}
	public void setAppScore(AppScore appScore) {
		this.appScore = appScore;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(), "" + this.getUserId()};
	}
}
