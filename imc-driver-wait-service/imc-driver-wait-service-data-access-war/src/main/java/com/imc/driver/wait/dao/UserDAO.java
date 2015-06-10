package com.imc.driver.wait.dao;

import com.imc.driver.wait.service.data.UserDetailsDTO;
import com.imc.driver.wait.service.entities.Userid;

public interface UserDAO {
	Userid get(String userCode);
	UserDetailsDTO getUserDetails(String userCode);
}
