package com.imc.dex.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "IndexField", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
@XmlAccessorType(XmlAccessType.FIELD)
public class IndexField {

	@XmlElement(name="Id", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
	private IndexIds idField;

	@XmlElement(name="Value", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
	private String valueField;

	public IndexIds getIdField() {
		return idField;
	}

	public void setIdField(IndexIds idField) {
		this.idField = idField;
	}

	public String getValueField() {
		return valueField;
	}

	public void setValueField(String valueField) {
		this.valueField = valueField;
	}

}
