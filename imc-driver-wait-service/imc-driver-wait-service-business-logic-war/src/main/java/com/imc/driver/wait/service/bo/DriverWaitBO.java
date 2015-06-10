package com.imc.driver.wait.service.bo;

import java.util.List;

import com.imc.driver.wait.service.data.DrwaitFifoDTO;
import com.imc.driver.wait.service.entities.Drwait;


public interface DriverWaitBO {
	void processDrwaitEventQueue(String usrCode, int cmpyNo);
	List<Drwait> getIncompleteDrwaits(String usrCode);
	void processMoveUpdate(DrwaitFifoDTO drwaitFifo);
}