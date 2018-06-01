package com.nt.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;


@Path("/data")
public class PaytmService {
	@GET
	@Path("/getName")
	public MultivaluedMap<String,String> getBalance(@Context HttpHeaders head) {
		return head.getRequestHeaders();
	}
}
