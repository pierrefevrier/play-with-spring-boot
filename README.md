Play with Spring Boot
=====================

Spring Boot is something really exciting, every Java geek should have hear about it !  

Let's play with it, with easy understandable examples :)  

For spelling, sorry, I'm French...  

# Wiki

First, we need an IDE (ok it's not a requirement but we don't want to have an headache...) and setup few little things: [here is the wiki](../../wiki).

# Projects

## `hello-world-jersey-minimum` and `hello-world-sb-jersey-minimum`

[MVP](https://en.wikipedia.org/wiki/Minimum_viable_product) MVP !  
These 2 projects have the minimum to expose a REST service with Jersey and Spring.  

Difference between them ? Spring Boot of course !

`hello-world-sb-jersey-minimum` is simply the Spring Boot version of `hello-world-jersey-minimum`.  

For both, I followed Servlet 3.0 spec, thanks to [this Xebia tuto](http://blog.xebia.fr/2014/04/22/construire-une-api-rest-avec-jersey-et-spring-sans-web-xml-ni-applicationcontext-xml-ni-getterssetters/).

## `hello-world-jersey-logs`

This project demonstrate how it is easy to setup logs with Spring Boot.
- I add a [embedded `application.properties`](hello-world-sb-jersey-logs/src/main/resources/application.properties) to be able to default some Spring Boot settings, here only `spring.application.name`.
- Have a look at [logback-spring.xml](dev/hello-world-sb-jersey-logs/config/logback-spring.xml)
  - [By default](https://github.com/spring-projects/spring-boot/blob/master/spring-boot/src/main/resources/org/springframework/boot/logging/logback/file-appender.xml) Spring Boot use a log rotation based on file size, I prefer time based rotation so I override the `FILE` appender and keep other default settings.
  - Note that I use `<springProperty name="spring.application.name" source="spring.application.name"/>` to refer to the property I have set in the [embedded `application.properties`](hello-world-sb-jersey-logs/src/main/resources/application.properties) and use it as the base name of log files.

## `hello-world-jersey-dev-tools`

See how Spring Boot detect changes on the classpath and restart automatically app to reflect changes (more infos here: https://spring.io/blog/2015/06/17/devtools-in-spring-boot-1-3).
- Note that it doesn't work when app is running with [maven command line](dev/hello-world-sb-jersey-dev-tools), you have to use `Run As > Java Application` or `Run As > Spring Boot App`
