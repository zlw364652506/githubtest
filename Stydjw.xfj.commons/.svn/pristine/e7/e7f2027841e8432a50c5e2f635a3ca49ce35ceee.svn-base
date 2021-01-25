package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * @Title: 文件实体描述
 * @Description:文件实体表
 * @author: chenzhirong
 * @date:2017-12-21 15:25:44
 * @version V1.0
 */
public class FileDataInfo extends AJFrameNamedBeanAbstract {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8367559221788548161L;

	/**
	 * 主键
	 */
	private Long objId;

	/**
	 * 关联主键ID
	 */
	private Long relObjId;
	/**
	 * 文件MD5码
	 */
	private String md5Code;
	/**
	 * 业务类型，1-APP版本文件；2-APP评测附件文件；3-APP启动页照片；4-通知消息附件；5-实名认证附件；
	 */
	private Long busType;
	/**
	 * 文件描述
	 */
	private String fileDesc;
	/**
	 * 创建人
	 */
	private Long createUserId;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态， 0-失效；1-正常；
	 */
	private Byte state;
	/**
	 * 资源名称
	 */
	private String resourceName;
	/**
	 * 本地资源URL
	 */
	private String resourceUrl;
	/**
	 * 内网资源URL
	 */
	private String intranetResourceUrl;
	/**
	 * 外网资源URL
	 */
	private String outernetResourceUrl;
	/**
	 * 最后操作时间
	 */
	private Date lastOptTime;
	/**
	 * 设置资源失效日期，格式：yyyy-MM-dd
	 */
	private Date invalidDate;
	/**
	 * 资源类型，1--图片；2-声音；3-视频；4-文件；
	 */
	private Long resourceType;
	/**
	 * 备注
	 */
	private String remark;
	
	
	public Long getObjId() {
		return this.objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getRelObjId() {
		return this.relObjId;
	}

	public void setRelObjId(Long relObjId) {
		this.relObjId = relObjId;
	}

	public Long getBusType() {
		return this.busType;
	}

	public void setBusType(Long busType) {
		this.busType = busType;
	}

	public String getFileDesc() {
		return this.fileDesc;
	}

	public void setFileDesc(String fileDesc) {
		this.fileDesc = fileDesc;
	}

	public Long getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Byte getState() {
		return this.state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public String getResourceName() {
		return resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
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

	public String getMd5Code() {
		return md5Code;
	}

	public void setMd5Code(String md5Code) {
		this.md5Code = md5Code;
	}

	public String getIntranetResourceUrl() {
		return intranetResourceUrl;
	}

	public void setIntranetResourceUrl(String intranetResourceUrl) {
		this.intranetResourceUrl = intranetResourceUrl;
	}

	public String getOuternetResourceUrl() {
		return outernetResourceUrl;
	}

	public void setOuternetResourceUrl(String outernetResourceUrl) {
		this.outernetResourceUrl = outernetResourceUrl;
	}

	public Date getInvalidDate() {
		return invalidDate;
	}

	public void setInvalidDate(Date invalidDate) {
		this.invalidDate = invalidDate;
	}

	public Long getResourceType() {
		return resourceType;
	}

	public void setResourceType(Long resourceType) {
		this.resourceType = resourceType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getResourceName(),
				"" + this.getMd5Code(), "" + this.getResourceUrl() };
	}
}