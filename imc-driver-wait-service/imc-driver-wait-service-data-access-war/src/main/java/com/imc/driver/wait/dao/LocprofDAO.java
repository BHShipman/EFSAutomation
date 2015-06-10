package com.imc.driver.wait.dao;

import com.imc.driver.wait.service.entities.Locprof;

public interface LocprofDAO {
	Locprof get(String lpCode, int cmpyNo);
}
