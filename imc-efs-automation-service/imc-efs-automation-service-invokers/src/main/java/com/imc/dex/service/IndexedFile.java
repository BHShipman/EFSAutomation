package com.imc.dex.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "IndexedFile", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
@XmlAccessorType(XmlAccessType.FIELD)
public class IndexedFile {

	@XmlElement(name="FileBytes", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
	private byte[] fileBytes;

	@XmlElement(name="FileExt", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
	private String fileExtField;

	@XmlElementWrapper(name="Indexes",namespace="http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
	@XmlElement(name="IndexField", namespace="http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
	List<IndexField> indexFields;

	@XmlElement(name="Info", namespace = "http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain")
	ServerInfo serverInfo;

	public byte[] getFileBytes() {
		return fileBytes;
	}

	public void setFileBytes(byte[] fileBytes) {
		this.fileBytes = fileBytes;
	}

	public String getFileExtField() {
		return fileExtField;
	}

	public void setFileExtField(String fileExtField) {
		this.fileExtField = fileExtField;
	}

	public List<IndexField> getIndexFields() {
		if(this.indexFields == null){
			return new ArrayList<IndexField>();
		}else
		return indexFields;
	}

	public void setIndexFields(List<IndexField> indexFields) {
		this.indexFields = indexFields;
	}

	public ServerInfo getServerInfo() {
		return serverInfo;
	}

	public void setServerInfo(ServerInfo serverInfo) {
		this.serverInfo = serverInfo;
	}

}
