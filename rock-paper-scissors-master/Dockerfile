FROM tomcat:8.0-alpine

LABEL maintainer=”gweber@student.neumont.edu”

ADD /var/lib/jenkins/workspace/Tomcat/target/roshambo-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD [“catalina.sh”, “run”]
