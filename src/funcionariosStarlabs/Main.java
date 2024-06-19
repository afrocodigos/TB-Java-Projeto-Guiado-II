package src.funcionariosStarlabs;

import java.util.List;
import java.util.Scanner;
import src.funcionariosStarlabs.model.Cargo;
import src.funcionariosStarlabs.model.Cpf;
import src.funcionariosStarlabs.model.Funcionario;
import src.funcionariosStarlabs.model.Nivel;
import src.funcionariosStarlabs.model.Salario;
import src.funcionariosStarlabs.service.ArvoreDeCargos;
import src.funcionariosStarlabs.service.ArvoreDeFuncionarios;
import src.funcionariosStarlabs.service.GerenciamentoFuncionarios;

public class Main {

    private static final List<String> cargosDisponiveis = List.of(
        "ENGENHEIRO",
        "ARQUITETO",
        "QA",
        "GESTOR"
    );

    public static void main(String[] args) {
        GerenciamentoFuncionarios arvoreDeFuncionarios = new ArvoreDeFuncionarios();
        GerenciamentoFuncionarios arvoreDeCargos = new ArvoreDeCargos();

        adicionarFuncionariosDefault(arvoreDeFuncionarios, arvoreDeCargos);

        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;
            do {
                mostrarMenu();
                opcao = obterOpcao(scanner);

                executarOpcao(arvoreDeFuncionarios, arvoreDeCargos, scanner, opcao);
            } while (opcao != 8);
        }
    }

    private static void mostrarMenu() {
        System.out.println("------------------------------------------");
        System.out.println("OPÇÕES    MENU");
        System.out.println("------------------------------------------");
        System.out.println("  1       Adicionar Funcionário");
        System.out.println("  2       Excluir Funcionário");
        System.out.println("  3       Atualizar Funcionário");
        System.out.println("  4       Visualizar Funcionários");
        System.out.println("  5       Filtrar Funcionários por Cargo");
        System.out.println("  6       Buscar Funcionário por CPF");
        System.out.println("  7       Filtrar Funcionários por Nome");
        System.out.println("  8       Sair");
        System.out.println("------------------------------------------");
        System.out.print("Escolha uma opção: ");
    }

    private static int obterOpcao(Scanner scanner) {
        while (true) {
            try {
                int opcao = Integer.parseInt(scanner.nextLine());
                if (opcao >= 1 && opcao <= 8) {
                    return opcao;
                }
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
            }
        }
    }

    private static void executarOpcao(GerenciamentoFuncionarios arvoreDeFuncionarios, GerenciamentoFuncionarios arvoreDeCargos, Scanner scanner, int opcao) {
        switch (opcao) {
            case 1 -> adicionarFuncionario(arvoreDeFuncionarios, arvoreDeCargos, scanner);
            case 2 -> excluirFuncionario(arvoreDeFuncionarios, arvoreDeCargos, scanner);
            case 3 -> atualizarFuncionario(arvoreDeFuncionarios, scanner);
            case 4 -> visualizarFuncionarios(arvoreDeFuncionarios);
            case 5 -> filtrarPorCargo(arvoreDeCargos, scanner);
            case 6 -> buscarPorCPF(arvoreDeFuncionarios, scanner);
            case 7 -> filtrarPorNome(arvoreDeCargos, scanner);
            case 8 -> System.out.println("Encerrando o programa...");
            default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
        }
    }

    private static void adicionarFuncionario(GerenciamentoFuncionarios arvoreDeFuncionarios, GerenciamentoFuncionarios arvoreDeCargos, Scanner scanner) {
        String nome = obterEntrada(scanner, "Digite o nome do funcionário:");
        String cpf = obterEntrada(scanner, "Digite o CPF do funcionário:");
        String cargo = selecionarCargo(scanner);
        String nivel = selecionarNivel(scanner);
        double salario = obterSalario(scanner, "Digite o salário do funcionário:");

        Funcionario novoFuncionario = new Funcionario(nome, new Cpf(cpf), Cargo.valueOf(cargo.toUpperCase()), Nivel.valueOf(nivel.toUpperCase()), new Salario(salario));
        arvoreDeFuncionarios.adicionarFuncionario(novoFuncionario);
        arvoreDeCargos.adicionarFuncionario(novoFuncionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    private static void excluirFuncionario(GerenciamentoFuncionarios arvoreDeFuncionarios, GerenciamentoFuncionarios arvoreDeCargos, Scanner scanner) {
        String cpf = obterEntrada(scanner, "Digite o CPF do funcionário que deseja excluir:");

        arvoreDeFuncionarios.removerFuncionario(cpf);
        arvoreDeCargos.removerFuncionario(cpf);
        System.out.println("Funcionário removido com sucesso!");
    }

    private static void atualizarFuncionario(GerenciamentoFuncionarios arvoreDeFuncionarios, Scanner scanner) {
        String cpf = obterEntrada(scanner, "Digite o CPF do funcionário que deseja atualizar:");

        Funcionario funcionario = arvoreDeFuncionarios.buscarFuncionario(cpf);
        if (funcionario != null) {
            String novoNome = obterEntrada(scanner, "Digite o novo nome do funcionário:");
            funcionario.setNome(novoNome);

            double novoSalario = obterSalario(scanner, "Digite o novo salário do funcionário:");
            funcionario.getSalario().setValor(novoSalario);

            arvoreDeFuncionarios.atualizarFuncionario(funcionario);
            System.out.println("Funcionário atualizado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void visualizarFuncionarios(GerenciamentoFuncionarios arvoreDeFuncionarios) {
        System.out.println("Lista de Funcionários:");
        arvoreDeFuncionarios.mostrarDadosOrdenados();
    }

    private static void filtrarPorCargo(GerenciamentoFuncionarios arvoreDeCargos, Scanner scanner) {
        String cargo = selecionarCargo(scanner);
        arvoreDeCargos.filtrarPorCargo(Cargo.valueOf(cargo.toUpperCase()));
    }

    private static void buscarPorCPF(GerenciamentoFuncionarios arvoreDeFuncionarios, Scanner scanner) {
        String cpf = obterEntrada(scanner, "Digite o CPF do funcionário que deseja buscar:");
        Funcionario funcionario = arvoreDeFuncionarios.buscarFuncionario(cpf);

        if (funcionario != null) {
            System.out.println("Funcionário encontrado:");
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void filtrarPorNome(GerenciamentoFuncionarios arvoreDeCargos, Scanner scanner) {
        String nome = obterEntrada(scanner, "Digite o nome do funcionário que deseja buscar:");
        arvoreDeCargos.filtrarPorNome(nome);
    }

    private static String obterEntrada(Scanner scanner, String mensagem) {
        System.out.println(mensagem);
        return scanner.nextLine();
    }

    private static String selecionarCargo(Scanner scanner) {
        System.out.println("Selecione o cargo do funcionário:");
        for (int i = 0; i < cargosDisponiveis.size(); i++) {
            System.out.println((i + 1) + " - " + cargosDisponiveis.get(i));
        }
        int cargoEscolhido = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha
        return cargosDisponiveis.get(cargoEscolhido - 1);
    }

    private static String selecionarNivel(Scanner scanner) {
        System.out.println("Selecione o nível do funcionário (1 para Estagiário, 2 para Júnior, 3 para Pleno, 4 para Sênior, 5 para Gestor):");
        int nivelEscolhido = scanner.nextInt();
        scanner.nextLine();  // Consome a nova linha
        return switch (nivelEscolhido) {
            case 1 -> "Estagiário";
            case 2 -> "Júnior";
            case 3 -> "Pleno";
            case 4 -> "Sênior";
            case 5 -> "Gestor";
            default -> "Júnior"; // Nível padrão em caso de valor inválido
        };
    }

    private static double obterSalario(Scanner scanner, String mensagem) {
        while (true) {
            try {
                System.out.println(mensagem);
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, insira um valor numérico.");
            }
        }
    }

    private static void adicionarFuncionariosDefault(GerenciamentoFuncionarios arvoreDeFuncionarios, GerenciamentoFuncionarios arvoreDeCargos) {
        arvoreDeFuncionarios.adicionarFuncionario(new Funcionario("Alice", new Cpf("12345678900"), Cargo.ENGENHEIRO, Nivel.SENIOR, new Salario(10000)));
        arvoreDeFuncionarios.adicionarFuncionario(new Funcionario("Bob", new Cpf("98765432100"), Cargo.QA, Nivel.PLENO, new Salario(8000)));
        arvoreDeFuncionarios.adicionarFuncionario(new Funcionario("Carol", new Cpf("45678912300"), Cargo.ARQUITETO, Nivel.JUNIOR, new Salario(9000)));
        arvoreDeFuncionarios.adicionarFuncionario(new Funcionario("David", new Cpf("78912345600"), Cargo.GESTOR, Nivel.SENIOR, new Salario(12000)));
    
        arvoreDeCargos.adicionarFuncionario(new Funcionario("Alice", new Cpf("12345678900"), Cargo.ENGENHEIRO, Nivel.SENIOR, new Salario(10000)));
        arvoreDeCargos.adicionarFuncionario(new Funcionario("Bob", new Cpf("98765432100"), Cargo.QA, Nivel.PLENO, new Salario(8000)));
        arvoreDeCargos.adicionarFuncionario(new Funcionario("Carol", new Cpf("45678912300"), Cargo.ARQUITETO, Nivel.JUNIOR, new Salario(9000)));
        arvoreDeCargos.adicionarFuncionario(new Funcionario("David", new Cpf("78912345600"), Cargo.GESTOR, Nivel.SENIOR, new Salario(12000)));
    }
}    
