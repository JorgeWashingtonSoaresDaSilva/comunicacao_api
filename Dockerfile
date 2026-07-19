FROM maven:4.0.0-rc-4-eclipse-temurin-21-alpine as build
WORKDIR /app
COPY . .
RUN  mvn clean package -DskipTests
FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar /app/comunicacao_api.jar
EXPOSE 8080

CMD ["java", "-jar", "/app/comunicacao_api.jar"]



