package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.NotImplementedException;
import org.apache.commons.lang.StringUtils;

import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.dao.RequestTypeDAO;
import com.imc.efs.automation.entities.RequestTypeConfigs;
import com.imc.efs.automation.entities.RequestTypes;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.enums.RequirementTypes;

public class RequestBOImpl {

	private RequestDAO requestDAO;
	private RequestTypeDAO requestTypeDAO;

	public RequestBOImpl(RequestDAO requestDAO, RequestTypeDAO requestTypeDAO) {
		this.requestDAO = requestDAO;
		this.requestTypeDAO = requestTypeDAO;
	}
	
	public Requests getRequest(int id){
		return requestDAO.getRequestsById(id);
	}
	
	public RequestTypes getRequestType(int requestTypeId){
		return requestTypeDAO.getRequestTypeById(requestTypeId);
	}
	
	public void validateRequestInputAgainstConfig(RequestTypeConfigs config, Requests request){
		List<String> invalidParams = new ArrayList<String>();
		
		
		//DriverId
		 if (config.getDriverId() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getDriverId()) || request.getDriverId() == null))
             invalidParams.add("DriverId");

         if (config.getVendorId() == RequirementTypes.Required.index() && (StringUtils.isEmpty(String.valueOf(request.getVendorId())) || request.getVendorId() == null))
             invalidParams.add("VendorId");

         if (config.getServiceCharge() == RequirementTypes.Required.index() && (StringUtils.isEmpty(String.valueOf(request.getServiceCharge())) || request.getServiceCharge() == null))
             invalidParams.add("ServiceCharge");

         if (config.getProNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getProNumber()) || request.getProNumber() == null))
             invalidParams.add("ProNumber");

         if (config.getPoWoNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getPoWoNumber()) || request.getPoWoNumber() == null))
             invalidParams.add("PoWoNumber");

         if (config.getTruckId() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getTruckId()) || request.getTruckId() == null))
             invalidParams.add("TruckId");

         if (config.getChassisNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getChassisNumber()) || request.getChassisNumber() == null))
             invalidParams.add("ChassisNumber");

         if (config.getContainerNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getContainerNumber()) || request.getContainerNumber() == null))
             invalidParams.add("ContainerNumber");

         if (config.getClaimNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getClaimNumber()) || request.getClaimNumber() == null))
             invalidParams.add("ClaimNumber");

         if (config.getClaimType() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getClaimType()) || request.getClaimType() == null))
             invalidParams.add("ClaimType");

         if (config.getTagEquipment() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getTagEquipment()) || request.getTagEquipment() == null))
             invalidParams.add("TagEquipment");

         if (config.getTagPurchType() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getTagPurchType()) || request.getTagPurchType() == null))
             invalidParams.add("TagPurchType");

         //if (config.IsChargedToCustomer == RequirementTypes.Required.index() && string.IsNullOrEmpty(request.IsChargedToCustomer))
         //    invalidParams.add("IsChargedToCustomer");

         if (invalidParams.size() > 0)
         {
             throw new NotImplementedException();
             //throw new FaultException<ClientFault>(new ClientFault("Invalid input: [" + string.Join(",", invalidParams) + "]"));
         }
	}
	
	public void validateIsNotDuplicateRequest(String poWoNumber){
		boolean isDuplicate = requestDAO.checkIfDuplicateRequest(poWoNumber);
		if(isDuplicate)
			throw new NotImplementedException();
	}
	
	public int saveRequest(Requests request){
		throw new NotImplementedException();
	}
	
	public BigDecimal getUsersEfsCheckLimit(String p1, int p2){
		throw new NotImplementedException();
	}
	
	public List<Requests> getIssuedRequests(){
		return requestDAO.getRequestsOfStatusIssued(); 
	}

}
