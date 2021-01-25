package com.aj.frame.ydjwpt.common.beans;

import com.aj.frame.beans.AJFrameNamedBeanAbstract;
import com.aj.frame.idstring.IdStringBean;

public class RankAddError extends AJFrameNamedBeanAbstract{
	
	private static final long serialVersionUID = -8591690751772739209L;
	
	private Rank rank;
	private IdStringBean error;
	public Rank getRank() {
		return rank;
	}
	public void setRank(Rank rank) {
		this.rank = rank;
	}
	public IdStringBean getError() {
		return error;
	}
	public void setError(IdStringBean error) {
		this.error = error;
	}
	
	public RankAddError() {
	}
	public RankAddError(Rank rank, IdStringBean error) {
		this.rank = rank;
		this.error = error;
	}
	
	public String[] importantFieldValues() {
		return new String[] {this.getClass().getSimpleName(), this.getError().toString()};
	}

}
