package com.imc.efs.automation.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.entities.Requests;

public class RequestDAOImpl implements RequestDAO {

	EntityManagerFactory efsEMF = Persistence
			.createEntityManagerFactory("EFSAutomation");
	EntityManagerFactory gpcEMF = Persistence
			.createEntityManagerFactory("GPCustom");
	EntityManager em;

	public RequestDAOImpl() {
	}

	public void add(Requests request) {
		//TODO finish
		em = efsEMF.createEntityManager();
	}

	public void update(Requests request) {
		//TODO finish
		em = efsEMF.createEntityManager();
	}

	public Requests getRequestsById(int requestId) {
		//TODO finish
		em = efsEMF.createEntityManager();
		return null;
	}

	public boolean checkIfQualifiedVendor(int vendorId) {
		//TODO finish
		em = gpcEMF.createEntityManager();
		Query query = em
				.createQuery("Select v.efsQualified from RsaVendorsNetwork v where v.vendorId = :vendorId");
		query.setParameter("vendorId", vendorId);
		return (Boolean) query.getSingleResult();
	}

	public boolean checkIfFirstTimeVendor(int vendorId) {
		//TODO finish
		em = efsEMF.createEntityManager();
		return false;
	}

	public boolean checkIfDuplicateRequest(String poWoNumber) {
		//TODO finish
		em = efsEMF.createEntityManager();
		return false;
	}

	public Requests addAndReturnRequestWithReferences(Requests request) {
		//TODO finish
		em = efsEMF.createEntityManager();
		return null;
	}

	public Requests returnRequestWithReference(Requests request) {
		//TODO finish
		em = efsEMF.createEntityManager();
		return null;
	}

	public Requests updateAndReturnRequestWithReference(Requests request) {
		//TODO finish
		em = efsEMF.createEntityManager();
		return null;
	}

	public List<Requests> getRequestsOfStatusIssued() {
		//TODO finish

		return null;
	}

}
