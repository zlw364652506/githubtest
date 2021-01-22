package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class StatCounterEventQueue extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 4659248538078633477L;

	// Fields
	private Long objId;

	/**
	 * 计数器主键
	 */
	private Long counterId;

	/**
	 * 计数器中文名称
	 */
	private String counterName;

	/**
	 * 统计数量
	 */
	private Long statCount;

	/**
	 * 处理器名称
	 */
	private String processorName;

	/**
	 * 事件描述
	 */
	private String eventDesc;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 状态 0-失效；1-正常；9-处理中；
	 */
	private Byte state;

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public Long getCounterId() {
		return counterId;
	}

	public void setCounterId(Long counterId) {
		this.counterId = counterId;
	}

	public String getCounterName() {
		return counterName;
	}

	public void setCounterName(String counterName) {
		this.counterName = counterName;
	}

	public Long getStatCount() {
		return statCount;
	}

	public void setStatCount(Long statCount) {
		this.statCount = statCount;
	}

	public String getProcessorName() {
		return processorName;
	}

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
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
				"" + this.getProcessorName(), "" + this.getStatCount() };
	}
}
