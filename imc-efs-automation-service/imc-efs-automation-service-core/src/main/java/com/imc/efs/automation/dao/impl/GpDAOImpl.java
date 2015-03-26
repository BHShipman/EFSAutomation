package com.imc.efs.automation.dao.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.imc.efs.automation.dao.GpDAO;
import com.imc.efs.automation.dto.GpIntegrationDTO;

@Stateless(name="GpDAO")
@Remote(GpDAO.class)
public class GpDAOImpl implements GpDAO {

	@PersistenceContext(name = "Integrations", unitName="Integrations")
	EntityManager emIntegration;
	@PersistenceContext(name = "GP", unitName="GP")
	EntityManager emGP;

	@Override
	public void integrateIssuance(GpIntegrationDTO gpDto) {
		emIntegration
				.createNativeQuery(
						"{call USP_Integrations_AP_Full(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}")
				.setParameter(1, gpDto.getIntegration())
				.setParameter(2, gpDto.getCompany())
				.setParameter(3, gpDto.getBatchId())
				.setParameter(4, gpDto.getVCHNUMWK())
				.setParameter(5, gpDto.getVendorId())
				.setParameter(6, gpDto.getDocNumber())
				.setParameter(7, gpDto.getDocType())
				.setParameter(8, gpDto.getDocAmount())
				.setParameter(9, gpDto.getDocDate())
				.setParameter(10, gpDto.getPstgDate())
				.setParameter(11, gpDto.getChrgAmount())
				.setParameter(12, gpDto.getTen99Amount())
				.setParameter(13, gpDto.getPrchAmount())
				.setParameter(14, gpDto.getTRXDSCRN())
				.setParameter(15, gpDto.getCurrency())
				.setParameter(16, gpDto.getRateTPid())
				.setParameter(17, gpDto.getExchangeDate())
				.setParameter(18, gpDto.getRateExp())
				.setParameter(19, gpDto.getCreateDist())
				.setParameter(20, gpDto.getDistType())
				.setParameter(21, gpDto.getActNumSt())
				.setParameter(22, gpDto.getDebitAmount())
				.setParameter(23, gpDto.getCreditAmount())
				.setParameter(24, gpDto.getDISTREF())
				.setParameter(25, gpDto.getRecordid())
				.setParameter(26, gpDto.getUserId())
				.setParameter(27, gpDto.getProNumber())
				.setParameter(28, gpDto.getContainer())
				.setParameter(29, gpDto.getChassis())
				.setParameter(30, gpDto.getDriverId())
				.setParameter(31, gpDto.getPordNumber())
				.setParameter(32, gpDto.getDivision())
				.setParameter(33, gpDto.getFailure())
				.setParameter(34, gpDto.getRepairType())
				.setParameter(35, gpDto.getInvoiceNumber())
				.setParameter(36, gpDto.isApHold()).executeUpdate();

	}

	@Override
	public void executeRecievedIntegrations(String company, String batchId) {
		emIntegration
				.createNativeQuery(
						"{call USP_ReceivedIntegrations(?,?,?,?,?,?,?,?,?,?)}")
				.setParameter(1, "EFS").setParameter(2, company)
				.setParameter(3, batchId).setParameter(4, 0)
				.setParameter(5, null).setParameter(6, null)
				.setParameter(7, null).setParameter(8, new Date())
				.setParameter(9, "ILSGP01").setParameter(10, "EFS_Automation")
				.executeUpdate();
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
		List<Object[]> results = emGP.createNativeQuery("{call USP_QuerySWS(?,?)}")
				.setParameter(1, "SELECT div_code FROM trk.driver WHERE code = '" + driverId + "';")
				.setParameter(2, null)
				.getResultList();
		
		Object[] obj = results.get(0);
		return obj[0].toString();
	}

}
