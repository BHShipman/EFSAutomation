package com.imc.efs.automation.bo.impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import com.imc.data.access.service.EfsDataAccessServiceBean;
import com.imc.efs.automation.bo.CredentialsBO;
import com.imc.efs.automation.dto.CredentialsDTO;

@Stateless(name="CredentialsBO")
@Remote(CredentialsBO.class)
public class CredentialsBOImpl implements CredentialsBO {

	@EJB(beanName="EfsDAOService")
	private EfsDataAccessServiceBean efsDAOService;

	public CredentialsBOImpl(EfsDataAccessServiceBean efsDAOService) {
		this.efsDAOService = efsDAOService;
	}
	
	public CredentialsBOImpl(){
		
	}

	/* (non-Javadoc)
	 * @see com.imc.efs.automation.bo.impl.CredentialsBO#validateCredentials(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean validateCredentials(String username, String password) {
		CredentialsDTO credentials = efsDAOService.efsDAOService
				.getEncryptedCredentials(username);

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

	private String HashSHA1(String value) throws NoSuchAlgorithmException{
		
		MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
		byte[] hash = sha1.digest(value.getBytes());
		
		String result = new BigInteger(1, hash).toString(16);
		
		
		return result;
		
	}
	

}
