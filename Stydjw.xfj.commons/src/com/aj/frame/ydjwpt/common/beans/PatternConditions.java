package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/** 
 * @ClassName: PatternConditions 
 * @Description: 智能查询条件对象
 * @author liuling 
 * @date 2016-8-28 上午11:04:25 
 *  
 */
public class PatternConditions extends AJFrameNamedBeanAbstract {
	private static final long serialVersionUID = -7179646789226696497L;
	
	/**
	 * 查询条件
	 */
	private String queryCondition;
	/**
	 * 查询条件字符串的特征<br>
	 * 参考{@link com.aj.frame.ydjwpt.StringFeatures}
	 */
	private int queryConditionFeatures;
	
	public int getQueryConditionFeatures() {
		return queryConditionFeatures;
	}
	public void setQueryConditionFeatures(int queryConditionFeatures) {
		this.queryConditionFeatures = queryConditionFeatures;
	}
	public String getQueryCondition() {
		return queryCondition;
	}
	public void setQueryCondition(String queryCondition) {
		this.queryCondition = queryCondition;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), this.getQueryCondition()};
	}

}
