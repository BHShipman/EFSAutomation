package com.imc.driver.wait.service.bo.impl;

import java.math.MathContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.imc.driver.wait.data.access.bean.DriverWaitDataAccessBean;
import com.imc.driver.wait.service.bo.DriverWaitBO;
import com.imc.driver.wait.service.data.BreadcrumbDTO;
import com.imc.driver.wait.service.data.CoordinatePoint;
import com.imc.driver.wait.service.data.DrwaitFifoDTO;
import com.imc.driver.wait.service.entities.Driver;
import com.imc.driver.wait.service.entities.Drwait;
import com.imc.driver.wait.service.entities.DrwaitEventQueue;
import com.imc.driver.wait.service.entities.Locprof;
import com.imc.driver.wait.service.entities.Mcgps;
import com.imc.driver.wait.service.entities.Move;
import com.imc.driver.wait.service.utils.CoordinatePointSerializer;
import com.imc.driver.wait.service.utils.DatesUtil;

@Stateless(name = "DriverWaitBO")
@Remote(DriverWaitBO.class)
public class DriverWaitBOImpl implements DriverWaitBO {

	@EJB(name = "DriverWaitDAOService")
	private DriverWaitDataAccessBean driverWaitDAOBean;

	private CoordinatePointSerializer cps = new CoordinatePointSerializer();
	private static final Logger log = LoggerFactory
			.getLogger(DriverWaitBOImpl.class);
	private static Gson gson = new Gson();

	public DriverWaitBOImpl() {

	}

	public DriverWaitBOImpl(DriverWaitDataAccessBean driverWaitDAOBean) {
		this.driverWaitDAOBean = driverWaitDAOBean;
	}

	@Override
	public void processDrwaitEventQueue(String usrCode, int cmpyNo) {
		List<DrwaitEventQueue> unprocessedDrwaitEvents = driverWaitDAOBean.driverWaitDAOService
				.getAllDrwaitEvents(usrCode, false);

		for (DrwaitEventQueue drwaitEvent : unprocessedDrwaitEvents) {
			// get (json)geofence from lp
			Locprof lp = driverWaitDAOBean.driverWaitDAOService.getLocprof(
					drwaitEvent.getLpCode(), drwaitEvent.getCmpyNo());

			// convert geofence from json to CoordinatePoint[]
			CoordinatePoint[] polygon = cps
					.deserializeToArray(lp.getGeofence());

			Date wdatetime = DatesUtil.combineDateAndTime(
					drwaitEvent.getWdate(), drwaitEvent.getWtime());

			// get breadcrumbs
			List<Mcgps> bcs = (List<Mcgps>) driverWaitDAOBean.driverWaitDAOService
					.getBreadcrumbs2(cmpyNo, wdatetime, 600,
							drwaitEvent.getDrCode());

			List<List<BreadcrumbDTO>> chains = getWaits(bcs, polygon);

			List<BreadcrumbDTO> matchedChain = null;

			if (drwaitEvent.getOrigOrDest().equals("O")) {
				matchedChain = getBestMatch(chains, wdatetime,
						drwaitEvent.getOrigOrDest());
			} else if (drwaitEvent.getOrigOrDest().equals("D")) {
				matchedChain = getBestMatch(chains, wdatetime,
						drwaitEvent.getOrigOrDest());
			}

			getOrCreateDrwait(drwaitEvent, wdatetime,
					matchedChain, null);
			drwaitEvent.setProcessed((short) 1);
			driverWaitDAOBean.driverWaitDAOService
					.updateDrwaitEvent(drwaitEvent);
		}
	}

