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
public class SimCardAddError extends AJFrameNamedBeanAbstract {
	private static final long serialVersionUID = 7763383138057912015L;
	private SimCard simCard;
	private IdStringBean error;

	public SimCard getSimCard() {
		return simCard;
	}

	public void setSimCard(SimCard simCard) {
		this.simCard = simCard;
	}

	public IdStringBean getError() {
		return error;
	}

	public void setError(IdStringBean error) {
		this.error = error;
	}

	public SimCardAddError() {
		// TODO Auto-generated constructor stub
	}
	public SimCardAddError(SimCard simCard, IdStringBean error) {
		this.simCard = simCard;
		this.error = error;
	}

	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), this.getError().toString()};
	}

}
