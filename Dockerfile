# Usando uma imagem base do JDK 17
FROM openjdk:17-jdk-slim

# Definindo o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copiando o arquivo JAR gerado para o diretório de trabalho no contêiner
COPY target/prospertech_produto-0.0.1-SNAPSHOT.jar /app/app.jar

# Expondo a porta que a aplicação irá rodar (padrão do Spring Boot é 8080)
EXPOSE 8080

# Comando para executar a aplicação Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
