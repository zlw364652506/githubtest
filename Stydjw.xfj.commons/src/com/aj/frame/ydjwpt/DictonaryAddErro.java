package com.aj.frame.ydjwpt;

import com.aj.frame.idstring.IdStringBean;
import com.aj.frame.ydjwpt.common.beans.Dictonary;
/**
 * 
 * @author chengjun
 *
 */
public class DictonaryAddErro {
	private Dictonary dictonary;
	private IdStringBean error;
	public Dictonary getDictonary() {
		return dictonary;
	}
	public void setDictonary(Dictonary dictonary) {
		this.dictonary = dictonary;
	}
	public IdStringBean getError() {
		return error;
	}
	public void setError(IdStringBean error) {
		this.error = error;
	}
	public DictonaryAddErro(){
		
	}
	public DictonaryAddErro(Dictonary dictonary, IdStringBean error) {
		this.dictonary = dictonary;
		this.error = error;
	}
	
	
}
