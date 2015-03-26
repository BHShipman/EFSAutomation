package com.imc.efs.automation.dao.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.imc.efs.automation.dao.CredentialsDAO;
import com.imc.efs.automation.dto.CredentialsDTO;
@Stateless(name = "CredentialsDAO")
@Remote(CredentialsDAO.class)
public class CredentialsDAOImpl implements CredentialsDAO {

	@PersistenceContext(name="EFS", unitName="EFS")
	EntityManager em;
	
	//table / entity [Users] does not currently exist
	// bshipman 3/20/15
	
	@Override
	public CredentialsDTO GetEncryptedCredentials(String username) {
		Query query = em.createNamedQuery("get.credentials");
		query.setParameter("username", username);
		//table / entity does not currently exist
		// bshipman 3/20/15
		// User user = (User) query.getSingleResult();
		// CredentialsDTO creds = new CredentialsDTO();
		// creds.setUserId(user.getuserId());
		// creds.setEncryptedPassword(user.getPassword());
		// creds.setSalt(user.getUserGuid());
//		return creds;
		try {
			throw new Exception("Table / Entity [Users] does not currently exist");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
