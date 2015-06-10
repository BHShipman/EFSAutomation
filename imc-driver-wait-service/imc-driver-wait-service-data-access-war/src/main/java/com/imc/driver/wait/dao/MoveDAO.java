package com.imc.driver.wait.dao;

import com.imc.driver.wait.service.entities.Move;

public interface MoveDAO {
//	List<MoveDTO> getMoveDTOsByDispatcher(int cmpyNo, String dispatcher);
//	void updateDestinationArvDpt(int cmpyNo, int moveNo, Date arrival, Date departure);
//	void updateOriginArvDpt(int cmpyNo, int moveNo, Date arrival, Date departure);
	void update(Move move);
	Move get(int moveNo, int cmpyNo);
}
