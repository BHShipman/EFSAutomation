package com.imc.driver.wait.service.data;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DrwaitFifoDTO  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5873686099064272563L;
	private int moveNo;
	private String drCode;
	private int cmpyNo;
	private int orNo;
	private String divCode;
	private String pro;
	private Date wdate;
	private Date wtime;
	private String origOrDest;
	
	public int getMoveNo() {
		return moveNo;
	}
	public void setMoveNo(int moveNo) {
		this.moveNo = moveNo;
	}
	public String getDrCode() {
		return drCode;
	}
	public void setDrCode(String drCode) {
		this.drCode = drCode;
	}
	public int getCmpyNo() {
		return cmpyNo;
	}
	public void setCmpyNo(int cmpyNo) {
		this.cmpyNo = cmpyNo;
	}
	public int getOrNo() {
		return orNo;
	}
	public void setOrNo(int orNo) {
		this.orNo = orNo;
	}
	public String getDivCode() {
		return divCode;
	}
	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}
	public String getPro() {
		return pro;
	}
	public void setPro(String pro) {
		this.pro = pro;
	}
	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate = wdate;
	}
	public Date getWtime() {
		return wtime;
	}
	public void setWtime(Date wtime) {
		this.wtime = wtime;
	}
	public String getOrigOrDest() {
		return origOrDest;
	}
	public void setOrigOrDest(String origOrDest) {
		this.origOrDest = origOrDest;
	}
	
}
