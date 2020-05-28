# SpringBoot - Rest XML
* Spring-Boot 2.3.0.RELEASE
* Java 8 -- 1.8.0_211
* Maven 3.6.1

created for testing

### Development 
when i was started to create this app, i found problem with spring boot plugin.
The problem was in `maven-surefire-plugin version 2.20.1`. It is not working for me even on `JDK 8`. After decreasing version to `2.18.1` started to work fine.

Example Request dan Response :

![output](https://github.com/vadlimolebila/rest-xml/blob/master/image/example.jpg?raw=true)