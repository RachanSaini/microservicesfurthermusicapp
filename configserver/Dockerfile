FROM openjdk:11.0-jdk

ADD ./target/configserver-0.0.1-SNAPSHOT.jar /configserver/app/configserver-0.0.1-SNAPSHOT.jar

#WORKDIR configserver/app

EXPOSE 8099

ENTRYPOINT ["java", "-jar", "configserver-0.0.1-SNAPSHOT.jar"]