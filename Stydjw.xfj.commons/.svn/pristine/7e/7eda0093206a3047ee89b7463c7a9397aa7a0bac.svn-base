package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * MobileTerminalDev entity. @author MyEclipse Persistence Tools
 */
public class MobileTerminalDev extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -7678836336158729070L;
	private Long objId;
	/**
	 * 机型_主键
	 */
	private Long devTypeId;
	/**
	 * 串号
	 */
	private String imei;
	/**
	 * 操作系统版本号，操作系统的纯数字完整版本号
	 */
	private String osVersion;
	/**
	 * 创建时间
	 */
	private Date createtime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	//扩展对象
	private GpsInfo gpsInfo;
	private DevType devType;
	// Constructors
	/** default constructor */
	public MobileTerminalDev() {
	}
	public MobileTerminalDev(String imei) {
		this.imei = imei;
	}
	public MobileTerminalDev(String imei, String osVersion) {
		this.imei = imei;
		this.osVersion = osVersion;
	}
	/** minimal constructor */
	public MobileTerminalDev(String imei, String osVersion,
			Date createtime, Byte state) {
		this.imei = imei;
		this.osVersion = osVersion;
		this.createtime = createtime;
		this.state = state;
	}
	/** full constructor */
	public MobileTerminalDev(Long devTypeId, String imei, String osVersion,
			Date createtime, Byte state) {
		this.devTypeId = devTypeId;
		this.imei = imei;
		this.osVersion = osVersion;
		this.createtime = createtime;
		this.state = state;
	}
	public MobileTerminalDev(Long objId) {
		this.objId = objId;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getDevTypeId() {
		return this.devTypeId;
	}
	public void setDevTypeId(Long devTypeId) {
		this.devTypeId = devTypeId;
	}
	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}
	public String getOsVersion() {
		return this.osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public Date getCreatetime() {
		return this.createtime;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	public DevType getDevType() {
		return devType;
	}
	public void setDevType(DevType devType) {
		this.devType = devType;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public GpsInfo getGpsInfo() {
		return gpsInfo;
	}
	public void setGpsInfo(GpsInfo gpsInfo) {
		this.gpsInfo = gpsInfo;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getImei(), this.getOsVersion()};
	}
}
