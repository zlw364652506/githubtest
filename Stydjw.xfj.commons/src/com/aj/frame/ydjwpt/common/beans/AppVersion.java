package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import java.util.List;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.ydjwpt.common.beans.view.AppTopSearch;
/**
 * AppVersion entity. @author MyEclipse Persistence Tools
 */
public class AppVersion extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = 7348709090512881947L;
	private Long objId;
	/**
	 * APP主键
	 */
	private Long appId;
	/**
	 * 版本名
	 */
	private String verName;
	/**
	 * 版本号
	 */
	private String verCode;
	/**
	 * apk识别码
	 */
	private String apkCode;
	/**
	 * 更新说明
	 */
	private String updateIntro;
	/**
	 * 强制更新
	 */
	private Boolean forceUpdate;
	/**
	 * 发布时间
	 */
	private Date pubTime;
	/**
	 * 图标
	 */
	private byte[] icon;
	/**
	 * 图标URL地址
	 */
	private String iconUrl;
	/**
	 * 小图标
	 */
	private byte[] smallIcon;
	/**
	 * 小图标URL地址
	 */
	private String smallIconUrl;
	/**
	 * 软件描述
	 */
	private String description;
	/**
	 * 标签
	 */
	private String tag;
	/**
	 * 申请时间
	 */
	private Date applyTime;
	/**
	 * 装机数
	 */
	private Long installCount;
	/**
	 * apk位置
	 */
	private String apkUrl;
	/**
	 * 下载量
	 */
	private Long downCount;
	/**
	 * 状态 0-失效（撤回版本）；1-待评测；2-试点待审核；3-待审核；4-评测通过；5-试点审核通过；6-试点通过；7-审核通过；8-评测未通过；9-试点审核未通过；10-试点未通过；11-审核未通过；
	 */
	private Byte state;
	/**
	 * apk安装包大小，单位(B)
	 */
	private Long appSize;
	/**
	 * 发布序号，记录发布次数从1开始计数，不重复
	 */
	private Long releaseIndex;
	
	/**
	 * 记录正在使用的版本
	 */
	private Byte currentVer;
	/**
	 * 应用形态，包括：001-nativeApp（原生应用）；002-lightApp（轻应用）；003-hybridApp（混合应用）三种形态；
	 */
	private String technologyType;
	/**
	 * 适用的操作系统最小版本号
	 */
	private String osMinVersion;
	/**
	 * 适用的操作系统最大版本号
	 */
	private String osMaxVersion;
	/**
	 * 创建人
	 */
	private Long createUserId;
	/**
	 * 最后操作人
	 */
	private Long lastOptUserId;
	/**
	 * 最后操作时间
	 */
	private Date lastOptTime;
	/**
	 * 启动应用配置项
	 */
	private String appAction;
	/**
	 * 静默安装，0-否；1-是；
	 */
	private Byte isSilentInstallation;
	/**
	 * 开发框架类型，1：原生应用；2：混合应用；
	 */
	private Byte appFrameworkType;
	/**
	 * 验证类型，0：匿名；1：oauth2；
	 */
	private Byte authType;
	/**
	 * 访问地址
	 */
	private String appWebUrl;
	/**
	 * 帮助页地址
	 */
	private String helpUrl;
	/**
	 * 管理控制台地址
	 */
	private String adminUrl;
	/**
	 * 扩展信息
	 */
	private String extendInfos;
	
	//扩展对象
	private TerminalApp terminalApp;
	//试用用户，获取列表需用代码通过中间表实现
	private List<UserExt> testers;
	//图片，获取列表需用代码通过中间表实现
	private List<AppVersionPicture> appVersionPictures;
	//基础服务，获取列表需用代码通过中间表实现
	private List<BaseService> baseServices;
	private AppEvaluat appEvaluat;//App评测
	//端口，获取列表需用代码通过关联表实现
	private List<AppUsePortNum> appUsePortNums;
	//警种，获取列表需用代码通过中间表实现
	private List<PoliceType> policeTypes;
	//地区，获取列表需用代码通过中间表实现
	private List<Area> areas;
	//机型，获取列表需用代码通过中间表实现
	private List<DevType> devTypes;
	//公司，获取列表需用代码通过中间表实现
	private List<Company> companys;
	
	private UserSort userSort;
	private List<AppTag> apptags;
	
	//创建人
	private UserExt createUser;
	//APP选择标签
	private List<AppChooseTags> appChooseTags;
	//app服务范围
	private List<Dept> authorityScope;
	//文件
	private List<FileData> fileDatas;
	//评论
	private List<AppComment> appComments;
	// APP访问榜
	private AppAccessRank appAccessRank;
	//APP下载飙升榜
	private AppWeekDownRank appWeekDownRank;
	//APP下载榜
	private AppDownRank appDownRank;
	//热搜榜对象
	private AppTopSearch appTopSearch;

	public AppAccessRank getAppAccessRank() {
		return appAccessRank;
	}
	public void setAppAccessRank(AppAccessRank appAccessRank) {
		this.appAccessRank = appAccessRank;
	}
	public List<AppComment> getAppComments() {
		return appComments;
	}
	public void setAppComments(List<AppComment> appComments) {
		this.appComments = appComments;
	}
	public List<FileData> getFileDatas() {
		return fileDatas;
	}
	public void setFileDatas(List<FileData> fileDatas) {
		this.fileDatas = fileDatas;
	}
	public List<Dept> getAuthorityScope() {
		return authorityScope;
	}
	public void setAuthorityScope(List<Dept> authorityScope) {
		this.authorityScope = authorityScope;
	}
	public UserExt getCreateUser() {
		return createUser;
	}
	public void setCreateUser(UserExt createUser) {
		this.createUser = createUser;
	}
	public List<AppChooseTags> getAppChooseTags() {
		return appChooseTags;
	}
	public void setAppChooseTags(List<AppChooseTags> appChooseTags) {
		this.appChooseTags = appChooseTags;
	}
	private AppSort appSort;
	
	/** default constructor */
	public AppVersion() {
	}
	public AppVersion(Byte state) {
		this.state = state;
	}
	public AppVersion(Long appId) {
		this.appId = appId;
	}
	/** minimal constructor */
	public AppVersion(Long appId, String verName, String verCode,
			String apkCode, String description, Date applyTime,
			String apkUrl, Byte state) {
		this.appId = appId;
		this.verName = verName;
		this.verCode = verCode;
		this.apkCode = apkCode;
		this.description = description;
		this.applyTime = applyTime;
		this.apkUrl = apkUrl;
		this.state = state;
	}
	/** full constructor */
	public AppVersion(Long appId, String verName, String verCode,
			String apkCode, String updateIntro, Boolean forceUpdate,
			Date pubTime, byte[] icon, String description, String tag,
			Date applyTime, Long installCount, String apkUrl,
			Long downCount, Byte state) {
		this.appId = appId;
		this.verName = verName;
		this.verCode = verCode;
		this.apkCode = apkCode;
		this.updateIntro = updateIntro;
		this.forceUpdate = forceUpdate;
		this.pubTime = pubTime;
		this.icon = icon;
		this.description = description;
		this.tag = tag;
		this.applyTime = applyTime;
		this.installCount = installCount;
		this.apkUrl = apkUrl;
		this.downCount = downCount;
		this.state = state;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getAppId() {
		return this.appId;
	}
	public void setAppId(Long appId) {
		this.appId = appId;
	}
	public String getVerName() {
		return this.verName;
	}
	public void setVerName(String verName) {
		this.verName = verName;
	}
	public String getVerCode() {
		return this.verCode;
	}
	public void setVerCode(String verCode) {
		this.verCode = verCode;
	}
	public String getApkCode() {
		return this.apkCode;
	}
	public void setApkCode(String apkCode) {
		this.apkCode = apkCode;
	}
	public String getUpdateIntro() {
		return this.updateIntro;
	}
	public void setUpdateIntro(String updateIntro) {
		this.updateIntro = updateIntro;
	}
	public Boolean getForceUpdate() {
		return this.forceUpdate;
	}
	public void setForceUpdate(Boolean forceUpdate) {
		this.forceUpdate = forceUpdate;
	}
	public Date getPubTime() {
		return this.pubTime;
	}
	public void setPubTime(Date pubTime) {
		this.pubTime = pubTime;
	}
	public byte[] getIcon() {
		return this.icon;
	}
	public void setIcon(byte[] icon) {
		this.icon = icon;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTag() {
		return this.tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public Long getInstallCount() {
		return this.installCount;
	}
	public void setInstallCount(Long installCount) {
		this.installCount = installCount;
	}
	public String getApkUrl() {
		return this.apkUrl;
	}
	public void setApkUrl(String apkUrl) {
		this.apkUrl = apkUrl;
	}
	public Long getDownCount() {
		return this.downCount;
	}
	public void setDownCount(Long downCount) {
		this.downCount = downCount;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public TerminalApp getTerminalApp() {
		return terminalApp;
	}
	public void setTerminalApp(TerminalApp terminalApp) {
		this.terminalApp = terminalApp;
	}
	public List<UserExt> getTesters() {
		return testers;
	}
	public void setTesters(List<UserExt> testers) {
		this.testers = testers;
	}
	public List<AppVersionPicture> getAppVersionPictures() {
		return appVersionPictures;
	}
	public void setAppVersionPictures(List<AppVersionPicture> appVersionPictures) {
		this.appVersionPictures = appVersionPictures;
	}
	public List<BaseService> getBaseServices() {
		return baseServices;
	}
	public void setBaseServices(List<BaseService> baseServices) {
		this.baseServices = baseServices;
	}
	public AppEvaluat getAppEvaluat() {
		return appEvaluat;
	}
	public void setAppEvaluat(AppEvaluat appEvaluat) {
		this.appEvaluat = appEvaluat;
	}
	public List<AppUsePortNum> getAppUsePortNums() {
		return appUsePortNums;
	}
	public void setAppUsePortNums(List<AppUsePortNum> appUsePortNums) {
		this.appUsePortNums = appUsePortNums;
	}
	public List<PoliceType> getPoliceTypes() {
		return policeTypes;
	}
	public void setPoliceTypes(List<PoliceType> policeTypes) {
		this.policeTypes = policeTypes;
	}
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	public List<DevType> getDevTypes() {
		return devTypes;
	}
	public void setDevTypes(List<DevType> devTypes) {
		this.devTypes = devTypes;
	}
	public List<Company> getCompanys() {
		return companys;
	}
	public void setCompanys(List<Company> companys) {
		this.companys = companys;
	}
	public Long getAppSize() {
		return appSize;
	}
	public void setAppSize(Long appSize) {
		this.appSize = appSize;
	}
	public Long getReleaseIndex() {
		return releaseIndex;
	}
	public void setReleaseIndex(Long releaseIndex) {
		this.releaseIndex = releaseIndex;
	}

	public Byte getCurrentVer() {
		return currentVer;
	}
	public void setCurrentVer(Byte currentVer) {
		this.currentVer = currentVer;
	}
	public String getIconUrl() {
		return iconUrl;
	}
	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}
	public byte[] getSmallIcon() {
		return smallIcon;
	}
	public void setSmallIcon(byte[] smallIcon) {
		this.smallIcon = smallIcon;
	}
	public String getSmallIconUrl() {
		return smallIconUrl;
	}
	public void setSmallIconUrl(String smallIconUrl) {
		this.smallIconUrl = smallIconUrl;
	}
	public String getTechnologyType() {
		return technologyType;
	}
	public void setTechnologyType(String technologyType) {
		this.technologyType = technologyType;
	}
	public String getOsMinVersion() {
		return osMinVersion;
	}
	public void setOsMinVersion(String osMinVersion) {
		this.osMinVersion = osMinVersion;
	}
	public String getOsMaxVersion() {
		return osMaxVersion;
	}
	public void setOsMaxVersion(String osMaxVersion) {
		this.osMaxVersion = osMaxVersion;
	}
	public Long getCreateUserId() {
		return createUserId;
	}
	public void setCreateUserId(Long createUserId) {
		this.createUserId = createUserId;
	}
	public Long getLastOptUserId() {
		return lastOptUserId;
	}
	public void setLastOptUserId(Long lastOptUserId) {
		this.lastOptUserId = lastOptUserId;
	}
	public Date getLastOptTime() {
		return lastOptTime;
	}
	public void setLastOptTime(Date lastOptTime) {
		this.lastOptTime = lastOptTime;
	}
	public String getAppAction() {
		return appAction;
	}
	public void setAppAction(String appAction) {
		this.appAction = appAction;
	}
	public Byte getIsSilentInstallation() {
		return isSilentInstallation;
	}
	public void setIsSilentInstallation(Byte isSilentInstallation) {
		this.isSilentInstallation = isSilentInstallation;
	}
	public Byte getAppFrameworkType() {
		return appFrameworkType;
	}
	public void setAppFrameworkType(Byte appFrameworkType) {
		this.appFrameworkType = appFrameworkType;
	}
	public Byte getAuthType() {
		return authType;
	}
	public void setAuthType(Byte authType) {
		this.authType = authType;
	}
	public String getAppWebUrl() {
		return appWebUrl;
	}
	public void setAppWebUrl(String appWebUrl) {
		this.appWebUrl = appWebUrl;
	}
	public String getHelpUrl() {
		return helpUrl;
	}
	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}
	public String getAdminUrl() {
		return adminUrl;
	}
	public void setAdminUrl(String adminUrl) {
		this.adminUrl = adminUrl;
	}
	public String getExtendInfos() {
		return extendInfos;
	}
	public void setExtendInfos(String extendInfos) {
		this.extendInfos = extendInfos;
	}
	
	
	public UserSort getUserSort() {
		return userSort;
	}
	public void setUserSort(UserSort userSort) {
		this.userSort = userSort;
	}

	
	public List<AppTag> getApptags() {
		return apptags;
	}
	public void setApptags(List<AppTag> apptags) {
		this.apptags = apptags;
	}
	
	public AppSort getAppSort() {
		return appSort;
	}
	public void setAppSort(AppSort appSort) {
		this.appSort = appSort;
	}
	public AppWeekDownRank getAppWeekDownRank() {
		return appWeekDownRank;
	}
	public void setAppWeekDownRank(AppWeekDownRank appWeekDownRank) {
		this.appWeekDownRank = appWeekDownRank;
	}
	public AppDownRank getAppDownRank() {
		return appDownRank;
	}
	public void setAppDownRank(AppDownRank appDownRank) {
		this.appDownRank = appDownRank;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), "" + this.getAppId(), this.getVerName(), this.getVerCode()};
	}
	public AppTopSearch getAppTopSearch() {
		return appTopSearch;
	}
	public void setAppTopSearch(AppTopSearch appTopSearch) {
		this.appTopSearch = appTopSearch;
	}
}
