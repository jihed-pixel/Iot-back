FROM openjdk:11
COPY target/HachCovid19Back-0.0.1-SNAPSHOT.jar HachCovid19Back-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","HachCovid19Back-0.0.1-SNAPSHOT.jar"]