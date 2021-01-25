package com.aj.frame.ydjwpt.common.beans;
import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import java.lang.Long;

 /**  
 * @Title:  授权单据涉及部门
 * @Description:授权单据涉及部门
 * @author: chenzhirong  
 * @date:2020-8-19 17:25:53
 * @version V1.0
 */  
public class AuthDeptRel extends AJFrameNamedBeanAbstract {

    /**
     *   主键
     */
    private Long objId;

    /**
     *  授权单据ID
     */
	private Long authId;
    /**
     *  部门ID
     */
	private Long deptId;


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
	public Long getDeptId(){
        return this.deptId;
    }
    public void setDeptId(Long deptId){
        this.deptId = deptId;
    }	

    @Override
    public String[] importantFieldValues() {
    return new String[] {this.getClass().getSimpleName(), "" + this.getObjId()};
    }
}