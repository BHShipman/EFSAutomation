package com.imc.efs.automation.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.RsaVendorsNetwork;

public class RequestDAOImpl implements RequestDAO {

	@PersistenceContext(unitName = "EFS")
	private EntityManager emEFS;
	@PersistenceContext(unitName = "GP")
	private EntityManager emGP;

	public int addRequest(Requests request) {
		try {
			emEFS.persist(request);
		} catch (RuntimeException re) {
			throw re;
		}
		return request.getRequestId();
	}

	public int updateRequest(Requests request) {
		try {
			emEFS.merge(request);
		} catch (RuntimeException re) {
			throw re;
		}
		return request.getRequestId();
	}

	public Requests getRequestsById(int requestId) {
		try {
			Requests instance = emEFS.find(Requests.class, requestId);
			return instance;
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public boolean checkIfQualifiedVendor(int vendorId) {
		try {
			RsaVendorsNetwork vendor = emGP.find(RsaVendorsNetwork.class,
					vendorId);
			return vendor.isEfsQualified();
		} catch (RuntimeException re) {
			throw re;
		}
	}

	public boolean checkIfFirstTimeVendor(int vendorId) {

		boolean isFirstTimeVendor;
		try {
			// isFirstTimeVendor
		} catch (RuntimeException re) {
			throw re;
		}
		return false;
	}

	public boolean checkIfDuplicateRequest(String poWoNumber) {
		// TODO Finish
		return false;
	}

	public Requests addAndReturnRequestWithReferences(Requests request) {
		// TODO Finish
		return null;
	}

	public Requests returnRequestWithReference(Requests request) {
		// TODO Finish
		return null;
	}

	public Requests updateAndReturnRequestWithReference(Requests request) {
		// TODO Finish
		return null;
	}

	public List<Requests> getRequestsOfStatusIssued() {
		// TODO Finish
		return null;
	}

}
