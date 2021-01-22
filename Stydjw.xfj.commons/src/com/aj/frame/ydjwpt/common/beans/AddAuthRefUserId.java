package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**  
 * @Title:  新增发机预授权单据和用户关联表
 * @Description:新增发机预授权单据和用户关联表
 * @author: chenzhirong  
 * @date:2020-8-18 17:08:13
 * @version V1.0
 */  
public class AddAuthRefUserId extends AJFrameNamedBeanAbstract {


    /**
	 * 
	 */
	private static final long serialVersionUID = 4751996369798569716L;
	/**
     *  主键
     */
	private Long objId;
    /**
     *  授权ID
     */
	private Long authorId;
    /**
     *  用户ID
     */
	private Long userId;
    /**
     *  登录状态  0 未登陆；1 已登陆
     */
	private Long loginState;
    /**
     *  创建时间
     */
	private Date createtime;
    /**
     *  删除标记，0 未删除，1 已删除
     */
	private Byte state;
	/**
	 * 身份证号码
	 */
	private String cardSn;
	/**
	 * 手机号码
	 */
	private String phoneNum;
	/**
	 * SIM卡串号
	 */
	private String simNum;
	/**
	 * sim卡ID
	 */
	private Long simId;
	
	public Long getSimId() {
		return simId;
	}
	public void setSimId(Long simId) {
		this.simId = simId;
	}

	//扩展对象 
	private UserExt userExt;//用户信息
	private SimCard simCard;//sim卡信息
	
	public SimCard getSimCard() {
		return simCard;
	}
	public void setSimCard(SimCard simCard) {
		this.simCard = simCard;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getSimNum() {
		return simNum;
	}
	public void setSimNum(String simNum) {
		this.simNum = simNum;
	}
	public UserExt getUserExt() {
		return userExt;
	}
	public void setUserExt(UserExt userExt) {
		this.userExt = userExt;
	}
	public String getCardSn() {
		return cardSn;
	}
	public void setCardSn(String cardSn) {
		this.cardSn = cardSn;
	}
	public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }	
	public Long getAuthorId(){
        return this.authorId;
    }
    public void setAuthorId(Long authorId){
        this.authorId = authorId;
    }	
	public Long getUserId(){
        return this.userId;
    }
    public void setUserId(Long userId){
        this.userId = userId;
    }	
	public Long getLoginState() {
		return loginState;
	}
	public void setLoginState(Long loginState) {
		this.loginState = loginState;
	}
	public Date getCreatetime(){
        return this.createtime;
    }
    public void setCreatetime(Date createtime){
        this.createtime = createtime;
    }	
	public Byte getState(){
        return this.state;
    }
    public void setState(Byte state){
        this.state = state;
    }

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}