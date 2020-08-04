# Spring Boot Application Template/Starter-Project

[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2FSpring-Boot-Framework%2FSpring-Boot-Application-Template.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2FSpring-Boot-Framework%2FSpring-Boot-Application-Template?ref=badge_shield)
[![GitHub issues](https://img.shields.io/github/issues/Spring-Boot-Framework/Spring-Boot-Application-Template)](https://github.com/Spring-Boot-Framework/Spring-Boot-Application-Template/issues)
[![GitHub forks](https://img.shields.io/github/forks/Spring-Boot-Framework/Spring-Boot-Application-Template)](https://github.com/Spring-Boot-Framework/Spring-Boot-Application-Template/network)
[![GitHub stars](https://img.shields.io/github/stars/Spring-Boot-Framework/Spring-Boot-Application-Template)](https://github.com/Spring-Boot-Framework/Spring-Boot-Application-Template/stargazers)
[![Build Status](https://travis-ci.org/Spring-Boot-Framework/Spring-Boot-Application-Template.svg?branch=master)](https://travis-ci.org/Spring-Boot-Framework/Spring-Boot-Application-Template)
[![codecov](https://codecov.io/gh/Spring-Boot-Framework/Spring-Boot-Application-Template/branch/master/graph/badge.svg)](https://codecov.io/gh/Spring-Boot-Framework/Spring-Boot-Application-Template)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/4bc5385252064f0e908f445b1eba184b)](https://www.codacy.com/gh/Spring-Boot-Framework/Spring-Boot-Application-Template?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=Spring-Boot-Framework/Spring-Boot-Application-Template&amp;utm_campaign=Badge_Grade)
[![](https://images.microbadger.com/badges/image/anantha/spring-boot-application-template.svg)](https://microbadger.com/images/anantha/spring-boot-application-template)
[![](https://images.microbadger.com/badges/version/anantha/spring-boot-application-template.svg)](https://microbadger.com/images/anantha/spring-boot-application-template)
![Docker Image Size (latest by date)](https://img.shields.io/docker/image-size/anantha/spring-boot-application-template)

The only thing better than a Maven archetype is a repo you can fork with everything already setup. Skip the documentation and just fork-and-code.

Delete the sample code, replace with your own and you’re good to go.

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
