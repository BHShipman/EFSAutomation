package com.imc.efs.automation.hold.removal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.imc.business.logic.service.EfsBusinessLogicServiceBean;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.enums.RequestStatuses;

public class HoldRemovalService implements ServletContextListener {


	EfsBusinessLogicServiceBean businessLogicBean = new EfsBusinessLogicServiceBean();
	final static Logger log = Logger.getLogger("HoldRemovalService");


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		final List<String> companies = new ArrayList<String>();
		
		companies.add("AIS");
		companies.add("DNJ");
		companies.add("GIS");
		companies.add("IMC");
		companies.add("NDS");		
		
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
		scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
//				removeHolds(companies);
				log.info("would be removing holds, but we are in test environment");
				
			}
		} , (long)0, (long)15, TimeUnit.MINUTES);
		
	}

	
	private void removeHolds(List<String> companies){
		
		List<Requests> requests = businessLogicBean.efsBOService.getIssuedRequests();
		
		for(String company : companies){
			for (Requests request : requests){
				if (request.getCompany().trim().compareTo(company) == 0){
					
					MoneyCodeDetailsDTO moneyCode = businessLogicBean.efsBOService.getMoneyCodeDetails(company, request.getMoneyCodeReferenceNumber());
					
					if (moneyCode.isVoided()){
						request.setStatusId(RequestStatuses.Voided.index());
						businessLogicBean.efsBOService.updateRequest(request);
					} else if (moneyCode.getFirstUse() != "" && moneyCode.getAmountUsed() == moneyCode.getAmount()){
						request.setStatusId(RequestStatuses.Activated.index());
						businessLogicBean.efsBOService.updateRequest(request);
						businessLogicBean.efsBOService.releaseAPHold(company, String.valueOf(request.getMoneyCodeReferenceNumber()));
					}
					
					
					
				}
			}
		}
		
	}
	
}