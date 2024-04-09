FROM maven:latest AS build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

FROM openjdk:latest
WORKDIR /app
COPY --from=build /app/target/hopital-0.0.1-SNAPSHOT.jar /app/hopital-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "hopital-0.0.1-SNAPSHOT.jar"]