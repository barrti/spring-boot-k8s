FROM openjdk:10-jre-slim
MAINTAINER Bartosz Międlar<bmiedlar@wp.pl>

WORKDIR /app
RUN mkdir -p /app \
 && chgrp -R 0 /app \
 && chmod -R g=rwx /app
COPY build/libs/*.jar /app/app.jar
COPY start.sh /
ENTRYPOINT ["/start.sh"]
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-jar", "/app/app.jar"]

EXPOSE 8080