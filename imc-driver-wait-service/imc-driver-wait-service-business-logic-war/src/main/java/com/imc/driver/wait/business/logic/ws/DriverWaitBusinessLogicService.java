package com.imc.driver.wait.business.logic.ws;



import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.imc.driver.wait.service.data.DrwaitFifoDTO;
import com.imc.driver.wait.service.entities.Drwait;

@WebService
public interface DriverWaitBusinessLogicService {
	@WebMethod
	void processDrwaitEventQueue(@WebParam(name="usrCode")String usrCode, @WebParam(name="cmpyNo") int cmpyNo);
	@WebMethod
	List<Drwait> getIncompleteDrwaits(@WebParam(name="usrCode")String usrCode);
//	@WebMethod
//	void processMoveUpdate(@WebParam(name="drwaitEvent")DrwaitEventQueue drwaitEvent);
	@WebMethod
	void processMoveUpdate(@WebParam(name="drwaitFifo")DrwaitFifoDTO drwaitFifo);
}
