package com.imc.efs.automation.dao.impl;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.imc.efs.automation.dao.CheckLimitDAO;
import com.imc.efs.automation.entities.Requesters;

public class CheckLimitDAOImpl implements CheckLimitDAO {

	@PersistenceContext(name="EFS")
	EntityManager em;
	
	
	@Override
	public BigDecimal getEfsCheckLimitByUser(String requester, int requestTypeId) {

		double limit = 0.0;
		
		Query query = em.createQuery("Select r FROM Requesters r WHERE r.name = :name AND r.requestTypeId = :requestTypeId");
		query.setParameter("name", requester.toUpperCase());
		query.setParameter("requestTypeId", requestTypeId);
		Requesters requesters = (Requesters) query.getSingleResult();

		return requesters.getLimit();
	}

}
