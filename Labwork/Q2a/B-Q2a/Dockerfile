# Use an official Java runtime as a parent image
FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the Java program from the host to the container
COPY . .

# Make the Java program executable
RUN javac factorial.java
CMD [ "java","factorial" ]