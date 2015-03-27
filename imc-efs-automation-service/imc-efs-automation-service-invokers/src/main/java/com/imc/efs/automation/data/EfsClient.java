package com.imc.efs.automation.data;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import com.imc.efs.automation.enums.Companies;

public class EfsClient {

	public String userId;
	public int contractId;
	public int carrierId;

	public EfsClient(Companies company) throws Exception {

		switch (company) {
		case AIS:
			carrierId = 150630;
			contractId = 128393;
			break;
		case IMC:
			carrierId = 150628;
			contractId = 128391;
			break;
		case GIS:
			carrierId = 150635;
			contractId = 128398;
			break;
		case DNJ:
			carrierId = 150721;
			contractId = 128824;
			break;
		case NDS:
			carrierId = 150631;
			contractId = 128394;
			break;
		case ATEST:
			throw new Exception("Trying to use test company in Prod Environment");
		}
		
	}

}
