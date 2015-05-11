package com.imc.dex.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ServerInfo", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
@XmlAccessorType(XmlAccessType.FIELD)
public class ServerInfo {

	@XmlElement(name = "Message", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
	String messageField;

	@XmlElement(name = "Status", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
	ReturnStatus returnStatus;

	public String getMessageField() {
		return messageField;
	}

	public void setMessageField(String messageField) {
		this.messageField = messageField;
	}

	public ReturnStatus getReturnStatus() {
		return returnStatus;
	}

	public void setReturnStatus(ReturnStatus returnStatus) {
		this.returnStatus = returnStatus;
	}

}
