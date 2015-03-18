package com.imc.efs.automation.bo;

import com.imc.efs.automation.dto.CredentialsDTO;

public interface ICredentialsValidator {

	CredentialsDTO GetEncryptedCredentials(String username);
}
