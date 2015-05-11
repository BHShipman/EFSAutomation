package com.imc.efs.automation.bo.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.apache.commons.io.FileUtils;

import com.imc.data.access.service.EfsDataAccessServiceBean;
import com.imc.dex.service.DexServiceInvoker;
import com.imc.dex.service.IndexIds;
import com.imc.dex.service.IndexedFile;
import com.imc.dex.service.IndexField;
import com.imc.efs.automation.bo.DocBO;
import com.imc.efs.automation.data.FileUpload;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.helper.PdfGenerator;
import com.lowagie.text.pdf.ArabicLigaturizer;

@Remote(DocBO.class)
@Stateless(name="DocBO")
public class DocBOImpl implements DocBO {

	@EJB(beanName="EfsDAOService")
	private EfsDataAccessServiceBean efsDAOService;
	@EJB(beanName="PdfGenerator")
	private PdfGenerator pdfGenerator;
	@EJB(beanName="DexService")
	private DexServiceInvoker dexService;

	public DocBOImpl() {
	}

	public DocBOImpl(EfsDataAccessServiceBean efsDAOService, PdfGenerator pdf, DexServiceInvoker dexService) {
		this.efsDAOService = efsDAOService;
		this.pdfGenerator = pdf;
		this.dexService = dexService;
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
		File file = new File(issDocFilePath);
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
		if (field1 != null){
			IndexedFile iFile = new IndexedFile();
			try {
				iFile.setFileBytes(FileUtils.readFileToByteArray(file));
				iFile.setFileExtField(".pdf");
				IndexField field11 = new IndexField();
				IndexField field2 = new IndexField();
				IndexField field3 = new IndexField();
				IndexField field4 = new IndexField();
				List<IndexField> fields = new ArrayList<IndexField>();
				
				field11.setValueField("118");
				field11.setIdField(IndexIds.ProjectId);
				fields.add(field11);
				
				field2.setValueField("10");
				field2.setIdField(IndexIds.Idx1);
				fields.add(field2);
				
				field3.setValueField("ISSU");
				field3.setIdField(IndexIds.Idx2);
				fields.add(field3);
				
				field4.setValueField(file.getName());
				field4.setIdField(IndexIds.Name);
				fields.add(field4);
				
				iFile.setIndexFields(fields);
								
				} catch (IOException e) {
				e.printStackTrace();
			}
			
			dexService.upload(iFile);
		}
			
			
			
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
