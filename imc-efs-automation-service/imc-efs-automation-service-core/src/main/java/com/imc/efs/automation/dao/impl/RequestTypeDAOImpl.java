package com.imc.efs.automation.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.imc.efs.automation.dao.RequestTypeDAO;
import com.imc.efs.automation.entities.RequestTypes;

@Stateless
public class RequestTypeDAOImpl implements RequestTypeDAO {

	@PersistenceContext(unitName="EFS")
	private EntityManager entityManager;

	@Override
	public RequestTypes getRequestTypeById(int requestTypeId) {
		
		if (entityManager ==null){
			System.out.println("em is null");
		}
		else{
			System.out.println("it's not null");
		}
		
		try {
			Query query = entityManager.createQuery("Select reqType from RequestTypes reqType where reqType.requestTypeId = :reqTypeId");
			RequestTypes instance = (RequestTypes)query.getSingleResult();
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}
}
