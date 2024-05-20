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

public class Main {

    private static final List<String> cargosDisponiveis = List.of(
        "engenheiro",
        "arquiteto",
        "qa",
        "gestor"
    );

    public static void main(String[] args) {
        ArvoreDeFuncionarios arvoreDeFuncionarios = new ArvoreDeFuncionarios();
        ArvoreDeCargos arvoreDeCargos = new ArvoreDeCargos();

        adicionarFuncionariosDefault(arvoreDeFuncionarios, arvoreDeCargos);

        try (Scanner scanner = new Scanner(System.in)) {
            int opcao;
            do {
                mostrarMenu();
                opcao = scanner.nextInt();
                scanner.nextLine();

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

    private static void adicionarFuncionario(ArvoreDeFuncionarios arvoreDeFuncionarios, ArvoreDeCargos arvoreDeCargos, Scanner scanner) {
        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do funcionário:");
        String cpf = scanner.nextLine();

        System.out.println("Selecione o cargo do funcionário:");
        for (int i = 0; i < cargosDisponiveis.size(); i++) {
            System.out.println((i + 1) + ". " + cargosDisponiveis.get(i));
        }
        int indiceCargo = scanner.nextInt();
        scanner.nextLine();
        String cargo = cargosDisponiveis.get(indiceCargo - 1);

        System.out.println("Digite o nível do funcionário (1 para Estagiário, 2 para Junior, 3 para Pleno, 4 para Senior, 5 para Gestor):");
        int nivel = scanner.nextInt();
        scanner.nextLine();

        Funcionario novoFuncionario = new Funcionario(nome, new Cpf(cpf), new Cargo(cargo), new Nivel(nivel), new Salario());

        arvoreDeFuncionarios.adicionarFuncionario(novoFuncionario);
        arvoreDeCargos.adicionarFuncionario(novoFuncionario);

        System.out.println("Funcionário adicionado com sucesso!");
    }

    private static void excluirFuncionario(ArvoreDeFuncionarios arvoreDeFuncionarios, ArvoreDeCargos arvoreDeCargos, Scanner scanner) {
        System.out.println("Digite o CPF do funcionário que deseja excluir:");
        String cpf = scanner.nextLine();

        arvoreDeFuncionarios.removerFuncionario(cpf);
        arvoreDeCargos.removerFuncionario(cpf);

        System.out.println("Funcionário removido com sucesso!");
    }

    private static void atualizarFuncionario(ArvoreDeFuncionarios arvoreDeFuncionarios, Scanner scanner) {
        System.out.println("Digite o CPF do funcionário que deseja atualizar:");
        String cpf = scanner.nextLine();

        Funcionario funcionario = arvoreDeFuncionarios.buscarFuncionario(cpf);

        if (funcionario != null) {
            System.out.println("Digite o novo nome do funcionário:");
            String novoNome = scanner.nextLine();

            System.out.println("Selecione o novo cargo do funcionário:");
            for (int i = 0; i < cargosDisponiveis.size(); i++) {
                System.out.println((i + 1) + ". " + cargosDisponiveis.get(i));
            }
            int indiceCargo = scanner.nextInt();
            scanner.nextLine();
            String novoCargo = cargosDisponiveis.get(indiceCargo - 1);

            System.out.println("Digite o novo nível do funcionário (1 para Estagiário, 2 para Junior, 3 para Pleno, 4 para Senior, 5 para Gestor):");
            int novoNivel = scanner.nextInt();
            scanner.nextLine();

            funcionario.setNome(novoNome);
            funcionario.setCargo(new Cargo(novoCargo));
            funcionario.setNivel(new Nivel(novoNivel));

            arvoreDeFuncionarios.atualizarFuncionario(funcionario);

            System.out.println("Funcionário atualizado com sucesso!");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void visualizarFuncionarios(ArvoreDeFuncionarios arvoreDeFuncionarios) {
        if (arvoreDeFuncionarios.estaVazia()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Lista de funcionários:");
            arvoreDeFuncionarios.listarFuncionarios();
        }
    }

    private static void filtrarPorCargo(ArvoreDeCargos arvoreDeCargos, Scanner scanner) {
        System.out.println("Digite o cargo para filtrar:");
        String cargo = scanner.nextLine();

        System.out.println("Funcionários com o cargo '" + cargo +  "':");
        arvoreDeCargos.buscarFuncionariosPorCargo(cargo).forEach(System.out::println);
    }

    private static void buscarPorCPF(ArvoreDeFuncionarios arvoreDeFuncionarios, Scanner scanner) {
        System.out.println("Digite o CPF do funcionário para buscar:");
        String cpf = scanner.nextLine();

        Funcionario funcionario = arvoreDeFuncionarios.buscarFuncionario(cpf);

        if (funcionario != null) {
            System.out.println("Funcionário encontrado:");
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private static void filtrarPorNome(ArvoreDeCargos arvoreDeCargos, Scanner scanner) {
        System.out.println("Digite o nome para filtrar:");
        String nome = scanner.nextLine();

        System.out.println("Funcionários com o nome '" + nome + "':");
        arvoreDeCargos.buscarFuncionariosPorNome(nome).forEach(System.out::println);
    }

    private static void adicionarFuncionariosDefault(ArvoreDeFuncionarios arvoreDeFuncionarios, ArvoreDeCargos arvoreDeCargos) {

        Funcionario funcionario1 = new Funcionario("João", new Cpf("12345678901"), new Cargo("qa"), new Nivel(1), new Salario());
        Funcionario funcionario2 = new Funcionario("Maria", new Cpf("98765432109"), new Cargo("engenheiro"), new Nivel(2), new Salario());

        arvoreDeFuncionarios.adicionarFuncionario(funcionario1);
        arvoreDeFuncionarios.adicionarFuncionario(funcionario2);

        arvoreDeCargos.adicionarFuncionario(funcionario1);
        arvoreDeCargos.adicionarFuncionario(funcionario2);
    }

}

