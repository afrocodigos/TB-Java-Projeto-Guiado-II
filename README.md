# TB-Java-Projeto-Guiado-II
Para este projeto, deve ser construído um sistema para o gerenciamento dos colaboradores de uma empresa (o famoso CRUD), suas áreas e seus gestores, aplicando o conceito de árvore binária e paradigma orientado a objetos. (Afrocódigos 2024 - Turma Backend Java)

# Gestão de Funcionários BlackCoders
Este projeto em Java visa fornecer uma solução para a gestão de funcionários da empresa "BlackCoders". Utilizando conceitos de **Programação Orientada a Objetos (POO)**, a estrutura do projeto é baseada em uma **árvore binária TreeSet** para armazenar os valores dos funcionários.

## Hierarquia de Classes
O projeto segue uma hierarquia de classes que reflete a estrutura organizacional da empresa "BlackCoders":

- **FuncionarioBase**: Classe base que define os atributos e métodos comuns a todos os funcionários.
  - **Executivo**: Subclasse que representa os cargos executivos da empresa, como CEO, CTO e CFO.
  - **Desenvolvimento** e **Suporte**: Subclasses que abrange os cargos Coordenador, Supervisor e Analista.

<img src="/ProjetoGuiado-II.png">

## Regras de Negócio
O projeto incorpora as seguintes regras de negócio:

1. Herança de Departamentos: Os departamentos herdam da classe FuncionarioBase e adicionam atributos correspondentes ao seu departamento.

2. Especialização de Cargos: Os cargos herdam da classe Departamento e adicionam especificidades nos métodos de criação, edição e leitura.

3. O sistema deve permitir a criação, listagem, edição e remoção de todas as entidades, através do usuário responsável pelo RH da empresa.

4. O sistema deve guardar a data e hora da atualização dos funcionários

5. O sistema deve permitir uma listagem de todos os funcionários cadastrados e também separados por departamento

6. O sistema deve permitir o cadastro de Consultores e sua forma de contração seja por projeto e não departamento

<img src="/ProjetoGuiado2-II.png">

## Próximos passos
[ ] Adicionar Departamento e Projeto respectivamente na listagem de Funcionários e Consultores 
