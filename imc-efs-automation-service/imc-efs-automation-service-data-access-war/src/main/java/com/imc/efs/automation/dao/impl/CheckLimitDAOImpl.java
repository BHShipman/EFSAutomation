package com.imc.efs.automation.dao.impl;

import java.math.BigDecimal;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.imc.efs.automation.dao.CheckLimitDAO;
import com.imc.efs.automation.entities.Requesters;

@Stateless(name = "CheckLimitDAO")
@Remote(CheckLimitDAO.class)
public class CheckLimitDAOImpl implements CheckLimitDAO {

	@PersistenceContext(name = "EFS", unitName = "EFS")
	EntityManager em;

	public BigDecimal getEfsCheckLimitByUser(String requester, int requestTypeId) throws Exception {
		Query query = em
				.createQuery("Select r FROM Requesters r WHERE r.name = :name AND r.requesttypes.requestTypeId = :requestTypeId");
		query.setParameter("name", requester.toUpperCase());
		query.setParameter("requestTypeId", requestTypeId);
		Requesters requesters = (Requesters) query.getSingleResult();

		return requesters.getLimit();
	}

}
