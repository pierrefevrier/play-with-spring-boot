package fr.pierrefevrier.playwithspringboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "fr.pierrefevrier.playwithspringboot")
public class SpringConfig {

	public static void main(String[] args) {
		// Bootstrap app (and it's auto-configured Tomcat web server) 
		// (see http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#getting-started-first-application-main-method)
		SpringApplication.run(SpringConfig.class, args);
	}
}
