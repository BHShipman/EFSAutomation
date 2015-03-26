package com.imc.efs.automation.bo.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.commons.lang3.StringUtils;

import com.imc.efs.automation.bo.RequestBO;
import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.dao.RequestTypeDAO;
import com.imc.efs.automation.entities.RequestTypeConfigs;
import com.imc.efs.automation.entities.RequestTypes;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.enums.RequirementTypes;

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
	public void validateRequestInputAgainstConfig(RequestTypeConfigs config, Requests request) throws Exception{
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
        	 throw new Exception("Not Implemented");
             //throw new FaultException<ClientFault>(new ClientFault("Invalid input: [" + string.Join(",", invalidParams) + "]"));
         }
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#validateIsNotDuplicateRequest(java.lang.String)
	 */
	@Override
	public void validateIsNotDuplicateRequest(String poWoNumber) throws Exception{
		boolean isDuplicate = requestDAO.checkIfDuplicateRequest(poWoNumber);
		if(isDuplicate)
			throw new Exception("Not Implemented");
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#saveRequest(com.imc.efs.automation.entities.Requests)
	 */
	@Override
	public int saveRequest(Requests request) throws Exception{
		throw new Exception("Not Implemented");
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.RequestBO#getUsersEfsCheckLimit(java.lang.String, int)
	 */
	@Override
	public BigDecimal getUsersEfsCheckLimit(String p1, int p2) throws Exception{
		throw new Exception("Not Implemented");
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
		}finally{
			return null;
		}
	}

}
