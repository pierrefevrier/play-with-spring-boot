package fr.pierrefevrier.playwithspringboot.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		// Scan to auto-discover resources
		packages("fr.pierrefevrier.playwithspringboot.exposition");
	}
}
