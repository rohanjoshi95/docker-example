FROM openjdk:8
ADD target/docker-app.jar division.jar
ENTRYPOINT ["java","-jar","docker-app.jar"]