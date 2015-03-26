package com.imc.efs.automation.dao.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.imc.efs.automation.dao.RequestTypeDAO;
import com.imc.efs.automation.entities.RequestTypes;

@Stateless(name="RequestTypeDAO")
@Remote(RequestTypeDAO.class)
public class RequestTypeDAOImpl implements RequestTypeDAO {

	@PersistenceContext(name = "EFS", unitName="EFS")
	private EntityManager entityManager;

	
	public RequestTypes getRequestTypeById(int requestTypeId) {

		try {
			Query query = entityManager.createQuery("Select reqType from RequestTypes reqType where reqType.requestTypeId = :reqTypeId");
			query.setParameter("reqTypeId", requestTypeId);
			RequestTypes instance = (RequestTypes)query.getSingleResult();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
