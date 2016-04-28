package com.bouygtel.springbootsample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // Spring beans declaration
@ComponentScan(basePackages = "com.bouygtel.springbootsample") // Scan to auto-discover beans
public class SpringConfig {

}
