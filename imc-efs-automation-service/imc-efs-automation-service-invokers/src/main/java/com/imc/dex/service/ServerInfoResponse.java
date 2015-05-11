package com.imc.dex.service;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(namespace="http://schemas.datacontract.org/2004/07/Iils.Services.FileIndexing.Domain", name="Message")
public class ServerInfoResponse {
	
	protected ServerInfo serverInfo;

}
