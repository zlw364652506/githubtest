package com.aj.frame.ydjwpt.common.beans;

import java.util.List;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/** 
 * @ClassName: AJFrameBeanDescribe 
 * @Description: Bean描述对象
 * @author liuling 
 * @date 2016-9-30 上午11:16:16 
 *  
 */
public class AJFrameBeanDescribe extends AJFrameNamedBeanAbstract{

	private static final long serialVersionUID = -4657204846755492411L;

	//对象类
	private Class<?> clazz;
	
	//对象描述
	private String classDescribe;
	/**
	 * 是否支持照片查询
	 */
	private boolean supportZpQuery;
	/**
	 * 是否支持缩略图查询
	 */
	private boolean supportSltQuery;
	
	//对象属性列表
	private List<AJFrameBeanAttribute> attributeList;
	
	//对象支持扩展关联查询列表
	private List<AJFrameBeanRelateQuery> extQueryList;
	
	public AJFrameBeanDescribe() {
	}
	public AJFrameBeanDescribe(Class<?> clazz){
		this.clazz = clazz;
	}
	
	public Class<?> getClazz() {
		return clazz;
	}

	public void setClazz(Class<?> clazz) {
		this.clazz = clazz;
	}

	public String getClassDescribe() {
		return classDescribe;
	}

	public void setClassDescribe(String classDescribe) {
		this.classDescribe = classDescribe;
	}

	public List<AJFrameBeanAttribute> getAttributeList() {
		return attributeList;
	}

	public void setAttributeList(List<AJFrameBeanAttribute> attributeList) {
		this.attributeList = attributeList;
	}

	public List<AJFrameBeanRelateQuery> getExtQueryList() {
		return extQueryList;
	}

	public void setExtQueryList(List<AJFrameBeanRelateQuery> extQueryList) {
		this.extQueryList = extQueryList;
	}
	
	public boolean isSupportZpQuery() {
		return supportZpQuery;
	}
	public void setSupportZpQuery(boolean supportZpQuery) {
		this.supportZpQuery = supportZpQuery;
	}
	public boolean isSupportSltQuery() {
		return supportSltQuery;
	}
	public void setSupportSltQuery(boolean supportSltQuery) {
		this.supportSltQuery = supportSltQuery;
	}

	/* (non-Javadoc)
	 * @see com.aj.frame.beans.AJFrameBean#importantFieldValues()
	 */
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName()};
	}

}
