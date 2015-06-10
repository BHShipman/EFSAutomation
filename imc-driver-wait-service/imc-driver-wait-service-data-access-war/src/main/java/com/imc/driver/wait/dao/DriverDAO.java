package com.imc.driver.wait.dao;

import com.imc.driver.wait.service.entities.Driver;


public interface DriverDAO {
	Driver getDriverByCodeAndCmpyNo(String drCode, int cmpyNo);
}
