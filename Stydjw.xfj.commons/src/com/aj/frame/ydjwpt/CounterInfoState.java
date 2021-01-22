package com.aj.frame.ydjwpt;
/**
 * //状态 0-失效（已处理）；1-正常（待处理）；9-处理中；
 * @author chenzhirong
 *
 */
public class CounterInfoState {
	
	/**
	 * 状态 0-失效（已处理
	 */
	public static final Byte Invalid = 0;
	/**
	 * 1-正常（待处理）
	 */
	public static final Byte Normal = 1;
	/**
	 * ；9-处理中；
	 */
	public static final Byte Processing = 9;

}
