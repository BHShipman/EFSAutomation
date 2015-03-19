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
	
	
	
	public BigDecimal getEfsCheckLimitByUser(String requester, int requestTypeId) {
		
		Query query = em.createQuery("Select r FROM Requesters r WHERE r.name = :name AND r.requestTypeId = :requestTypeId");
		query.setParameter("name", requester.toUpperCase());
		query.setParameter("requestTypeId", requestTypeId);
		Requesters requesters = (Requesters) query.getSingleResult();

		return requesters.getLimit();
	}

}
