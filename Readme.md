# Spring Boot Application Client API

## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[PostgreSQL](https://www.postgresql.org/) - Open-Source Relational Database Management System
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system
* 	[Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
* 	[Swagger](https://swagger.io/) - Open-Source software framework backed by a large ecosystem of tools that helps developers design, build, document, and consume RESTful Web services.
* 	[Liquibase](https://www.liquibase.org/) - Liquibase Community is an open source project that helps millions of developers rapidly manage database schema changes.


### Customer URLs

|  URL |  Method | Remarks |
|----------|--------------|--------------|
|`http://localhost:8080/customer`                           | POST | 
|`http://localhost:8080/customer/{id}`                           | GET | 
|`http://localhost:8080/customer/all`                       | GET | |
|`http://localhost:8080/customer/by/city`                 | GET | |
|`http://localhost:8080/customer/by/phone/prefix` | GET | |

### Address URLs

|  URL |  Method | Remarks |
|----------|--------------|--------------|
|`http://localhost:8080/customer/{customerId}/address`                         | POST |
|`http://localhost:8080/customer/{customerId}/address/{addressId}`                       | DELETE |                                                                                     |"# ClientApi" 
