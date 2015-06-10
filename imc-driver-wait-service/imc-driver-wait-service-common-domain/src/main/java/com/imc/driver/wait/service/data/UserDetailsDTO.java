package com.imc.driver.wait.service.data;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserDetailsDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1822868376722667338L;
	private String userCode;
	private String name;
	private String divCode;
	private int cmpyNo;
	private String status;

	public UserDetailsDTO() {

	}

	public UserDetailsDTO(String userCode, String name, String divCode,
			int cmpyNo, String status) {
		super();
		this.userCode = userCode;
		this.name = name;
		this.divCode = divCode;
		this.cmpyNo = cmpyNo;
		this.status = status;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDivCode() {
		return divCode;
	}

	public void setDivCode(String divCode) {
		this.divCode = divCode;
	}

	public int getCmpyNo() {
		return cmpyNo;
	}

	public void setCmpyNo(int cmpyNo) {
		this.cmpyNo = cmpyNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
