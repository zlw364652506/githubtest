/**
 * 
 */
package com.aj.frame.ydjwpt;

/**
 * <b>字符串特征预定义</b>
 * @author rechard
 *
 */
public class StringFeatures {
	/**
	 * 未知
	 */
	public final static int Unknown		= 0x00000000;
	/**
	 * 数字
	 */
	public final static int Number		= 0x00000001;
	/**
	 * 英文字母字符串
	 */
	public final static int Letters		= 0x00000002;
	/**
	 * 非英文字母字符串(中文字符串)
	 */
	public final static int NonLetters	= 0x00000004;
	
	/**
	 * 日期
	 */
	public final static int Date		= 0x00000100;
	/**
	 * 时间
	 */
	public final static int Time		= 0x00000200;
	/**
	 * 日期时间
	 */
	public final static int DateTime	= 0x00000400;
	
	
	/**
	 * 身份证号
	 */
	public final static int CardSn		= 0x00001000;
	/**
	 * 机动车号牌号码
	 */
	public final static int CarNumber	= 0x00002000;
	/**
	 * 车辆识别代号
	 */
	public final static int CarSn		= 0x00004000;
	/**
	 * 机动车发动机号码
	 */
	public final static int EngineSn	= 0x00008000;
	/**
	 * 案件编号
	 */
	public final static int AjSn		= 0x00010000;
	/**
	 * 电话号码
	 */
	public final static int PhoneNumber	= 0x00020000;
	/**
	 * 疑似标记位，有效时表示其他特征位描述的特征是疑似
	 */
	public final static int Suspected	= 0x80000000;
}
