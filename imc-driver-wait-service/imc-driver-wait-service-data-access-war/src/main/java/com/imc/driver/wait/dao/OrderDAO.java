package com.imc.driver.wait.dao;

import com.imc.driver.wait.service.entities.Order;


public interface OrderDAO {
//	void confirmDriverWait(Drwait driverWait);
	Order get(int orNo, int cmpyNo);
	
}
