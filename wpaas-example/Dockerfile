FROM openjdk:8u111

MAINTAINER atSistemas.com

COPY target/wpaas-example-*.jar /opt/springboot/app.jar

RUN useradd springboot

USER springboot

EXPOSE 8484

ENV WPAAS_USER_WALLPAPER "http://bit.ly/2pNhWz8"

ENTRYPOINT ["/usr/bin/java"]

CMD ["-jar", "/opt/springboot/app.jar"]
