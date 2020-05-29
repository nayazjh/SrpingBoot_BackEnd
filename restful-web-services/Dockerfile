FROM openjdk:8-jdk-alpine
EXPOSE 8083
RUN addgroup -S nayazjh && adduser -S nayazjh -G nayazjh
USER nayazjh:nayazjh
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} restful-web-services-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/restful-web-services-0.0.1-SNAPSHOT.war"]