package com.imc.efs.automation.helper;

import java.util.Hashtable;
import java.util.Map;

import com.imc.cxf.sample.data.Chassis;
import com.imc.efs.automation.exception.DuplicateChassisException;

public class ChassisDataHelper {

	private static Map<String, Chassis> chassisIdData;
	
	private static ChassisDataHelper _instance;
	
	private ChassisDataHelper(){
		chassisIdData = new Hashtable<String, Chassis>();
	}
	
	public static ChassisDataHelper getInstance(){
		if(_instance == null){
			_instance = new ChassisDataHelper();
		}
		return _instance;
	}
		
	public Chassis getChassis(String chassisId){
		return chassisIdData.get(chassisId);
	}
	
	public void insertChassis(Chassis chassis) throws DuplicateChassisException{
		if(!chassisIdData.containsKey(chassis.getChassisID())){
			chassisIdData.put(chassis.getChassisID(), chassis);
		} else {
			throw new DuplicateChassisException(chassis);
		}
	}
	
	public void updateChassis(Chassis chassis){
		if(chassisIdData.containsKey(chassis.getChassisID())){
			chassisIdData.put(chassis.getChassisID(), chassis);
		}
	}
}
