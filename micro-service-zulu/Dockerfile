FROM openjdk:11.0-jdk

ADD ./target/micro-service-zuul-0.0.1-SNAPSHOT.jar /zuul/app/micro-service-zuul-0.0.1-SNAPSHOT.jar

WORKDIR zuul/app

EXPOSE 8097

ENTRYPOINT ["java", "-jar", "micro-service-zuul-0.0.1-SNAPSHOT.jar"]