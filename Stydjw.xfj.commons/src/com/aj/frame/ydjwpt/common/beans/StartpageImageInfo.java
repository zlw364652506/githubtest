package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

 /**  
 * @Title:  启动页图片信息
 * @Description:启动页图片信息
 * @author: chenzhirong  
 * @date:2017-11-7 9:06:32
 * @version V1.0
 */  
public class StartpageImageInfo extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 2574602309728911721L;

	/**
     *   主键
     */
    private Long objId;

    /**
     *  启动页主键
     */
	private Long startpageId;
    /**
     *  名称
     */
	private String imageName;
    /**
     *  链接
     */
	private String imageUrl;
    /**
     *  停留时间，单位（秒）
     */
	private Long waitTime;
    /**
     *  是否允许跳过，0-否；1-是；
     */
	private Long canSkip;
    /**
     *  显示顺序
     */
	private Long orderIndex;
    /**
     *  创建时间
     */
	private Date createTime;
    /**
     *  状态 0-失效；1-正常；
     */
	private Byte state;

	//扩展属性
    /**
     *  附件信息
     */
	private AttachInfo attachInfo;

    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Long getStartpageId(){
        return this.startpageId;
    }
    public void setStartpageId(Long startpageId){
        this.startpageId = startpageId;
    }	
	public String getImageName(){
        return this.imageName;
    }
    public void setImageName(String imageName){
        this.imageName = imageName;
    }	
	public String getImageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }	
	public Long getWaitTime(){
        return this.waitTime;
    }
    public void setWaitTime(Long waitTime){
        this.waitTime = waitTime;
    }	
	public Long getCanSkip(){
        return this.canSkip;
    }
    public void setCanSkip(Long canSkip){
        this.canSkip = canSkip;
    }	
	public Long getOrderIndex(){
        return this.orderIndex;
    }
    public void setOrderIndex(Long orderIndex){
        this.orderIndex = orderIndex;
    }	
	public Date getCreateTime(){
        return this.createTime;
    }
    public void setCreateTime(Date createTime){
        this.createTime = createTime;
    }	
	public Byte getState(){
        return this.state;
    }
    public void setState(Byte state){
        this.state = state;
    }

    public AttachInfo getAttachInfo() {
		return attachInfo;
	}
	public void setAttachInfo(AttachInfo attachInfo) {
		this.attachInfo = attachInfo;
	}
	@Override
    public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}