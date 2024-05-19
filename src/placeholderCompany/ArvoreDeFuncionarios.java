package placeholderCompany;
import java.util.TreeSet;
import java.util.Scanner;
import utils.*;

public class ArvoreDeFuncionarios<T extends FuncionarioBase>{

    private TreeSet<T> funcionarios;

    public ArvoreDeFuncionarios() {
        funcionarios = new TreeSet<>((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
    }

    public void adicionar(T funcionario) {
        String cpf = funcionario.getCpf();
        if (buscarCpf(cpf)) {
            System.out.println("Funcionário já existe na nossa base de dados");
            return;
        }
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    public void adicionar(T funcionario, boolean flag) {

        String cpf = funcionario.getCpf();
        if (buscarCpf(cpf)) {
            if (flag) {
                System.out.println("Funcionário já existe na nossa base de dados");
                return;
            }
            return;
        }
        funcionarios.add(funcionario);
        if (flag){
            System.out.println("Funcionário adicionado com sucesso!");
        }
    }

    public T buscar(String cpf) {
        
        for (T funcionarioBase : funcionarios) {
            if (funcionarioBase.getCpf().equals(cpf)) {
                return funcionarioBase; // retorno o funcionário encontrado
            }
        }
        System.out.println("Funcionário não existe na nossa base de dados");
        return null;
    }
    public boolean buscarCpf(String cpf) {
        for (T funcionarioBase : funcionarios) {
            if (funcionarioBase.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void remover(String cpf) {
        T funcionarioParaRemover = buscar(cpf);
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
            System.out.println("Funcionário " + funcionarioParaRemover.getNome() + " removido com sucesso!");
        } else {
            System.out.println(cpf + "Não foi encontrado na nossa base de dados");
        }
    }

    public void mostrarTodos() {
        System.out.println("\n=== Todos os Funcionários ===");
        for (T funcionarioBase : funcionarios) {
            System.out.println(funcionarioBase.getNome() + " - " + funcionarioBase.getCargo() + " - " + funcionarioBase.getSalario() + " - " + funcionarioBase.getCpf());
        }
    }

    // public void atualizarDados(String nome, double novoSalario, String novoCargo) {
    //     T funcionarioParaAtualizar = buscar(nome);
    //     if (funcionarioParaAtualizar != null) {
    //         funcionarioParaAtualizar.setSalario(novoSalario);
    //         funcionarioParaAtualizar.setCargo(novoCargo);
    //         System.out.println("Dados da pessoa funcionária atulizados com sucesso!");
    //     } else {
    //         System.out.println("Pessoa não encontrada em nossa base!");
    //     }
    // }

    public void atualizarDados(String cpf){
        T funcionarioParaAtualizar = buscar(cpf);
        if (funcionarioParaAtualizar != null) {
            System.out.println("Funcionário encontrado! Dados atuais: " + funcionarioParaAtualizar);
            System.out.println("O que deseja atualizar?");
            System.out.println("1 - Salário");
            System.out.println("2 - Cargo");
            System.out.println("3 - Salário e Cargo");
            System.out.println("4 - Tipo de Funcionário");
            Scanner scanner = new Scanner(System.in);
            int opcao = scanner.nextInt();
            scanner.nextLine();
            while (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida! Digite novamente: ");
                opcao = scanner.nextInt();
            }
            switch (opcao) {
                case 1:
                    System.out.println("Digite o novo salário: ");
                    double novoSalario = scanner.nextDouble();
                    funcionarioParaAtualizar.setSalario(novoSalario);
                    break;
                case 2:
                    System.out.println("Digite o novo cargo: ");
                    String novoCargo = scanner.nextLine();
                    funcionarioParaAtualizar.setCargo(novoCargo);
                    break;
                case 3:
                    System.out.println("Digite o novo salário: ");
                    double novoSalario2 = scanner.nextDouble();
                    scanner.nextLine();
                    funcionarioParaAtualizar.setSalario(novoSalario2);
                    System.out.println("Digite o novo cargo: ");
                    String novoCargo2 = scanner.nextLine();
                    funcionarioParaAtualizar.setCargo(novoCargo2);
                    break;
                case 4:
                    System.out.println("Qual o novo tipo de funcionário?");
                    System.out.println("1 - Estagiário");
                    System.out.println("2 - Júnior");
                    System.out.println("3 - Pleno");
                    System.out.println("4 - Sênior");
                    System.out.println("5 - Lead");
                    System.out.println("6 - Diretor");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();
                    while (tipo < 1 || tipo > 6) {
                        System.out.println("Tipo inválido! Digite novamente: ");
                        tipo = scanner.nextInt();
                    }
                    switch (tipo) {
                        case 1:
                            Estagiario estagiario = new Estagiario(funcionarioParaAtualizar.getNome(), funcionarioParaAtualizar.getCargo(), funcionarioParaAtualizar.getSalario(), funcionarioParaAtualizar.getCpf());
                            funcionarios.remove(funcionarioParaAtualizar);
                            funcionarios.add((T) estagiario);
                            break;
                        case 2:
                            Junior junior = new Junior(funcionarioParaAtualizar.getNome(), funcionarioParaAtualizar.getCargo(), funcionarioParaAtualizar.getSalario(), funcionarioParaAtualizar.getCpf());
                            funcionarios.remove(funcionarioParaAtualizar);
                            funcionarios.add((T) junior);
                            break;
                        case 3:
                            Pleno pleno = new Pleno(funcionarioParaAtualizar.getNome(), funcionarioParaAtualizar.getCargo(), funcionarioParaAtualizar.getSalario(), funcionarioParaAtualizar.getCpf());
                            funcionarios.remove(funcionarioParaAtualizar);
                            funcionarios.add((T) pleno);
                            break;
                        case 4:
                            Senior senior = new Senior(funcionarioParaAtualizar.getNome(), funcionarioParaAtualizar.getCargo(), funcionarioParaAtualizar.getSalario(), funcionarioParaAtualizar.getCpf());
                            funcionarios.remove(funcionarioParaAtualizar);
                            funcionarios.add((T) senior);
                            break;
                        case 5:
                            Lead lead = new Lead(funcionarioParaAtualizar.getNome(), funcionarioParaAtualizar.getCargo(), funcionarioParaAtualizar.getSalario(), funcionarioParaAtualizar.getCpf());
                            funcionarios.remove(funcionarioParaAtualizar);
                            System.out.println("Lead: " + lead);
                            funcionarios.add((T) lead);
                            break;
                        case 6:
                            Diretor diretor = new Diretor(funcionarioParaAtualizar.getNome(), funcionarioParaAtualizar.getCargo(), funcionarioParaAtualizar.getSalario(), funcionarioParaAtualizar.getCpf());
                            funcionarios.remove(funcionarioParaAtualizar);
                            funcionarios.add((T) diretor);
                            break;
                    }              
            }
            System.out.println("Dados atualizados com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada em nossa base!");
        }
    }

    public TreeSet<T> getFuncionarios() {
        return funcionarios;
    }
}