	private Drwait getOrCreateDrwait(DrwaitEventQueue de, Date wdatetime,
			List<BreadcrumbDTO> breadcrumbs, Drwait previousDrwait) {
		Drwait drwait = null;
		if (de.getOrigOrDest().equals("O")) {
			drwait = driverWaitDAOBean.driverWaitDAOService.getByImportMoveNo(
					de.getMoveNo(), de.getCmpyNo());
			if (drwait == null || drwait.getStatus() == 1) {
				if (drwait == null) {
					drwait = new Drwait();
					drwait.setLpCode(de.getLpCode());
					drwait.setDrCode(de.getDrCode());
					drwait.setUsrCode(de.getUsrCode());
					drwait.setDivCode(de.getDivCode());
					drwait.setCmpyNo(de.getCmpyNo());
					drwait.setStatus((short) 1);
				}

				drwait.setImportOrderNo(de.getOrNo());
				drwait.setImportMoveNo(de.getMoveNo());
				drwait.setImportPro(de.getPro());
				drwait.setImportDeparture(wdatetime);

				if (breadcrumbs != null) {
					String jsonBreadcrumbs = gson.toJson(breadcrumbs);
					drwait.setBreadcrumbs(jsonBreadcrumbs);
				}
			}
		} else if (de.getOrigOrDest().equals("D")) {
			drwait = driverWaitDAOBean.driverWaitDAOService.getByExportMoveNo(
					de.getMoveNo(), de.getCmpyNo());
			if (drwait == null || drwait.getStatus() == 1) {
				if (drwait == null) {
					// if (de.getLpCode().equals(previousDrwait.getLpCode())

					drwait = new Drwait();
					drwait.setLpCode(de.getLpCode());
					drwait.setDrCode(de.getDrCode());
					drwait.setUsrCode(de.getUsrCode());
					drwait.setDivCode(de.getDivCode());
					drwait.setCmpyNo(de.getCmpyNo());
					drwait.setStatus((short) 1);
				}

				drwait.setExportOrderNo(de.getOrNo());
				drwait.setExportMoveNo(de.getMoveNo());
				drwait.setExportPro(de.getPro());
				drwait.setExportArrival(wdatetime);

			}
		}
		if (breadcrumbs != null) {
			String jsonBreadcrumbs = gson.toJson(breadcrumbs);
			drwait.setBreadcrumbs(jsonBreadcrumbs);
		}

		if (drwait.getId() > 0) {
			// need update drwait method in DAO
		} else {
			driverWaitDAOBean.driverWaitDAOService.insertDrwait(drwait);
		}

		return drwait;

	}

	private List<BreadcrumbDTO> getBestMatch(List<List<BreadcrumbDTO>> chains,
			Date wdatetime, String origOrDest) {
		if (chains.size() == 0)
			return null;
		else if (chains.size() == 1)
			return chains.get(0);
		else {
			List<BreadcrumbDTO> match = chains.get(0);
			for (int i = 1; i < chains.size(); i++) {
				List<BreadcrumbDTO> currentChain = chains.get(i);
				BreadcrumbDTO currentBreadcrumbTarget = null;
				BreadcrumbDTO matchBreadcrumbTarget = null;
				if (origOrDest.equals("O")) {
					currentBreadcrumbTarget = currentChain.get(currentChain
							.size());
					matchBreadcrumbTarget = match.get(match.size());
				} else if (origOrDest.equals("D")) {
					currentBreadcrumbTarget = currentChain.get(0);
					matchBreadcrumbTarget = match.get(0);
				}

				int matchDifference = Math.abs(matchBreadcrumbTarget
						.getEventDatetime().compareTo(wdatetime));
				int currentDifference = Math.abs(currentBreadcrumbTarget
						.getEventDatetime().compareTo(wdatetime));
				if (currentDifference < matchDifference) {
					match = currentChain;
				}
			}
			return match;
		}

	}

	private BreadcrumbDTO createBreadcrumbDTO(Mcgps bc, String note,
			boolean isInside) {
		return new BreadcrumbDTO(bc.getMvehCode(),
				DatesUtil.combineDateAndSecondsAfterMidnight(bc.getEventdt(),
						bc.getEventSecs()), bc.getMdrvCode(), bc.getSpeed(),
				bc.getHeading(), bc.getSignal(), bc.getLatitude(),
				bc.getLongitude(), bc.getFixtype(), note, isInside);
	}

