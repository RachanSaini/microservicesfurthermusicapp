FROM openjdk:11.0-jdk

ADD ./target/micro-service-zulu-0.0.1-SNAPSHOT.jar /zuul/app/micro-service-zulu-0.0.1-SNAPSHOT.jar

WORKDIR zuul/app

EXPOSE 8097

ENTRYPOINT ["java", "-jar", "micro-service-zulu-0.0.1-SNAPSHOT.jar"]