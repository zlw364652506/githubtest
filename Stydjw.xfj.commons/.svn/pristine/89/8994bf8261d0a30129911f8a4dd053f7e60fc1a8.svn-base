package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**  
 * @Title:  责任民警
 * @Description:责任民警
 * @author: chenzhirong
 * @date:2020-9-24 15:07:04
 * @version V1.0
 */  
public class ResponsiblePolice extends AJFrameNamedBeanAbstract {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     *   主键
     */
    private Long objId;

    /**
     *  责任民警警号
     */
	private String jh;
    /**
     *  责任民警姓名
     */
	private String name;
    /**
     *  责任民警电话
     */
	private String tel;
    /**
     *  状态
     */
	private Byte state;
    /**
     *  创建时间
     */
	private Date createTime;
    /**
     *  更新时间
     */
	private Date updateTime;
    /**
     *  身份证号码
     */
	private String card;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public String getJh(){
        return this.jh;
    }
    public void setJh(String jh){
        this.jh = jh;
    }	
	public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }	
	public String getTel(){
        return this.tel;
    }
    public void setTel(String tel){
        this.tel = tel;
    }	
	public Byte getState(){
        return this.state;
    }
    public void setState(Byte state){
        this.state = state;
    }
	public Date getCreateTime(){
        return this.createTime;
    }
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }	
	public Date getUpdateTime(){
        return this.updateTime;
    }
    public void setUpdateTime(Date updateTime){
        this.updateTime = updateTime;
    }	
	public String getCard(){
        return this.card;
    }
    public void setCard(String card){
        this.card = card;
    }	

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}