package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;

/** 
 * @ClassName: AJFrameBeanAttribute 
 * @Description: Bean属性描述
 * @author liuling 
 * @date 2016-9-30 上午11:16:16 
 *  
 */
public class AJFrameBeanAttribute extends AJFrameNamedBeanAbstract{

	private static final long serialVersionUID = -4657204846755492411L;

	//属性中文描述
	private String attributeDescribe;
	
	//属性名称
	private String attributeName;

	//长度
	private int attributeLength;
	
	//显示顺序
	private int orderIndex;

	//是否必填
	private boolean required;

	//是否隐藏
	private boolean hidden;
	
	//重要程度（级别）
	private int importLevel;
	
	//如果当前属性是一个字典项则指明用来进行字典转换的字典分类代码
	private String dictTypeCode;
	
	//标识当前属性是否用来展示警示效果
	private boolean forWarning;
	
	public AJFrameBeanAttribute() {
	}
	
	public boolean isForWarning() {
		return forWarning;
	}

	public void setForWarning(boolean forWarning) {
		this.forWarning = forWarning;
	}

	public String getDictTypeCode() {
		return dictTypeCode;
	}

	public void setDictTypeCode(String dictTypeCode) {
		this.dictTypeCode = dictTypeCode;
	}

	public String getAttributeDescribe() {
		return attributeDescribe;
	}

	public void setAttributeDescribe(String attributeDescribe) {
		this.attributeDescribe = attributeDescribe;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public int getAttributeLength() {
		return attributeLength;
	}

	public void setAttributeLength(int attributeLength) {
		this.attributeLength = attributeLength;
	}
	
	public int getOrderIndex() {
		return orderIndex;
	}

	public void setOrderIndex(int orderIndex) {
		this.orderIndex = orderIndex;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public boolean isHidden() {
		return hidden;
	}

	public void setHidden(boolean hidden) {
		this.hidden = hidden;
	}

	public int getImportLevel() {
		return importLevel;
	}

	public void setImportLevel(int importLevel) {
		this.importLevel = importLevel;
	}

	/* (non-Javadoc)
	 * @see com.aj.frame.beans.AJFrameBean#importantFieldValues()
	 */
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName()};
	}

}
