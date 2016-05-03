package fr.pierrefevrier.playwithspringboot.exposition;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Path("/helloworld")
public class ResourceHelloWorld {

	// Use SF4J facade pattern
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@GET
	public String home() {
		LOGGER.info("Here I'm...");
		LOGGER.debug("...I'm here too  !");
		return "Hello World from Spring Boot with custom logs handling !";
	}
}
