# Case Java I

## Descrição do projeto

Este projeto trata-se de um serviço "Web" simples utilizando o Spring Boot e o Docker. O serviço "Web" fornece 
uma API REST básica para manipular dados de uma entidade Produto.

### Etapas

#### 1. Configuração do projeto

* Criar projeto Spring Boot utizando o [Spring Initializr](https://start.spring.io/)
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Adicionar as dependências: spring-boot-starter-web, spring-boot-starter-data-jpa
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

#### 2. Inicialização do Repositório Git

* Iniciar repositório Git na raiz do projeto. 
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Adicionar arquivo ".gitignore" para ignorar arquivos e diretórios desnecessários, como arquivos de compilação, arquivos 
de "log", etc.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

#### 3. Implementação da Entidade Produto

* Criar a classe Produto com campos como "id", nome, preco, descrição, etc.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Adicionar anotações JPA para mapeamento da entidade Produto.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Realizar o commit das mudanças ao repositório Git.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

#### 4. Implementação do Controlador REST

* Criar um controlador REST para manipular operações CRUD (Create, Read, Update, Delete) para a entidade Produto.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Implementar métodos para criar, ler, atualizar e excluir produtos.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

##### Adicionar um novo produto:

    - Endpoint: /produtos
    - Método HTTP: POST
    - Parâmetro: Corpo da requisição contendo um objeto JSON com os dados do produto.
    - Descrição: Este endpoint adiciona um novo produto ao banco de dados.
    - Exemplo de uso:
    ```json
    {
        "nome": "Notebook",
        "preco": 1500.00,
        "descricao": "Notebook Dell Inspiron",
        "quantidade": 10
    }

##### Obter todos os produtos:

    - Endpoint: `/produtos`
    - Método HTTP: GET
    - Parâmetro: Nenhum.
    - Descrição: Este endpoint retorna uma lista de todos os produtos cadastrados.
    - Exemplo de uso: `/api/produtos`

##### Obter um produto por ID:
    - Endpoint: /produtos/{id}
    - Método HTTP: GET
    - Parâmetro: id (via URL)
    - Descrição: Este endpoint retorna um produto específico baseado no ID fornecido. Se o produto não for encontrado, 
      uma exceção será lançada.
    - Exemplo de uso: /api/produtos/1

##### Excluir um produto:
    
    - Endpoint: /produtos/{id}
    - Método HTTP: DELETE
    - Parâmetro: id (via URL)
    - Descrição: Este endpoint exclui um produto específico baseado no ID fornecido.
    - Exemplo de uso: /api/produtos/1

##### Atualizar um produto existente:

    - Endpoint: /produtos/{id}
    - Método HTTP: PUT
    - Parâmetro: 
        - id (via URL)
        - Corpo da requisição contendo um objeto JSON com os dados atualizados do produto.
    - Descrição: Este endpoint atualiza os dados de um produto específico baseado no ID fornecido. 
      Se o produto não for encontrado, uma exceção será lançada.
    - Exemplo de uso:
    ```json
    {
    "nome": "Notebook atualizado",
    "preco": 1600.00,
    "descricao": "Notebook Dell Inspiron atualizado",
    "quantidade": 8
    }

* Realizar o commit das mudanças ao repositório Git.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

#### 5. Configuração do Banco de Dados
   
* Configurar banco de dados no arquivo application.properties do Spring Boot.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)
 
* Realizar o commit das mudanças ao repositório Git.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)
 
#### 6. Configuração do Dockerfile

* Criar um arquivo Dockerfile na raiz do seu projeto Spring Boot para construir a imagem do contêiner.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Especificar as etapas necessárias para construir e executar o aplicativo Spring Boot dentro do contêiner.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Realizar o commit das mudanças ao repositório Git.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

#### 7. Configuração do Docker Compose

* Criar um arquivo docker-compose.yml para definir os serviços necessários, como o serviço "Web" e o banco de dados, 
  e suas configurações.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Usar o Docker Compose para orquestrar e gerenciar os contêineres.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Realizar o commit das mudanças ao repositório Git.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

#### 8. Construção e Execução dos Contêineres

* Executar o Docker Compose para construir e executar os contêineres.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

#### 6. Teste o serviço "Web" acessando a API REST via navegador ou ferramentas como o Postman
   
* Testar o serviço "Web" acessando a API REST via navegador.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)

* Testar o serviço "Web" acessando a API REST via Postman.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)
 
* Realizar o commit das mudanças ao repositório Git.
![tarefa realizada](https://img.shields.io/badge/status-realizada-brightgreen?style=flat-square&logo=check&logoColor=white)
