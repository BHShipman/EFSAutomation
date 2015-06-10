package com.imc.driver.wait.service.data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BreadcrumbDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1424828054536863927L;
	private String mvehCode;
	private Date eventDatetime;
	private String mdrvCode;
	private int speed;
	private int heading;
	private int signal;
	private BigDecimal latitude;
	private BigDecimal longitude;
	private String fixtype;
	private String note;
	private boolean isInside;

	public BreadcrumbDTO() {

	}

	public BreadcrumbDTO(String mvehCode, Date eventDatetime, String mdrvCode,
			int speed, int heading, int signal, BigDecimal latitude,
			BigDecimal longitude, String fixtype, String note, boolean isInside) {
		super();
		this.mvehCode = mvehCode;
		this.eventDatetime = eventDatetime;
		this.mdrvCode = mdrvCode;
		this.speed = speed;
		this.heading = heading;
		this.signal = signal;
		this.latitude = latitude;
		this.longitude = longitude;
		this.fixtype = fixtype;
		this.note = note;
		this.isInside = isInside;
	}

	public String getMvehCode() {
		return mvehCode;
	}

	public void setMvehCode(String mvehCode) {
		this.mvehCode = mvehCode;
	}

	public Date getEventDatetime() {
		return eventDatetime;
	}

	public void setEventDatetime(Date eventDatetime) {
		this.eventDatetime = eventDatetime;
	}

	public String getMdrvCode() {
		return mdrvCode;
	}

	public void setMdrvCode(String mdrvCode) {
		this.mdrvCode = mdrvCode;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getHeading() {
		return heading;
	}

	public void setHeading(int heading) {
		this.heading = heading;
	}

	public int getSignal() {
		return signal;
	}

	public void setSignal(int signal) {
		this.signal = signal;
	}

	public BigDecimal getLatitude() {
		return latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getFixtype() {
		return fixtype;
	}

	public void setFixtype(String fixtype) {
		this.fixtype = fixtype;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public boolean isInside() {
		return isInside;
	}

	public void setInside(boolean isInside) {
		this.isInside = isInside;
	}
}
