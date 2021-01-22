package com.aj.frame.ydjwpt;

/**
 * APP申请流程审核状态
 * @author zhouzhiyuan
 *
 */
public class AppVersionStatus {
	/**
	 * 撤回版本
	 */
	public final static byte RecallVersion	= 0;
	
	/**
	 * 待评测
	 */
	public final static byte WaitEvaluat = 1;
	
	/**
	 * 试点待审核
	 */
	public final static byte PilotWait	= 2;
	
	/**
	 * 待审核
	 */
	public final static byte WaitCheck	= 3;
	
	/**
	 * 评测通过
	 */
	public final static byte EvaluatPass = 4;
	
	/**
	 * 试点审核通过
	 */
	public final static byte PilotCheckPass	= 5;
	
	/**
	 * 试点通过
	 */
	public final static byte PilotPass	= 6;
	
	/**
	 * 审核通过
	 */
	public final static byte Approve = 7;
	
	/**
	 * 评测未通过
	 */
	public final static byte NotPassEvaluat	= 8;
	
	/**
	 * 试点审核不通过
	 */
	public final static byte PilotCheckNoPass = 9;
	
	/**
	 * 试点未通p过
	 */
	public final static byte PilotNoPass = 10;
	
	/**
	 * 审核不通过
	 */
	public final static byte NoPass	= 11;
}
