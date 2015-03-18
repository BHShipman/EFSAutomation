package com.imc.cxf.sample.service;

import com.imc.cxf.sample.data.Chassis;
import com.imc.cxf.sample.data.ChassisResponse;

public interface ChassisService {

	public ChassisResponse getChassis(String chassisId);

	public ChassisResponse addChassis(String chassisID, String chassisOwner);	

    public ChassisResponse addChassisJson(Chassis chassis);
}