	private List<List<BreadcrumbDTO>> getWaits(List<Mcgps> bcs,
			CoordinatePoint[] polygon) {
		List<BreadcrumbDTO> breadcrumbsInChain = new ArrayList<BreadcrumbDTO>();
		List<List<BreadcrumbDTO>> chains = new ArrayList<List<BreadcrumbDTO>>();

		for (int i = 0; i < bcs.size(); i++) {
			if (IsPointInPolygon(polygon, new CoordinatePoint(bcs.get(i)
					.getLatitude(), bcs.get(i).getLongitude()))
					|| (i + 1 < bcs.size() && breadcrumbsInChain.size() > 0 && IsPointInPolygon(
							polygon, new CoordinatePoint(bcs.get(i + 1)
									.getLatitude(), bcs.get(i + 1)
									.getLongitude())))) {
				if (breadcrumbsInChain.size() == 0) {
					for (int j = 2; j > 0; j--) {
						if (i - j > 0)
							breadcrumbsInChain.add(createBreadcrumbDTO(
									(bcs.get(i - j)), "APPROACHING", false));
					}
					breadcrumbsInChain.add(createBreadcrumbDTO(bcs.get(i),
							"ENTRY", true));
				} else {
					breadcrumbsInChain.add(createBreadcrumbDTO(bcs.get(i),
							"WAITING", true));
				}
			} else {
				if (breadcrumbsInChain.size() > 0) {
					for (int j = 1; j < 2; j++) {
						if (i + j < bcs.size())
							breadcrumbsInChain.add(createBreadcrumbDTO(
									bcs.get(i + j), "DEPARTING", false));
					}
					chains.add(breadcrumbsInChain);
					breadcrumbsInChain.clear();
					;
				} else
					continue;
			}
		}
		// incase the very last breadcrumb is still inside geofence...
		if (breadcrumbsInChain.size() > 0) {
			log.debug("Last breadcrumb was still in geofence... NEED LARGER TOLERANCE?");
			// chains.Add(new DetentionChain(breadcrumbsInChain));
		}

		return chains;
	}

	@Override
	public List<Drwait> getIncompleteDrwaits(String usrCode) {
		return driverWaitDAOBean.driverWaitDAOService.getAllDrwaits(usrCode,
				false);
	}

