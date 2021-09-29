FROM java:11
EXPOSE 9080

VOLUME /tmp
ADD java-web-base.jar  /app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
