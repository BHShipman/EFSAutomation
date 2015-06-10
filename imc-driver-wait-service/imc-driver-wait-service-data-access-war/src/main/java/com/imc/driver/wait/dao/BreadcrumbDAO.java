package com.imc.driver.wait.dao;

import java.util.Date;
import java.util.List;

import com.imc.driver.wait.service.entities.Mcgps;

public interface BreadcrumbDAO {
	List<Mcgps> getAll(int cmpyNo, Date targetDatetime, int toleranceInMinutes, String drCode);
	List<Mcgps> getAll(int cmpyNo, Date targetDatetime, int toleranceInMinutes);
	List<Mcgps> getAll(int cmpyNo, Date startDatetime, Date endDatetime, String drCode);
	List<Mcgps> getAll(int cmpyNo, Date startDatetime, Date endDatetime);
}
