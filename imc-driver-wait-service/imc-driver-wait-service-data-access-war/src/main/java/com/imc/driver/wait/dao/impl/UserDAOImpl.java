package com.imc.driver.wait.dao.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.driver.wait.dao.UserDAO;
import com.imc.driver.wait.service.data.UserDetailsDTO;
import com.imc.driver.wait.service.entities.Userid;

@Stateless(name="UserDAO")
@Remote(UserDAO.class)
public class UserDAOImpl implements UserDAO {

	private static final Logger log = LoggerFactory.getLogger(UserDAOImpl.class);
	
	@PersistenceContext(unitName = "SWS")
	private EntityManager em;
	
	@Override
	public UserDetailsDTO getUserDetails(String userCode) {
		log.debug("getting Userid instance with usrCode: " + userCode);
		Userid user;
		try {
			user = em.find(Userid.class, userCode);
			log.debug("get successful");
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
		UserDetailsDTO userDetails = new UserDetailsDTO(user.getCode(),user.getName(),user.getDivCode(),user.getCmpyNo(),user.getStatus());
		return userDetails;
		
	}
//	public Orchrg findById(int id) {
//	log.debug("getting Orchrg instance with id: " + id);
//	try {
//		Orchrg instance = entityManager.find(Orchrg.class, id);
//		log.debug("get successful");
//		return instance;
//	} catch (RuntimeException re) {
//		log.error("get failed", re);
//		throw re;
//	}
//}

	@Override
	public Userid get(String userCode) {
		log.debug("getting Userid instance with usrCode: " + userCode);
		try {
			Userid user = em.find(Userid.class, userCode);
			log.debug("get successful");
			return user;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

}
