FROM openjdk:17 AS kpod
LABEL authors="dbontch"

ADD target/kpod-1.0.0-SNAPSHOT.jar kpod.jar

ENTRYPOINT ["java", "-jar", "kpod.jar"]
EXPOSE 8080
