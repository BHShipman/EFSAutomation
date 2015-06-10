package com.imc.driver.wait.dao.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.driver.wait.dao.DrwaitDAO;
import com.imc.driver.wait.service.entities.Drwait;

@Stateless(name="DrwaitDAO")
@Remote(DrwaitDAO.class)
public class DrwaitDAOImpl implements DrwaitDAO {

	private static final Logger log = LoggerFactory.getLogger(DrwaitDAOImpl.class);
	
	@PersistenceContext(unitName = "SWS")
	private EntityManager em;
	
	@Override
	public void insert(Drwait driverWait) {
		log.debug("persisting Orchrg instance");
		try {
			em.persist(driverWait);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Drwait> getAll(String userCode, boolean includeComplete) {
		log.debug("getting drwaits where status < 5");
		try {
			Query query;
			if (includeComplete == true)
				query = em.createQuery("FROM Drwait WHERE usrCode = :usrCode");
			else 
				query = em.createQuery("FROM Drwait WHERE usrCode = :usrCode AND status < 5");
			query.setParameter("usrCode", userCode);
			List<Drwait> drwaits = (List<Drwait>) query.getResultList();
			log.debug("get successful");
			return drwaits;
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public Drwait getByExportMoveNo(int exportMoveNo, int cmpyNo) {
		log.debug("getting drwaits where exportMoveNo = " + exportMoveNo);
		try {
			Query query = em.createQuery("FROM Drwait WHERE exportMoveNo = :exportMoveNo AND cmpyNo = :cmpyNo");
			query.setParameter("exportMoveNo", exportMoveNo);
			query.setParameter("cmpyNo", cmpyNo);
			List<Drwait> drwaitList = (List<Drwait>) query.getResultList();
			log.debug("get successful");
			if (drwaitList.size() == 0) {
				return null;
			} else {
				return drwaitList.get(0);
			}
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@Override
	public Drwait getByImportMoveNo(int importMoveNo, int cmpyNo) {
		log.debug("getting drwaits where importMoveNo = " + importMoveNo);
		try {
			Query query = em.createQuery("FROM Drwait WHERE importMoveNo = :importMoveNo AND cmpyNo = :cmpyNo");
			query.setParameter("importMoveNo", importMoveNo);
			query.setParameter("cmpyNo", cmpyNo);
			List<Drwait> drwaitList = (List<Drwait>) query.getResultList();
			log.debug("get successful");
			if (drwaitList.size() == 0) {
				return null;
			} else {
				return drwaitList.get(0);
			}
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
//	public boolean exists(DTOAny instance) {
//	    Query query = getSession().             
//	    createQuery("select 1 from DTOAny t where t.key = :key");
//	        query.setString("key", instance.getKey() );
//	    return (query.uniqueResult() != null);
//	}
	
	
	
}


//package com.imc.driver.wait.service.entities;
//
////Generated May 12, 2015 8:59:44 AM by Hibernate Tools 3.4.0.CR1
//
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//
///**
//* Home object for domain model class Drwait.
//* @see com.imc.driver.wait.service.entities.Drwait
//* @author Hibernate Tools
//*/
//@Stateless
//public class DrwaitHome {
//
//	private static final Log log = LogFactory.getLog(DrwaitHome.class);
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	public void persist(Drwait transientInstance) {
//		log.debug("persisting Drwait instance");
//		try {
//			entityManager.persist(transientInstance);
//			log.debug("persist successful");
//		} catch (RuntimeException re) {
//			log.error("persist failed", re);
//			throw re;
//		}
//	}
//
//	public void remove(Drwait persistentInstance) {
//		log.debug("removing Drwait instance");
//		try {
//			entityManager.remove(persistentInstance);
//			log.debug("remove successful");
//		} catch (RuntimeException re) {
//			log.error("remove failed", re);
//			throw re;
//		}
//	}
//
//	public Drwait merge(Drwait detachedInstance) {
//		log.debug("merging Drwait instance");
//		try {
//			Drwait result = entityManager.merge(detachedInstance);
//			log.debug("merge successful");
//			return result;
//		} catch (RuntimeException re) {
//			log.error("merge failed", re);
//			throw re;
//		}
//	}
//
//	public Drwait findById(int id) {
//		log.debug("getting Drwait instance with id: " + id);
//		try {
//			Drwait instance = entityManager.find(Drwait.class, id);
//			log.debug("get successful");
//			return instance;
//		} catch (RuntimeException re) {
//			log.error("get failed", re);
//			throw re;
//		}
//	}
//}
