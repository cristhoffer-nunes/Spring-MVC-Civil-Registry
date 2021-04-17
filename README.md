# Sistema de Cartórios

**API Rest para um sistema de cartórios**

**Planejamento do projeto:** Foi utiizado o Trello como forma de organização para separar as etapas do projeto, tendo como fonte de pesquisa o [Java Guides](https://www.javaguides.net/), 
[Thymeleaf](https://www.thymeleaf.org/) e utilização de projetos pessoais para a realização das tarefas.

![Apresentação](https://github.com/cristhoffer-nunes/Spring-MVC-Civil-Registry/blob/master/readme_gifs/geral.gif)

## Tecnologias
![Spring Badge](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)
![Bootstrap Badge](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)

## Dependências utilizadas

* Spring Web
* Spring Data JPA
* Spring Boot Devtools
* MySQL Driver
* Thymeleaf

## Baixando o repositório:

Para baixar esse repositório no seu computador, rode o código abaixo ou clique em [download](https://github.com/cristhoffer-nunes/Spring-MVC-Civil-Registry/archive/refs/heads/master.zip).

```bash
$ git clone https://github.com/cristhoffer-nunes/Spring-MVC-Civil-Registry.git
```

## Configurando e iniciando o projeto: 

Importe o projeto como Maven Project em sua IDE de preferência e edite no arquivo **application.properties** os dados necessários para realizar a conexão com o MySQL

> spring.datasource.url=jdbc:mysql://localhost:3306/INSIRA AQUI SEU SCHEMA DO MYSQL?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false <br>
spring.datasource.username=**INSIRA SEU USUARIO DO MYSQL** <br>
spring.datasource.password=**INSIRA SUA SENHA DO MYSQL** <br>

Feito as configurações necessárias execute o projeto e acesse a seguinte url:
> http://localhost:8080

## Consultando os cartórios

> Por padrão todos os cartórios adicionados serão exibidos na página inicial.

## Adicionar um cartório

> Clique no botão **Adicionar cartório** e insira as informações necessárias, após isto clique em **Salvar cartório**.

![Add](https://github.com/cristhoffer-nunes/Spring-MVC-Civil-Registry/blob/master/readme_gifs/add.gif)

## Alterar os dados

> Clique no botão **Atualizar** e insira as informações necessárias, após isto clique em **Atualizar cartório**.

![Update](https://github.com/cristhoffer-nunes/Spring-MVC-Civil-Registry/blob/master/readme_gifs/atualizar.gif)

## Excluir um cartório
> Clique no botão **Excluir** que o cartório será excluído automaticamente.

![Delete](https://github.com/cristhoffer-nunes/Spring-MVC-Civil-Registry/blob/master/readme_gifs/deletar.gif)
