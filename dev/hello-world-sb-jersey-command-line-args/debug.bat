call mvn clean package spring-boot:run ^
	-D run.arguments="--start" ^
	-Drun.jvmArguments="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n" ^
	-f %WORKSPACE_HOME%/hello-world-sb-jersey-command-line-args/pom.xml
pause

@rem For infos about Spring Boot Maven Plugin: http://docs.spring.io/spring-boot/docs/current/maven-plugin/examples/run-debug.html