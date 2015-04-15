package com.imc.efs.automation.hold.removal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.imc.efs.automation.bo.EfsBO;
import com.imc.efs.automation.bo.GpBO;
import com.imc.efs.automation.bo.RequestBO;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;
import com.imc.efs.automation.entities.Requests;
import com.imc.efs.automation.enums.RequestStatuses;

public class HoldRemovalService implements ServletContextListener {

	@EJB(name = "RequestBO")
	RequestBO requestBO;
	@EJB(name="GpBO")
	GpBO gpBO;
	@EJB(name="EfsBO")
	EfsBO efsBO;

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		List<String> companies = new ArrayList<String>();
		
		companies.add("AIS");
		companies.add("DNJ");
		companies.add("GIS");
		companies.add("IMC");
		companies.add("NDS");		
		
		
		ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
		ScheduledFuture scheduledFuture = scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("removing holds");
				
			}
		} , (long)0, (long)15, TimeUnit.MINUTES);
		
	}

	
	private void removeHolds(List<String> companies){
		
		List<Requests> requests = requestBO.getIssuedRequests();
		
		for(String company : companies){
			for (Requests request : requests){
				if (request.getCompany().trim().compareTo(company) == 0){
					
					MoneyCodeDetailsDTO moneyCode = efsBO.GetMoneyCodeDetails(company, request.getMoneyCodeReferenceNumber());
					
					if (moneyCode.isVoided()){
						request.setStatusId(RequestStatuses.Voided.index());
						requestBO.updateRequest(request);
					} else if (moneyCode.getFirstUse() != "" && moneyCode.getAmountUsed() == moneyCode.getAmount()){
						request.setStatusId(RequestStatuses.Activated.index());
						requestBO.updateRequest(request);
						gpBO.releaseAPHold(company, String.valueOf(request.getMoneyCodeReferenceNumber()));
					}
					
					
					
				}
			}
		}
		
	}
	
}