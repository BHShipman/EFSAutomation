package com.imc.efs.automation.dao.impl;

import java.util.List;

import com.imc.efs.automation.dao.DexDAO;

public class DexDAOImpl implements DexDAO {

	@Override
	public void saveDocument(long dexProjectId, String username,
			String password, String requestId, String docType, String filePath) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean checkIfHasInvoice(long dexProjectId, String field1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<String> getDocumentFilePathsByRequestId(int requestId,
			long dexProjectId) {
		// TODO Auto-generated method stub
		return null;
	}

}
