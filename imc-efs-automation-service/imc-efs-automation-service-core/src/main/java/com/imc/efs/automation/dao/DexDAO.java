package com.imc.efs.automation.dao;

import java.util.List;

public interface DexDAO {

	void saveDocument(long dexProjectId, String username, String password, String requestId, String docType, String filePath);
	boolean checkIfHasInvoice(long dexProjectId, String field1);
	List<String> getDocumentFilePathsByRequestId(int requestId, long dexProjectId);
	
}
