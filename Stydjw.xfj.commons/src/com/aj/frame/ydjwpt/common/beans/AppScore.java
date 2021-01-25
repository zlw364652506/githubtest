package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * AppScore entity. @author MyEclipse Persistence Tools
 */
public class AppScore extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 6228302129346897402L;
	
	// Fields
	private Long objId;
	/**
	 * app_主键
	 */
	private Long appId;
	/**
	 * 评论人
	 */
	private Long userId;
	/**
	 * 星数
	 */
	private Byte starCount;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public AppScore() {
	}
	/** full constructor */
	public AppScore(Long appId, Long userId, Byte starCount, Byte state) {
		this.appId = appId;
		this.userId = userId;
		this.starCount = starCount;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getAppId() {
		return this.appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Byte getStarCount() {
		return this.starCount;
	}
	public void setStarCount(Byte starCount) {
		this.starCount = starCount;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppId(), "" + this.getUserId()};
	}
}
