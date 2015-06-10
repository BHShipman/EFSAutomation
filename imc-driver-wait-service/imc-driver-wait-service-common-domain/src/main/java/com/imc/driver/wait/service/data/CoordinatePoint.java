package com.imc.driver.wait.service.data;

import java.math.BigDecimal;

public class CoordinatePoint {

	private BigDecimal latitude;
	private BigDecimal longitude;

	public CoordinatePoint() {
	}

	public CoordinatePoint(BigDecimal latitude, BigDecimal longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
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

	public BigDecimal getX() {
		return this.longitude;
	}

	public BigDecimal getY() {
		return this.latitude;
	}

}
