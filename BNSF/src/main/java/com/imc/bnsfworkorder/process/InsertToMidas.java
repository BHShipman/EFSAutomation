package com.imc.bnsfworkorder.process;

import javax.persistence.EntityManager;

import com.imc.midas.model.Repairs;
import com.imc.midas.model.RepairsDetails;

public class InsertToMidas {

	EntityManager em;

	public InsertToMidas() {

	}

	public InsertToMidas(EntityManager em) {
		this.em = em;
	}

	public void insertRepair(Repairs repair) throws Exception {

		em.persist(repair);
		em.flush();
	
		for (RepairsDetails detail : repair.getDetails()) {
			detail.setFkRepairId(repair.getRepairId());
			em.persist(detail);
		}

	}

	public EntityManager getEm() {
		return em;
	}

	public void setEm(EntityManager em) {
		this.em = em;
	}
}
