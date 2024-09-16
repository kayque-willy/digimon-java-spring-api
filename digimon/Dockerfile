FROM eclipse-temurin:21-jdk-noble
EXPOSE 8080
USER root
WORKDIR /app
 
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
 
COPY src ./src
 
CMD ["./mvnw", "spring-boot:run"]

# WORKDIR $CATALINA_HOME/conf
# ENV CATALINA_OPTS="-XX:InitialRAMPercentage=1 -XX:MaxRAMPercentage=75 -XX:MinRAMPercentage=25"
# WORKDIR /usr
# WORKDIR $CATALINA_HOME/webapps
# RUN rm -Rfv ROOT*
# COPY /target/ROOT.war ./
# WORKDIR $CATALINA_HOME/bin
# CMD ["catalina.sh", "jpda", "run"]