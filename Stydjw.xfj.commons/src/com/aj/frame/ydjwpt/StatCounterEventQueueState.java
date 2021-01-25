package com.aj.frame.ydjwpt;
/**
 * 信息统计计数器事件队列状态 0-失效；1-正常；9-处理中；
 * @author liufen
 *
 */
public class StatCounterEventQueueState {
	
	/**
	 * 0-失效；
	 */
	public final static Byte Invalid = 0;
	/**
	 * 1-正常；
	 */
	public final static Byte Normal = 1;
	
	/**
	 * 9-处理中；
	 */
	public final static Byte Operate = 9;
}
