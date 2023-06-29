# imagem
FROM openjdk:11

# diretorio
WORKDIR /app

# Copy the Java source file
#COPY vet_media_temp.java .
COPY vet_soma_impar.java .

# Compile 
#RUN javac vet_media_temp.java
RUN javac vet_soma_impar.java

# Run the Java application
#CMD ["java", "vet_media_temp"]
CMD ["java", "vet_soma_impar"]