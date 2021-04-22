FROM tomcat:8.0-alpine

LABEL maintainer="gweber@student.neumont.edu"

ADD rock-paper-scissors-master/target/roshambo.war /usr/local/tomcat/webapps/ROOT

EXPOSE 8080

CMD ["catalina.sh", "run"]
