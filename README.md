# E-commerce API

Desenvolvi a E-commerce API como parte de um curso, acompanhando e implementando as funcionalidades ensinadas. Trata-se 
de uma aplicação para gerenciamento de compras online, permitindo que usuários visualizem, pesquisem e adquiram produtos
de diversas categorias.

- ## Principais funcionalidades

  - Exibição e pesquisa de produtos em múltiplas categorias.
  - Cadastro de usuários e autenticação.
  - Adição de produtos ao carrinho e finalização de pedidos.
  - Gestão de produtos, categorias e pedidos pelos administradores.

- ## Tecnologias utilizadas

  - **Backend**: Java + Spring Boot (Spring Web, Spring Data JPA).
  - **Banco de Dados**: PostgreSQL + H2 para testes.
  - **Testes**: Spring Boot Starter Test.
  - **Containerização**: Docker + Docker Compose.

O projeto foi estruturado com classes de entidade como User, Product, Order e Category, cada uma com seu próprio service
para garantir uma separação clara de responsabilidades e manutenção eficiente.

## Requisitos
Certifique-se de ter o Java, Maven e Docker instalados em sua máquina.

## Executando a Aplicação

<details>
<summary>Com docker-compose</summary>

1. Clone o repositório.
   ```bash
     git@github.com:Phyllipesa/workshop-springboot3-jpa.git
   ```

2. Navegue até o diretório do projeto.
   ```bash
     cd workshop-springboot3-jpa
   ```

3. Compile o projeto.
   ```bash
     mvn package
   ```

4. Execute o comando.
   ```bash
     docker compose up -d --build
   ```

5. A aplicação será iniciada em 'http://localhost:80'.


6. Utilize as configurações de ENV e Collections fornecidas na pasta "docs" com o Postman ou outra ferramenta similar para realizar requisições e testar a API.
</details>

<details>
<summary>Sem docker-compose</summary>

1. Crie um contêiner para executar um servidor PostgreSQL.
   ```bash
     docker container run --name postgres -e POSTGRES_PASSWORD=1234567 -d -p 5432:5432 postgres
   ```

2. Clone o repositório.
   ```bash
     git@github.com:Phyllipesa/workshop-springboot3-jpa.git
   ```

3. Abra o projeto utilizando a IDE de preferência.


4. Altere o conteúdo do arquivo application.yml que se encontra no diretório __/src/main/resources__ para:
   ```
     spring:
       jpa:
         open-in-view: true
       profiles:
         active: dev
   ```

5. Execute a aplicação usando Maven.
   ```bash
     mvn spring-boot:run
   ```

6. A aplicação será iniciada em 'http://localhost:8080'.


7. Utilize as configurações de ENV e Collections fornecidas na pasta "docs" com o Postman ou outra ferramenta similar para realizar requisições e testar a API.


</details>

## Tecnologias
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Docker](https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)

## Autores
- [@acenelio](https://github.com/acenelio) - Commit inicial
- [@phyllipesa](https://github.com/phyllipesa) - Desenvolvimento do projeto
