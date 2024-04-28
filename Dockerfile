FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/verisoft_backend_1-0.0.1-SNAPSHOT.jar VerisoftBackend.jar
ENTRYPOINT ["java", "-jar","/VerisoftBackend.jar"]