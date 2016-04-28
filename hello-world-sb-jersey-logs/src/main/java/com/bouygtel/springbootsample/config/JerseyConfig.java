package com.bouygtel.springbootsample.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		// Scan to auto-discover resources
		packages("com.bouygtel.springbootsample.exposition");
	}
}
