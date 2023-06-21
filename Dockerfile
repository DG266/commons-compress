# syntax=docker/dockerfile:1

FROM maven:3.9.2-eclipse-temurin-17

WORKDIR /app

# Add a non-root user
RUN groupadd -r myuser && useradd --create-home -r -g myuser myuser
RUN usermod -u 1024 myuser; groupmod -g 1024 myuser;

COPY pom.xml ./

RUN mvn dependency:resolve
RUN mkdir target
RUN chown myuser target

COPY src ./src

# From "root" user to "myuser" user
USER myuser

RUN mvn package

ENTRYPOINT ["java", "-jar", "./target/commons-compress-1.23.0-SNAPSHOT.jar"]