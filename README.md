# Sistema de Gerenciamento de Funcionários da StarLabs

## Objetivo
Este projeto tem como objetivo gerenciar os funcionários da StarLabs, permitindo operações como adicionar, remover, atualizar e buscar funcionários. Além disso, o sistema permite filtrar funcionários por cargo e nome, proporcionando uma maneira eficiente de visualizar e gerenciar os dados dos funcionários.

## Dependências
- JDK 11 ou superior
- IDE de sua escolha (Eclipse, IntelliJ IDEA, etc.)
- Biblioteca de Coleções do Java (java.util)

## Como Rodar
1. **Clone o Repositório**
   ```bash
   git clone https://github.com/julianachavespalm/TB-Java-Projeto-Guiado-II
   ```

2. **Compile o Projeto**
   Navegue até o diretório do projeto e compile os arquivos:
   ```bash
   javac -d bin src/**/*.java
   ```

3. **Execute o Projeto**
   Após a compilação, execute a classe principal usando o seguinte comando no terminal:
   ```bash
   java -cp bin src.funcionariosStarlabs.Main
   ```

   Isso iniciará o programa e exibirá o menu principal no console.

## Funcionalidades

### 1. Adicionar Funcionário
   Para adicionar um funcionário, selecione a opção "1" no menu e siga as instruções fornecidas pelo sistema. Será solicitado que você insira o nome, CPF, cargo e nível do funcionário.

### 2. Remover Funcionário
   Para remover um funcionário, selecione a opção "2" no menu e forneça o CPF do funcionário que deseja remover. O sistema confirmará a remoção.

### 3. Atualizar Funcionário
   Para atualizar as informações de um funcionário, selecione a opção "3" no menu e forneça o CPF do funcionário a ser atualizado. Em seguida, insira os novos dados conforme solicitado.

### 4. Visualizar Funcionários
   Para visualizar todos os funcionários cadastrados, selecione a opção "4". O sistema exibirá uma lista completa dos funcionários com seus respectivos dados.

### 5. Filtrar Funcionários por Cargo
   Para filtrar os funcionários por cargo, selecione a opção "5" e insira o nome do cargo desejado. O sistema exibirá todos os funcionários que ocupam o cargo especificado.

### 6. Buscar Funcionário por CPF
   Para buscar um funcionário específico pelo CPF, selecione a opção "6" e forneça o CPF. O sistema exibirá os dados do funcionário correspondente.

### 7. Filtrar Funcionários por Nome
   Para filtrar os funcionários por nome, selecione a opção "7" e insira o nome ou parte do nome do funcionário desejado. O sistema exibirá todos os funcionários que correspondem ao nome fornecido.

### 8. Sair
   Para encerrar o programa, selecione a opção "8".

## Exemplo de Uso
Aqui está um exemplo passo a passo de como adicionar um funcionário:
1. Execute o programa conforme descrito acima.
2. Quando o menu principal aparecer, selecione a opção "1".
3. Siga as instruções no console para inserir o nome, CPF, cargo e nível do novo funcionário.
4. O sistema confirmará a adição do funcionário com sucesso.

## Autora
Juliana Chaves Palm