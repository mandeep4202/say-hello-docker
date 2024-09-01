FROM openjdk:8
EXPOSE 8080
ADD target/say-hello-docker.jar say-hello-docker.jar
ENTRYPOINT ["java","-jar","/say-hello-docker.jar"]