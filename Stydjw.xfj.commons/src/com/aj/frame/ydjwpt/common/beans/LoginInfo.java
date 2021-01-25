package com.aj.frame.ydjwpt.common.beans;

import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * 登录信息
 * 
 * @author chenzhirong
 *
 */
public class LoginInfo extends AJFrameNamedBeanAbstract {

	/**
	 * 本月登录次数
	 */
	private Long count;
	/**
	 * 最近使用时间
	 */
	private Date time;

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(), "" };
	}
}
