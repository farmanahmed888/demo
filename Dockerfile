FROM openjdk:17-alpine
COPY ./target/demo-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
CMD ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar"]
