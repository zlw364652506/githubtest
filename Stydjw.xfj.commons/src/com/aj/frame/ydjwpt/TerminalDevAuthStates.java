/**
 * 
 */
package com.aj.frame.ydjwpt;

/**
 * @author rechard
 *
 */
public class TerminalDevAuthStates extends ObjectStates {
	/**
	 * 已授权
	 */
	public final static byte Authorize		= 1;
	
	/**
	 * 待授权
	 */
	public final static byte Authing		= 2;
	/**
	 * 已挂失
	 */
	public final static byte Lost			= 3;
	/**
	 * 已禁用
	 */
	public final static byte Disable		= 4;
	/**
	 * 用户被注销
	 */
	public final static byte UserRemoved	= 5;
	/**
	 * 未匹配
	 */
	public final static byte Unmatch		= 6;
	
	/**
	 * 换SIM卡
	 */
	public final static byte changeSim	= 0x08;
	/**
	 * 换手机
	 */
	public final static byte changeTerminalDev	= 0x10;
	/**
	 * 换加密卡
	 */
	public final static byte changeEncryptionCard = 0x20;
	
	/**
	 * 换手机SIM卡
	 */
	public final static byte changeTerminalDevAndSim = TerminalDevAuthStates.changeTerminalDev | TerminalDevAuthStates.changeSim;
	
	/**
	 * 换手机加密卡
	 */
	public final static byte changeTerminalDevAndEncryptionCard = TerminalDevAuthStates.changeTerminalDev | TerminalDevAuthStates.changeEncryptionCard;
	
	/**
	 * 换sim卡加密卡
	 */
	public final static byte changeSimAndEncryptionCard = TerminalDevAuthStates.changeSim | TerminalDevAuthStates.changeEncryptionCard;
	
	/**
	 * 换手机sim卡加密卡
	 */
	public final static byte changeTerminalDevAndSimAndEncryptionCard = TerminalDevAuthStates.changeTerminalDev | TerminalDevAuthStates.changeSim | TerminalDevAuthStates.changeEncryptionCard;
}
