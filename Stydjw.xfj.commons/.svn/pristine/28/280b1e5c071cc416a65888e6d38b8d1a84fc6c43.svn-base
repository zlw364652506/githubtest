package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

public class FingerprintInfo extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 7900857953309848048L;

	// Fields
	/**
	 * 指纹特征串
	 */
	private String fingerprintFeature;

	/**
	 * 指纹特征流
	 */
	private byte[] fingerprintBytes;

	/**
	 * 加密警号
	 */
	private String encryptPoliceCode;

	/**
	 * 加密字符串
	 */
	private String encryptCode;

	public String getFingerprintFeature() {
		return fingerprintFeature;
	}

	public void setFingerprintFeature(String fingerprintFeature) {
		this.fingerprintFeature = fingerprintFeature;
	}

	public byte[] getFingerprintBytes() {
		return fingerprintBytes;
	}

	public void setFingerprintBytes(byte[] fingerprintBytes) {
		this.fingerprintBytes = fingerprintBytes;
	}

	public String getEncryptPoliceCode() {
		return encryptPoliceCode;
	}

	public void setEncryptPoliceCode(String encryptPoliceCode) {
		this.encryptPoliceCode = encryptPoliceCode;
	}

	public String getEncryptCode() {
		return encryptCode;
	}

	public void setEncryptCode(String encryptCode) {
		this.encryptCode = encryptCode;
	}

	@Override
	public String[] importantFieldValues() {
		// TODO Auto-generated method stub
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getFingerprintFeature(), "" + this.getEncryptPoliceCode() };
	}

}
