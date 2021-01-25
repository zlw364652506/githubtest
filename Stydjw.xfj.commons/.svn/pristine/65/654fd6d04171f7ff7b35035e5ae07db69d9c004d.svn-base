package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * GpsInfo entity. @author MyEclipse Persistence Tools
 */
public class GpsInfo extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -8617541716585175010L;
	private Long objId;
	/**
	 * 经度
	 */
	private Double longitude;
	/**
	 * 纬度
	 */
	private Double latitude;
	/**
	 * 海拔高度
	 */
	private Double altitude;
	/**
	 * 终端设备ID
	 */
	private Long deviceId;
	/**
	 * 操作人ID
	 */
	private Long optUserId;
	/**
	 * 终端设备所有者用户ID
	 */
	private Long ownerUserId;
	/**
	 * 终端采集时间
	 */
	private Date gatherTime;
	/**
	 * 服务端接收时间
	 */
	private Date receiveTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// Constructors
	/** default constructor */
	public GpsInfo() {
	}
	/** minimal constructor */
	public GpsInfo(Double longitude, Double latitude, Long deviceId,
			Date gatherTime, Date receiveTime, Byte state) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.deviceId = deviceId;
		this.gatherTime = gatherTime;
		this.receiveTime = receiveTime;
		this.state = state;
	}
	/** full constructor */
	public GpsInfo(Double longitude, Double latitude, Double altitude,
			Long deviceId, Long optUserId, Long ownerUserId, Date gatherTime,
			Date receiveTime, Byte state) {
		this.longitude = longitude;
		this.latitude = latitude;
		this.altitude = altitude;
		this.deviceId = deviceId;
		this.optUserId = optUserId;
		this.ownerUserId = ownerUserId;
		this.gatherTime = gatherTime;
		this.receiveTime = receiveTime;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Double getLongitude() {
		return this.longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return this.latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getAltitude() {
		return this.altitude;
	}
	public void setAltitude(Double altitude) {
		this.altitude = altitude;
	}
	public Long getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}
	public Long getOptUserId() {
		return this.optUserId;
	}
	public void setOptUserId(Long optUserId) {
		this.optUserId = optUserId;
	}
	public Long getOwnerUserId() {
		return this.ownerUserId;
	}
	public void setOwnerUserId(Long ownerUserId) {
		this.ownerUserId = ownerUserId;
	}
	public Date getGatherTime() {
		return this.gatherTime;
	}
	public void setGatherTime(Date gatherTime) {
		this.gatherTime = gatherTime;
	}
	public Date getReceiveTime() {
		return this.receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getDeviceId(), "" + this.getLongitude(), "" + this.getLatitude()};
	}
}
