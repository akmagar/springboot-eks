FROM openjdk:8
ADD target/springboot-eks.jar springboot-eks.jar
EXPOSE 80
ENTRYPOINT ["java", "-jar", "springboot-eks.jar"]