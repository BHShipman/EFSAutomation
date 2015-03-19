package com.imc.efs.automation.dao;

import java.math.BigDecimal;

public interface CheckLimitDAO {

	BigDecimal getEfsCheckLimitByUser(String requester, int requestTypeId);
}
