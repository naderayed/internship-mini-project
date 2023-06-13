FROM openjdk:17-jdk

WORKDIR /app

COPY target/internship_project-0.1.jar /app/internship_project-0.1.jar

EXPOSE 8085

CMD ["java", "-jar", "internship_project-0.1.jar"]
