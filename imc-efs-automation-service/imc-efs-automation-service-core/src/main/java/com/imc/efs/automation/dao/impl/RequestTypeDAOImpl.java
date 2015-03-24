package com.imc.efs.automation.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.imc.efs.automation.dao.RequestTypeDAO;
import com.imc.efs.automation.entities.RequestTypes;

public class RequestTypeDAOImpl implements RequestTypeDAO {

	@PersistenceContext(name="EFS")
	private EntityManager em;

	@Override
	public RequestTypes getRequestTypeById(int requestTypeId) {

		try {
			RequestTypes instance = em.find(RequestTypes.class, requestTypeId);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
