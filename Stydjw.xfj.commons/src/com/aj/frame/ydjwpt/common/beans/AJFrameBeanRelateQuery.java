package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/** 
 * @ClassName: AJFrameBeanRelateQuery 
 * @Description: 关联查询对象
 * @author liuling 
 * @date 2016-9-30 上午11:16:16 
 *  
 */
public class AJFrameBeanRelateQuery extends AJFrameNamedBeanAbstract{
	
	/**
	 * 不做预警处理
	 */
	public final static byte DontWarning			= 0;
	/**
	 * 有结果则预警
	 */
	public final static byte WarningHasResult		= 1;
	/**
	 * 无结果则预警
	 */
	public final static byte WarningHasNotResult	= 2;

	private static final long serialVersionUID = -4657204846755492411L;

	//关联查询功能描述
	private String extQueryDescribe;
	
	//关联查询处理器ID
	private String extQueryProcessorId;
	/**
	 * 是否需要自动执行
	 */
	private boolean autoExecute;
	/**
	 * 预警模式<br>
	 * 0：不做预警处理；1：有结果则预警；2；无结果则预警
	 */
	private byte warningMode;
	
	public AJFrameBeanRelateQuery(String extQueryDescribe, String extQueryProcessorId, boolean autoExecute, byte warningMode) {
		this.extQueryDescribe = extQueryDescribe;
		this.extQueryProcessorId = extQueryProcessorId;
		this.autoExecute = autoExecute;
		this.warningMode = warningMode;
	}
	public AJFrameBeanRelateQuery() {
	}

	public byte getWarningMode() {
		return warningMode;
	}

	public void setWarningMode(byte warningMode) {
		this.warningMode = warningMode;
	}

	public boolean isAutoExecute() {
		return autoExecute;
	}

	public void setAutoExecute(boolean autoExecute) {
		this.autoExecute = autoExecute;
	}

	public String getExtQueryDescribe() {
		return extQueryDescribe;
	}

	public void setExtQueryDescribe(String extQueryDescribe) {
		this.extQueryDescribe = extQueryDescribe;
	}

	public String getExtQueryProcessorId() {
		return extQueryProcessorId;
	}

	public void setExtQueryProcessorId(String extQueryProcessorId) {
		this.extQueryProcessorId = extQueryProcessorId;
	}

	/* (non-Javadoc)
	 * @see com.aj.frame.beans.AJFrameBean#importantFieldValues()
	 */
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName()};
	}

}
