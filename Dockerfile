From eclipse-temurin:21

WORKDIR /app

COPY target/banking-App-0.0.1-SNAPSHOT.jar /app/bankingApp-docker.jar

ENTRYPOINT ["java","-jar","bankingApp-docker.jar"]