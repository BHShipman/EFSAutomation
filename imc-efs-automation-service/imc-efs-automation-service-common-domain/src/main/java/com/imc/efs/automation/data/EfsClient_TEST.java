package com.imc.efs.automation.data;

import java.io.Serializable;

import com.imc.efs.automation.enums.Companies;

public class EfsClient_TEST implements Serializable{

	public String userId;
	public int contractId = 0;
	public int _carrierId = 0;

	public EfsClient_TEST(Companies company) throws Exception{
		
		switch (company){
		
		case AIS:
		case IMC:
		case GIS:
		case DNJ:
		case NDS:
			throw new Exception("Non-test company trying to use EFS Test Environment...");
		case ATEST:
			_carrierId=0;
			contractId=128387;
			break;
		}
	}
}
