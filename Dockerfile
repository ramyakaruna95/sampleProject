FROM java:8
ADD target/ practise-0.0.1-SNAPSHOT.jar practiseone.jar
EXPOSE 8088 8999
ENTRYPOINT ["java","-jar","practiseone.jar"] 
