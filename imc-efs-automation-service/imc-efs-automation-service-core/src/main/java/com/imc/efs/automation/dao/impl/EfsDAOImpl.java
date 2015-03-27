package com.imc.efs.automation.dao.impl;

import java.math.BigDecimal;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import service.cards.tch.com.CardManagementEP;
import service.cards.tch.com.CardManagementEP_TEST;
import service.cards.tch.com.CardManagementWS;
import service.cards.tch.com.CardManagementWS_TEST;
import service.cards.tch.com.types.WSMoneyCode;
import service.cards.tch.com.types.WSMoneyCodeHistRec;

import com.imc.efs.automation.dao.EfsDAO;
import com.imc.efs.automation.data.EfsClient;
import com.imc.efs.automation.data.EfsClient_TEST;
import com.imc.efs.automation.data.EfsMoneyCode;
import com.imc.efs.automation.dto.MoneyCodeDetailsDTO;
import com.imc.efs.automation.enums.Companies;

@Remote(EfsDAO.class)
@Stateless(name = "EfsDAO")
public class EfsDAOImpl implements EfsDAO {

	@Override
	public EfsMoneyCode getMoneyCode(BigDecimal efsAmount, String issueTo,
			String description, String company) {
		CardManagementWS service = new CardManagementWS();
		CardManagementEP client = service.getCardManagementEPPort();

		EfsClient efsClient = null;
		try {
			efsClient = new EfsClient(Companies.AIS);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String userId = client.login(System.getProperty("efs.ws.user")
				+ efsClient.carrierId, System.getProperty("efs.ws.password"));
		WSMoneyCode wsMoneyCode = client.issueMoneyCode(userId,
				efsClient.contractId, 0, efsAmount.doubleValue(), false,
				issueTo, description, "USD2");
		EfsMoneyCode moneyCode = new EfsMoneyCode();
		moneyCode.setIssued(true);
		moneyCode.setReferenceNumber(wsMoneyCode.getId());
		moneyCode.setMoneyCode(wsMoneyCode.getCode());

		client.logout(userId);

		return moneyCode;
	}

	@Override
	public EfsMoneyCode GetMoneyCode_TEST(BigDecimal efsAmount, String issueTo,
			String description, String company) {
		CardManagementWS_TEST service = new CardManagementWS_TEST();
		CardManagementEP_TEST client = service.getCardManagementEPPort();

		EfsClient_TEST efsClient = null;
		try {
			efsClient = new EfsClient_TEST(Companies.ATEST);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String userId = client.login(System.getProperty("wsTESTUser"),
				System.getProperty("wsTESTPassword"));
		WSMoneyCode wsMoneyCode = client.issueMoneyCode(userId,
				efsClient.contractId, 0, efsAmount.doubleValue(), false,
				issueTo, description, "USD2");
		EfsMoneyCode moneyCode = new EfsMoneyCode();
		moneyCode.setIssued(true);
		moneyCode.setReferenceNumber(wsMoneyCode.getId());
		moneyCode.setMoneyCode(wsMoneyCode.getCode());

		client.logout(userId);

		return moneyCode;
	}

	@Override
	public MoneyCodeDetailsDTO GetMoneyCodeDetails(String company,
			int referenceNumber) {
		CardManagementWS service = new CardManagementWS();
		CardManagementEP client = service.getCardManagementEPPort();

		EfsClient efsClient = null;
		try {
			efsClient = new EfsClient(Companies.AIS);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String userId = client.login(System.getProperty("efs.ws.user")
				+ efsClient.carrierId, System.getProperty("efs.ws.password"));
		WSMoneyCodeHistRec wsMoneyCode = client.getMoneyCode(userId,
				String.valueOf(referenceNumber));
		MoneyCodeDetailsDTO moneyCodeDetails = new MoneyCodeDetailsDTO();
		moneyCodeDetails.setAmount(wsMoneyCode.getAmount());
		moneyCodeDetails.setAmountUsed(wsMoneyCode.getAmountUsed());
		moneyCodeDetails.setFeeAmount(wsMoneyCode.getFeeAmount());
		moneyCodeDetails.setFirstUse(wsMoneyCode.getFirstUse());
		moneyCodeDetails.setVoided(wsMoneyCode.isVoided());
		moneyCodeDetails.setWho(wsMoneyCode.getWho());

		client.logout(userId);

		return moneyCodeDetails;
	}

	@Override
	public MoneyCodeDetailsDTO GetMoneyCodeDetails_TEST(String company,
			int referenceNumber) {
		CardManagementWS_TEST service = new CardManagementWS_TEST();
		CardManagementEP_TEST client = service.getCardManagementEPPort();
		
		EfsClient efsClient = null;
		try {
			efsClient = new EfsClient(Companies.ATEST);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String userId = client.login(System.getProperty("efs.test.ws.user"),
				System.getProperty("efs.test.ws.password"));
		WSMoneyCodeHistRec wsMoneyCode = client.getMoneyCode(userId,
				String.valueOf(referenceNumber));
		MoneyCodeDetailsDTO moneyCodeDetails = new MoneyCodeDetailsDTO();
		moneyCodeDetails.setAmount(wsMoneyCode.getAmount());
		moneyCodeDetails.setAmountUsed(wsMoneyCode.getAmountUsed());
		moneyCodeDetails.setFeeAmount(wsMoneyCode.getFeeAmount());
		moneyCodeDetails.setFirstUse(wsMoneyCode.getFirstUse());
		moneyCodeDetails.setVoided(wsMoneyCode.isVoided());
		moneyCodeDetails.setWho(wsMoneyCode.getWho());

		client.logout(userId);

		return moneyCodeDetails;
	}

}
