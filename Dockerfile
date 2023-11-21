FROM openjdk:8
ADD target/docker-producer-demo.jar docker-producer-demo.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","docker-producer-demo.jar"]