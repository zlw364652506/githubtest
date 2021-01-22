/**
 * 
 */
package com.aj.frame.ydjwpt.common.beans;

import java.util.List;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/**
 * <b>客户端配置对象</b><br>
 * 一些由服务端统一分发的所有客户端的配置信息
 * @author rechard
 *
 */
public class ClientConfiguration extends AJFrameNamedBeanAbstract {
	private static final long serialVersionUID = -2537466914953540886L;
	
	private List<AJFrameBeanDescribe> beanDescribes;
	public List<AJFrameBeanDescribe> getBeanDescribes() {
		return beanDescribes;
	}

	public void setBeanDescribes(List<AJFrameBeanDescribe> beanDescribes) {
		this.beanDescribes = beanDescribes;
	}

	/**
	 * 
	 */
	public ClientConfiguration() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.aj.frame.beans.AJFrameBean#importantFieldValues()
	 */
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName()};
	}

}
