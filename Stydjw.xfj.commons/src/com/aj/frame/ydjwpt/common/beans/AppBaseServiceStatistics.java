package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * AppBaseServiceStatistics entity. @author MyEclipse Persistence Tools
 */
public class AppBaseServiceStatistics extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -7195972696798428982L;
	private Long objId;
	/**
	 * 基础服务_主键
	 */
	private Long baseServiceId;
	/**
	 * app_主键
	 */
	private Long appId;
	/**
	 * 调用次数
	 */
	private Long callCount;
	//扩展对象
	private BaseService baseService;
	private TerminalApp terminalApp;
	// Constructors
	/** default constructor */
	public AppBaseServiceStatistics() {
	}
	/** full constructor */
	public AppBaseServiceStatistics(Long baseServiceId, Long appId,
			Long callCount) {
		this.baseServiceId = baseServiceId;
		this.appId = appId;
		this.callCount = callCount;
	}
	public AppBaseServiceStatistics(AppVersion appVer) {
		this.appId = appVer.getAppId();
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getBaseServiceId() {
		return this.baseServiceId;
	}
	public void setBaseServiceId(Long baseServiceId) {
		this.baseServiceId = baseServiceId;
	}
	public Long getAppId() {
		return this.appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public Long getCallCount() {
		return this.callCount;
	}
	public void setCallCount(Long callCount) {
		this.callCount = callCount;
	}
	public BaseService getBaseService() {
		return baseService;
	}
	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}
	public TerminalApp getTerminalApp() {
		return terminalApp;
	}
	public void setTerminalApp(TerminalApp terminalApp) {
		this.terminalApp = terminalApp;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppId(), "" + this.getBaseServiceId()};
	}
}
