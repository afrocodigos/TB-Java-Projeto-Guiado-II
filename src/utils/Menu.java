package utils;
import java.util.Scanner;
import placeholderCompany.*;

public class Menu {

    public static int Options() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Cadastrar Funcionário");
        System.out.println("2 - Listar Funcionários");
        System.out.println("3 - Atualizar Dados de Funcionário");
        System.out.println("4 - Remover Funcionário");
        System.out.println("5 - Sair");
        System.out.print("Digite a opção desejada: ");
        int opcao = scanner.nextInt();
        return opcao;
    }

    public static void CadastrarFuncionario(ArvoreDeFuncionarios<FuncionarioBase> arvore) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o cargo do funcionário: ");
        String cargo = scanner.nextLine();
        System.out.println("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o CPF do funcionário: ");
        String cpf = scanner.nextLine();
        System.out.println("Qual o tipo do funcionário?");
        System.out.println("1 - Estagiário");
        System.out.println("2 - Júnior");
        System.out.println("3 - Pleno");
        System.out.println("4 - Sênior");
        System.out.println("5 - Lead");
        System.out.println("6 - Diretor");
        int tipo = scanner.nextInt();
        while (tipo < 1 || tipo > 6) {
            System.out.println("Tipo inválido! Digite novamente: ");
            tipo = scanner.nextInt();   
        }
        switch (tipo) {
            case 1:
                Estagiario estagiario = new Estagiario(nome, cargo, salario, cpf);
                arvore.adicionar(estagiario);
                break;
            case 2:
                Junior junior = new Junior(nome, cargo, salario, cpf);
                arvore.adicionar(junior);
                break;
            case 3:
                Pleno pleno = new Pleno(nome, cargo, salario, cpf);
                arvore.adicionar(pleno);
                break;
            case 4:
                Senior senior = new Senior(nome, cargo, salario, cpf);
                arvore.adicionar(senior);
                break;
            case 5:
                Lead lead = new Lead(nome, cargo, salario, cpf);
                arvore.adicionar(lead);
                break;
            case 6:
                Diretor diretor = new Diretor(nome, cargo, salario, cpf);
                arvore.adicionar(diretor);
                break;
        }
    }

    public static void ListarFuncionarios(ArvoreDeFuncionarios<FuncionarioBase> arvore) {
        arvore.mostrarTodos();
    }

    public static void AtualizarDados(ArvoreDeFuncionarios<FuncionarioBase> arvore) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do funcionário que deseja atualizar: ");
        String cpf = scanner.nextLine();
        arvore.atualizarDados(cpf);
    }

    public static void RemoverFuncionario(ArvoreDeFuncionarios<FuncionarioBase> arvore) {
        arvore.mostrarTodos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o cpf do funcionário que deseja remover: ");
        String cpf = scanner.nextLine();
        arvore.remover(cpf);
    }
    public static void main(String[] args) {
        ArvoreDeFuncionarios<FuncionarioBase> arvore = new ArvoreDeFuncionarios<>();
        arvore = FileManager.carregarArquivoCSV("funcionarios.csv");
        int opcao = Options();
        while (opcao != 5) {
            switch (opcao) {
                case 1:
                    CadastrarFuncionario(arvore);
                    break;
                case 2:
                    ListarFuncionarios(arvore);
                    break;
                case 3:
                    AtualizarDados(arvore);
                    break;
                case 4:
                    RemoverFuncionario(arvore);
                    break;
            }
            FileManager.salvarArquivoCSV(arvore, "funcionarios.csv");
            opcao = Options();
        }
    }
}
