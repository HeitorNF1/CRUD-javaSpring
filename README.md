# Projeto Full Stack - Back-end

Este é o back-end da aplicação do Projeto Full Stack, desenvolvida usando Java com Spring Boot para fornecer APIs RESTful para gerenciar um catálogo de alimentos.

## Descrição do Projeto

Este projeto é uma API RESTful que permite a gestão de um catálogo de alimentos. Através da API, os usuários podem adicionar novos alimentos, listar alimentos existentes, atualizar informações e excluir alimentos do catálogo.

## Para o front-end

[front end](https://github.com/HeitorNF1/CRUD-Java-React)

### Funcionalidades

- **Adicionar Comida:** Recebe um novo objeto de comida via requisição POST e o persiste no banco de dados.
- **Listar Comidas:** Retorna uma lista de todas as comidas cadastradas no banco de dados.
- **Atualizar Comida:** Atualiza as informações de um alimento existente com base no ID fornecido.
- **Excluir Comida:** Remove um alimento do catálogo com base no ID fornecido.

## Tecnologias Utilizadas

-Spring Boot Starter Data JPA
-Spring Boot Starter Validation
-Spring Boot Starter Web
-Flyway Core
-Flyway MySQL
-Spring Boot DevTools
-MySQL Connector
-Lombok
-Spring Boot Starter Test

## Requisitos

- JDK 11 ou superior
- Maven (para gerenciamento de dependências)

