package com.imc.driver.wait.dao;

import java.util.List;

import com.imc.driver.wait.service.entities.DrwaitEventQueue;

public interface DrwaitEventQueueDAO {
	List<DrwaitEventQueue> getAll(boolean includeProcessed);
	List<DrwaitEventQueue> getAll(String usrCode, boolean includeProcessed);
	void update(DrwaitEventQueue drwaitEvent);
	void insert(DrwaitEventQueue instance);
}
