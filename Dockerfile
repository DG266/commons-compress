# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

# syntax=docker/dockerfile:1

FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Add a non-root user
RUN groupadd -r myuser && useradd --create-home -r -g myuser myuser
RUN usermod -u 1024 myuser; groupmod -g 1024 myuser;

COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Fix Windows-to-Linux problems (special chars etc.)
RUN apt-get update && apt-get install dos2unix
RUN dos2unix mvnw
RUN chmod +x mvnw

# Update Maven version in maven-wrapper
RUN sed -i "s|3.5.0|3.8.8|g" .mvn/wrapper/maven-wrapper.properties

RUN ./mvnw dependency:resolve
RUN mkdir target
RUN chown myuser target

COPY src ./src

# From "root" user to "myuser" user
USER myuser

RUN ./mvnw install

ENTRYPOINT ["java", "-jar", "./target/commons-compress-1.23.0-SNAPSHOT.jar"]