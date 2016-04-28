package com.bouygtel.springbootsample.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ArgsValidator implements ApplicationRunner {

	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private ApplicationContext context;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		// Search for "start" arg option
		if (!args.containsOption("start")) {

			LOGGER.error("You must specify \"start\" option to start the app.");

			// Exit gracefully the app (with a non-zero exit code)
			SpringApplication.exit(context, new ExitCodeGenerator() {

				@Override
				public int getExitCode() {
					return 1;
				}
			});
		}
	}

}
