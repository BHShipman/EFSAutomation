package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.imc.data.access.service.EfsDataAccessServiceBean;
import com.imc.efs.automation.bo.RequestBO;
import com.imc.efs.automation.entities.RequestTypes;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Status;
import com.imc.efs.automation.enums.RequirementTypes;
import com.imc.efs.automation.exception.NotImplemented;

@Remote(RequestBO.class)
@Stateless(name="RequestBO")
public class RequestBOImpl implements RequestBO {

	@EJB(beanName="EfsDAOService")
	private EfsDataAccessServiceBean efsDAOService;


	public RequestBOImpl(EfsDataAccessServiceBean efsDAOService) {
		this.efsDAOService = efsDAOService;
	}
	
	public RequestBOImpl() {
	
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#getRequest(int)
	 */
	@Override
	public Requests getRequest(int id){
		return efsDAOService.efsDAOService.getRequestsById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#getRequestType(int)
	 */
	@Override
	public RequestTypes getRequestType(int requestTypeId){
		return efsDAOService.efsDAOService.getRequestTypeById(requestTypeId);
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#validateRequestInputAgainstConfig(com.imc.efs.automation.entities.RequestTypeConfigs, com.imc.efs.automation.entities.Requests)
	 */
	@Override
	public void validateRequestInputAgainstConfig(Requests request) throws NotImplemented{
		List<String> invalidParams = new ArrayList<String>();
		
		
		//DriverId
		 if (request.getRequestTypes().getDriverId() == RequirementTypes.Required.index() && ((request.getDriverId().isEmpty()) || request.getDriverId() == null))
             invalidParams.add("DriverId");

         if (request.getRequestTypes().getVendorId() == RequirementTypes.Required.index() && ((String.valueOf(request.getVendorId()).isEmpty()) || request.getVendorId() == null))
             invalidParams.add("VendorId");

         if (request.getRequestTypes().getServiceCharge() == RequirementTypes.Required.index() && ((String.valueOf(request.getServiceCharge()).isEmpty()) || request.getServiceCharge() == null))
             invalidParams.add("ServiceCharge");

         if (request.getRequestTypes().getProNumber() == RequirementTypes.Required.index() && ((request.getProNumber().isEmpty()) || request.getProNumber() == null))
             invalidParams.add("ProNumber");

         if (request.getRequestTypes().getPoWoNumber() == RequirementTypes.Required.index() && ((request.getPoWoNumber().isEmpty()) || request.getPoWoNumber() == null))
             invalidParams.add("PoWoNumber");

         if (request.getRequestTypes().getTruckId() == RequirementTypes.Required.index() && ((request.getTruckId().isEmpty()) || request.getTruckId() == null))
             invalidParams.add("TruckId");

         if (request.getRequestTypes().getChassisNumber() == RequirementTypes.Required.index() && ((request.getChassisNumber().isEmpty()) || request.getChassisNumber() == null))
             invalidParams.add("ChassisNumber");

         if (request.getRequestTypes().getContainerNumber() == RequirementTypes.Required.index() && ((request.getContainerNumber().isEmpty()) || request.getContainerNumber() == null))
             invalidParams.add("ContainerNumber");

         if (request.getRequestTypes().getClaimNumber() == RequirementTypes.Required.index() && ((request.getClaimNumber().isEmpty()) || request.getClaimNumber() == null))
             invalidParams.add("ClaimNumber");

         if (request.getRequestTypes().getClaimType() == RequirementTypes.Required.index() && ((request.getClaimType().isEmpty()) || request.getClaimType() == null))
             invalidParams.add("ClaimType");

         if (request.getRequestTypes().getTagEquipment() == RequirementTypes.Required.index() && ((request.getTagEquipment().isEmpty()) || request.getTagEquipment() == null))
             invalidParams.add("TagEquipment");

         if (request.getRequestTypes().getTagPurchType() == RequirementTypes.Required.index() && ((request.getTagPurchType().isEmpty()) || request.getTagPurchType() == null))
             invalidParams.add("TagPurchType");

         //if (config.IsChargedToCustomer == RequirementTypes.Required.index() && string.IsNullOrEmpty(request.IsChargedToCustomer))
         //    invalidParams.add("IsChargedToCustomer");

         if (invalidParams.size() > 0)
         {
        	 throw new NotImplemented("Not Implemented");
             //throw new FaultException<ClientFault>(new ClientFault("Invalid input: [" + string.Join(",", invalidParams) + "]"));
         }
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#validateIsNotDuplicateRequest(java.lang.String)
	 */
	@Override
	public void validateIsNotDuplicateRequest(String poWoNumber) throws NotImplemented{
		boolean isDuplicate = efsDAOService.efsDAOService.checkIfDuplicateRequest(poWoNumber);
		if(isDuplicate)
			throw new NotImplemented("Not Implemented - A Request with this PoWoNumber has already been made");
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#saveRequest(com.imc.efs.automation.entities.Requests)
	 */
	@Override
	public int saveRequest(Requests request) throws Exception{
		return efsDAOService.efsDAOService.addRequest(request);
	}
	
	@Override
	public int updateRequest(Requests request){
		return efsDAOService.efsDAOService.updateRequest(request);
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#getUsersEfsCheckLimit(java.lang.String, int)
	 */
	@Override
	public BigDecimal getUsersEfsCheckLimit(String requester, int requestTypeId) throws NotImplemented{
		BigDecimal limit = efsDAOService.efsDAOService.getUsersEfsCheckLimit(requester, requestTypeId);
		
		if (limit != null){
		return limit;
		}
		else
			throw new NotImplemented("A Limit has not been made for this User, Please contact your manager");
		
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#getIssuedRequests()
	 */
	@Override
	public List<Requests> getIssuedRequests(){
		try {
			return efsDAOService.efsDAOService.getRequestsOfStatusIssued();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return null;
		
	}

	@Override
	public Status getStatus(int statusId) {
		return efsDAOService.efsDAOService.getStatus(statusId);
	}

}
