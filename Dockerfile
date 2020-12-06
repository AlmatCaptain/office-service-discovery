FROM openjdk:8

ADD /target/office-service-discovery-0.0.1-SNAPSHOT.jar office-service-discovery-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "office-service-discovery-0.0.1-SNAPSHOT.jar"]

EXPOSE 8761