package com.imc.efs.automation.enums;

public enum RequestStatuses {

	PendingApproval(1),
	PendingDsAudit(2),
	PendingIssued(3),
	Issued(3),
	Activated(4),
	Voided(5);
	
	private final int index;
	
	RequestStatuses(int index){
		this.index = index;
	}
	
	public int index(){
		return index;
	}
}
