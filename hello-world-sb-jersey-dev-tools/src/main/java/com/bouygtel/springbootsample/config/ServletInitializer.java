package com.bouygtel.springbootsample.config;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		// Replace web.xml declaration (most of work is done in SpringBootServletInitializer parent class)
		return application.sources(SpringConfig.class);
	}

}
