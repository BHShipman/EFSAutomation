package com.imc.efs.automation.dto;

public abstract class AbstractRequestDTO {

	public AbstractRequestDTO() {
	}

	private int requestTypeId;
	private String company;
	private double efsAmount;
	private String requester;
	private String description;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getEfsAmount() {
		return efsAmount;
	}

	public void setEfsAmount(double efsAmount) {
		this.efsAmount = efsAmount;
	}

	public String getRequester() {
		return requester;
	}

	public void setRequester(String requester) {
		this.requester = requester;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRequestTypeId() {
		return requestTypeId;
	}
}
