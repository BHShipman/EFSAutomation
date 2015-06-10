package com.imc.driver.wait.service.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.imc.driver.wait.service.data.CoordinatePoint;

public class CoordinatePointSerializer {

	private static Gson gson = new Gson();
	private static final Logger log = LoggerFactory
			.getLogger(CoordinatePointSerializer.class);

	public CoordinatePoint[] deserializeToArray(String json) {
		try {
			CoordinatePoint[] coordPoints = gson.fromJson(json,
					CoordinatePoint[].class);
			return coordPoints;
		} catch (Exception e) {
			log.error("deserializeToCoordPointArray failed with json: " + json,
					e);
			throw e;
		}
	}
}
