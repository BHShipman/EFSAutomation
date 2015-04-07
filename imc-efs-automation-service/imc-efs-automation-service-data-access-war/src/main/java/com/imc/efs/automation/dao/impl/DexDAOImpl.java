package com.imc.efs.automation.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

import com.imc.efs.automation.dao.DexDAO;

@Stateless(name = "DexDAO")
@Remote(DexDAO.class)
@TransactionManagement(TransactionManagementType.BEAN)
public class DexDAOImpl implements DexDAO {



	@Override
	public void saveDocument(String username,
			String password, String requestId, String docType, String filePath) {
		// TODO Imaging Service

	}

//	@Override
//	public boolean checkIfHasInvoice(long dexProjectId, String field1) {
//		Query query = em
//				.createNativeQuery("SELECT COUNT(*) FROM fb.dbo.View_DEXDocuments "
//						+ "WHERE Field1 = '"
//						+ field1
//						+ "' AND Field2 = 'INV'"
//						+ " AND ProjectId = '" + dexProjectId + "'");
//		int result = (int) query.getSingleResult();
//		if (result > 0) {
//			return true;
//		} else
//			return false;
//	}

	@Override
	public List<String> getDocumentFilePathsByRequestId(int requestId) {
		return null;
	}

}
