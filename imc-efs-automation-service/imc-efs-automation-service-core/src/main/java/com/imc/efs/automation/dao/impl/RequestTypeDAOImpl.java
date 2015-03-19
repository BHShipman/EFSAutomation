package com.imc.efs.automation.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.imc.efs.automation.dao.RequestTypeDAO;
import com.imc.efs.automation.entities.RequestTypes;

public class RequestTypeDAOImpl implements RequestTypeDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("EFS");
	EntityManager em;

	@Override
	public RequestTypes getRequestTypeById(int requestTypeId) {

		em = emf.createEntityManager();

		try {
			RequestTypes instance = em.find(RequestTypes.class, requestTypeId);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
