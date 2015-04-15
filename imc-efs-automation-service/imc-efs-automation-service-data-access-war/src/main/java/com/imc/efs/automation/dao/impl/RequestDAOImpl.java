package com.imc.efs.automation.dao.impl;

import java.math.BigDecimal;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import com.imc.efs.automation.dao.RequestDAO;
import com.imc.efs.automation.entities.Requesters;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.entities.RsaVendorsNetwork;
import com.imc.efs.automation.entities.Status;

@Stateless(name = "RequestDAO")
@Remote(RequestDAO.class)
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
		request = (Requests) emEFS
				.createQuery(
						"select req from Requests req where req.poWoNumber = :poWoNumber")
				.setParameter("poWoNumber", request.getPoWoNumber())
				.getSingleResult();
		return request.getRequestId();
	}

	public int updateRequest(Requests request) {
		Requests req = null;
		try{
		req = (Requests) emEFS.createQuery("select req from Requests req where req.poWoNumber = :poWoNumber").setParameter("poWoNumber", request.getPoWoNumber()).getSingleResult();
		}catch(NoResultException e){
			emEFS.persist(request);
		}
		if (req != null) {
			try {
				emEFS.merge(request);
			} catch (RuntimeException re) {
				throw re;
			}
		}
		request = (Requests) emEFS
				.createQuery(
						"select req from Requests req where req.poWoNumber = :poWoNumber")
				.setParameter("poWoNumber", request.getPoWoNumber())
				.getSingleResult();
		return request.getRequestId();
	}

	public Requests getRequestsById(int requestId) {
		
		 Requests instance = (Requests) emEFS.createQuery("select req from Requests req where req.requestId = :requestId")
					.setParameter("requestId", requestId).getSingleResult();
		
		return instance;
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

		// boolean isFirstTimeVendor;
		try {
			// TODO isFirstTimeVendor
		} catch (RuntimeException re) {
			throw re;
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	public boolean checkIfDuplicateRequest(String poWoNumber) {
		List<Requests> result = emEFS
				.createQuery(
						"select req from Requests req where req.poWoNumber = :poWoNumber")
				.setParameter("poWoNumber", poWoNumber).getResultList();
		if (result.size() > 0) {
			return true;
		} else
			return false;
	}

	public Requests addAndReturnRequestWithReferences(Requests request) {
		emEFS.persist(request);
		return request;
	}

	public Requests returnRequestWithReference(Requests request) {

		request = (Requests) emEFS
				.createQuery(
						"select req from Requests req where req.requestId = :requestId")
				.setParameter("requestId", request.getRequestId())
				.getSingleResult();

		return request;
	}

	public Requests updateAndReturnRequestWithReference(Requests request)
			throws Exception {
		throw new Exception("Not Implemented");
	}

	public List<Requests> getRequestsOfStatusIssued() throws Exception {
		throw new Exception("Not Implemented");
	}

	public BigDecimal getUsersEfsCheckLimit(String requester, int requestTypeId) {

		Requesters requesters = (Requesters) emEFS
				.createQuery(
						"select req from Requesters req where req.name = :requester AND req.requesttypes.requestTypeId = :requestTypeId")
				.setParameter("requester", requester.toUpperCase())
				.setParameter("requestTypeId", requestTypeId).getSingleResult();

		return requesters.getLimit();
	}

	@Override
	public Status getStatus(int statusId) {
		Status status = (Status) emEFS
				.createQuery(
						"select stat from Status stat where stat.statusId = :statusId")
				.setParameter("statusId", statusId).getSingleResult();

		return status;
	}

}
