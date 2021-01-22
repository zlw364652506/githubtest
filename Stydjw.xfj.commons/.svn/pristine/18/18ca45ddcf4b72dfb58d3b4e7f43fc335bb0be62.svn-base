package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;

import com.aj.frame.beans.AJFile;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;

 /**  
 * @Title: 终端首页附件信息
 * @Description:
 * @author: liuling
 * @date:2018-11-22 9:06:10
 * @version V1.0
 */  
public class AppIndexPageAttachment extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 7247687464206451266L;

	/**
     *   主键
     */
    private Long objId;
    /**
     *  配置主键
     */
	private Long configId;
    /**
     *  配置类型，1-主要信息；2-广告图片；
     */
	private Byte configType;
    /**
     *  名称
     */
	private String attName;
    /**
     *  链接类型，1-应用类型地址；2-互联网类型地址；
     */
	private Byte urlType;
    /**
     *  链接
     */
	private String url;
    /**
     *  文件地址
     */
	private String fileAddress;
    /**
     *  停留时间，单位（秒）
     */
	private Integer waitTime;
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
	 * 创建人主键
	 */
	private Long createUserId;
	/**
	 * 时间戳
	 */
	private Long timestamps;
    /**
     *  状态 0-失效；1-正常；
     */
	private Byte state;

	//扩展属性
	/**
	 * 附件文件
	 */
	private AJFile ajFile;

    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Long getConfigId() {
		return configId;
	}
	public void setConfigId(Long configId) {
		this.configId = configId;
	}
	public Byte getConfigType() {
		return configType;
	}
	public void setConfigType(Byte configType) {
		this.configType = configType;
	}
	public String getAttName() {
		return attName;
	}
	public void setAttName(String attName) {
		this.attName = attName;
	}
	public Byte getUrlType() {
		return urlType;
	}
	public void setUrlType(Byte urlType) {
		this.urlType = urlType;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getFileAddress() {
		return fileAddress;
	}
	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}
	public Integer getWaitTime() {
		return waitTime;
	}
	public void setWaitTime(Integer waitTime) {
		this.waitTime = waitTime;
	}
	public Long getCanSkip() {
		return canSkip;
	}
	public void setCanSkip(Long canSkip) {
		this.canSkip = canSkip;
	}
	public Long getOrderIndex() {
		return orderIndex;
	}
	public void setOrderIndex(Long orderIndex) {
		this.orderIndex = orderIndex;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	public Long getTimestamps() {
		return timestamps;
	}
	public void setTimestamps(Long timestamps) {
		this.timestamps = timestamps;
	}
	public Byte getState() {
		return state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public AJFile getAjFile() {
		return ajFile;
	}
	public void setAjFile(AJFile ajFile) {
		this.ajFile = ajFile;
	}
	@Override
    public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}