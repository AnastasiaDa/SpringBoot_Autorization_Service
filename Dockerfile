FROM adoptopenjdk/openjdk:8-jdk-alpine

EXPOSE 8080

ADD build/libs/Spring_Boot_Autorization_Service-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]