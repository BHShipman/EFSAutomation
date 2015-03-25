package com.imc.efs.automation.helper;

import java.math.BigDecimal;

import com.imc.efs.automation.data.EfsCheckRequest;
import com.imc.efs.automation.entities.Requests;

public class EfsCheckRequestExtensions {

	public EfsCheckRequestExtensions() {
	}

	public Requests ToRequest(EfsCheckRequest efsCheckRequest) {
		Requests request = new Requests();
		request.setRequestTypeId(efsCheckRequest.getRequestTypeId());
		request.setCompany(efsCheckRequest.getCompany());
		request.setEfsAmount(new BigDecimal(efsCheckRequest.getEfsAmount()));
		request.setRequester(efsCheckRequest.getRequester());
		request.setDescription(efsCheckRequest.getDescription());
		request.setVendorId(efsCheckRequest.getVendorId());
		request.setVendorName(efsCheckRequest.getVendorName());
		request.setDriverId(efsCheckRequest.getDriverId());
		request.setDriverName(efsCheckRequest.getDriverName());
		request.setPoWoNumber(efsCheckRequest.getPoWoNumber());
		request.setTruckId(efsCheckRequest.getTruckId());

		return request;
	}
}
