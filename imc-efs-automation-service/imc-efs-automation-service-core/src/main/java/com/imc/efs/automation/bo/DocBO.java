package com.imc.efs.automation.bo;

import com.imc.efs.automation.entities.Requests;

public interface DocBO {

	public abstract void createIssueDoc(Requests request, long projectId);

}