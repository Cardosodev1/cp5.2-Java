# Sistema de Gerenciamento de Brinquedos Esportivos

## 📑 Descrição do Projeto

Este projeto é uma aplicação web desenvolvida em **Java** com o framework **Spring Boot MVC**, projetada para uma empresa fictícia de brinquedos esportivos voltados para crianças de até 12 anos. O sistema implementa um CRUD (Create, Read, Update, Delete) completo para o gerenciamento de produtos, com um sistema de autenticação de usuários para garantir o acesso seguro às funcionalidades de administração.

A aplicação foi construída como parte do Checkpoint de Enterprise Application Development, demonstrando o uso de tecnologias modernas do ecossistema Spring para criar uma aplicação robusta, segura e de fácil manutenção.

---

## ✨ Funcionalidades Principais

* **Autenticação de Usuários**: Sistema de login e cadastro personalizado.
    * **Cadastro (Sign Up)**: Novos usuários podem se registrar no sistema, e suas credenciais são armazenadas de forma segura no banco de dados com senhas criptografadas.
    * **Login (Sign In)**: Usuários registrados podem se autenticar para acessar as áreas restritas da aplicação.
    * **Controle de Acesso**: Rotas de gerenciamento de brinquedos são protegidas, exigindo que o usuário esteja logado.
* **Gerenciamento de Brinquedos (CRUD)**:
    * **Create**: Adicionar novos brinquedos esportivos ao catálogo através de um formulário web.
    * **Read**: Visualizar todos os brinquedos cadastrados em uma tabela organizada.
    * **Update**: Editar as informações de um brinquedo existente.
    * **Delete**: Remover um brinquedo do catálogo.
* **Interface Web Responsiva**: Telas desenvolvidas com Thymeleaf e CSS para uma experiência de usuário limpa e funcional.

---

## 🛠️ Tecnologias Utilizadas

* **Backend**:
    * [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
    * [Spring Boot 3](https://spring.io/projects/spring-boot)
    * [Spring Web MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
    * [Spring Security](https://spring.io/projects/spring-security)
    * [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
    * [Lombok](https://projectlombok.org/)
* **Frontend**:
    * [Thymeleaf](https://www.thymeleaf.org/)
    * HTML5 & CSS3
* **Banco de Dados**:
    * [PostgreSQL](https://www.postgresql.org/)
* **Gerenciamento de Dependências**:
    * [Maven](https://maven.apache.org/)
* **IDE**:
    * [IntelliJ](https://www.jetbrains.com/pt-br/idea/download/?section=windows) 

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

Antes de começar, você precisará ter as seguintes ferramentas instaladas em seu ambiente:
* JDK (Java Development Kit) - Versão 21 ou superior.
* Maven 3.8 ou superior.
* PostgreSQL.
* Uma IDE de sua preferência (IntelliJ IDEA, Eclipse, VS Code).

### 1. Clone o Repositório

```bash
git clone [https://github.com/seu-usuario/seu-repositorio.git](https://github.com/seu-usuario/seu-repositorio.git)
cd seu-repositorio
```

### 2. Configure o Banco de Dados

1.  Crie um banco de dados no PostgreSQL (ex: `db_toysport`).
2.  Abra o arquivo `src/main/resources/application.properties`.
3.  Atualize as seguintes propriedades com as suas credenciais do PostgreSQL:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/nome_do_seu_banco
    spring.datasource.username=seu_usuario_postgres
    spring.datasource.password=sua_senha_postgres
    ```

### 3. Instale as Dependências e Execute

O Spring Boot fará o resto. Você pode executar a aplicação diretamente pela sua IDE ou usando o Maven no terminal:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em **http://localhost:8080**.

---

## 💻 Telas e Utilização

Ao acessar a aplicação, você será redirecionado para a tela de login, pois as rotas de gerenciamento são protegidas.

### Tela de Cadastro

Caso não possua um login, clique em "Cadastre-se" para criar uma nova conta.

<img width="1873" height="885" alt="image" src="https://github.com/user-attachments/assets/dd4b6723-c924-47b8-bead-91ad362bb21f" />


### Tela de Login

Após o cadastro, você será redirecionado para a tela de login. Utilize as credenciais recém-criadas para acessar o sistema.

<img width="1872" height="884" alt="image" src="https://github.com/user-attachments/assets/855c386c-f558-46e4-ae96-f64c2850921c" />


### Tela Principal - Lista de Brinquedos

Após o login bem-sucedido, você terá acesso à tela principal, que lista todos os brinquedos cadastrados. A partir daqui, é possível adicionar, editar ou excluir itens.

<img width="1874" height="885" alt="image" src="https://github.com/user-attachments/assets/78ebfed8-15a5-45c8-9677-43beb4f35410" />


### Tela de Formulário de Brinquedo

Ao clicar em "➕ Novo Brinquedo" ou "✏ Editar", você será levado ao formulário de cadastro, onde poderá inserir ou atualizar os detalhes do produto.

<img width="1873" height="887" alt="image" src="https://github.com/user-attachments/assets/40abfda4-2088-44e5-9822-f4f11afc7c7c" />


---

## 📂 Estrutura do Projeto

O projeto segue a estrutura padrão de aplicações Spring Boot, com uma organização clara de pacotes por responsabilidade:

```
br.com.fiap.exercicio.revisao
├── config/           # Configurações de segurança (Spring Security)
├── controller/       # Controladores MVC e REST
├── dto/              # Data Transfer Objects
├── entity/           # Entidades JPA (modelos de dados)
├── repository/       # Interfaces do Spring Data JPA
├── service/          # Lógica de negócio (serviço de autenticação)
└── Application.java  # Classe principal da aplicação
```
