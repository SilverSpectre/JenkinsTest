FROM tomcat:8.0-alpine

LABEL maintainer="gweber@student.neumont.edu"

RUN rm -fr /usr/local/tomcat/webapps/ROOT

COPY rock-paper-scissors-master/target/roshambo-1.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD ["catalina.sh", "run"]
