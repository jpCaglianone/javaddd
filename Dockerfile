FROM amazoncorretto:21

WORKDIR /app

COPY target/tp2_ddd-0.0.1-SNAPSHOT.jar /app/tp2_ddd.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/tp2_ddd.jar"]
