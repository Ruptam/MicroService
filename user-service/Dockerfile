FROM openjdk:8
ARG TOMCAT_DOWNLOAD_URL
WORKDIR /opt
#RUN wget https://downloads.apache.org/tomcat/tomcat-9/v9.0.41/bin/apache-tomcat-9.0.41.tar.gz
RUN wget ${TOMCAT_DOWNLOAD_URL}
RUN tar -xvzf apa*

RUN mv apache-tomcat-9.0.46 tomcat

RUN rm apache-tomcat-9.0.46.tar.gz

COPY target/*.war /opt/tomcat/webapps

CMD /opt/tomcat/bin/catalina.sh run
