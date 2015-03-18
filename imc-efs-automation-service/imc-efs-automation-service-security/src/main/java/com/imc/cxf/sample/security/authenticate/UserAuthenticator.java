package com.imc.cxf.sample.security.authenticate;

import org.apache.cxf.interceptor.security.AuthenticationException;

import com.imc.cxf.sample.security.data.UserData;

public interface UserAuthenticator {
	public UserData authenticateUser(String userId, String password) throws AuthenticationException;
}
