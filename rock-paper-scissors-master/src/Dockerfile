FROM tomcat:8.0-alpine

LABEL maintainer=”gweber@student.neumont.edu”

ADD /var/lib/jenkins/jobs/Github_Pull/modules/com.mcnz.rps$roshambo/builds/30/archive/com.mcnz.rps/roshambo/1.0-SNAPSHOT/roshambo-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD [“catalina.sh”, “run”]
