package com.imc.cxf.sample.service.impl;

import javax.ejb.EJB;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.cxf.sample.data.Chassis;
import com.imc.cxf.sample.data.ChassisResponse;
import com.imc.cxf.sample.service.ChassisService;
import com.imc.efs.automation.bo.ChassisDetailsBO;

@Path("/chassisservice/")
public class ChassisServiceImpl implements ChassisService {
	protected final Logger LOGGER = LoggerFactory
			.getLogger(ChassisServiceImpl.class);
	
	@EJB
	private ChassisDetailsBO chassisDetailsBO;

	@GET
	@Path("/v1/getchassis/{chassisID}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public ChassisResponse getChassis(@PathParam("chassisID") String chassisId) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("chassisId::" + chassisId);
		}

		//ChassisDetailsBO chassisDetailsBO = new ChassisDetailsBOImpl();
		
		ChassisResponse response = null;
		try {
			if(chassisDetailsBO == null){
				chassisDetailsBO = (ChassisDetailsBO)
				        (new InitialContext()).lookup("java:module/ChassisDetailsBO");
			}
			response = chassisDetailsBO
					.getChassisDetails(chassisId);
			
		} catch (NamingException e) {
			LOGGER.error("Error initializing EJB", e);
			
			response = new ChassisResponse();
			response.setResponseCode(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			response.setResponseStatus("ERROR");
			response.setResponseMessage(e.getMessage());			
		}

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("response::" + response);
		}

		return response;
	}

	@GET
	@Path("/v1/addchassis/{chassisID}/{chassisOwner}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public ChassisResponse addChassis(@PathParam("chassisID") String chassisID,
			@PathParam("chassisOwner") String chassisOwner) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("inside addChassis chassisID::" + chassisID
					+ "...chassisOwner::" + chassisOwner);
		}

		Chassis chassis = new Chassis();
		chassis.setChassisID(chassisID);
		chassis.setOwnerID(chassisOwner);
		
		ChassisResponse response = null;
		try {
			if(chassisDetailsBO == null){
				chassisDetailsBO = (ChassisDetailsBO)
				        (new InitialContext()).lookup("java:module/ChassisDetailsBO");
			}
	
			response = chassisDetailsBO.addChassis(chassis);
		} catch (NamingException e) {
			LOGGER.error("Error initializing EJB", e);
			
			response = new ChassisResponse();
			response.setResponseCode(Response.Status.INTERNAL_SERVER_ERROR.getStatusCode());
			response.setResponseStatus("ERROR");
			response.setResponseMessage(e.getMessage());			
		}
		
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("inserted the record chassis::" + chassis);
		}

		return response;
	}

	@POST
	@Path("/v1/addchassis")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public ChassisResponse addChassisJson(Chassis chassis) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("inside addChassis chassis::" + chassis);
		}
		//ChassisDetailsBO chassisDetailsBO = new ChassisDetailsBOImpl();

		ChassisResponse response = chassisDetailsBO.addChassis(chassis);

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("inserted the record response::" + response);
		}

		return response;
	}
}