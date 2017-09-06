## Library-system-rest-api - Spring-boot

This sample application demonstrates a sample REST API developed using Spring-boot. 
 
### Dependencies

This project requires the following to be built:

* Java 7 or higher

### Configuration

**application.properties**  
This is the standard Spring Boot configuration file used to specify environment specific values.

### Building

To build this project, is a two step process:

**Build the rest api**  
The first time you build the back end, you'll need to install the dependencies.  To do 
that:

```
$ ./gradlew clean build (ubuntu)
$  gradlew clean build (windows)
```

### Launching the application

With the dependencies installed, you can run the server with `$ ./gradlew bootrun`.  
The result of this will start an embedded tomcat server at port 8080 (http://localhost:8080).








