call mvn clean package spring-boot:run ^
	-D logging.level.com.bouygtel.springbootsample=DEBUG ^
	-D debug=true ^
	-D logging.config="%WORKSPACE_HOME%/dev/hello-world-sb-jersey-logs/config/logback-spring.xml" ^
	-D logging.path="%WORKSPACE_HOME%/dev/logs" ^
	-f "%WORKSPACE_HOME%/hello-world-sb-jersey-logs/pom.xml"
pause

@rem When the debug mode is enabled (debug=true), a selection of core loggers (embedded container, Hibernate and Spring) 
@rem are configured to output more information. 
@rem Enabling the debug mode does not configure your application log all messages with DEBUG level.
@rem (see http://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-logging-console-output)
