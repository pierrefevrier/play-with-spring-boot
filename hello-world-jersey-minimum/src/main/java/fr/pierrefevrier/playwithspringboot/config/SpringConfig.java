package fr.pierrefevrier.playwithspringboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Spring beans declaration
@ComponentScan(basePackages = "fr.pierrefevrier.playwithspringboot") // Scan to auto-discover beans
public class SpringConfig {

}
