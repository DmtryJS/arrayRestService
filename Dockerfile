FROM openjdk:8
ADD target/spring-boot-test-application.jar spring-boot-test-application.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "spring-boot-test-application.jar"]