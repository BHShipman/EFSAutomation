package com.imc.driver.wait.dao;

import java.util.List;

import com.imc.driver.wait.service.entities.Drwait;

public interface DrwaitDAO {
	void insert(Drwait driverWait);
	List<Drwait> getAll(String userCode, boolean includeComplete);
	Drwait getByExportMoveNo(int exportMoveNo, int cmpyNo);
	Drwait getByImportMoveNo(int importMoveNo, int cmpyNo);
}
