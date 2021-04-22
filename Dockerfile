FROM tomcat:8.0-alpine

LABEL maintainer="gweber@student.neumont.edu"

COPY rock-paper-scissors-master/target/roshambo-1.war /usr/local/tomcat/webapps/roshambo.war

CMD ["ls /usr/local/tomcat/webapps"]

EXPOSE 8080

CMD ["catalina.sh", "run"]
