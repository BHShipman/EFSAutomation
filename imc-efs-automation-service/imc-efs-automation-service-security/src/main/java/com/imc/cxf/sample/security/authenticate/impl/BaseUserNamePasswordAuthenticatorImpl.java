package com.imc.cxf.sample.security.authenticate.impl;

import org.apache.cxf.interceptor.security.AuthenticationException;

import com.imc.cxf.sample.security.authenticate.UserAuthenticator;
import com.imc.cxf.sample.security.authenticate.helper.UserDataHelperImpl;
import com.imc.cxf.sample.security.data.UserData;

public class BaseUserNamePasswordAuthenticatorImpl implements UserAuthenticator{

	public UserData authenticateUser(String userId, String password) throws AuthenticationException{
		UserData userData = null; 
		
		if(userId != null && userId.trim().length() > 0){
			userData = UserDataHelperImpl.getInstance().getUserData(userId);
		}
		
		//If password does not matches return null data
		if(!(userData != null && userData.getUserPassword().equals(password))){
			throw new AuthenticationException("Authentication Failed");
		}
		
		return userData;
	}	
}
