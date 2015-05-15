package com.imc.bnsfworkorder.process;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.imc.bnsfworkorder.model.BNSFHeader;
import com.imc.bnsfworkorder.model.BNSFJobDetail;
import com.imc.midas.model.DeacustBean;
import com.imc.midas.model.Repairs;
import com.imc.midas.model.RepairsDetails;

public class CreateMidasBean {

	EntityManager em;
	
	public CreateMidasBean() {

	}

	public CreateMidasBean(EntityManager em) {
		this.em = em;
	}

	public Repairs createMidasBean(BNSFHeader header) throws Exception {

//		 Query query = em.createNativeQuery(
//				"{call USP_QueryFIDepot(?)}", DeacustBean.class).setParameter(1,
//				"Select * from deacust where ACCT_NO = 'BNSF' AND IDCS_JOB = ");
//		 
//		 List<DeacustBean> deacustList = query.getResultList();
//		 if (true)
//		 throw new Exception("list size: " + deacustList.size() + " Contents of the first bean " + deacustList.get(0).toString());
		

		ArrayList<RepairsDetails> details = new ArrayList<RepairsDetails>();
		int i = 1;

		Repairs repair = new Repairs();
		repair.setTablet("BNSFTab");
		repair.setWorkOrder(header.getWoNbr());
		repair.setRepairStatus("N");
		repair.setChassisInspection(false);
		repair.setStatus(1);
		repair.setCreationDate(new Date());
		repair.setModificationDate(new Date());
		repair.setBidrecord(true);
		repair.setBidstatus(Short.valueOf("45"));
		repair.setTestRecord(false);
		repair.setReceivedOn(new Date());
		repair.setPicturesExtracted(true);

		for (BNSFJobDetail detail : header.getDetails()) {

			RepairsDetails midasDetail = new RepairsDetails();
			midasDetail.setLineItem(i);
			midasDetail.setPartNumber(detail.getJobCode());
			midasDetail.setDamageCode(detail.getWhyMade());
			midasDetail.setRepairCode(detail.getCondCode());
			midasDetail.setLocationCode(detail.getLocation());
			i++;
			details.add(midasDetail);
		}

		repair.setDetails(details);
		return repair;
	}
	
	public EntityManager getEm(){
		return em;
	}
	
	public void setEm(EntityManager em){
		this.em=em;
	}

}
