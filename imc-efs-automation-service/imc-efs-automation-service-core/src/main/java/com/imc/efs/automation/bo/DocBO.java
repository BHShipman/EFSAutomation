package com.imc.efs.automation.bo;

import java.util.List;

import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.entities.Requests;

public interface DocBO {

	public void createIssueDoc(Requests request, long projectId);
	
	public void storeDocuments(List<FileUpload> fileUploads, int requestId, String user, long dexProjectId);
	
	public void validateHasInvoice(long dexProjectId, String poWoNumber) throws Exception;

}