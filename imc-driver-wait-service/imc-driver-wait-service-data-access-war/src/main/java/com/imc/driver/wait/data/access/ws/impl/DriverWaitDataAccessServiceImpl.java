package com.imc.driver.wait.data.access.ws.impl;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.jws.WebService;

import com.imc.driver.wait.dao.BreadcrumbDAO;
import com.imc.driver.wait.dao.DriverDAO;
import com.imc.driver.wait.dao.DrwaitDAO;
import com.imc.driver.wait.dao.DrwaitEventQueueDAO;
import com.imc.driver.wait.dao.LocprofDAO;
import com.imc.driver.wait.dao.MoveDAO;
import com.imc.driver.wait.dao.OrchrgDAO;
import com.imc.driver.wait.dao.OrderDAO;
import com.imc.driver.wait.dao.UserDAO;
import com.imc.driver.wait.data.access.ws.DriverWaitDataAccessService;
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

@WebService(serviceName = "DriverWaitDataAccessWS", portName = "DriverWaitDataAccessWS", 
	endpointInterface = "com.imc.driver.wait.data.access.ws.DriverWaitDataAccessService")
public class DriverWaitDataAccessServiceImpl implements DriverWaitDataAccessService {

	@EJB(name="BreadcrumbDAO")
	private BreadcrumbDAO breadcrumbDAO;
	@EJB(name="DrwaitDAO")
	private DrwaitDAO drwaitDAO;
	@EJB(name="DrwaitEventQueueDAO")
	private DrwaitEventQueueDAO drwaitEventQueueDAO;
	@EJB(name="LocprofDAO")
	private LocprofDAO locprofDAO;
	@EJB(name="MoveDAO")
	private MoveDAO moveDAO;
	@EJB(name="OrderDAO")
	private OrderDAO orderDAO;
	@EJB(name="OrchrgDAO")
	private OrchrgDAO orchrgDAO;
	@EJB(name="UserDAO")
	private UserDAO userDAO;
	@EJB(name="DriverDAO")
	private DriverDAO driverDAO;
	
	@Override
	public List<Mcgps> getBreadcrumbs2(int cmpyNo, Date targetDatetime,
			int toleranceInMinutes, String drCode) {
		return breadcrumbDAO.getAll(cmpyNo, targetDatetime, toleranceInMinutes, drCode);
	}
	@Override
	public List<Mcgps> getBreadcrumbs3(int cmpyNo, Date targetDatetime,
			int toleranceInMinutes) {
		return breadcrumbDAO.getAll(cmpyNo, targetDatetime, toleranceInMinutes);
	}
	@Override
	public List<Mcgps> getBreadcrumbs(int cmpyNo, Date startDatetime,
				Date endDatetime, String drCode) {
		return breadcrumbDAO.getAll(cmpyNo, startDatetime, endDatetime, drCode);
	}
	@Override
	public List<Mcgps> getBreadcrumbs4(int cmpyNo, Date startDatetime,
			Date endDatetime) {
		return breadcrumbDAO.getAll(cmpyNo, startDatetime, endDatetime);
	}
	@Override
	public void insertDrwait(Drwait driverWait) {
		drwaitDAO.insert(driverWait);
	}
	@Override
	public List<Drwait> getAllDrwaits(String userCode, boolean includeComplete) {
		return drwaitDAO.getAll(userCode, includeComplete);
	}
	@Override
	public Drwait getByExportMoveNo(int exportMoveNo, int cmpyNo) {
		return drwaitDAO.getByExportMoveNo(exportMoveNo, cmpyNo);
	}
	@Override
	public Drwait getByImportMoveNo(int importMoveNo, int cmpyNo) {
		return drwaitDAO.getByImportMoveNo(importMoveNo, cmpyNo);
	}
	@Override
	public List<DrwaitEventQueue> getAllDrwaitEventsAllUsers(boolean includeProcessed) {
		return drwaitEventQueueDAO.getAll(includeProcessed);
	}
	@Override
	public List<DrwaitEventQueue> getAllDrwaitEvents(String usrCode,
			boolean includeProcessed) {
		return drwaitEventQueueDAO.getAll(usrCode, includeProcessed);
	}
	@Override
	public void updateDrwaitEvent(DrwaitEventQueue drwaitEvent) {
		drwaitEventQueueDAO.update(drwaitEvent);
	}
	@Override
	public void insertDrwaitEvent(DrwaitEventQueue drwaitEvent) {
		drwaitEventQueueDAO.insert(drwaitEvent);
	}
	@Override
	public Locprof getLocprof(String lpCode, int cmpyNo) {
		return locprofDAO.get(lpCode, cmpyNo);
	}
	@Override
	public void updateMove(Move move) {
		moveDAO.update(move);
	}
	@Override
	public void insertOrchrg(Orchrg orchrg) {
		orchrgDAO.insert(orchrg);
	}
	@Override
	public Userid getUser(String userCode) {
		return userDAO.get(userCode);
	}
	@Override
	public UserDetailsDTO getUserDetails(String userCode) {
		return userDAO.getUserDetails(userCode);
	}
	@Override
	public Driver getDriverByCodeAndCmpyNo(String drCode, int cmpyNo) {
		return driverDAO.getDriverByCodeAndCmpyNo(drCode, cmpyNo);
	}
	@Override
	public Order getOrder(int orNo, int cmpyNo) {
		return orderDAO.get(orNo, cmpyNo);
	}
	@Override
	public Move getMove(int moveNo, int cmpyNo) {
		return moveDAO.get(moveNo, cmpyNo);
	}
	
	
	
	
//	@Override
//	public void addAccessorial(Orchrg transientInstance) {
//		accessorialDAO.add(transientInstance);
//	}
//	
//	@Override
//	public List<Mcgps> GetBreadcrumbs(int cmpyNo, String driverCode,
//			Date targetDatetime, int toleranceInMinutes) {
//		return breadcrumbDAO.GetBreadcrumbs(cmpyNo, driverCode, targetDatetime, toleranceInMinutes);
//	}
//
////	@Override
////	public List<MoveDTO> getUnconfirmedDriverWaitsByDispatcher(
////			int cmpyNo, String dispatcher) {
////		return moveDAO.getUnconfirmedDriverWaitsByDispatcher(cmpyNo, dispatcher);
////	}
//
//	@Override
//	public void updateDestinationArvDpt(int cmpyNo, int moveNo, Date arrival,
//			Date departure) {
//		moveDAO.updateDestinationArvDpt(cmpyNo, moveNo, arrival, departure);
//	}
//
//	@Override
//	public void updateOriginArvDpt(int cmpyNo, int moveNo, Date arrival,
//			Date departure) {
//		moveDAO.updateOriginArvDpt(cmpyNo, moveNo, arrival, departure);
//	}
//
//	@Override
//	public void insertDrWait(Drwait driverWait) {
//		drwaitDAO.insert(driverWait);
//	}
//
//	@Override
//	public Locprof getLocprof(String lpCode, int cmpy_no) {
//		return locprofDAO.get(lpCode, cmpy_no);
//	}
//
//	@Override
//	public UserDetailsDTO getUserDetails(String userCode) {
//		return userDAO.getUserDetails(userCode);
//	}
}