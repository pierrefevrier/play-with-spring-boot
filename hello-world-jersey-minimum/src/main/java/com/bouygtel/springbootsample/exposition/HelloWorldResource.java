package com.bouygtel.springbootsample.exposition;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/helloworld")
public class HelloWorldResource {

	@GET
	public String home() {
		return "Hello World from Spring minimum !";
	}
}
