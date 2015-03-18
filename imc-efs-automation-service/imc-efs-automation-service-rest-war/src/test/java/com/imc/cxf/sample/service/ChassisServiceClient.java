package com.imc.cxf.sample.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;

public class ChassisServiceClient {
	static final String REST_URI = "http://localhost:8080/imc-efs-automation-service-rest-war/";
    static final String ADD_PATH = "chassisservice/v1/addchassis";
    static final String GET_PATH = "chassisservice/v1/getchassis";
    
    public static void main(String[] args) {        
        String chassisId = "ANIL522966";
        String chassisOwner = "TRAC";
        
        Response response;   
        
        System.err.println("Doing a add call for TSXA123234...");
        
        WebClient plainAddClient = WebClient.create(REST_URI, "IMC_WEB1", "IMC_WEB1_PWD", null);
        plainAddClient.path(ADD_PATH).path(chassisId + "/" + chassisOwner).accept("application/json");
        response = plainAddClient.get();                
        printResponse(response);
//
//        System.err.println("Doing a json add call for TSXA987654...");
//        Chassis chassis = new Chassis();
//        chassis.setChassisID("TSXA987654");
//        chassis.setOwnerID("DCLI");
//        
//        plainAddClient = WebClient.create(REST_URI, "IMC_WEB1", "IMC_WEB1_PWD", null);
//        response = plainAddClient.path(ADD_PATH).type("application/json").accept("application/json").post(chassis);        
//        printResponse(response);
        
        System.err.println("Doing a get call for TSXA123234...");

        WebClient getClientJson = WebClient.create(REST_URI, "IMC_WEB2", "IMC_WEB2_PWD", null);
        getClientJson.path(GET_PATH).path(chassisId).accept("application/json");
        response = getClientJson.get();
        printResponse(response);
        
        System.err.println("Doing a get call for TSXA987654...");
        
        chassisId = "TSXA987654";
        
        WebClient getClientXML = WebClient.create(REST_URI, "IMC_WEB2", "IMC_WEB2_PWD", null);
        getClientXML.path(GET_PATH).path(chassisId).accept("application/json");
        response = getClientXML.get();
        printResponse(response);
        
        System.err.println("Doing a json add call with ineligible user/pwd...");
        
        WebClient xmlAddClient = WebClient.create(REST_URI, "IMC_WEB2", "IMC_WEB2_PWD", null);
        xmlAddClient.path(ADD_PATH).path(chassisId + "/" + chassisOwner).accept("application/json");
        response = xmlAddClient.get();
        printResponse(response);        
    }
    
    private static void printResponse(Response response){

    	BufferedReader inputStreamReader = null;
    	
        try {
			String lineRead = "";
			StringBuilder returnDataBuilder = new StringBuilder();

			inputStreamReader = new BufferedReader(new InputStreamReader((InputStream)response.getEntity()));

			while ((lineRead = inputStreamReader.readLine()) != null) {
			    returnDataBuilder.append(lineRead);
			}

			System.err.println("REST Service Invoked response status is..[" + response.getStatus() + "]");
			System.err.println("data received::" + returnDataBuilder);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			if(inputStreamReader !=  null){
				try {
					inputStreamReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
              
    }
}
