package com.bouygtel.springbootsample.exposition;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/5xx")
public class ResourceErreurHandling {

	@GET
	public String home() {
		throw new RuntimeException("My custom technical error message.");
	}
}
