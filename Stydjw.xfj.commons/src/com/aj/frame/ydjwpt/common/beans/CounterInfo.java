package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class CounterInfo extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 1713349931239828547L;

	// Fields
	private Long objId;

	/**
	 * 计数器中文名称
	 */
	private String counterName;

	/**
	 * 计数器名称代码
	 */
	private String counterCode;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public String getCounterName() {
		return counterName;
	}

	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	public String getCounterCode() {
		return counterCode;
	}

	public void setCounterCode(String counterCode) {
		this.counterCode = counterCode;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId(), "" + this.getCounterName(),
				"" + this.getCounterCode() };
	}
}
