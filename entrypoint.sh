#!/bin/bash
# Espera até que o MySQL esteja disponível
./wait-for-it.sh mysql:3306 -t 60

# Inicia a aplicação Spring Boot
java -jar app.jar
