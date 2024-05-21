// MainController.java
package funcionariosBlackMoneySoftware.controller;

import funcionariosBlackMoneySoftware.model.CTO;
import funcionariosBlackMoneySoftware.model.FuncionarioBase;
import funcionariosBlackMoneySoftware.model.FuncionarioDesenvolvimento;
import funcionariosBlackMoneySoftware.model.FuncionarioInfraestrutura;
import funcionariosBlackMoneySoftware.model.FuncionarioRH;
import funcionariosBlackMoneySoftware.model.trees.ArvoreDeFuncionarios;
import funcionariosBlackMoneySoftware.view.MenuView;

import java.util.Scanner;

public class MainController {
    private final Scanner scanner;
    private final SistemaDeLogin sistemaDeLogin;
    private final ArvoreDeFuncionarios<FuncionarioBase> arvoreDeFuncionarios;
    private final MenuView menuView;
    private final CTO cto;

    public MainController(CTO cto) {
        this.scanner = new Scanner(System.in);
        this.sistemaDeLogin = new SistemaDeLogin();
        this.arvoreDeFuncionarios = new ArvoreDeFuncionarios<>();
        this.menuView = new MenuView(scanner);
        this.cto = cto;

        // Adicionando o CTO à árvore de funcionários
        arvoreDeFuncionarios.adicionarFuncionario(cto);
        sistemaDeLogin.adicionarLogin(cto.getLogin(), cto.getSenha());
    }

    public void iniciarSistema() {
        boolean executando = true;

        while (executando) {
            int opcaoInicial = menuView.mostrarMenuInicial();
            switch (opcaoInicial) {
                case 1:
                    if (login()) {
                        FuncionarioBase funcionarioLogado = arvoreDeFuncionarios.buscar(menuView.solicitarLogin());
                        if (funcionarioLogado instanceof CTO) {
                            menuCTO();
                        } else if (funcionarioLogado != null) {
                            menuFuncionario(funcionarioLogado);
                        } else {
                            System.out.println("Funcionário não encontrado.");
                        }
                    } else {
                        System.out.println("Login ou senha incorretos.");
                    }
                    break;
                case 2:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private boolean login() {
        System.out.println("Login no sistema");
        String login = menuView.solicitarLogin();
        String senha = menuView.solicitarSenha();
        return cto.autenticar(login, senha) || sistemaDeLogin.login(login, senha);
    }

    private void menuCTO() {
        boolean executando = true;

        while (executando) {
            int opcao = menuView.mostrarMenuCTO();

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    atualizarFuncionario();
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
    }

    private void menuFuncionario(FuncionarioBase funcionarioLogado) {
        boolean executando = true;

        while (executando) {
            int opcao = menuView.mostrarMenuFuncionario(funcionarioLogado);

            switch (opcao) {
                case 1:
                    funcionarioLogado.visualizarInformacoes();
                    break;
                case 2:
                    atualizarSenha(funcionarioLogado);
                    break;
                case 3:
                    opcao3(funcionarioLogado);
                    break;
                case 4:
                    opcao4(funcionarioLogado);
                    break;
                case 5:
                    opcao5(funcionarioLogado);
                    break;
                case 6:
                    opcao6(funcionarioLogado);
                    break;
                case 7:
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private void adicionarFuncionario() {
        String nome = menuView.solicitarNome();
        String cargo = menuView.solicitarCargo();
        double salario = menuView.solicitarSalario();
        String login = menuView.solicitarLogin();
        String senha = menuView.solicitarSenha();
        String cpf = menuView.solicitarCPF();
        int area = menuView.solicitarArea();

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

    private void removerFuncionario() {
        String nome = menuView.solicitarNome();
        arvoreDeFuncionarios.removerFuncionario(nome);
    }

    private void atualizarFuncionario() {
        String nome = menuView.solicitarNome();
        String novoCargo = menuView.solicitarCargo();
        double novoSalario = menuView.solicitarSalario();
        arvoreDeFuncionarios.atualizarDados(nome, novoSalario, novoCargo);
    }

    private void atualizarSenha(FuncionarioBase funcionarioLogado) {
        String novaSenha = menuView.solicitarNovaSenha();
        funcionarioLogado.atualizarSenha(novaSenha);
    }

    private void opcao3(FuncionarioBase funcionarioLogado) {
        if (funcionarioLogado instanceof FuncionarioDesenvolvimento) {
            ((FuncionarioDesenvolvimento) funcionarioLogado).iniciarProjeto();
        } else if (funcionarioLogado instanceof FuncionarioInfraestrutura) {
            ((FuncionarioInfraestrutura) funcionarioLogado).gerenciarServidor();
        } else if (funcionarioLogado instanceof FuncionarioRH) {
            String nomeFuncionario = menuView.solicitarNome();
            FuncionarioBase funcionario = arvoreDeFuncionarios.buscar(nomeFuncionario);
            if (funcionario != null) {
                double novoSalario = menuView.solicitarNovoSalario();
                ((FuncionarioRH) funcionarioLogado).atualizarSalario(funcionario, novoSalario);
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        }
    }

    private void opcao4(FuncionarioBase funcionarioLogado) {
        if (funcionarioLogado instanceof FuncionarioDesenvolvimento) {
            ((FuncionarioDesenvolvimento) funcionarioLogado).atualizarProjeto();
        } else if (funcionarioLogado instanceof FuncionarioInfraestrutura) {
            ((FuncionarioInfraestrutura) funcionarioLogado).rodarScript();
        } else if (funcionarioLogado instanceof FuncionarioRH) {
            String nomeFuncionario = menuView.solicitarNome();
            ((FuncionarioRH) funcionarioLogado).demitirFuncionario(arvoreDeFuncionarios, nomeFuncionario);
        }
    }

    private void opcao5(FuncionarioBase funcionarioLogado) {
        if (funcionarioLogado instanceof FuncionarioDesenvolvimento) {
            ((FuncionarioDesenvolvimento) funcionarioLogado).finalizarProjeto();
        } else if (funcionarioLogado instanceof FuncionarioInfraestrutura) {
            ((FuncionarioInfraestrutura) funcionarioLogado).notificar();
        } else if (funcionarioLogado instanceof FuncionarioRH) {
            String nomeFuncionario = menuView.solicitarNome();
            FuncionarioBase funcionario = arvoreDeFuncionarios.buscar(nomeFuncionario);
            if (funcionario != null) {
                ((FuncionarioRH) funcionarioLogado).darFerias(funcionario);
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        }
    }

    private void opcao6(FuncionarioBase funcionarioLogado) {
        if (funcionarioLogado instanceof FuncionarioDesenvolvimento) {
            ((FuncionarioDesenvolvimento) funcionarioLogado).notificar();
        } else if (funcionarioLogado instanceof FuncionarioRH) {
            String nomeFuncionario = menuView.solicitarNome();
            FuncionarioBase funcionario = arvoreDeFuncionarios.buscar(nomeFuncionario);
            if (funcionario != null) {
                String novoCargo = menuView.solicitarNovoCargo();
                ((FuncionarioRH) funcionarioLogado).atualizarCargo(funcionario, novoCargo);
            } else {
                System.out.println("Funcionário não encontrado.");
            }
        }
    }
}
