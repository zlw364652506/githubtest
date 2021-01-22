package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * Company entity. @author MyEclipse Persistence Tools
 */
public class Company extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -6040331057119517359L;
	
	// Fields
	private Long objId;
	/**
	 * 公司名称
	 */
	private String companyName;
	/**
	 * 公司描述
	 */
	private String companyDesc;
	// Constructors
	/** default constructor */
	public Company() {
	}
	/** minimal constructor */
	public Company(String companyName) {
		this.companyName = companyName;
	}
	/** full constructor */
	public Company(String companyName, String companyDesc) {
		this.companyName = companyName;
		this.companyDesc = companyDesc;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public String getCompanyName() {
		return this.companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyDesc() {
		return this.companyDesc;
	}
	public void setCompanyDesc(String companyDesc) {
		this.companyDesc = companyDesc;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getCompanyName()};
	}
}
