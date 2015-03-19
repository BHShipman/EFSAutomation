package com.imc.efs.automation.dao;

import com.imc.efs.automation.dto.CredentialsDTO;

public interface CredentialsDAO {

	CredentialsDTO GetEncryptedCredentials(String username);
}
