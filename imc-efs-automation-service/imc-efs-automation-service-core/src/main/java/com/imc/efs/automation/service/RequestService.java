package com.imc.efs.automation.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.NotImplementedException;
import org.apache.commons.lang3.StringUtils;

import com.imc.efs.automation.bo.IRequestRepository;
import com.imc.efs.automation.bo.IRequestTypeRepository;
import com.imc.efs.automation.entities.RequestTypeConfigs;
import com.imc.efs.automation.entities.RequestTypes;
import com.imc.efs.automation.entities.Requests;

public class RequestService {

	private IRequestRepository _requestRepo;
	private IRequestTypeRepository _requestTypeRepo;
	
	public RequestService() {
	
	}

	public RequestService(IRequestRepository reqeustRepo, IRequestTypeRepository requestTypeRepo){
		this._requestRepo = reqeustRepo;
		this._requestTypeRepo = requestTypeRepo;
	}
	
	public Requests getRequest(int id){
		return _requestRepo.getRequestsById(id);
	}
	
	public RequestTypes getRequestType(int requestTypeId){
		return _requestTypeRepo.getRequestTypeById(requestTypeId);	
	}
	
	public void validateRequestInputAgainstConfig(RequestTypeConfigs config, Requests request){
		List<String> invalidParams = new ArrayList<String>();
		
		//DriverId
		if(config.getDriverId() == ((byte)2) && (StringUtils.isEmpty(request.getDriverId()) || request.getDriverId() == null)){
			invalidParams.add("DriverId");
		}
		if(config.getVendorId() == ((byte)2) && (StringUtils.isEmpty(request.getVendorId().toString()) || request.getVendorId() == null)){
			invalidParams.add("VendorId");
		}
		if(config.getServiceCharge() == ((byte)2) && (StringUtils.isEmpty(request.getServiceCharge().toPlainString()) || request.getServiceCharge() == null)){
			invalidParams.add("ServiceCharge");
		}
		if(config.getProNumber() == ((byte)2) && (StringUtils.isEmpty(request.getProNumber()) || request.getProNumber() == null)){
			invalidParams.add("ProNumber");
		}
		if(config.getPoWoNumber() == ((byte)2) && (StringUtils.isEmpty(request.getPoWoNumber()) || request.getVendorId() == null)){
			invalidParams.add("PoWoNumber");
		}
		if(config.getTruckId() == ((byte)2) && (StringUtils.isEmpty(request.getTruckId()) || request.getTruckId() == null)){
			invalidParams.add("TruckId");
		}
		if(config.getChassisNumber() == ((byte)2) && (StringUtils.isEmpty(request.getChassisNumber()) || request.getChassisNumber() == null)){
			invalidParams.add("ChassisNumber");
		}
		if(config.getContainerNumber() == ((byte)2) && (StringUtils.isEmpty(request.getContainerNumber()) || request.getContainerNumber() == null)){
			invalidParams.add("ContainerNumber");
		}
		if(config.getClaimNumber() == ((byte)2) && (StringUtils.isEmpty(request.getClaimNumber()) || request.getClaimNumber() == null)){
			invalidParams.add("ClaimNumber");
		}
		if(config.getClaimType() == ((byte)2) && (StringUtils.isEmpty(request.getClaimType()) || request.getClaimType() == null)){
			invalidParams.add("ClaimType");
		}
		if(config.getTagEquipment() == ((byte)2) && (StringUtils.isEmpty(request.getTagEquipment()) || request.getTagEquipment() == null)){
			invalidParams.add("TagEquipment");
		}
		if(config.getTagPurchType() == ((byte)2) && (StringUtils.isEmpty(request.getTagPurchType()) || request.getTagPurchType() == null)){
			invalidParams.add("TagPurchType");
		}
		
		if(invalidParams.size() > 0){
			throw new NotImplementedException();
		}
	}
	
	public void validateIsNotDuplicateRequest(String poWoNumber){
		if(_requestRepo.checkIfDuplicateRequest(poWoNumber)){
			throw new NotImplementedException();
		}
	}
	
	public int saveRequest(Requests request){
		throw new NotImplementedException();
	}
	
	public BigDecimal getUsersEfsCheckLimit(String p1, int p2){
		throw new NotImplementedException();
	}
	
	public List<Requests> getIssuedRequests(){
		return _requestRepo.getRequestsOfStatusIssued();
	}
}
