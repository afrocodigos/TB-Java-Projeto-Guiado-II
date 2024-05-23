# BlackMoneySoftware - Gestão de funcionários

### JAVA - Projeto II

Olá ! , neste projeto estarei reforçando meus conhecimentos tecnicos em java e POO, aqui veremos um gerenciador de funcionarios e suas funcionalidades desenvolvidor por mim.

## Estrutura das pastas

Estrutura das pastas do meu projeto.

```bash
- TB-Java-Projeto-Guiado-II/
  - src/
    - funcionariosBlackMoneySoftware/
      - controller/
        FuncionarioInterface.java
        MainController.java
        SistemaDeLogin.java
        ValidadorDaSenha.java
      - model/
        - trees/
          ArvoreDeFuncionarios.java
        CTO.java
        FuncionarioBase.java
        FuncionarioDesenvolvimento.java
        FuncionarioInfraestrutura.java
        FuncionarioRH.java
      - view/
        MenuView.java
      Main.java
      - test.java.controller/
        - ValidadorDaSenhaTest.java
  - README.md
```

## Exemplo de execução

| Passo 1 - Login do CTO                         | Passo 2 - Add novo funcionário                |
| ---------------------------------------------- | --------------------------------------------- |
| ![Login CTO](https://i.ibb.co/5LxQK7L/1-1.png) | ![Add func](https://i.ibb.co/D7TJCL9/1-2.png) |

| Passo 3 - logout                          | Passo 4 - Login funcionário                          |
| ----------------------------------------- | ---------------------------------------------------- |
| ![logout](https://i.ibb.co/JKNSBxy/2.png) | ![login funcionário](https://i.ibb.co/djkGSYb/3.png) |

| Passo 5 - Menu de ações funcionário + método visualizar informações |
| ------------------------------------------------------------------- |
| ![ações funcionário](https://i.ibb.co/PT0NxMx/4.png)                |

## Aprendizados

Projeto super desafiador, onde pude construir esse gerenciador e elaborar um regex para validação da senha, reforçando conhecimento de CRUD e POO.

## Funcionalidades do sistema

#### Funcionalidades Gerais (Todos os funcionários herdam de `FuncionarioBase`):

- Visualizar Informações
- Atualizar Senha

#### Funcionalidades do CTO:

- Adicionar Funcionário
- Remover Funcionário
- Atualizar Dados do Funcionário
- Mostrar Todos os Funcionários

#### Funcionalidades do funcionário de RH:

- Atualizar Salário
- Demitir Funcionário
- Dar Férias
- Atualizar Cargo

#### Funcionalidades do funcionário de Infraestrutura:

- Gerenciar Servidor
- Executar Script
- Notificar

#### Validar Senha

- Um regex feito para validação de senha
- Onde a senha tem que ter entre 8 e 16 caracteres
- Letras maiúsculas, minúsculas e caracteres especiais

## Autor e Orientador

- [@Lucas Teles](https://www.github.com/Lucas-Teles) - branch lucas-version
- [@Júlio César (Orientador)](https://www.github.com/julio-cesar96)
