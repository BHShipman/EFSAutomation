package com.imc.efs.security;

import javax.ejb.Stateless;

@Stateless(name = "Authenticator")
public class BasicUserAuthenticator {

	public boolean authenticateRequest(String user, String pass) {
		if (user.compareTo("admin") == 0 && pass.compareTo("admin") == 0) {
			return true;
		} else if (user.compareTo("myTruck") == 0 && pass.compareTo("myTruck123") == 0) {
			return true;
		} else if (user.compareTo("FRS") == 0 && pass.compareTo("FRS123") == 0) {
			return true;
		}
		return false;
	}

}
