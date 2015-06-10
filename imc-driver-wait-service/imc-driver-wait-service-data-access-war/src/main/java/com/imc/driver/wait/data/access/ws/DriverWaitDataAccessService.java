package com.imc.driver.wait.data.access.ws;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.imc.driver.wait.service.data.UserDetailsDTO;
import com.imc.driver.wait.service.entities.Driver;
import com.imc.driver.wait.service.entities.Drwait;
import com.imc.driver.wait.service.entities.DrwaitEventQueue;
import com.imc.driver.wait.service.entities.Locprof;
import com.imc.driver.wait.service.entities.Mcgps;
import com.imc.driver.wait.service.entities.Move;
import com.imc.driver.wait.service.entities.Orchrg;
import com.imc.driver.wait.service.entities.Order;
import com.imc.driver.wait.service.entities.Userid;

@WebService
public interface DriverWaitDataAccessService {

	// BreadcrumbDAO
	@WebMethod
	List<Mcgps> getBreadcrumbs2(@WebParam(name="cmpyNo") int cmpyNo, @WebParam(name="targetDatetime") Date targetDatetime, 
			@WebParam(name="toleranceInMinutes") int toleranceInMinutes, @WebParam(name="drCode") String drCode);
	@WebMethod
	List<Mcgps> getBreadcrumbs3(@WebParam(name="cmpyNo") int cmpyNo, @WebParam(name="targetDatetime") Date targetDatetime, 
			@WebParam(name="toleranceInMinutes") int toleranceInMinutes);
	@WebMethod
	List<Mcgps> getBreadcrumbs(@WebParam(name="cmpyNo") int cmpyNo, @WebParam(name="startDatetime")  Date startDatetime,
			@WebParam(name="endDatetime")  Date endDatetime, @WebParam(name="drCode")  String drCode);
	@WebMethod
	List<Mcgps> getBreadcrumbs4(@WebParam(name="cmpyNo") int cmpyNo, @WebParam(name="startDatetime") Date startDatetime, 
			@WebParam(name="endDatetime") Date endDatetime);

	// DrwaitDAO
	@WebMethod
	void insertDrwait(@WebParam(name="driverWait") Drwait driverWait);
	@WebMethod
	List<Drwait> getAllDrwaits(@WebParam(name="userCode") String userCode, @WebParam(name="includeComplete") boolean includeComplete);
	@WebMethod
	Drwait getByExportMoveNo(@WebParam(name="exportMoveNo") int exportMoveNo, @WebParam(name="cmpyNo")int cmpyNo);
	@WebMethod
	Drwait getByImportMoveNo(@WebParam(name="importMoveNo") int importMoveNo, @WebParam(name="cmpyNo")int cmpyNo);

	// DrwaitEventQueueDAO
	@WebMethod
	List<DrwaitEventQueue> getAllDrwaitEventsAllUsers(@WebParam(name="includeProcessed") boolean includeProcessed);
	@WebMethod
	List<DrwaitEventQueue> getAllDrwaitEvents(@WebParam(name="usrCode") String usrCode, @WebParam(name="includeProcessed") boolean includeProcessed);
	@WebMethod
	void updateDrwaitEvent(@WebParam(name="drwaitEvent") DrwaitEventQueue drwaitEvent);
	@WebMethod
	void insertDrwaitEvent(@WebParam(name="drwaitEvent") DrwaitEventQueue drwaitEvent);
	
	// LocprofDAO
	@WebMethod
	Locprof getLocprof(@WebParam(name="lpCode") String lpCode, @WebParam(name="cmpyNo") int cmpyNo);

	
	// MoveDAO
	@WebMethod
	void updateMove(@WebParam(name="move") Move move);
	@WebMethod
	Move getMove(@WebParam(name="moveNo")int moveNo, @WebParam(name="cmpyNo")int cmpyNo);

	// OrchrgDAO
	@WebMethod
	void insertOrchrg(@WebParam(name="orchrg") Orchrg orchrg);
	
	// OrderDAO
	Order getOrder(@WebParam(name="orNo")int orNo, @WebParam(name="cmpyNo")int cmpyNo);
	
	// UserDAO
	@WebMethod
	Userid getUser(@WebParam(name="userCode") String userCode);
	@WebMethod
	UserDetailsDTO getUserDetails(@WebParam(name="userCode") String userCode);
	
	// DriverDAO
	@WebMethod
	Driver getDriverByCodeAndCmpyNo(@WebParam(name="drCode") String drCode, 
			@WebParam(name="cmpyNo")int cmpyNo);


	

	
}
