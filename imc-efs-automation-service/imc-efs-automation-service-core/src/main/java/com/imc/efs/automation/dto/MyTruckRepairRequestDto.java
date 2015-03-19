package com.imc.efs.automation.dto;

public class MyTruckRepairRequestDto extends AbstractRequestDTO {

	private static final int REQUEST_TYPE_ID = 2;

	
	public MyTruckRepairRequestDto() {
	}

	private int requestTypeId;
	private int vendorId;
	private String vendorName;
	private String driverId;
	private String driverName;
	private String poWoNumber;
	private String truckId;


	public int getRequestTypeId() {
		return REQUEST_TYPE_ID;
	}
	public void setRequestTypeId(int requestTypeId) {
		this.requestTypeId = requestTypeId;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getDriverId() {
		return driverId;
	}
	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getPoWoNumber() {
		return poWoNumber;
	}
	public void setPoWoNumber(String poWoNumber) {
		this.poWoNumber = poWoNumber;
	}
	public String getTruckId() {
		return truckId;
	}
	public void setTruckId(String truckId) {
		this.truckId = truckId;
	}
	
	
	
}
