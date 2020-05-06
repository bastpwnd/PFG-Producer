FROM openjdk:8-alpine
COPY target/demo-0.0.1-SNAPSHOT.jar /productor.jar
CMD ["java","-jar","/productor.jar"]


