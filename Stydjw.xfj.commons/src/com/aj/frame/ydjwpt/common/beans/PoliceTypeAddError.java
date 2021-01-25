package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.idstring.IdStringBean;

public class PoliceTypeAddError extends AJFrameNamedBeanAbstract{
	
	private static final long serialVersionUID = -7233685002984868350L;
	
	private PoliceType policeType;
	private IdStringBean error;

	@Override
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), this.getError().toString()};
	}

	public PoliceType getPoliceType() {
		return policeType;
	}

	public void setPoliceType(PoliceType policeType) {
		this.policeType = policeType;
	}

	public IdStringBean getError() {
		return error;
	}

	public void setError(IdStringBean error) {
		this.error = error;
	}
	
	public PoliceTypeAddError() {
	}
	public PoliceTypeAddError( PoliceType policeType, IdStringBean error) {
		this.policeType = policeType;
		this.error = error;
	}

}
