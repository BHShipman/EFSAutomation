package com.imc.driver.wait.dao.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.driver.wait.dao.DriverDAO;
import com.imc.driver.wait.service.entities.Driver;

@Stateless(name="DriverDAO")
@Remote(DriverDAO.class)
public class DriverDAOImpl implements DriverDAO {

	private static final Logger log = LoggerFactory.getLogger(DriverDAOImpl.class);
	
	@PersistenceContext(unitName = "SWS")
	private EntityManager em;
	
	@Override
	public Driver getDriverByCodeAndCmpyNo(String drCode, int cmpyNo) {
		log.info("getting driver with code: " + drCode + " and cmpyNo = " + cmpyNo);
		try {
			Driver driver = (Driver) em.createQuery("FROM Driver "
					+ "WHERE code = :drCode "
					+ "AND cmpyNo = :cmpyNo")
					.setParameter("drCode", drCode)
					.setParameter("cmpyNo", cmpyNo)
					.getSingleResult();
			
			log.info("get successful");
			
			return driver;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

}
