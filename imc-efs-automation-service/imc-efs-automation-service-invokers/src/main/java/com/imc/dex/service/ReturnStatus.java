package com.imc.dex.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ReturnStatus", namespace="http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
public enum ReturnStatus {

	Success(0), Info(1), Warning(2), Error(3);

	private final int index;

	ReturnStatus(int index) {
		this.index = index;
	}

	public int index() {
		return index;
	}
}
