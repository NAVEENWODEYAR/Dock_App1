#Docekrfile

FROM openjdk:21 

RUN mkdir usr/app/

COPY target/Docker_App.jar /usr/app/

WORKDIR /usr/app/ 

ENTRYPOINT [ "java","-jar","" ]