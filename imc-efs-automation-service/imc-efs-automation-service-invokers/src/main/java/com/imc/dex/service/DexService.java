package com.imc.dex.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

@WebService(name = "", targetNamespace = "http://tempuri.org/")
public interface DexService {

//	@WebMethod(action="http://tempuri.org/IIndexedFileService/Download")
//	@WebResult(targetNamespace="http://tempuri.org/", name="DownloadResult")
//	@RequestWrapper(localName="Download", targetNamespace = "http://tempuri.org/", className = "com.imc.test.Upload")
//	@ResponseWrapper(localName = "DownloadResponse", targetNamespace= "http://tempuri.org/")
//	public IndexedFile download(IndexedFile file);
	

	@WebMethod(action="http://tempuri.org/IIndexedFileService/Upload")
	@WebResult(targetNamespace="http://tempuri.org/", name="UploadResult")
	@RequestWrapper(localName="Upload", targetNamespace = "http://tempuri.org/")
	@ResponseWrapper(localName = "UploadResponse", targetNamespace= "http://tempuri.org/")
	public ServerInfo upload(@WebParam(name = "file", targetNamespace="http://tempuri.org/")IndexedFile file);
		
}
