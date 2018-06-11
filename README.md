# springboot-security-demo2 [![Build Status](https://travis-ci.org/origoni/springboot-security-demo2.svg?branch=master)](https://travis-ci.org/origoni/springboot-security-demo2)

springboot-security-demo2

- Spring Boot 2 & Spring Security 5
- User Join, Login
- Use simple(single) Role

NEXT
- User authentication management
- Method level security

## Reference

- http://spring.io/guides/gs/securing-web/
- http://spring.io/guides/topicals/spring-security-architecture/
- https://docs.spring.io/spring-security/site/docs/current/guides/html5/helloworld-boot.html

## Quick Start
Pre Installed
- JDK 1.8 (or Java 10)
- Maven 3.5
- Git

Run
```
git clone https://github.com/origoni/springboot-security-demo2.git
cd springboot-security-demo2
mvn spring-boot:run
```

## Test

http://localhost:9092

- id = admin
- pw = adminPassword

http://localhost:9092/h2-console

### Tested
- STS(Eclipse) 3.8.4
- IntelliJ IDEA 2018.1.4

```
//@formatter:off & //@formatter:on
eclipse : Preferences -> Java -> Code style -> Formatter -> Edit... (or New...) > Off/On Tags
intellij : Preferences -> Editor -> Code Style > Formatter Control > Enable formatter markers in comments
```


## Dependency

### Spring Boot 2.0.2.RELEASE
- spring-boot-starter-web
- spring-boot-starter-security

#### Environment
- Java version: 8 Update 172 or 10.0.1
- Spring Boot version: 2.0.2
- Maven version: 3.5.2
- Lombok version: 1.18.0
- Default Encoding: UTF-8
- Default SCM : git