package com.aj.frame.ydjwpt;

/**
 * <b>用户的设备使用状态预定义</b>
 * @author rechard
 *
 */
public class DeviceUseStates {
	/**
	 * 无设备
	 */
	public static final byte NoDevice			= (byte)0x00;
	/**
	 * 有设备
	 */
	public static final byte HasDevice			= (byte)0x01;
	/**
	 * 共享了别人的设备
	 */
	public static final byte SharedDevice		= (byte)0x02;
	/**
	 * 有设备而且共享了别人的设备
	 */
	public static final byte SharedAndHasDevice	= HasDevice | SharedDevice;
}
