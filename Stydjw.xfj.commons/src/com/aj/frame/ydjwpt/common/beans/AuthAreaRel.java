package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**  
 * @Title:  授权单据发涉及地区
 * @Description:授权单据发涉及地区
 * @author: chenzhirong  
 * @date:2020-8-19 17:26:03
 * @version V1.0
 */  
public class AuthAreaRel extends AJFrameNamedBeanAbstract {

    /**
	 * 
	 */
	private static final long serialVersionUID = 7078328732878157489L;

	/**
     *   主键
     */
    private Long objId;

    /**
     *  授权单据ID
     */
	private Long authId;
    /**
     *  地区ID
     */
	private Long areaId;


    public Long getObjId(){
        return this.objId;
    }
    public void setObjId(Long objId){
        this.objId = objId;
    }

	public Long getAuthId(){
        return this.authId;
    }
    public void setAuthId(Long authId){
        this.authId = authId;
    }	
	public Long getAreaId(){
        return this.areaId;
    }
    public void setAreaId(Long areaId){
        this.areaId = areaId;
    }	

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}