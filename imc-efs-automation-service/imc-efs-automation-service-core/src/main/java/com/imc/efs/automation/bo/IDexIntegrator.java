package com.imc.efs.automation.bo;

import java.util.List;

public interface IDexIntegrator {

	void saveDocument(long dexProjectId, String username, String password, String requestId, String docType, String filePath);
	boolean checkIfHasInvoice(long dexProjectId, String field1);
	List<String> getDocumentFilePathsByRequestId(int requestId, long dexProjectId);
	
}
