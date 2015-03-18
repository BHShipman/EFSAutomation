package com.imc.efs.automation.bo;

import com.imc.efs.automation.entities.RequestTypes;

public interface IRequestTypeRepository {

	RequestTypes getRequestTypeById(int requestTypeId);
}
