package com.imc.driver.wait.dao.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.driver.wait.dao.OrchrgDAO;
import com.imc.driver.wait.service.entities.Orchrg;

@Stateless(name="OrchrgDAO")
@Remote(OrchrgDAO.class)
public class OrchrgDAOImpl implements OrchrgDAO {

	private static final Logger log = LoggerFactory.getLogger(OrchrgDAOImpl.class);
	
	@PersistenceContext(unitName = "SWS")
	private EntityManager em;
	
	@Override
	public void insert(Orchrg orchrg) {
		log.debug("persisting Orchrg instance");
		try {
			em.persist(orchrg);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}
}
//	@Override
//	public void testStuff() {
////		EntityTransaction tx = null;
//		int orderNo = 101807666;
//		try {
////			tx = entityManager.getTransaction();
////			tx.begin();
//			
////			Order order = entityManager.find(Order.class, orderNo, LockModeType.PESSIMISTIC_WRITE);
//			Order order = entityManager.find(Order.class, orderNo);
//			
//			System.out.println(order);
//			
////			tx.commit();
//		} catch (RuntimeException re) {
////			if (tx != null && tx.isActive()) 
////				tx.rollback();
//			log.error("test failed", re);
//		}
//		
////		Query query = em
////				.createQuery("Select r FROM Requesters r WHERE r.name = :name AND r.requesttypes.requestTypeId = :requestTypeId");
////		query.setParameter("name", requester.toUpperCase());
////		query.setParameter("requestTypeId", requestTypeId);
////		Requesters requesters = null;
////		try{
////		requesters = (Requesters) query.getSingleResult();
////		} catch (NoResultException noResult){
////			return null;
////		}
////		return requesters.getLimit();
//	}

	


//package com.imc.driver.wait.service.entities;
//
////Generated May 7, 2015 12:19:02 PM by Hibernate Tools 3.4.0.CR1
//
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//
///**
//* Home object for domain model class Orchrg.
//* @see com.imc.accessorial.service.entities.Orchrg
//* @author Hibernate Tools
//*/
//@Stateless
//public class OrchrgHome {
//
//	private static final Log log = LogFactory.getLog(OrchrgHome.class);
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	public void persist(Orchrg transientInstance) {
//		log.debug("persisting Orchrg instance");
//		try {
//			entityManager.persist(transientInstance);
//			log.debug("persist successful");
//		} catch (RuntimeException re) {
//			log.error("persist failed", re);
//			throw re;
//		}
//	}
//
//	public void remove(Orchrg persistentInstance) {
//		log.debug("removing Orchrg instance");
//		try {
//			entityManager.remove(persistentInstance);
//			log.debug("remove successful");
//		} catch (RuntimeException re) {
//			log.error("remove failed", re);
//			throw re;
//		}
//	}
//
//	public Orchrg merge(Orchrg detachedInstance) {
//		log.debug("merging Orchrg instance");
//		try {
//			Orchrg result = entityManager.merge(detachedInstance);
//			log.debug("merge successful");
//			return result;
//		} catch (RuntimeException re) {
//			log.error("merge failed", re);
//			throw re;
//		}
//	}
//
//	public Orchrg findById(int id) {
//		log.debug("getting Orchrg instance with id: " + id);
//		try {
//			Orchrg instance = entityManager.find(Orchrg.class, id);
//			log.debug("get successful");
//			return instance;
//		} catch (RuntimeException re) {
//			log.error("get failed", re);
//			throw re;
//		}
//	}
//}
