package com.imc.efs.automation.dto;

import java.io.Serializable;

public class CredentialsDTO implements Serializable{

	public CredentialsDTO() {
	}

	private int userId;
	private String encryptedPassword;
	private String salt;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEncryptedPassword() {
		return encryptedPassword;
	}

	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

}
