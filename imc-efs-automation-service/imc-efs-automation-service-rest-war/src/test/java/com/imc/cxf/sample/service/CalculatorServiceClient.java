package com.imc.cxf.sample.service;

import org.apache.cxf.jaxrs.client.WebClient;

public class CalculatorServiceClient {
	static final String REST_URI = "http://localhost:8080/imc-sample-cxf-json-service-war/";
    static final String ADD_PATH = "calculator/add";
    static final String SUB_PATH = "calculator/sub";
    static final String MUL_PATH = "calculator/mul";
    static final String DIV_PATH = "calculator/div";
     
    public static void main(String[] args) {
        int a = 122;
        int b = 34;
        String s = "";
         
        WebClient plainAddClient = WebClient.create(REST_URI);
        plainAddClient.path(ADD_PATH).path(a + "/" + b).accept("text/plain");
        s = plainAddClient.get(String.class);
        System.out.println(s);
         
        WebClient xmlAddClient = WebClient.create(REST_URI);
        xmlAddClient.path(ADD_PATH).path(a + "/" + b).accept("text/xml");
        s = xmlAddClient.get(String.class);
        System.out.println(s);
         
        WebClient plainSubClient = WebClient.create(REST_URI);
        plainSubClient.path(SUB_PATH).path(a + "/" + b).accept("text/plain");
        s = plainSubClient.get(String.class);
        System.out.println(s);
         
        WebClient xmlSubClient = WebClient.create(REST_URI);
        xmlSubClient.path(SUB_PATH).path(a + "/" + b).accept("text/xml");
        s = xmlSubClient.get(String.class);
        System.out.println(s);
    }
}
