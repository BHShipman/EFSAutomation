package com.imc.efs.automation.dao.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.NotSupportedException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.UserTransaction;

import com.imc.efs.automation.dao.GpDAO;
import com.imc.efs.automation.dto.GpIntegrationDTO;

@Stateless(name="GpDAO")
@Remote(GpDAO.class)
@TransactionManagement(TransactionManagementType.BEAN)
public class GpDAOImpl implements GpDAO {

	@PersistenceContext(name = "Integrations", unitName="Integrations")
	EntityManager emIntegration;
	@PersistenceContext(name = "GP", unitName="GP")
	EntityManager emGP;
	@Resource
	UserTransaction utx;

	
	@Override
	public void integrateIssuance(GpIntegrationDTO gpDto) {
		if (gpDto.getCompany().compareTo("ATEST") == 0){
			gpDto.setVendorId("1070");
		}
		try {
			utx.begin();
		} catch (NotSupportedException | SystemException e) {
			e.printStackTrace();
		}
		emIntegration
				.createNativeQuery(
						"{call USP_Integrations_AP_Full(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}")
				.setParameter(1, gpDto.getIntegration().trim())
				.setParameter(2, gpDto.getCompany().trim())
				.setParameter(3, gpDto.getBatchId().trim())
				.setParameter(4, gpDto.getVCHNUMWK().trim())
				.setParameter(5, gpDto.getVendorId().trim())
				.setParameter(6, gpDto.getDocNumber().trim())
				.setParameter(7, gpDto.getDocType())
				.setParameter(8, gpDto.getDocAmount().trim())
				.setParameter(9, gpDto.getDocDate().trim())
				.setParameter(10, gpDto.getPstgDate().trim())
				.setParameter(11, gpDto.getChrgAmount())
				.setParameter(12, gpDto.getTen99Amount())
				.setParameter(13, gpDto.getPrchAmount())
				.setParameter(14, gpDto.getTRXDSCRN().trim())
				.setParameter(15, gpDto.getCurrency().trim())
				.setParameter(16, gpDto.getRateTPid().trim())
				.setParameter(17, gpDto.getExchangeDate().trim())
				.setParameter(18, gpDto.getRateExp())
				.setParameter(19, gpDto.getCreateDist())
				.setParameter(20, gpDto.getDistType())
				.setParameter(21, gpDto.getActNumSt().trim())
				.setParameter(22, gpDto.getDebitAmount())
				.setParameter(23, gpDto.getCreditAmount())
				.setParameter(24, gpDto.getDISTREF().trim())
				.setParameter(25, gpDto.getRecordid())
				.setParameter(26, gpDto.getUserId().trim())
				.setParameter(27, gpDto.getProNumber().trim())
				.setParameter(28, gpDto.getContainer().trim())
				.setParameter(29, gpDto.getChassis().trim())
				.setParameter(30, gpDto.getDriverId().trim())
				.setParameter(31, gpDto.getPordNumber().trim())
				.setParameter(32, gpDto.getDivision().trim())
				.setParameter(33, gpDto.getFailure().trim())
				.setParameter(34, gpDto.getRepairType().trim())
				.setParameter(35, gpDto.getInvoiceNumber().trim())
				.setParameter(36, gpDto.isApHold()).executeUpdate();
		try {
			utx.commit();
		} catch (SecurityException | IllegalStateException | RollbackException
				| HeuristicMixedException | HeuristicRollbackException
				| SystemException e) {
			e.printStackTrace();
		}

	}

	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
	public void executeRecievedIntegrations(String company, String batchId) {
		try {
			utx.begin();
		} catch (NotSupportedException | SystemException e) {
			e.printStackTrace();
		}
		emIntegration
				.createNativeQuery(
						"{call USP_ReceivedIntegrations(?,?,?,?,?,?,?,?,?,?)}")
				.setParameter(1, "EFS").setParameter(2, company.trim())
				.setParameter(3, batchId.trim()).setParameter(4, 0)
				.setParameter(5, null).setParameter(6, null)
				.setParameter(7, null).setParameter(8, new Date())
				.setParameter(9, "ILSGP01").setParameter(10, "EFS_Automation").executeUpdate();
				try {
					utx.commit();
				} catch (SecurityException | IllegalStateException
						| RollbackException | HeuristicMixedException
						| HeuristicRollbackException | SystemException e) {
					e.printStackTrace();
				}
	}

	@Override
	public String getEfsGpVendorIdByCompany(String company) throws Exception {
		@SuppressWarnings("unchecked")
		List<Object[]> results = emGP.createNativeQuery(
				"{call sp_RSA_VendorsNetworkGP_GetIntegrationEFSVendors}")
				.getResultList();
		for (Object[] row : results) {
			if (row[0].toString().trim().compareTo(company) == 0) {
				return row[2].toString();
			}
		}
		throw new Exception("No record for company '" + company
				+ "'. GP VendorId not returned.");
	}

	@Override
	public String getDivisionByDriverId(String driverId) {
		@SuppressWarnings("unchecked")
		List<Object> results = emGP.createNativeQuery("{call USP_QuerySWS(?,?)}")
				.setParameter(1, "SELECT div_code FROM trk.driver WHERE code = '" + driverId + "';")
				.setParameter(2, null)
				.getResultList();
		
		
		return results.get(0).toString();
	}
	
	@Override
	public int releaseAPHold(String company, String moneyCodeReferenceNumber){
		return (int)emGP.createNativeQuery("{call USP_ReleaseAPHold(?,?)}")
		.setParameter(1, company)
		.setParameter(2, moneyCodeReferenceNumber)
		.getSingleResult();
	}

}
