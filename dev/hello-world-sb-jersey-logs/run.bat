call mvn clean package spring-boot:run ^
	-D logging.config="%WORKSPACE_HOME%/dev/hello-world-sb-jersey-logs/config/logback-spring.xml" ^
	-D logging.path="%WORKSPACE_HOME%/dev/logs" ^
	-f "%WORKSPACE_HOME%/hello-world-sb-jersey-logs/pom.xml"
pause
