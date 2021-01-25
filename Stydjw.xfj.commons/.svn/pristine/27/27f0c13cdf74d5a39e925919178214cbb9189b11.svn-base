package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.util.List;
import java.lang.Long;

/**
 * @Title: 启动页信息
 * @Description:
 * @author: chenzhirong
 * @date:2017-11-7 9:06:10
 * @version V1.0
 */
public class StartpageInfo extends AJFrameNamedBeanAbstract {

	private static final long serialVersionUID = 7760421860507285713L;

	/**
	 * 主键
	 */
	private Long objId;
	/**
	 * 名称
	 */
	private String pageName;
	/**
	 * 地区主键
	 */
	private Long areaId;
	/**
	 * 显示次数，默认-1表示一直显示；其他大于-1的整数表示实际显示次数；
	 */
	private Byte showTimes;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 状态
	 */
	private Byte state;

	// 扩展属性
	/**
	 * 图片张数
	 */
	private int imageNum;

	/**
	 * 启动页图片信息列表
	 */
	private List<StartpageImageInfo> imageInfos;

	/**
	 * 地区对象
	 */
	private Area area;

	public Long getObjId() {
		return objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public Long getAreaId() {
		return areaId;
	}

	public void setAreaId(Long areaId) {
		this.areaId = areaId;
	}

	public Byte getShowTimes() {
		return showTimes;
	}

	public void setShowTimes(Byte showTimes) {
		this.showTimes = showTimes;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Byte getState() {
		return state;
	}

	public void setState(Byte state) {
		this.state = state;
	}

	public int getImageNum() {
		return imageNum;
	}

	public void setImageNum(int imageNum) {
		this.imageNum = imageNum;
	}

	public List<StartpageImageInfo> getImageInfos() {
		return imageInfos;
	}

	public void setImageInfos(List<StartpageImageInfo> imageInfos) {
		this.imageInfos = imageInfos;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] { this.getClass().getSimpleName(),
				"" + this.getObjId() };
	}
}