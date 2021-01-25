package com.aj.frame.ydjwpt.common.beans;
import java.util.Date;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
/**
 * TerminalApp entity. @author MyEclipse Persistence Tools
 */
public class TerminalApp extends AJFrameNamedBeanAbstract {
	// Fields
	private static final long serialVersionUID = -502946485916441319L;
	private Long objId;
	/**
	 * 开发者用户ID
	 */
	private Long developerId;
	/**
	 * app名称，命名规则为 [服务范围][省份名称] [地市名称][应用名称] 例如：全－广东省－广州市－人员核查应用
	 */
	private String appName;
	/**
	 * 包名
	 */
	private String packageName;
	/**
	 * 发布者
	 */
	private Long publisherId;
	/**
	 * 由app发布者来进行申请，由app审核者来进行确认和修改
	 */
	private Boolean mustInstall;
	/**
	 * 状态 0-失效；1-正常
	 */
	private Byte state;
	/**
	 * 发布时间
	 */
	private Date publishTime;
	/**
	 * app的当前状态：在所有的执行过程中默认是上架状态，当发布整体流程完成后，可以进行下架和上架的转换操作
	 */
	private Boolean online;
	/**
	 * app评论数
	 */
	private Long commentCount;
	/**
	 * app五星数
	 */
	private Long fivestarCount;
	/**
	 * app四星数
	 */
	private Long fourstarCount;
	/**
	 * app三星数
	 */
	private Long threestarCount;
	/**
	 * app二星数
	 */
	private Long twostarCount;
	/**
	 * app一星数
	 */
	private Long onestatCount;
	/**
	 * app评星数
	 */
	private Long starCount;
	/**
	 * 装机数
	 */
	private Long installCount;
	/**
	 * app版本主键
	 */
	private Long appVersionId;

	/**
	 * APP类型，0-基础共性应用；1- 综合应用；2 -专业应用；3- 移动互联网应用；
	 */
	private Byte appType;
	/**
	 * APP描述
	 */
	private String describe;
	/**
	 * APP应用类型分类主键，I,II,III类应用分类
	 */
	private Long appSortId;
	/**
	 * 应用市场信息主键
	 */
	private Long stroeInfoId;
	/**
	 * APP应用编码，命名规则为[省市+地市组织机构代码][建设年份][应用代码][终端代码][版本号]
	 */
	private String appCode;
	/**
	 * 应用类型，1：WEB应用；2：Android应用；4：IOS应用；
	 */
	private Byte terminalType;
	/**
	 * 应用密钥
	 */
	private String secretKey;
	/**
	 * 是否需要实名认证，1-是；0-否；
	 */
	private Byte realNameAuth;
	
	//扩展对象
	private UserExt publisher;
	private AppVersion appScoreVersion;//APP评星的最新版本
	
	public AppVersion getAppScoreVersion() {
		return appScoreVersion;
	}
	public void setAppScoreVersion(AppVersion appScoreVersion) {
		this.appScoreVersion = appScoreVersion;
	}
	// Constructors
	/** default constructor */
	public TerminalApp() {
	}
	/** minimal constructor */
	public TerminalApp(Long developerId, String appName, String packageName,
			Boolean mustInstall, Byte state, Boolean online) {
		this.developerId = developerId;
		this.appName = appName;
		this.packageName = packageName;
		this.mustInstall = mustInstall;
		this.state = state;
		this.online = online;
	}
	/** full constructor */
	public TerminalApp(Long developerId, String appName, String packageName,
			Long publisherId, Boolean mustInstall, Byte state,
			Date publishTime, Boolean online, Long commentCount,
			Long fivestarCount, Long fourstarCount,
			Long threestarCount, Long twostarCount,
			Long onestatCount, Long starCount,
			Long installCount) {
		this.developerId = developerId;
		this.appName = appName;
		this.packageName = packageName;
		this.publisherId = publisherId;
		this.mustInstall = mustInstall;
		this.state = state;
		this.publishTime = publishTime;
		this.online = online;
		this.commentCount = commentCount;
		this.fivestarCount = fivestarCount;
		this.fourstarCount = fourstarCount;
		this.threestarCount = threestarCount;
		this.twostarCount = twostarCount;
		this.onestatCount = onestatCount;
		this.starCount = starCount;
		this.installCount = installCount;
	}
	// Property accessors
	public Long getObjId() {
		return this.objId;
	}
	public void setObjId(Long objId) {
		this.objId = objId;
	}
	public Long getDeveloperId() {
		return this.developerId;
	}
	public void setDeveloperId(Long developerId) {
		this.developerId = developerId;
	}
	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getPackageName() {
		return this.packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public Long getPublisherId() {
		return this.publisherId;
	}
	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}
	public Boolean getMustInstall() {
		return this.mustInstall;
	}
	public void setMustInstall(Boolean mustInstall) {
		this.mustInstall = mustInstall;
	}
	public Byte getState() {
		return this.state;
	}
	public void setState(Byte state) {
		this.state = state;
	}
	public Date getPublishTime() {
		return this.publishTime;
	}
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	public Boolean getOnline() {
		return this.online;
	}
	public void setOnline(Boolean online) {
		this.online = online;
	}
	public Long getCommentCount() {
		return this.commentCount;
	}
	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}
	public Long getFivestarCount() {
		return this.fivestarCount;
	}
	public void setFivestarCount(Long fivestarCount) {
		this.fivestarCount = fivestarCount;
	}
	public Long getFourstarCount() {
		return this.fourstarCount;
	}
	public void setFourstarCount(Long fourstarCount) {
		this.fourstarCount = fourstarCount;
	}
	public Long getThreestarCount() {
		return this.threestarCount;
	}
	public void setThreestarCount(Long threestarCount) {
		this.threestarCount = threestarCount;
	}
	public Long getTwostarCount() {
		return this.twostarCount;
	}
	public void setTwostarCount(Long twostarCount) {
		this.twostarCount = twostarCount;
	}
	public Long getOnestatCount() {
		return this.onestatCount;
	}
	public void setOnestatCount(Long onestatCount) {
		this.onestatCount = onestatCount;
	}
	public Long getStarCount() {
		return this.starCount;
	}
	public void setStarCount(Long starCount) {
		this.starCount = starCount;
	}
	public Long getInstallCount() {
		return this.installCount;
	}
	public void setInstallCount(Long installCount) {
		this.installCount = installCount;
	}
	public UserExt getPublisher() {
		return publisher;
	}
	public void setPublisher(UserExt publisher) {
		this.publisher = publisher;
	}
	public Long getAppVersionId() {
		return appVersionId;
	}
	public void setAppVersionId(Long appVersionId) {
		this.appVersionId = appVersionId;
	}
	public Byte getAppType() {
		return appType;
	}
	public void setAppType(Byte appType) {
		this.appType = appType;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public Long getAppSortId() {
		return appSortId;
	}
	public void setAppSortId(Long appSortId) {
		this.appSortId = appSortId;
	}
	public Long getStroeInfoId() {
		return stroeInfoId;
	}
	public void setStroeInfoId(Long stroeInfoId) {
		this.stroeInfoId = stroeInfoId;
	}
	public String getAppCode() {
		return appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	public Byte getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(Byte terminalType) {
		this.terminalType = terminalType;
	}
	public String getSecretKey() {
		return secretKey;
	}
	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
	public Byte getRealNameAuth() {
		return realNameAuth;
	}
	public void setRealNameAuth(Byte realNameAuth) {
		this.realNameAuth = realNameAuth;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), "" + this.getObjId(), this.getAppName(), this.getPackageName()};
	}
}
