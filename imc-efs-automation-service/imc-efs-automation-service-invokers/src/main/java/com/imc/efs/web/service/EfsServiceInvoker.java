package com.imc.efs.web.service;

import java.math.BigDecimal;

import javax.ejb.Local;
import javax.ejb.Stateless;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import service.cards.tch.com.CardManagementEP;
import service.cards.tch.com.types.WSMoneyCode;

import com.imc.efs.automation.data.EfsClient_TEST;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.enums.Companies;

@Stateless(name="EfsService")
public class EfsServiceInvoker {

	private final String serviceUrl_TEST = "https://test.efsllc.com/axis2/services/CardManagementWS/";

//	private CardManagementEP createEfsService() {
//		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//		factory.setServiceClass(CardManagementEP.class);
//		factory.setAddress(serviceUrl);
//		CardManagementEP efsService = (CardManagementEP) factory.create();
//		return efsService;
//	}

	private CardManagementEP createEfsService_TEST() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(CardManagementEP.class);
		factory.setAddress(serviceUrl_TEST);
		CardManagementEP efsService = (CardManagementEP) factory
				.create();
		return efsService;
	}

	public EfsMoneyCode getMoneyCode(BigDecimal efsAmount, String issueTo,
			String description, String company) {

		return null;
	}

	public EfsMoneyCode getMoneyCode_TEST(BigDecimal efsAmount, String issueTo,
			String description, String company) {

		EfsClient_TEST efsClient = null;
		try {
			efsClient = new EfsClient_TEST(Companies.ATEST);
		} catch (Exception e) {
			e.printStackTrace();
		}
		CardManagementEP efsService = createEfsService_TEST();

		String userId = efsService.login(System.getProperty("efs.test.ws.user"),
				System.getProperty("efs.test.ws.password"));
		WSMoneyCode wsMoneyCode = efsService.issueMoneyCode(userId,
				efsClient.contractId, 0, efsAmount.doubleValue(), false,
				issueTo, description, "USD2");
		EfsMoneyCode moneyCode = new EfsMoneyCode();
		moneyCode.setIssued(true);
		moneyCode.setReferenceNumber(wsMoneyCode.getId());
		moneyCode.setMoneyCode(wsMoneyCode.getCode());

		efsService.logout(userId);

		return moneyCode;
	}
}
