#Base Image
FROM maven:latest AS build

WORKDIR /Ecommerce website

#Copy pom file
COPY pom.xml pom.xml

#Install dependency
RUN mvn dependency:go-offline

#Copy all file
COPY src/ ./src

# Build the application using maven
RUN mvn clean package

CMD ["java", "-jar", "target/Ecommerce website"]
