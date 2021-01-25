package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.util.Date;
import java.util.List;
import java.lang.Long;

 /**  
 * @Title:  新增发机预授权单据
 * @Description:新增发机预授权单据
 * @author: chenzhirong  
 * @date:2020-8-18 17:07:49
 * @version V1.0
 */  
public class AddPreAuthDoc extends AJFrameNamedBeanAbstract {


    /**
	 * 
	 */
	private static final long serialVersionUID = -4963761315363020634L;
	/**
     *  主键
     */
	private Long objId;
    /**
     *  状态  0是删除  1是正常
     */
	private Byte state;
    /**
     *  创建时间
     */
	private Date createtime;
    /**
     *  授权状态  0 未授权，1 已授权
     */
	private Long auth;
    /**
     *  运营商代码
     */
	private String operatorCods;
    /**
     *  发机数量
     */
	private Long count;
    /**
     *  
     */
	private Long authCount;
    /**
     *  
     */
	private Long matchCount;
    /**
     *  发机日期
     */
	private Date fjTime;
    /**
     *  说明
     */
	private String remark;
	/**
	 * 发机批次ID
	 */
	private Long batchId;
	
	//扩展圣墓
	private List<Dept> depts;//部门
	private List<Area> areas;//地区

	public List<Dept> getDepts() {
		return depts;
	}
	public void setDepts(List<Dept> depts) {
		this.depts = depts;
	}
	public List<Area> getAreas() {
		return areas;
	}
	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
	public Long getBatchId() {
		return batchId;
	}
	public void setBatchId(Long batchId) {
		this.batchId = batchId;
	}
	public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }	
	public Byte getState(){
        return this.state;
    }
    public void setState(Byte state){
        this.state = state;
    }
	public Date getCreatetime(){
        return this.createtime;
    }
    public void setCreatetime(Date createtime){
        this.createtime = createtime;
    }	
		
	public Long getAuth() {
		return auth;
	}
	public void setAuth(Long auth) {
		this.auth = auth;
	}
	public String getOperatorCods(){
        return this.operatorCods;
    }
    public void setOperatorCods(String operatorCods){
        this.operatorCods = operatorCods;
    }	
	public Long getCount(){
        return this.count;
    }
    public void setCount(Long count){
        this.count = count;
    }	
	public Long getAuthCount(){
        return this.authCount;
    }
    public void setAuthCount(Long authCount){
        this.authCount = authCount;
    }	
	public Long getMatchCount(){
        return this.matchCount;
    }
    public void setMatchCount(Long matchCount){
        this.matchCount = matchCount;
    }	
	public Date getFjTime(){
        return this.fjTime;
    }
    public void setFjTime(Date fjTime){
        this.fjTime = fjTime;
    }	
	public String getRemark(){
        return this.remark;
    }
    public void setRemark(String remark){
        this.remark = remark;
    }	

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}