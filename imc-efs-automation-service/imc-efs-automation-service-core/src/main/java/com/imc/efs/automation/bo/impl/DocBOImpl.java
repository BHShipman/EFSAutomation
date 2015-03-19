package com.imc.efs.automation.bo.impl;

import com.imc.efs.automation.bo.DocBO;
import com.imc.efs.automation.dao.DexIntegratorDAO;
import com.imc.efs.automation.entities.Requests;

public class DocBOImpl implements DocBO {

	private DexIntegratorDAO _dex;
	
	public DocBOImpl() {
	}
	
	public DocBOImpl(DexIntegratorDAO _dex){
		this._dex = _dex;
	}
	
	public void createIssueDoc(Requests request, long projectId){
		//TODO research java equivalent of ABCpdf
	}

}
