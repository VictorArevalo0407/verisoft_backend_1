FROM amazoncorretto:17-alpine-jdk
MAINTAINER ESMERALDA
COPY target/verisoft_backend_1-0.0.1-SNAPSHOT.jar Verisoft_backend_1.jar
ENTRYPOINT ["java","-jar","/Verisoft_backend_1.jar"]