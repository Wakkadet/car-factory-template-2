#FROM adoptopenjdk:11-jre-openj9
#
#RUN mkdir -p /home/app
#
#ADD target/showroom-0.0.1-SNAPSHOT.jar /home/app/app.jar
## ADD client.truststore.jks /home/app/client.truststore.jks
#ADD application.yaml /home/app/application.yaml
#
#WORKDIR /home/app
#
#EXPOSE 8080
#
#ENTRYPOINT exec java $JAVA_OPTS -jar /home/app/app.jar $JAVA_CONFIGS

FROM adoptopenjdk:11-jre-openj9

# Set volume point to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside container
EXPOSE 8080

# Set application's JAR file
ARG JAR_FILE=target/showroom-0.0.1-SNAPSHOT.jar

# Add the application's JAR file to the container
ADD ${JAR_FILE} app.jar

# Run the JAR file
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]