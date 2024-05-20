// MenuView.java
package funcionariosBlackMoneySoftware.view;

import funcionariosBlackMoneySoftware.model.FuncionarioBase;
import funcionariosBlackMoneySoftware.model.FuncionarioDesenvolvimento;
import funcionariosBlackMoneySoftware.model.FuncionarioInfraestrutura;
import funcionariosBlackMoneySoftware.model.FuncionarioRH;

import java.util.Scanner;

public class MenuView {
    private final Scanner scanner;

    public MenuView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String solicitarLogin() {
        System.out.print("Login: ");
        return scanner.nextLine();
    }

    public String solicitarSenha() {
        System.out.print("Senha: ");
        return scanner.nextLine();
    }

    public int mostrarMenuInicial() {
        System.out.println("\nMenu Inicial:");
        System.out.println("1. Login");
        System.out.println("2. Sair");

        System.out.print("Escolha uma opção: ");
        return nextIntWithClearBuffer();
    }

    public int mostrarMenuCTO() {
        System.out.println("\nMenu de Operações do CTO:");
        System.out.println("1. Adicionar Funcionário");
        System.out.println("2. Remover Funcionário");
        System.out.println("3. Atualizar Dados do Funcionário");
        System.out.println("4. Mostrar Todos os Funcionários");
        System.out.println("5. Logout");

        System.out.print("Escolha uma opção: ");
        return nextIntWithClearBuffer();
    }

    public int mostrarMenuFuncionario(FuncionarioBase funcionarioLogado) {
        System.out.println("\nMenu de Operações do Funcionário:");
        System.out.println("1. Visualizar Informações");
        System.out.println("2. Atualizar Senha");
        if (funcionarioLogado instanceof FuncionarioDesenvolvimento) {
            System.out.println("3. Iniciar Projeto");
            System.out.println("4. Atualizar Projeto");
            System.out.println("5. Finalizar Projeto");
            System.out.println("6. Notificar");
        } else if (funcionarioLogado instanceof FuncionarioInfraestrutura) {
            System.out.println("3. Gerenciar Servidor");
            System.out.println("4. Rodar Script");
            System.out.println("5. Notificar");
        } else if (funcionarioLogado instanceof FuncionarioRH) {
            System.out.println("3. Atualizar Salário");
            System.out.println("4. Demitir Funcionário");
            System.out.println("5. Dar Férias");
            System.out.println("6. Atualizar Cargo");
        }
        System.out.println("7. Logout");

        System.out.print("Escolha uma opção: ");
        return nextIntWithClearBuffer();
    }

    // Métodos para solicitar dados de funcionários
    public String solicitarNome() {
        System.out.print("Nome: ");
        return scanner.nextLine();
    }

    public String solicitarCargo() {
        System.out.print("Cargo: ");
        return scanner.nextLine();
    }

    public double solicitarSalario() {
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer
        return salario;
    }

    public String solicitarCPF() {
        System.out.print("CPF: ");
        return scanner.nextLine();
    }

    public int solicitarArea() {
        System.out.println("Área do funcionário (1. Desenvolvimento, 2. Infraestrutura, 3. RH): ");
        int area = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        return area;
    }

    public String solicitarNovaSenha() {
        System.out.print("Nova Senha: ");
        return scanner.nextLine();
    }

    public double solicitarNovoSalario() {
        System.out.print("Novo Salário: ");
        double novoSalario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer
        return novoSalario;
    }

    public String solicitarNovoCargo() {
        System.out.print("Novo Cargo: ");
        return scanner.nextLine();
    }

    private int nextIntWithClearBuffer() {
        int input = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        return input;
    }
}