	private static boolean IsPointInPolygon(CoordinatePoint[] polygon,
			CoordinatePoint pt) {
		boolean result = false;
		int j = polygon.length - 1;
		for (int i = 0; i < polygon.length; i++) {
			if (polygon[i].getY().compareTo(pt.getY()) == -1
					&& polygon[j].getY().compareTo(pt.getY()) != -1
					|| polygon[j].getY().compareTo(pt.getY()) == -1
					&& polygon[i].getY().compareTo(pt.getY()) != -1) {
				if (polygon[i]
						.getX()
						.add((pt.getY().subtract(polygon[i].getY())))
						.divide(polygon[j].getY().subtract(polygon[i].getY()),
								MathContext.DECIMAL128)
						.multiply(polygon[j].getX().subtract(polygon[i].getX()))
						.compareTo(pt.getX()) == -1) {
					result = !result;
				}
			}
			j = i;
		}
		return result;
	}

//	@Override
//	public void processMoveUpdate(Move oldMove, Move newMove) {
//		if (newMove.getOtime() != null 
//				&& newMove.getOtime() != oldMove.getOtime()) {
//			DrwaitEventQueue de = new DrwaitEventQueue();
//			de.setMoveNo(newMove.getNo()); /////
//			de.setDrCode(newMove.getDrCode()); /////
//			Driver driver = driverWaitDAOBean
//					.driverWaitDAOService
//					.getDriverByCodeAndCmpyNo(newMove.getDrCode(), newMove.getCmpyNo());
//			de.setUsrCode(driver.getUsrCode());
//			de.setCmpyNo(newMove.getCmpyNo()); /////
//			Order order  = newMove.getOrder();
//			de.setOrNo(order.getNo()); /////
//			de.setDivCode(order.getDivCode());
//			de.setPro(order.getPro()); /////
//			
//			de.setLpCode(newMove.getOlpCode());
//			de.setWdate(newMove.getOdate());  /////
//			de.setWtime(newMove.getOtime());  /////
//			de.setWarvdate(newMove.getOarvdate());
//			de.setWarvtime(newMove.getOarvtime());
//			de.setWdptdate(newMove.getOdptdate());
//			de.setWdpttime(newMove.getOdpttime());
//			de.setOrigOrDest("O"); /////
//			
//			driverWaitDAOBean.driverWaitDAOService.insertDrwaitEvent(de);
//		}
//		
//		if (newMove.getDtime() != null 
//				&& newMove.getDtime() != oldMove.getDtime()) {
//			DrwaitEventQueue de = new DrwaitEventQueue();
//			de.setMoveNo(newMove.getNo());
//			de.setDrCode(newMove.getDrCode());
//			Driver driver = driverWaitDAOBean
//					.driverWaitDAOService
//					.getDriverByCodeAndCmpyNo(newMove.getDrCode(), newMove.getCmpyNo());
//			de.setUsrCode(driver.getUsrCode());
//			de.setCmpyNo(newMove.getCmpyNo());
//			Order order  = newMove.getOrder();
//			de.setOrNo(order.getNo());
//			de.setDivCode(order.getDivCode());
//			de.setPro(order.getPro());
//			
//			de.setLpCode(newMove.getDlpCode());
//			de.setWdate(newMove.getDdate());
//			de.setWtime(newMove.getDtime());
//			de.setWarvdate(newMove.getDarvdate());
//			de.setWarvtime(newMove.getDarvtime());
//			de.setWdptdate(newMove.getDdptdate());
//			de.setWdpttime(newMove.getDdpttime());
//			de.setOrigOrDest("D");
//			
//			driverWaitDAOBean.driverWaitDAOService.insertDrwaitEvent(de);
//		}
	
	@Override
	public void processMoveUpdate(DrwaitFifoDTO drwaitFifo) {
		Move move = driverWaitDAOBean.driverWaitDAOService.getMove(drwaitFifo.getMoveNo(), drwaitFifo.getCmpyNo());
		
		String lpCode = drwaitFifo.getOrigOrDest().equals("O")
				? move.getOlpCode()
				: move.getDlpCode();
		
		if (lpCode.contains("IMCD")) return;
				
		Locprof locprof = driverWaitDAOBean.driverWaitDAOService.getLocprof(lpCode, drwaitFifo.getCmpyNo());
		
		if (!locprof.getNrp().equals("Y")) return;
		
		DrwaitEventQueue de = new DrwaitEventQueue();
		de.setMoveNo(drwaitFifo.getMoveNo());
		de.setDrCode(drwaitFifo.getDrCode());
		Driver driver = driverWaitDAOBean
				.driverWaitDAOService
				.getDriverByCodeAndCmpyNo(drwaitFifo.getDrCode(), drwaitFifo.getCmpyNo());
		de.setUsrCode(driver.getUsrCode());
		de.setCmpyNo(drwaitFifo.getCmpyNo());
		de.setOrNo(drwaitFifo.getOrNo());
		de.setDivCode(drwaitFifo.getDivCode());
		de.setPro(drwaitFifo.getPro());
		
		de.setLpCode(lpCode);
		de.setWdate(drwaitFifo.getWdate());
		de.setWtime(drwaitFifo.getWtime());
		
		de.setOrigOrDest(drwaitFifo.getOrigOrDest());
		
//			de.setWarvdate(newMove.getOarvdate());
//			de.setWarvtime(newMove.getOarvtime());
//			de.setWdptdate(newMove.getOdptdate());
//			de.setWdpttime(newMove.getOdpttime());
			
		driverWaitDAOBean.driverWaitDAOService.insertDrwaitEvent(de);
	}
	
	
	

}
