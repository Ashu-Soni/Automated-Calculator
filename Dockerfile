FROM openjdk:11
COPY ./application.jar ./
WORKDIR ./
CMD ["java", "-jar", "application.jar", "calculator"]