package com.imc.efs.automation.bo.impl;

import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.imc.data.access.service.EfsDataAccessServiceBean;
import com.imc.efs.automation.bo.DocBO;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.helper.PdfGenerator;

@Remote(DocBO.class)
@Stateless(name="DocBO")
public class DocBOImpl implements DocBO {

	@EJB(beanName="EfsDAOService")
	private EfsDataAccessServiceBean efsDAOService;
	@EJB(beanName="PdfGenerator")
	private PdfGenerator pdfGenerator;

	public DocBOImpl() {
	}

	public DocBOImpl(EfsDataAccessServiceBean efsDAOService, PdfGenerator pdf) {
		this.efsDAOService = efsDAOService;
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
	public void createIssueDoc(Requests request) {
		String issDocFilePath =  pdfGenerator.generateIssuanceDoc(request);
		
		String field1 = null;
		if(request.getRequesttypes().isIsOpsPortalType()){
			field1 = String.valueOf(request.getRequestId());
		} else
		{
			Pattern pattern = Pattern.compile("\\d+");
			Matcher matcher = pattern.matcher(request.getPoWoNumber());
			matcher.find();
			field1 = matcher.group(0);
		}
		if (field1 != null)
			efsDAOService.efsDAOService.saveDocument("admin", "admin", field1, "ISSU", issDocFilePath);
			
			
	}

	@Override
	public void storeDocuments(List<FileUpload> fileUploads, int requestId,
			String user) {
		
		for (FileUpload fu : fileUploads) {
			efsDAOService.efsDAOService.saveDocument("admin", "admin", String.valueOf(requestId), fu.getFileType(), fu.getFilePath());
		}
	}

//	@Override
//	public void validateHasInvoice(long dexProjectId, String poWoNumber) throws Exception {
//		
//		boolean hasInvoice = _dex.checkIfHasInvoice(dexProjectId, poWoNumber);
//		
//		if (!hasInvoice) {
//			throw new Exception("Not Implemented - No Invoice found");
//		}
//	}
	
	@Override
	public boolean validateHasInvoice(Requests request){
		File invoice = new File(request.getPathToInvoice());
		
		if(invoice.exists() && !invoice.isDirectory()){
			return true;
		}else
			return false;
	}

}
