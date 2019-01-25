FROM openjdk:11.0-jdk

ADD ./target/MuzixApplicationMongodUser-0.0.1-SNAPSHOT.jar /user/app/MuzixApplicationMongodUser-0.0.1-SNAPSHOT.jar

WORKDIR user/app

EXPOSE 8095

ENTRYPOINT ["java", "-jar", "MuzixApplicationMongodUser-0.0.1-SNAPSHOT.jar"]