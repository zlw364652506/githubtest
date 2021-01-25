package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.util.List;
import java.lang.Long;
import java.lang.Integer;

/**
 * @Title: 终端首页配置
 * @Description:
 * @author: liuling
 * @date:2018-11-22 9:06:10
 * @version V1.0
 */
public class AppIndexPageConfig extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = -5296557236808731664L;
	
	/**
	 * 主键
	 */
	private Long objId;
	/**
	 * 地区主键
	 */
	private Long areaId;
	/**
	 * 名称
	 */
	private String configName;
	/**
	 * 背景色值
	 */
	private String colourValue;
	/**
	 * 轮播间隔时间
	 */
	private Integer loopIntervalTime;
	/**
	 * 创建人主键
	 */
	private Long createUserId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 时间戳
	 */
	private Long timestamps;
	/**
	 * 状态
	 */
	private Byte state;

	// 扩展属性
	/**
	 * 启动页图片信息列表
	 */
	private List<AppIndexPageAttachment> attachments;

	/**
	 * 地区对象
	 */
	private Area area;

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public String getConfigName() {
		return configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
	}

	public String getColourValue() {
		return colourValue;
	}

	public void setColourValue(String colourValue) {
		this.colourValue = colourValue;
	}
	public Integer getLoopIntervalTime() {
		return loopIntervalTime;
	}

	public void setLoopIntervalTime(Integer loopIntervalTime) {
		this.loopIntervalTime = loopIntervalTime;
	}

	public Long getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public List<AppIndexPageAttachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<AppIndexPageAttachment> attachments) {
		this.attachments = attachments;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId() };
	}
}