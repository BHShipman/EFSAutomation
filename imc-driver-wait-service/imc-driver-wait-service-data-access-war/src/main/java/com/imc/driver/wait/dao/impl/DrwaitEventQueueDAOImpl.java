package com.imc.driver.wait.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.driver.wait.dao.DrwaitEventQueueDAO;
import com.imc.driver.wait.service.entities.DrwaitEventQueue;

@Stateless(name="DrwaitEventQueueDAO")
@Remote(DrwaitEventQueueDAO.class)
public class DrwaitEventQueueDAOImpl implements DrwaitEventQueueDAO {
	
	private static final Logger log = LoggerFactory.getLogger(DrwaitEventQueueDAOImpl.class);
	
	@PersistenceContext(unitName = "SWS")
	private EntityManager em;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<DrwaitEventQueue> getAll(boolean includeProcessed) {
		log.debug("getting all unprocessed DrwaitEvents");
		try {
			Query query = em.createQuery("FROM DrwaitEventQueue WHERE processed = :includeProcessed");
			query.setParameter("includeProcessed", includeProcessed ? (short)1 : (short)0);
			List<DrwaitEventQueue> drwaitEvents = (List<DrwaitEventQueue>) query.getResultList();
			log.debug("get successful");
			return drwaitEvents;
		} catch (RuntimeException re) {
			log.error("getAllUnprocessed failed", re);
			throw re;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<DrwaitEventQueue> getAll(String usrCode, boolean includeProcessed) {
		log.debug("getting all unprocessed DrwaitEvents with usr: " + usrCode);
		try {
			Query query = em.createQuery("FROM DrwaitEventQueue WHERE processed = :includeProcessed AND usrCode = :usrCode");
			query.setParameter("includeProcessed", includeProcessed ? (short)1 : (short)0);
			query.setParameter("usrCode", usrCode);
			List<DrwaitEventQueue> drwaitEvents = (List<DrwaitEventQueue>) query.getResultList();
			log.debug("get successful");
			return drwaitEvents;
		} catch (RuntimeException re) {
			log.error("getAllUnprocessed failed with userCode: " + usrCode, re);
			throw re;
		}
	}

	@Override
	public void update(DrwaitEventQueue instance) {
		log.debug("merging DrwaitEventQueue instance with id: " + instance.getId());
		try {
			em.merge(instance);
			log.debug("merged successfully");
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}
	
	@Override
	public void insert(DrwaitEventQueue instance) {
		log.debug("inserting DrwaitEventQueue instance");
		try {
			em.persist(instance);
			log.debug("insert successfully");
		} catch (RuntimeException re) {
			log.error("insert failed", re);
			throw re;
		}
	}

}
