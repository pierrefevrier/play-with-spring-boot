package fr.pierrefevrier.playwithspringboot.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/") // Webapp will listen on "/" uri
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		// Scan to auto-discover resources
		packages("fr.pierrefevrier.playwithspringboot.exposition");
	}
}
