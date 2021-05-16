FROM openjdk:8
WORKDIR /opt
RUN wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.41/bin/apache-tomcat-9.0.41.tar.gz
RUN tar -xvzf apa*
RUN mv apache-tomcat-9.0.41 tomcat
RUN rm apache-tomcat-9.0.41.tar.gz
COPY target/*.war /opt/tomcat/webapps
CMD /opt/tomcat/bin/catalina.sh run