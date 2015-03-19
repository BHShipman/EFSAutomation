package com.imc.efs.automation.bo.impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.imc.efs.automation.bo.CheckLimitBO;
import com.imc.efs.automation.dao.CredentialsDAO;
import com.imc.efs.automation.dto.CredentialsDTO;

public class CredentialsBOImpl implements CheckLimitBO {

	private CredentialsDAO _credsValidator;

	public CredentialsBOImpl() {
	}

	public CredentialsBOImpl(CredentialsDAO credsValidator) {
		_credsValidator = credsValidator;
	}

	public boolean validateCredentials(String username, String password) {
		CredentialsDTO credentials = _credsValidator
				.GetEncryptedCredentials(username);

		String hashedPassword = null;
		try {
			hashedPassword = HashSHA1(password + credentials.getSalt());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		if (credentials.getEncryptedPassword().compareTo(hashedPassword) == 0) {
			return true;
		} else
			return false;
	}
	//TODO make sure this is correct
	private String HashSHA1(String value) throws NoSuchAlgorithmException{
		
		MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
		byte[] hash = sha1.digest(value.getBytes());
		
		String result = new BigInteger(1, hash).toString(16);
		
		
		return result;
		
	}
	

}
