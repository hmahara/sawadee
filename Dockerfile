FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY target/sawadee-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
