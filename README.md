# 🚀 Aplicação Simples com JPA e Hibernate

![Status](https://img.shields.io/badge/status-finalizado-brightgreen)
![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-4.0.0-red)
![JPA](https://img.shields.io/badge/JPA-2.2-orange)
![Hibernate](https://img.shields.io/badge/Hibernate-5.6-lightgrey)

Um projeto didático desenvolvido para demonstrar as operações fundamentais de um CRUD (Create, Read, Delete) utilizando **Java**, **JPA** (Java Persistence API) com **Hibernate** como provedor de persistência e **MySQL** como banco de dados.

---

## 📋 Índice

* [Sobre o Projeto](#-sobre-o-projeto)
* [🛠️ Tecnologias Utilizadas](#-tecnologias-utilizadas)
* [⚙️ Pré-requisitos e Instalação](#️-pré-requisitos-e-instalação)
* [▶️ Como Executar](#️-como-executar)
* [🖼️ Preview do Banco de Dados](#️-preview-do-banco-de-dados)
* [👨‍💻 Autor](#-autor)

---

## 📖 Sobre o Projeto

O objetivo principal desta aplicação é servir como um exemplo claro e prático de como realizar o Mapeamento Objeto-Relacional (ORM) em Java. O projeto utiliza o **Maven** para gerenciamento de dependências e demonstra como configurar a conexão com um banco de dados **MySQL** através do arquivo `persistence.xml`.

As operações implementadas são:
* **Inserção (`Create`):** O `TransitionProgram.java` insere novos registros na tabela.
* **Consulta (`Read`):** O `ConsultProgram.java` busca um registro específico pelo seu ID.
* **Exclusão (`Delete`):** O `DeleteProgram.java` remove registros do banco de dados.

A tabela no banco de dados é gerenciada automaticamente pelo Hibernate com a configuração `hibernate.hbm2ddl.auto="update"`, que cria ou atualiza o schema conforme a entidade `Pessoa.java`.

---

## 🛠️ Tecnologias Utilizadas

* **Java 17**
* **Maven**
* **JPA (Java Persistence API)**: Especificação para persistência de dados.
* **Hibernate**: Implementação da JPA para o ORM.
* **MySQL**: Sistema de Gerenciamento de Banco de Dados.
* **XAMPP** (ou similar): Ambiente para rodar o servidor MySQL.

---

## ⚙️ Pré-requisitos e Instalação

Antes de começar, você vai precisar ter as seguintes ferramentas instaladas em sua máquina:
* [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)
* [MySQL](https://www.mysql.com/downloads/) (pode ser via [XAMPP](https://www.apachefriends.org/pt_br/index.html), WAMP, MAMP, etc.)
* Um Git client para clonar o repositório.

Siga os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/CaioFilardis/application-simple-JPA.git](https://github.com/CaioFilardis/application-simple-JPA.git)
    ```

2.  **Inicie seu servidor MySQL** e crie um novo banco de dados chamado `aplicacaojpa`:
    ```sql
    CREATE DATABASE aplicacaojpa;
    ```

3.  **Configure a conexão com o banco de dados.** Verifique se as credenciais no arquivo `src/main/resources/META-INF/persistence.xml` correspondem às suas. Por padrão, ele está configurado para um usuário `root` sem senha.
    ```xml
    <property name="javax.persistence.jdbc.user" value="root" />
    <property name="javax.persistence.jdbc.password" value="" />
    ```

4.  **Instale as dependências com o Maven:**
    Abra o terminal na raiz do projeto e execute:
    ```bash
    mvn install
    ```

---

## ▶️ Como Executar

Você pode executar as operações diretamente da sua IDE (Eclipse, IntelliJ, etc.). Cada funcionalidade está em uma classe separada com um método `main`.

1.  **Para inserir dados:**
    * Execute o arquivo `src/main/java/aplicacao/TransitionProgram.java`. Isso irá inserir três novas pessoas no banco de dados.

2.  **Para consultar um dado:**
    * Execute o arquivo `src/main/java/aplicacao/ConsultProgram.java`. Ele irá buscar e imprimir no console a pessoa com `id = 2`.

3.  **Para deletar dados:**
    * Execute o arquivo `src/main/java/aplicacao/DeleteProgram.java`. Ele irá remover do banco as pessoas com `id` 4, 5 e 6 (após serem previamente inseridas).

---

## 🖼️ Preview do Banco de Dados

A imagem abaixo mostra a estrutura da tabela `pessoa` no banco de dados após a execução do `TransitionProgram.java`.

![Preview do Banco de Dados Localhost](URL_DA_SUA_IMAGEM_AQUI)

> **Nota:** Substitua `URL_DA_SUA_IMAGEM_AQUI` pelo link de uma captura de tela do seu phpMyAdmin ou cliente de banco de dados mostrando os dados na tabela.

---

## 👨‍💻 Autor

Desenvolvido por **Caio Filardis**.

[![GitHub](https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white)](https://github.com/CaioFilardis)
