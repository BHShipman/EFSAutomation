package com.imc.efs.automation.bo.impl;

import com.imc.efs.automation.bo.DocBO;
import com.imc.efs.automation.dao.DexDAO;
import com.imc.efs.automation.entities.Requests;

public class DocBOImpl implements DocBO {

	private DexDAO _dex;
	
	public DocBOImpl() {
	}
	
	public DocBOImpl(DexDAO _dex){
		this._dex = _dex;
	}
	
	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.DocBO#createIssueDoc(com.imc.efs.automation.entities.Requests, long)
	 */
	@Override
	public void createIssueDoc(Requests request, long projectId){
		//TODO research java equivalent of ABCpdf
	}

}
