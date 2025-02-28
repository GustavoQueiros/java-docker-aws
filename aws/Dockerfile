FROM eclipse-temurin:21-jdk-alpine

WORKDIR /app-springboot

COPY target/aws-0.0.1-SNAPSHOT.jar aws.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "aws.jar"]