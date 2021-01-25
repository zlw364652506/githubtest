/**
 * 
 */
package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.idstring.IdStringBean;

/**
 * @author rechard
 *
 */
public class DeptAddError  extends AJFrameNamedBeanAbstract {
	
	private static final long serialVersionUID = -5103907798933132414L;
	
	private Dept dept;
	private IdStringBean error;

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	public IdStringBean getError() {
		return error;
	}

	public void setError(IdStringBean error) {
		this.error = error;
	}

	/**
	 * 
	 */
	public DeptAddError() {
	}
	public DeptAddError(Dept dept, IdStringBean error) {
		this.dept = dept;
		this.error = error;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), this.getError().toString()};
	}

}
