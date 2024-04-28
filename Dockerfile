###### Maven #############
FROM maven:3.8.3-openjdk-17-slim AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]



###### Gradle #############
# FROM ubuntu:latest AS build
# RUN apt-get update
# RUN apt-get install -y openjdk-17-jdk
# COPY . .
# RUN ./gradlew bootJar --no-daemon

# FROM openjdk:17-jdk-slim
# EXPOSE 8080
# COPY --from=build /build/libs/verisoft-1.jar app.jar

# ENTRYPOINT ["java", "-jar", "/app.jar"]