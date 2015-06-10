package com.imc.driver.wait.dao.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.driver.wait.dao.BreadcrumbDAO;
import com.imc.driver.wait.service.entities.Mcgps;
import com.imc.driver.wait.service.utils.DatesUtil;

@Stateless(name="BreadcrumbDAO")
@Remote(BreadcrumbDAO.class)
public class BreadcrumbDAOImpl implements BreadcrumbDAO {

	private static final Logger log = LoggerFactory.getLogger(BreadcrumbDAOImpl.class);
	
	@PersistenceContext(unitName = "SWS")
	private EntityManager em;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Mcgps> getAll(int cmpyNo, Date targetDatetime, int toleranceInMinutes, String drCode) {
		log.debug("getting breadcrumbs with cmpyNo: %d, targetDatetime: %s, toleranceInMinutes: %d, drCode: %s"
				, new Object[] { cmpyNo, targetDatetime, toleranceInMinutes, drCode });
		
		try {
			Calendar startCal = DatesUtil.getDatePlusMinutesCalendar(targetDatetime, toleranceInMinutes*-1);
			Date startDate = startCal.getTime();
			int startSecs = DatesUtil.getSecondsAfterMidnight(startCal);
			
			Calendar endCal = DatesUtil.getDatePlusMinutesCalendar(targetDatetime, toleranceInMinutes);
			Date endDate = endCal.getTime();
			int endSecs = DatesUtil.getSecondsAfterMidnight(endCal);
			
			
			Query query = em.createQuery("FROM Mcgps m "
					+ "WHERE m.mdrvCode = :driverCode "
					+ "AND m.id.cmpyNo = :cmpyNo "
					+ "AND (m.eventdt > :startDate OR (m.eventdt = :startDate AND m.eventSecs >= :startSecs)) "
					+ "AND (m.eventdt < :endDate OR (m.eventdt = :endDate AND m.eventSecs <= :endSecs))");
			
			query.setParameter("driverCode", drCode);
			query.setParameter("cmpyNo", cmpyNo);
			query.setParameter("startDate", startDate); 
			query.setParameter("startSecs", startSecs);
			query.setParameter("endDate", endDate);
			query.setParameter("endSecs", endSecs);
			
			List<Mcgps> breadcrumbs = (List<Mcgps>) query.getResultList();
			log.debug("get successful");
			
			return breadcrumbs;
		} catch (RuntimeException re) {
			log.error("getBreadcrumbs failed with cmpyNo: %d, targetDatetime: %s, toleranceInMinutes: %d, drCode: %s"
					, new Object[] { cmpyNo, targetDatetime, toleranceInMinutes, drCode }
					, re);
			throw re;
		}
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Mcgps> getAll(int cmpyNo, Date targetDatetime, int toleranceInMinutes) {
		log.debug("getting breadcrumbs with cmpyNo: %d, targetDatetime: %s, toleranceInMinutes: %d"
				, new Object[] { cmpyNo, targetDatetime, toleranceInMinutes });
		
		try{
			Calendar startCal = DatesUtil.getDatePlusMinutesCalendar(targetDatetime, toleranceInMinutes*-1);
			Calendar endCal = DatesUtil.getDatePlusMinutesCalendar(targetDatetime, toleranceInMinutes);
			
			Query query = em.createQuery("FROM Mcgps "
					+ "WHERE cmpyNo = :cmpyNo "
					+ "AND (eventdt > :startDate OR (eventdt = :startDate AND eventSecs >= :startSecs)) "
					+ "AND (eventdt < :endDate OR (eventdt = :endDate AND eventSecs <= :endSecs))");
			
			query.setParameter("cmpyNo", cmpyNo);
			query.setParameter("startDate", startCal.getTime());
			query.setParameter("startSecs", DatesUtil.getSecondsAfterMidnight(startCal));
			query.setParameter("endDate", endCal.getTime());
			query.setParameter("endSecs", DatesUtil.getSecondsAfterMidnight(endCal));
			
			List<Mcgps> breadcrumbs = (List<Mcgps>) query.getResultList();
			log.debug("get successful");
			
			return breadcrumbs;
		} catch (RuntimeException re) {
			log.error("getBreadcrumbs failed with cmpyNo: %d, targetDatetime: %s, toleranceInMinutes: %d"
					, new Object[] { cmpyNo, targetDatetime, toleranceInMinutes }
					, re);
			throw re;
		}
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<Mcgps> getAll(int cmpyNo, Date startDatetime,
			Date endDatetime, String drCode) {
		log.debug("getting breadcrumbs with cmpyNo: %d, startDatetime: %s, endDatetime: %d, drCode: %s"
				, new Object[] { cmpyNo, startDatetime, endDatetime, drCode });
		
		try{
			
			Query query = em.createQuery("FROM Mcgps "
					+ "WHERE mdrvCode = :driverCode "
					+ "AND cmpyNo = :cmpyNo "
					+ "AND (eventdt > :startDate OR (eventdt = :startDate AND eventSecs >= :startSecs)) "
					+ "AND (eventdt < :endDate OR (eventdt = :endDate AND eventSecs <= :endSecs))");
			
			query.setParameter("driverCode", drCode);
			query.setParameter("cmpyNo", cmpyNo);
			query.setParameter("startDate", startDatetime);
			query.setParameter("startSecs", DatesUtil.getSecondsAfterMidnight(startDatetime));
			query.setParameter("endDate", endDatetime);
			query.setParameter("endSecs", DatesUtil.getSecondsAfterMidnight(endDatetime));
			
			List<Mcgps> breadcrumbs = (List<Mcgps>) query.getResultList();
			log.debug("get successful");
			
			return breadcrumbs;
		} catch (RuntimeException re) {
			log.error("getBreadcrumbs failed with cmpyNo: %d, startDatetime: %s, endDatetime: %d, drCode: %s"
				, new Object[] { cmpyNo, startDatetime, endDatetime, drCode }
					, re);
			throw re;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Mcgps> getAll(int cmpyNo, Date startDatetime,
			Date endDatetime) {
		log.debug("getting breadcrumbs with cmpyNo: %d, startDatetime: %s, endDatetime: %d"
				, new Object[] { cmpyNo, startDatetime, endDatetime});
		
		try{
			
			Query query = em.createQuery("FROM Mcgps "
					+ "WHERE cmpyNo = :cmpyNo "
					+ "AND (eventdt > :startDate OR (eventdt = :startDate AND eventSecs >= :startSecs)) "
					+ "AND (eventdt < :endDate OR (eventdt = :endDate AND eventSecs <= :endSecs))");
			
			query.setParameter("cmpyNo", cmpyNo);
			query.setParameter("startDate", startDatetime);
			query.setParameter("startSecs", DatesUtil.getSecondsAfterMidnight(startDatetime));
			query.setParameter("endDate", endDatetime);
			query.setParameter("endSecs", DatesUtil.getSecondsAfterMidnight(endDatetime));
			
			List<Mcgps> breadcrumbs = (List<Mcgps>) query.getResultList();
			log.debug("get successful");
			
			return breadcrumbs;
		} catch (RuntimeException re) {
			log.error("getBreadcrumbs failed  with cmpyNo: %d, startDatetime: %s, endDatetime: %d"
					, new Object[] { cmpyNo, startDatetime, endDatetime }
					, re);
			throw re;
		}
	}
}
