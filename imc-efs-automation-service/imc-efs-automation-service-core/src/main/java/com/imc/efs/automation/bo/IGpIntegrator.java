package com.imc.efs.automation.bo;

import com.imc.efs.automation.dto.GpIntegrationDTO;

public interface IGpIntegrator {

	void integrateIssuance(GpIntegrationDTO gpDto);
	void executeRecievedIntegrations(String company, String batchId);
	String getEfsGpVendorIdByCompany(String company);
	String getDivisionByDriverId(String driverId);
}
