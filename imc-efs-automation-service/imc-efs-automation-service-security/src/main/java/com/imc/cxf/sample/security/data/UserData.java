package com.imc.cxf.sample.security.data;

import java.io.Serializable;
import java.util.List;

public class UserData implements Serializable{
	private static final long serialVersionUID = 6680653257302565623L;
	
	private String userId;
	private String userPassword;
	private List<String> roles;

	public UserData(){
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
}
