FROM tomcat:8.0-alpine

LABEL maintainer="gweber@student.neumont.edu"

ADD rock-paper-scissors-master/target/roshambo-1.war /usr/local/tomcat/webapps/roshambo.war

ADD rock-paper-scissors-master/target/game.html /usr/local/tomcat/webapps/roshambo/

EXPOSE 8080

CMD ["catalina.sh", "run"]
