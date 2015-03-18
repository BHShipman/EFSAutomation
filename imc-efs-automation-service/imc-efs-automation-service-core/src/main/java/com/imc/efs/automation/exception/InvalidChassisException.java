package com.imc.efs.automation.exception;

import com.imc.cxf.sample.data.Chassis;

public class InvalidChassisException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private String chassisNbr;
	private String ownerID;
	
	public InvalidChassisException(Chassis chassis){
		if(chassis != null){
			this.chassisNbr = chassis.getChassisID();
			this.ownerID = chassis.getOwnerID();
		}
	}

    public String getMessage(){
        return "Invalid chassis data chassisNbr::" + chassisNbr + "...ownerID::" + ownerID;
    }
}