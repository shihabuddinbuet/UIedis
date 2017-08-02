package com.ipv.su.uedis;

import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ipv.su.uedis.model.KeyInfo;
import com.ipv.su.uedis.service.UedisService;
import com.ipv.su.uedis.utils.Converter;

@Path("api")
public class UedisApi {
	private static final String SEPARATOR = ",";
	
	@Inject
	private UedisService service;
	
	@GET
	@Path("/keys")
	@Produces(MediaType.TEXT_PLAIN)
	public String getKeys() {
		Set<String> keys = service.getKeys();
		String response = Converter.toString(keys, SEPARATOR);
		return response;
	}
	
	@GET
	@Path("/keys/{key}")
	@Produces(MediaType.APPLICATION_XML)
	public KeyInfo getKey(@PathParam("key") String key) {
		return new KeyInfo(key, "string", "uddin"); 
	}
	
	@GET
	@Path("/ping")
	@Produces(MediaType.TEXT_PLAIN)
	public String ping() {
		return "Wow !! Got it";
	}
	
}
