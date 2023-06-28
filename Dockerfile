# Base image with Java
FROM openjdk:11

# Set the working directory
WORKDIR /app

# Copy the Java source file
#COPY vet_media_temp.java .
COPY vet_soma_impar.java .

# Compile the Java source file
#RUN javac vet_media_temp.java
RUN javac vet_soma_impar.java

# Run the Java application
#CMD ["java", "vet_media_temp"]
CMD ["java", "vet_soma_impar"]