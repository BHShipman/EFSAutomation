package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.commons.lang3.StringUtils;

import service.cards.tch.com.types.WSMoneyCode;
import service.cards.tch.com.types.WSMoneyCodeHistRec;

import com.imc.efs.automation.bo.RequestBO;
import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.dao.RequestTypeDAO;
import com.imc.efs.automation.entities.RequestTypes;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.Status;
import com.imc.efs.automation.enums.RequirementTypes;
import com.imc.efs.automation.exception.NotImplemented;

@Remote(RequestBO.class)
@Stateless(name="RequestBO")
public class RequestBOImpl implements RequestBO {

	@EJB(beanName="RequestDAO")
	private RequestDAO requestDAO;
	@EJB(beanName="RequestTypeDAO")
	private RequestTypeDAO requestTypeDAO;

	public RequestBOImpl(RequestDAO requestDAO, RequestTypeDAO requestTypeDAO) {
		this.requestDAO = requestDAO;
		this.requestTypeDAO = requestTypeDAO;
	}
	
	public RequestBOImpl() {
	
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#getRequest(int)
	 */
	@Override
	public Requests getRequest(int id){
		return requestDAO.getRequestsById(id);
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#getRequestType(int)
	 */
	@Override
	public RequestTypes getRequestType(int requestTypeId){
		return requestTypeDAO.getRequestTypeById(requestTypeId);
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#validateRequestInputAgainstConfig(com.imc.efs.automation.entities.RequestTypeConfigs, com.imc.efs.automation.entities.Requests)
	 */
	@Override
	public void validateRequestInputAgainstConfig(Requests request) throws NotImplemented{
		List<String> invalidParams = new ArrayList<String>();
		
		
		//DriverId
		 if (request.getRequestTypes().getDriverId() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getDriverId()) || request.getDriverId() == null))
             invalidParams.add("DriverId");

         if (request.getRequestTypes().getVendorId() == RequirementTypes.Required.index() && (StringUtils.isEmpty(String.valueOf(request.getVendorId())) || request.getVendorId() == null))
             invalidParams.add("VendorId");

         if (request.getRequestTypes().getServiceCharge() == RequirementTypes.Required.index() && (StringUtils.isEmpty(String.valueOf(request.getServiceCharge())) || request.getServiceCharge() == null))
             invalidParams.add("ServiceCharge");

         if (request.getRequestTypes().getProNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getProNumber()) || request.getProNumber() == null))
             invalidParams.add("ProNumber");

         if (request.getRequestTypes().getPoWoNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getPoWoNumber()) || request.getPoWoNumber() == null))
             invalidParams.add("PoWoNumber");

         if (request.getRequestTypes().getTruckId() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getTruckId()) || request.getTruckId() == null))
             invalidParams.add("TruckId");

         if (request.getRequestTypes().getChassisNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getChassisNumber()) || request.getChassisNumber() == null))
             invalidParams.add("ChassisNumber");

         if (request.getRequestTypes().getContainerNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getContainerNumber()) || request.getContainerNumber() == null))
             invalidParams.add("ContainerNumber");

         if (request.getRequestTypes().getClaimNumber() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getClaimNumber()) || request.getClaimNumber() == null))
             invalidParams.add("ClaimNumber");

         if (request.getRequestTypes().getClaimType() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getClaimType()) || request.getClaimType() == null))
             invalidParams.add("ClaimType");

         if (request.getRequestTypes().getTagEquipment() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getTagEquipment()) || request.getTagEquipment() == null))
             invalidParams.add("TagEquipment");

         if (request.getRequestTypes().getTagPurchType() == RequirementTypes.Required.index() && (StringUtils.isEmpty(request.getTagPurchType()) || request.getTagPurchType() == null))
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
		boolean isDuplicate = requestDAO.checkIfDuplicateRequest(poWoNumber);
		if(isDuplicate)
			throw new NotImplemented("Not Implemented - A Request with this PoWoNumber has already been made");
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#saveRequest(com.imc.efs.automation.entities.Requests)
	 */
	@Override
	public int saveRequest(Requests request) throws Exception{
		return requestDAO.addRequest(request);
	}
	
	@Override
	public int updateRequest(Requests request){
		return requestDAO.updateRequest(request);
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#getUsersEfsCheckLimit(java.lang.String, int)
	 */
	@Override
	public BigDecimal getUsersEfsCheckLimit(String requester, int requestTypeId) throws NotImplemented{
		BigDecimal limit = requestDAO.getUsersEfsCheckLimit(requester, requestTypeId);
		
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
			return requestDAO.getRequestsOfStatusIssued();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return null;
		
	}

	@Override
	public Status getStatus(int statusId) {
		return requestDAO.getStatus(statusId);
	}

}
