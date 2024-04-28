FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/verisoft_backend_1-0.0.1-SNAPSHOT.jar verisoft_backend_1a.jar
ENTRYPOINT["java","-jar","/verisoft_backend_1a.jar"]