FROM openjdk:8-jdk-alpine
USER root
VOLUME /tmp
RUN apk add --no-cache bash
RUN apk add --no-cache wget
COPY target/spring-boot-monitoring.jar app.jar
#RUN wget  -O Dynatrace-OneAgent-Linux-1.173.314.sh "https://kpf02450.live.dynatrace.com/api/v1/deployment/installer/agent/unix/default/latest?Api-Token=eIPJIVVGRLyRHRMNH8rAu&arch=x86&flavor=default"
#RUN wget https://ca.dynatrace.com/dt-root.cert.pem ; ( echo 'Content-Type: multipart/signed; protocol="application/x-pkcs7-signature"; micalg="sha-256"; boundary="--SIGNED-INSTALLER"'; echo ; echo ; echo '----SIGNED-INSTALLER' ; cat Dynatrace-OneAgent-Linux-1.173.314.sh ) | openssl cms -verify -CAfile dt-root.cert.pem > /dev/null
#RUN /bin/sh Dynatrace-OneAgent-Linux-1.173.314.sh APP_LOG_CONTENT_ACCESS=1 INFRA_ONLY=0
EXPOSE 8080
ENTRYPOINT ["java","-jar","-Dspring-boot.run.profiles=dev","/app.jar"]



