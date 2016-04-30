package fr.pierrefevrier.playwithspringboot.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@Order(Ordered.HIGHEST_PRECEDENCE) // Take the lead before Jersey to load application context (http://blog.xebia.fr/2014/04/22/construire-une-api-rest-avec-jersey-et-spring-sans-web-xml-ni-applicationcontext-xml-ni-getterssetters/)
public class ServletInitializer implements WebApplicationInitializer { // Spring implement of Servlet 3.0 spec

	public void onStartup(ServletContext servletContext) throws ServletException {

		// Explain to Spring where to find application context conf
	    servletContext.setInitParameter("contextConfigLocation", "fr.pierrefevrier.playwithspringboot.config");
		
	    // Drive application context by annotations
		AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();

		servletContext.addListener(new ContextLoaderListener(rootContext));
	}

}
