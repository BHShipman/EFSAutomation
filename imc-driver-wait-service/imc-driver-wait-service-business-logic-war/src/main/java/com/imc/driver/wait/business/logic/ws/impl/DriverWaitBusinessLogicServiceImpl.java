package com.imc.driver.wait.business.logic.ws.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import com.imc.driver.wait.business.logic.ws.DriverWaitBusinessLogicService;
import com.imc.driver.wait.service.bo.DriverWaitBO;
import com.imc.driver.wait.service.data.DrwaitFifoDTO;
import com.imc.driver.wait.service.entities.Drwait;

@WebService(serviceName = "DriverWaitBusinessLogicWS", portName = "DriverWaitBusinessLogicWS", 
	endpointInterface = "com.imc.driver.wait.business.logic.ws.DriverWaitBusinessLogicService")
public class DriverWaitBusinessLogicServiceImpl implements DriverWaitBusinessLogicService {

	@EJB(name = "DriverWaitBO")
	DriverWaitBO driverWaitBO;
	
	@Override
	public void processDrwaitEventQueue(String usrCode, int cmpyNo) {
		driverWaitBO.processDrwaitEventQueue(usrCode, cmpyNo);
	}

	@Override
	public List<Drwait> getIncompleteDrwaits(String usrCode) {
		return driverWaitBO.getIncompleteDrwaits(usrCode);
	}

	@Override
	public void processMoveUpdate(DrwaitFifoDTO drwaitFifo) {
		driverWaitBO.processMoveUpdate(drwaitFifo);
		
	}

	


}
