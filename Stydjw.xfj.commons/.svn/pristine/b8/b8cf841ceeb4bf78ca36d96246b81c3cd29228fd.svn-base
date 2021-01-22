package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * MyFavorites entity. @author MyEclipse Persistence Tools
 */
public class MyFavorites extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 2821610910839248929L;
	// Fields
	private Long objId;
	/**
	 * 收藏类型 1-人；2-车；3-案件
	 */
	private Long favoryType;
	/**
	 * 收藏目标对象ID，收藏的人、车、案对象的主键ID
	 */
	private Long targetId;
	/**
	 * 收藏人ID
	 */
	private Long userId;
	/**
	 * 收藏时间
	 */
	private Date favoryTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public MyFavorites() {
	}
	public MyFavorites(User user) {
		this.userId = user.getObjId();
	}
	public MyFavorites(UserExt user) {
		this.userId = user.getObjId();
	}
	/** full constructor */
	public MyFavorites(Long favoryType, Long targetId, Long userId,
			Date favoryTime, Byte state) {
		this.favoryType = favoryType;
		this.targetId = targetId;
		this.userId = userId;
		this.favoryTime = favoryTime;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getFavoryType() {
		return this.favoryType;
	}
	public void setFavoryType(Long favoryType) {
		this.favoryType = favoryType;
	}
	public Long getTargetId() {
		return this.targetId;
	}
	public void setTargetId(Long targetId) {
		this.targetId = targetId;
	}
	public Long getUserId() {
		return this.userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getFavoryTime() {
		return this.favoryTime;
	}
	public void setFavoryTime(Date favoryTime) {
		this.favoryTime = favoryTime;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getUserId(), "" + this.getTargetId(), "" + this.getFavoryType()};
	}
}
