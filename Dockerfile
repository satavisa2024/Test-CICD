FROM eclipse-temurin:17-jdk-alpine
RUN apk add curl
VOLUME /tmp
EXPOSE 8080
ADD target/Test-CICD-service.jar Test-CICD-service.jar
ENTRYPOINT ["java","-jar","/Test-CICD-service.jar"]