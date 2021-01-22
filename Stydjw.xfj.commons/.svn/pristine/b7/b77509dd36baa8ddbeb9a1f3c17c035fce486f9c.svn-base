package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Function entity. @author MyEclipse Persistence Tools
 */
public class Function extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = 3785797689031966714L;
	
	// Fields
	private Long objId;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 地址
	 */
	private String url;
	/**
	 * 描述
	 */
	private String describe;
	/**
	 * 序号
	 */
	private Byte orderIndex;
	/**
	 * 父ID
	 */
	private Long pid;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 编号，有效对象范围内保持唯一
	 */
	private String sn;
	/**
	 * 功能类型，0 - 管理平台菜单；1 - APP模块；2 - 权限目标；3 - 第三方APP
	 */
	private Byte functionType;
	
	// Constructors
	/** default constructor */
	public Function() {
	}
	/** minimal constructor */
	public Function(Byte state, String sn, Byte functionType) {
		this.state = state;
		this.sn = sn;
		this.functionType = functionType;
	}
	/** full constructor */
	public Function(String name, String url, String describe, Byte orderIndex,
			Long pid, Byte state, String sn, Byte functionType) {
		this.name = name;
		this.url = url;
		this.describe = describe;
		this.orderIndex = orderIndex;
		this.pid = pid;
		this.state = state;
		this.sn = sn;
		this.functionType = functionType;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return this.url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public Byte getOrderIndex() {
		return this.orderIndex;
	}
	public void setOrderIndex(Byte orderIndex) {
		this.orderIndex = orderIndex;
	}
	public Long getPid() {
		return this.pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public Byte getFunctionType() {
		return this.functionType;
	}
	public void setFunctionType(Byte functionType) {
		this.functionType = functionType;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getPid(), this.getName()};
	}
}
