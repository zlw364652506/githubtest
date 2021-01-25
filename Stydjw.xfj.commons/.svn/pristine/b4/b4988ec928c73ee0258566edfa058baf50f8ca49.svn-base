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
public class UserExtAddError extends AJFrameNamedBeanAbstract {
	private static final long serialVersionUID = -6370859049808147795L;
	
	private UserExt userExt;
	private IdStringBean error;
	public UserExt getUserExt() {
		return this.userExt;
	}
	public void setUserExt(UserExt userExt) {
		this.userExt = userExt;
	}
	public IdStringBean getError() {
		return this.error;
	}
	public void setError(IdStringBean error) {
		this.error = error;
	}
	/**
	 * 
	 */
	public UserExtAddError() {
	}
	public UserExtAddError(UserExt userExt, IdStringBean error) {
		this.userExt = userExt;
		this.error = error;
	}
	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), this.getError().toString()};
	}

}
