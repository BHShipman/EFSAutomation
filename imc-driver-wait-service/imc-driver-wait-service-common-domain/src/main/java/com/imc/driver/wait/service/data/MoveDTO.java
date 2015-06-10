package com.imc.driver.wait.service.data;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MoveDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3046985971281155020L;
	private String pro;
	private int moveNo;
	private int orderNo;
	private String divisionCode;
	private String driverCode;
	private String dlpCode;
	private Date darvDatetime;
	private String olpCode;
	private Date odptDatetime;
	private String usrCode;
	private int cmpyNo;

	public MoveDTO() {
	}

	public MoveDTO(int moveNo, int orderNo, String divisionCode, String pro,
			String driverCode, String dlpCode, Date darvDatetime,
			String olpCode, Date odptDatetime, String usrCode, int cmpyNo) {
		this.pro = pro;
		this.moveNo = moveNo;
		this.orderNo = orderNo;
		this.divisionCode = divisionCode;
		this.driverCode = driverCode;
		this.dlpCode = dlpCode;
		this.darvDatetime = darvDatetime;
		this.olpCode = olpCode;
		this.odptDatetime = odptDatetime;
		this.usrCode = usrCode;
		this.cmpyNo = cmpyNo;
	}

	// @XmlElement
	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public int getMoveNo() {
		return moveNo;
	}

	public void setMoveNo(int moveNo) {
		this.moveNo = moveNo;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getDivisionCode() {
		return divisionCode;
	}

	public void setDivisionCode(String divisionCode) {
		this.divisionCode = divisionCode;
	}

	public String getDriverCode() {
		return driverCode;
	}

	public void setDriverCode(String driverCode) {
		this.driverCode = driverCode;
	}

	public String getDlpCode() {
		return dlpCode;
	}

	public void setDlpCode(String dlpCode) {
		this.dlpCode = dlpCode;
	}

	public Date getDarvDatetime() {
		return darvDatetime;
	}

	public void setDarvDatetime(Date darvDatetime) {
		this.darvDatetime = darvDatetime;
	}

	public String getOlpCode() {
		return olpCode;
	}

	public void setOlpCode(String olpCode) {
		this.olpCode = olpCode;
	}

	public Date getOdptDatetime() {
		return odptDatetime;
	}

	public void setOdptDatetime(Date odptDatetime) {
		this.odptDatetime = odptDatetime;
	}

	public String getUsrCode() {
		return usrCode;
	}

	public void setUsrCode(String usrCode) {
		this.usrCode = usrCode;
	}

	public int getCmpyNo() {
		return cmpyNo;
	}

	public void setCmpyNo(int cmpyNo) {
		this.cmpyNo = cmpyNo;
	}

}
