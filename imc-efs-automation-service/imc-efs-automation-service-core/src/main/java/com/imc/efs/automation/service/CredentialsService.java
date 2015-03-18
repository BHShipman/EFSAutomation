package com.imc.efs.automation.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.imc.efs.automation.bo.ICredentialsValidator;
import com.imc.efs.automation.dto.CredentialsDTO;

public class CredentialsService {

	private ICredentialsValidator _credsValidator;

	public CredentialsService() {
	}

	public CredentialsService(ICredentialsValidator credsValidator) {
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
