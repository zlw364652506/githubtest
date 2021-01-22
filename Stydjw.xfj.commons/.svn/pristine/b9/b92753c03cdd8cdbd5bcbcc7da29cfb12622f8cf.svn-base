package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.lang.Long;

 /**  
 * @Title:  附件信息
 * @Description:附件信息
 * @author: chenzhirong  
 * @date:2017-11-7 9:06:46
 * @version V1.0
 */  
public class AttachInfo extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 5198720610214730274L;

	/**
     *   主键
     */
    private Long objId;

    /**
     *  关联主键
     */
	private Long relationId;
    /**
     *  关联业务类型，1-启动项；
     */
	private Long businessType;
    /**
     *  附件名称
     */
	private String attName;
    /**
     *  附件后缀
     */
	private String attSuffix;
    /**
     *  附件类型，1--图片；2-声音；3-视频；4-文件；
     */
	private Long attType;
    /**
     *  附件缩略图
     */
	private byte[] thumb;
    /**
     *  附件内容
     */
	private byte[] content;
    /**
     *  设置附件失效日期，格式：yyyy-MM-dd
     */
	private Date invalidDate;
    /**
     *  创建时间
     */
	private Date createTime;
    /**
     *  状态， 0-失效；1-正常；
     */
	private Byte state;
    /**
     *  备注
     */
	private String remark;
	/**
	 * 资源URL
	 */
	private String resourceUrl;
	/**
	 * 最后操作时间
	 */
	private Date lastOptTime;

    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Long getRelationId(){
        return this.relationId;
    }
    public void setRelationId(Long relationId){
        this.relationId = relationId;
    }	
	public Long getBusinessType(){
        return this.businessType;
    }
    public void setBusinessType(Long businessType){
        this.businessType = businessType;
    }	
	public String getAttName(){
        return this.attName;
    }
    public void setAttName(String attName){
        this.attName = attName;
    }	
	public String getAttSuffix(){
        return this.attSuffix;
    }
    public void setAttSuffix(String attSuffix){
        this.attSuffix = attSuffix;
    }	
	public Long getAttType(){
        return this.attType;
    }
    public void setAttType(Long attType){
        this.attType = attType;
    }	
	public byte[] getThumb(){
        return this.thumb;
    }
    public void setThumb(byte[] thumb){
        this.thumb = thumb;
    }	
	public byte[] getContent(){
        return this.content;
    }
    public void setContent(byte[] content){
        this.content = content;
    }	
	public Date getInvalidDate(){
        return this.invalidDate;
    }
    public void setInvalidDate(Date invalidDate){
        this.invalidDate = invalidDate;
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
	public String getRemark(){
        return this.remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
    }
    public String getResourceUrl() {
		return resourceUrl;
	}
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	public Date getLastOptTime() {
		return lastOptTime;
	}
	public void setLastOptTime(Date lastOptTime) {
		this.lastOptTime = lastOptTime;
	}
	@Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}