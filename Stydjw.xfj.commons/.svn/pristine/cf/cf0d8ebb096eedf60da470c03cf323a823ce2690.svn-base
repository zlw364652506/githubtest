package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * DevType entity. @author MyEclipse Persistence Tools
 */
public class DevType extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 392702373575461068L;
	
	public final static int ModelSnLength = 30;
	public final static int ModelNameLength = 20;
	
	// Fields
	private Long objId;
	/**
	 * 厂商
	 */
	private String brand;
	/**
	 * 型号名称，如：荣耀
	 */
	private String modelName;
	/**
	 * 型号编号，与从物理机器上提取的型号内容一致
	 */
	private String modelSn;
	/**
	 * 操作系统名称，预定义的规范名称
	 */
	private String osName;
	/**
	 * 操作系统版本号，纯数字的主副版本号，如：4.2
	 */
	private String osVersion;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 状态 0-失效；1-正常但机型未适配；2-正常且机型已适配
	 */
	private Byte state;
	/**
	 * 终端类型ID
	 */
	private Long terminalTypeId;
	
	// Constructors
	/** default constructor */
	public DevType() {
	}
	public DevType(String modelSn) {
		this.modelSn = modelSn;
	}
	/** minimal constructor */
	public DevType(String brand, String modelName, String modelSn,
			String osName, String osVersion, Byte state) {
		this.brand = brand;
		this.modelName = modelName;
		this.modelSn = modelSn;
		this.osName = osName;
		this.osVersion = osVersion;
		this.state = state;
	}
	public DevType(String brand, String modelSn,
			String osName, String osVersion) {
		this.brand = brand;
		this.modelSn = modelSn;
		this.osName = osName;
		this.osVersion = osVersion;
	}
	/** full constructor */
	public DevType(String brand, String modelName, String modelSn,
			String osName, String osVersion, String remark, Byte state) {
		this.brand = brand;
		this.modelName = modelName;
		this.modelSn = modelSn;
		this.osName = osName;
		this.osVersion = osVersion;
		this.remark = remark;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModelName() {
		return this.modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getModelSn() {
		return this.modelSn;
	}
	public void setModelSn(String modelSn) {
		this.modelSn = modelSn;
	}
	public String getOsName() {
		return this.osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getOsVersion() {
		return this.osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public Long getTerminalTypeId() {
		return terminalTypeId;
	}
	public void setTerminalTypeId(Long terminalTypeId) {
		this.terminalTypeId = terminalTypeId;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getModelSn(), this.getBrand(), this.getOsVersion()};
	}
}
