package com.imc.driver.wait.dao.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.driver.wait.dao.LocprofDAO;
import com.imc.driver.wait.service.entities.Locprof;

@Stateless(name="LocprofDAO")
@Remote(LocprofDAO.class)
public class LocprofDAOImpl implements LocprofDAO {

	private static final Logger log = LoggerFactory.getLogger(LocprofDAOImpl.class);
	
	@PersistenceContext(unitName = "SWS")
	private EntityManager em;
	
	@Override
	public Locprof get(String lpCode, int cmpyNo) {
		try {
			Locprof locprof = (Locprof) em.createQuery("FROM Locprof "
					+ "WHERE cmpyNo = :cmpyNo "
					+ "AND code = :lpCode")
					.setParameter("cmpyNo", cmpyNo)
					.setParameter("lpCode", lpCode)
					.getSingleResult();
			
			return locprof;
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}
//	private Move getMoveByMoveNoAndCmpyNo(int moveNo, int cmpyNo) {
//		Query query = em.createQuery("Select m from Move m where m.no = :moveNo AND m.cmpyNo = :cmpyNo");
//		query.setParameter("moveNo", moveNo);
//		query.setParameter("cmpyNo", cmpyNo);
//		Move move = (Move)query.getSingleResult();
//		return move;
//	}

}
