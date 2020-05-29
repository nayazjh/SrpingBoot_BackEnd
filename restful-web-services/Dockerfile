FROM openjdk:8-jdk-alpine
EXPOSE 8083
RUN addgroup -S nayazjh && adduser -S nayazjh -G nayazjh
USER nayazjh:nayazjh
ARG JAR_FILE=target/*.war
COPY ${JAR_FILE} spring-boot-jenkins-docker.war
ENTRYPOINT ["java","-jar","/spring-boot-jenkins-docker.war"]