package com.imc.efs.automation.bo.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.imc.efs.automation.bo.DocBO;
import com.imc.efs.automation.dao.DexDAO;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.entities.Requests;

@Remote(DocBO.class)
@Stateless(name="DocBO")
public class DocBOImpl implements DocBO {

	@EJB(beanName="DexDAO")
	private DexDAO _dex;

	public DocBOImpl() {
	}

	public DocBOImpl(DexDAO _dex) {
		this._dex = _dex;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.imc.efs.automation.bo.impl.DocBO#createIssueDoc(com.imc.efs.automation
	 * .entities.Requests, long)
	 */
	@Override
	public void createIssueDoc(Requests request, long projectId) {
		// TODO research java equivalent of ABCpdf
	}

	@Override
	public void storeDocuments(List<FileUpload> fileUploads, int requestId,
			String user, long dexProjectId) {
		
		for (FileUpload fu : fileUploads) {
			_dex.saveDocument(dexProjectId, "admin", "admin", String.valueOf(requestId), fu.getFileType(), fu.getFilePath());
		}
	}

	@Override
	public void validateHasInvoice(long dexProjectId, String poWoNumber) throws Exception {
		
		boolean hasInvoice = _dex.checkIfHasInvoice(dexProjectId, poWoNumber);
		
		if (!hasInvoice) {
			throw new Exception("Not Implemented - No Invoice found");
		}
	}

}
