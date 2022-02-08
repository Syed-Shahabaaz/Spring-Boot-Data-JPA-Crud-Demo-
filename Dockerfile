FROM openjdk:11-jre-slim

WORKDIR app

COPY /target/demo-0.0.1-SNAPSHOT.jar ./

ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]