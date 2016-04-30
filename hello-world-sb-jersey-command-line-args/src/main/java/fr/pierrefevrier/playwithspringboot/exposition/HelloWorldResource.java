package fr.pierrefevrier.playwithspringboot.exposition;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Path("/helloworld")
public class HelloWorldResource {

	@Value("${parallelism:1}") // Come from from command line args
	private String parallelism;

	@GET
	public String home() {
		return "Hello World from Spring Boot with command line args parallelism=" + parallelism + " !";
	}
}
