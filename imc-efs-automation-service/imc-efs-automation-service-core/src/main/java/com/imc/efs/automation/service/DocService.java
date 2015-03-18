package com.imc.efs.automation.service;

import com.imc.efs.automation.bo.IDexIntegrator;
import com.imc.efs.automation.entities.Requests;

public class DocService {

	private IDexIntegrator _dex;
	
	public DocService() {
	}
	
	public DocService(IDexIntegrator _dex){
		this._dex = _dex;
	}
	
	public void createIssueDoc(Requests request, long projectId){
		//TODO research java equivalent of ABCpdf
	}

}
