FROM openjdk:11.0-jdk

ADD ./target/eurekaservice-0.0.1-SNAPSHOT.jar /eureka/app/eurekaservice-0.0.1-SNAPSHOT.jar

#WORKDIR eureka/app

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "eurekaservice-0.0.1-SNAPSHOT.jar"]