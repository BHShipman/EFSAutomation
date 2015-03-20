package com.imc.efs.automation.dao;

import com.imc.efs.automation.dto.GpIntegrationDTO;

public interface GpDAO {

	void integrateIssuance(GpIntegrationDTO gpDto);
	void executeRecievedIntegrations(String company, String batchId);
	String getEfsGpVendorIdByCompany(String company) throws Exception;
	String getDivisionByDriverId(String driverId);
}
