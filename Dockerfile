#Docekrfile

FROM openjdk:21 

RUN mkdir usr/app/

COPY target/Dock_App.jar /usr/app/

WORKDIR /usr/app/ 

ENTRYPOINT [ "java","-jar","Dock_App.jar" ]