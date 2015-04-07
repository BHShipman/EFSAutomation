package com.imc.efs.automation.helper;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.ejb.Stateless;

import com.imc.efs.automation.entities.Requests;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.html.simpleparser.HTMLWorker;
import com.lowagie.text.pdf.PdfWriter;

@Stateless(name="PdfGenerator")
public class PdfGenerator {

	public PdfGenerator() {
	}

	
	public String generateIssuanceDoc(Requests request){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		NumberFormat amountFormat = NumberFormat.getCurrencyInstance(Locale.US);
		amountFormat.setMinimumFractionDigits(1);
		amountFormat.setMaximumFractionDigits(2);
		
		String header = "<h2 align=\"center\">" + request.getRequesttypes().getName() + " EFS Automation Check Issuance Document</h2><h4 align=\"center\">Generated at " + sdf.format(new Date()) + "<h4><hr/>";
		List<String> htmlList = new ArrayList<String>();
		htmlList.add(makeLabelAndValue("Request Date", sdf.format(request.getRequestDate())));
		htmlList.add(makeLabelAndValue("Reference ID", String.valueOf(request.getMoneyCodeReferenceNumber())));
		htmlList.add(makeLabelAndValue("Issue Type", "EFS Automation"));
		htmlList.add(makeLabelAndValue("Requester", request.getRequester()));
		htmlList.add(makeLabelAndValue("Notes", request.getDescription()));
		htmlList.add(makeLabelAndValue("Company", request.getCompany()));
		htmlList.add(makeLabelAndValue("EFS Amount", amountFormat.format(request.getEfsAmount().setScale(2, RoundingMode.HALF_EVEN).doubleValue())));
		htmlList.add(makeLabelAndValue("Driver ID", request.getDriverId()));
		if(request.getApprover() == null || request.getApprover().isEmpty()){
			htmlList.add(makeLabelAndValue("Approver", "(no approver)"));
		}else{
			htmlList.add(makeLabelAndValue("Approver", request.getApprover()));
		}
			if(request.getIssuer() == null || request.getIssuer().isEmpty()){
			htmlList.add(makeLabelAndValue("Issuer", "(no issuer)"));
		}else{
			htmlList.add(makeLabelAndValue("Issuer", request.getIssuer()));
		}
		
		String list = makePdfHtmlList(htmlList);
		
		return saveAndReturnPath(header, list);
	}
	
	private String makeLabelAndValue(String label, String value) {

		return "<b>" + label + "</b>: " + value;
	}


	private String makePdfHtmlList(List<String> strings) {
		StringBuilder sb = new StringBuilder();
		sb.append("<UL align=\"left\">");
		
		for(String string : strings){
			sb.append("<LI>");
			sb.append(string);
			sb.append("</LI>");
		}
		
		sb.append("</UL>");
		
		return sb.toString();
	}


	private static String saveAndReturnPath(String header, String list){
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		
		Document document = new Document();
		
		String tempDocDirectory = "C://temp//EfsIssuance"+sdf.format(new Date()) + ".pdf";
		try{
			PdfWriter pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(tempDocDirectory));
		} catch (FileNotFoundException | DocumentException e){
			e.printStackTrace();
		}
		
		document.open();
		HTMLWorker worker = new HTMLWorker(document);
		try{
		worker.parse(new StringReader(header));
		worker.parse(new StringReader(list));
		}catch(IOException e){
			e.printStackTrace();
		}
		document.close();
		
		
		
		return tempDocDirectory;
		
	}
	
	//TODO use IMC Imaging Service, once implemented
}
