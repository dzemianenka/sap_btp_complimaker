FROM openjdk:11

COPY srv/target/complimaker-0.0.1.jar complimaker-0.0.1.jar

VOLUME /tmp

EXPOSE 8080

ENTRYPOINT ["java","-jar","/complimaker-0.0.1.jar"]