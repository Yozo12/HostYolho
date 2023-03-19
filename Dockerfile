FROM openjdk:19
COPY ./target/Prova-0.0.1-SNAPSHOT.jar /tmp
WORKDIR /tmp
CMD ["java", "-Dspring.profiles.active=development", "-jar", "/tmp/Prova-0.0.1-SNAPSHOT.jar"]