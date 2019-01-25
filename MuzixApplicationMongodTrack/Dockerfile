FROM openjdk:11.0-jdk

ADD ./target/MuzixApplicationMongodTrack-0.0.1-SNAPSHOT.jar /track/app/MuzixApplicationMongodTrack-0.0.1-SNAPSHOT.jar

WORKDIR track/app

ENTRYPOINT ["java", "-jar", "MuzixApplicationMongodTrack-0.0.1-SNAPSHOT.jar"]