package com.imc.driver.wait.dao.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.imc.driver.wait.dao.OrderDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.imc.driver.wait.service.entities.Order;

@Stateless(name="OrderDAO")
@Remote(OrderDAO.class)
public class OrderDAOImpl implements OrderDAO {

	private static final Logger log = LoggerFactory.getLogger(OrderDAOImpl.class);
	
	@PersistenceContext(unitName = "SWS")
	private EntityManager em;

	@Override
	public Order get(int orNo, int cmpyNo) {
		log.info("getting Order with orNo: " + orNo + " and cmpyNo = " + cmpyNo);
		try {
			Order order = (Order) em.createQuery("FROM Order "
					+ "WHERE no = :orNo "
					+ "AND cmpyNo = :cmpyNo")
					.setParameter("orNo", orNo)
					.setParameter("cmpyNo", cmpyNo)
					.getSingleResult();
			
			log.info("get successful");
			
			return order;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
//	public Driver getDriverByCodeAndCmpyNo(String drCode, int cmpyNo) {
//	log.info("getting driver with code: " + drCode + " and cmpyNo = " + cmpyNo);
//	try {
//		Driver driver = (Driver) em.createQuery("FROM Driver "
//				+ "WHERE code = :drCode "
//				+ "AND cmpyNo = :cmpyNo")
//				.setParameter("drCode", drCode)
//				.setParameter("cmpyNo", cmpyNo)
//				.getSingleResult();
//		
//		log.info("get successful");
//		
//		return driver;
//	} catch (RuntimeException re) {
//		log.error("get failed", re);
//		throw re;
//	}
//}
	
//	@Override
//	public void confirmDriverWait(Drwait driverWait) {
//		
//	}
	
	
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
		
//		Query query = em
//				.createQuery("Select r FROM Requesters r WHERE r.name = :name AND r.requesttypes.requestTypeId = :requestTypeId");
//		query.setParameter("name", requester.toUpperCase());
//		query.setParameter("requestTypeId", requestTypeId);
//		Requesters requesters = null;
//		try{
//		requesters = (Requesters) query.getSingleResult();
//		} catch (NoResultException noResult){
//			return null;
//		}
//		return requesters.getLimit();
//	}
	
}
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
//* Home object for domain model class Order.
//* @see com.imc.accessorial.service.entities.Order
//* @author Hibernate Tools
//*/
//@Stateless
//public class OrderHome {
//
//	private static final Log log = LogFactory.getLog(OrderHome.class);
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	public void persist(Order transientInstance) {
//		log.debug("persisting Order instance");
//		try {
//			entityManager.persist(transientInstance);
//			log.debug("persist successful");
//		} catch (RuntimeException re) {
//			log.error("persist failed", re);
//			throw re;
//		}
//	}
//
//	public void remove(Order persistentInstance) {
//		log.debug("removing Order instance");
//		try {
//			entityManager.remove(persistentInstance);
//			log.debug("remove successful");
//		} catch (RuntimeException re) {
//			log.error("remove failed", re);
//			throw re;
//		}
//	}
//
//	public Order merge(Order detachedInstance) {
//		log.debug("merging Order instance");
//		try {
//			Order result = entityManager.merge(detachedInstance);
//			log.debug("merge successful");
//			return result;
//		} catch (RuntimeException re) {
//			log.error("merge failed", re);
//			throw re;
//		}
//	}
//
//	public Order findById(int id) {
//		log.debug("getting Order instance with id: " + id);
//		try {
//			Order instance = entityManager.find(Order.class, id);
//			log.debug("get successful");
//			return instance;
//		} catch (RuntimeException re) {
//			log.error("get failed", re);
//			throw re;
//		}
//	}
//}
