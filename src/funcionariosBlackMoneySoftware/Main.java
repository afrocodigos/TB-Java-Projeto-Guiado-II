package funcionariosBlackMoneySoftware;

import funcionariosBlackMoneySoftware.controller.SistemaDeLogin;
import funcionariosBlackMoneySoftware.model.FuncionarioBase;
import funcionariosBlackMoneySoftware.model.FuncionarioDesenvolvimento;
import funcionariosBlackMoneySoftware.model.FuncionarioInfraestrutura;
import funcionariosBlackMoneySoftware.model.FuncionarioRH;
import funcionariosBlackMoneySoftware.model.trees.ArvoreDeFuncionarios;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaDeLogin sistemaDeLogin = new SistemaDeLogin();
        ArvoreDeFuncionarios<FuncionarioBase> arvoreDeFuncionarios = new ArvoreDeFuncionarios<>();

        // Login do CTO
        System.out.println("Login do CTO");
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        if (sistemaDeLogin.login(login, senha)) {
            System.out.println("Login realizado com sucesso!");
            boolean executando = true;

            while (executando) {
                System.out.println("\nMenu de Operações do CTO:");
                System.out.println("1. Adicionar Funcionário");
                System.out.println("2. Remover Funcionário");
                System.out.println("3. Atualizar Dados do Funcionário");
                System.out.println("4. Mostrar Todos os Funcionários");
                System.out.println("5. Logout");

                System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case 1:
                        adicionarFuncionario(scanner, arvoreDeFuncionarios, sistemaDeLogin);
                        break;
                    case 2:
                        removerFuncionario(scanner, arvoreDeFuncionarios);
                        break;
                    case 3:
                        atualizarFuncionario(scanner, arvoreDeFuncionarios);
                        break;
                    case 4:
                        arvoreDeFuncionarios.mostrarTodos();
                        break;
                    case 5:
                        executando = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }
        } else {
            System.out.println("Login ou senha incorretos.");
        }

        // Login do Funcionário
        System.out.println("Login do Funcionário");
        System.out.print("Login: ");
        String loginFuncionario = scanner.nextLine();
        System.out.print("Senha: ");
        String senhaFuncionario = scanner.nextLine();

        if (sistemaDeLogin.login(loginFuncionario, senhaFuncionario)) {
            FuncionarioBase funcionarioLogado = arvoreDeFuncionarios.buscar(loginFuncionario);
            if (funcionarioLogado != null) {
                System.out.println("Login realizado com sucesso!");
                boolean executando = true;

                while (executando) {
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
                    int opcao = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer

                    switch (opcao) {
                        case 1:
                            funcionarioLogado.visualizarInformacoes();
                            break;
                        case 2:
                            System.out.print("Nova Senha: ");
                            String novaSenha = scanner.nextLine();
                            funcionarioLogado.atualizarSenha(novaSenha);
                            break;
                        case 3:
                            if (funcionarioLogado instanceof FuncionarioDesenvolvimento) {
                                ((FuncionarioDesenvolvimento) funcionarioLogado).iniciarProjeto();
                            } else if (funcionarioLogado instanceof FuncionarioInfraestrutura) {
                                ((FuncionarioInfraestrutura) funcionarioLogado).gerenciarServidor();
                            } else if (funcionarioLogado instanceof FuncionarioRH) {
                                System.out.print("Nome do Funcionário: ");
                                String nomeFuncionario = scanner.nextLine();
                                FuncionarioBase funcionario = arvoreDeFuncionarios.buscar(nomeFuncionario);
                                if (funcionario != null) {
                                    System.out.print("Novo Salário: ");
                                    double novoSalario = scanner.nextDouble();
                                    scanner.nextLine(); // Limpa o buffer
                                    ((FuncionarioRH) funcionarioLogado).atualizarSalario(funcionario, novoSalario);
                                } else {
                                    System.out.println("Funcionário não encontrado.");
                                }
                            }
                            break;
                        case 4:
                            if (funcionarioLogado instanceof FuncionarioDesenvolvimento) {
                                ((FuncionarioDesenvolvimento) funcionarioLogado).atualizarProjeto();
                            } else if (funcionarioLogado instanceof FuncionarioInfraestrutura) {
                                ((FuncionarioInfraestrutura) funcionarioLogado).rodarScript();
                            } else if (funcionarioLogado instanceof FuncionarioRH) {
                                System.out.print("Nome do Funcionário: ");
                                String nomeFuncionario = scanner.nextLine();
                                ((FuncionarioRH) funcionarioLogado).demitirFuncionario(arvoreDeFuncionarios, nomeFuncionario);
                            }
                            break;
                        case 5:
                            if (funcionarioLogado instanceof FuncionarioDesenvolvimento) {
                                ((FuncionarioDesenvolvimento) funcionarioLogado).finalizarProjeto();
                            } else if (funcionarioLogado instanceof FuncionarioInfraestrutura) {
                                ((FuncionarioInfraestrutura) funcionarioLogado).notificar();
                            } else if (funcionarioLogado instanceof FuncionarioRH) {
                                System.out.print("Nome do Funcionário: ");
                                String nomeFuncionario = scanner.nextLine();
                                FuncionarioBase funcionario = arvoreDeFuncionarios.buscar(nomeFuncionario);
                                if (funcionario != null) {
                                    ((FuncionarioRH) funcionarioLogado).darFerias(funcionario);
                                } else {
                                    System.out.println("Funcionário não encontrado.");
                                }
                            }
                            break;
                        case 6:
                            if (funcionarioLogado instanceof FuncionarioDesenvolvimento) {
                                ((FuncionarioDesenvolvimento) funcionarioLogado).notificar();
                            } else if (funcionarioLogado instanceof FuncionarioRH) {
                                System.out.print("Nome do Funcionário: ");
                                String nomeFuncionario = scanner.nextLine();
                                FuncionarioBase funcionario = arvoreDeFuncionarios.buscar(nomeFuncionario);
                                if (funcionario != null) {
                                    System.out.print("Novo Cargo: ");
                                    String novoCargo = scanner.nextLine();
                                    ((FuncionarioRH) funcionarioLogado).atualizarCargo(funcionario, novoCargo);
                                } else {
                                    System.out.println("Funcionário não encontrado.");
                                }
                            }
                            break;
                        case 7:
                            executando = false;
                            break;
                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                    }
                }
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        } else {
            System.out.println("Login ou senha incorretos.");
        }
    }

    private static void adicionarFuncionario(Scanner scanner, ArvoreDeFuncionarios<FuncionarioBase> arvoreDeFuncionarios, SistemaDeLogin sistemaDeLogin) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Área do funcionário (1. Desenvolvimento, 2. Infraestrutura, 3. RH): ");
        int area = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        FuncionarioBase funcionario;
        switch (area) {
            case 1:
                funcionario = new FuncionarioDesenvolvimento(nome, cargo, salario, login, senha, cpf);
                break;
            case 2:
                funcionario = new FuncionarioInfraestrutura(nome, cargo, salario, login, senha, cpf);
                break;
            case 3:
                funcionario = new FuncionarioRH(nome, cargo, salario, login, senha, cpf);
                break;
            default:
                System.out.println("Área inválida. Funcionário não adicionado.");
                return;
        }
        arvoreDeFuncionarios.adicionarFuncionario(funcionario);
        sistemaDeLogin.adicionarLogin(login, senha);
    }

    private static void removerFuncionario(Scanner scanner, ArvoreDeFuncionarios<FuncionarioBase> arvoreDeFuncionarios) {
        System.out.print("Nome do funcionário a ser removido: ");
        String nome = scanner.nextLine();
        arvoreDeFuncionarios.removerFuncionario(nome);
    }

    private static void atualizarFuncionario(Scanner scanner, ArvoreDeFuncionarios<FuncionarioBase> arvoreDeFuncionarios) {
        System.out.print("Nome do funcionário a ser atualizado: ");
        String nome = scanner.nextLine();
        System.out.print("Novo cargo: ");
        String novoCargo = scanner.nextLine();
        System.out.print("Novo salário: ");
        double novoSalario = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer
        arvoreDeFuncionarios.atualizarDados(nome, novoSalario, novoCargo);
    }
}
