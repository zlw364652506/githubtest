package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import java.util.List;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.um.usm.beans.User;
/**
 * AppEvaluat entity. @author MyEclipse Persistence Tools
 */
public class AppEvaluat extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -850518869805282987L;
	private Long objId;
	/**
	 * App版本ID
	 */
	private Long appVersionId;
	/**
	 * 评测人
	 */
	private Long evaluaterId;
	/**
	 * 评测内容
	 */
	private String report;
	/**
	 * 评测报告附件的文件路径
	 */
	private String reportAttachments;
	/**
	 * 是否通过
	 */
	private Boolean pass;
	/**
	 * 评测时间
	 */
	private Date evaTime;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	// 评测人
	private User evaluater;
	// 扩展对象
	private List<Attachment> attachments;
	// Constructors
	/** default constructor */
	public AppEvaluat() {
	}
	/** minimal constructor */
	public AppEvaluat(Long appVersionId, Long evaluaterId, Boolean pass, Date evaTime, Byte state) {
		this.appVersionId = appVersionId;
		this.evaluaterId = evaluaterId;
		this.pass = pass;
		this.evaTime = evaTime;
		this.state = state;
	}
	/** full constructor */
	public AppEvaluat(Long appVersionId, Long evaluaterId, String report, String reportAttachments, Boolean pass,
			Date evaTime, Byte state) {
		this.appVersionId = appVersionId;
		this.evaluaterId = evaluaterId;
		this.report = report;
		this.reportAttachments = reportAttachments;
		this.pass = pass;
		this.evaTime = evaTime;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getAppVersionId() {
		return this.appVersionId;
	}
	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}
	public Long getEvaluaterId() {
		return this.evaluaterId;
	}
	public void setEvaluaterId(Long evaluaterId) {
		this.evaluaterId = evaluaterId;
	}
	public String getReport() {
		return this.report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getReportAttachments() {
		return this.reportAttachments;
	}
	public void setReportAttachments(String reportAttachments) {
		this.reportAttachments = reportAttachments;
	}
	public Boolean getPass() {
		return this.pass;
	}
	public void setPass(Boolean pass) {
		this.pass = pass;
	}
	public Date getEvaTime() {
		return this.evaTime;
	}
	public void setEvaTime(Date evaTime) {
		this.evaTime = evaTime;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public List<Attachment> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
	public User getEvaluater() {
		return evaluater;
	}
	public void setEvaluater(User evaluater) {
		this.evaluater = evaluater;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppVersionId(),
				"" + this.getEvaluaterId() };
	}
}
