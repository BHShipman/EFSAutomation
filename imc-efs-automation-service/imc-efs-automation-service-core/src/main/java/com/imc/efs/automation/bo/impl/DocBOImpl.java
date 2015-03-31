package com.imc.efs.automation.bo.impl;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.imc.efs.automation.bo.DocBO;
import com.imc.efs.automation.dao.DexDAO;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.helper.PdfGenerator;

@Remote(DocBO.class)
@Stateless(name="DocBO")
public class DocBOImpl implements DocBO {

	@EJB(beanName="DexDAO")
	private DexDAO _dex;
	@EJB(beanName="PdfGenerator")
	private PdfGenerator pdfGenerator;

	public DocBOImpl() {
	}

	public DocBOImpl(DexDAO _dex, PdfGenerator pdf) {
		this._dex = _dex;
		this.pdfGenerator = pdf;
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
		String issDocFilePath =  pdfGenerator.generateIssuanceDoc(request);
		
		String field1 = null;
		if(request.getRequestTypes().isIsOpsPortalType()){
			field1 = String.valueOf(request.getRequestId());
		} else
		{
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(request.getPoWoNumber());
			matcher.find();
			field1 = matcher.group(0);
		}
		if (field1 != null)
			_dex.saveDocument(projectId, "admin", "admin", field1, "ISSU", issDocFilePath);
			
			
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
