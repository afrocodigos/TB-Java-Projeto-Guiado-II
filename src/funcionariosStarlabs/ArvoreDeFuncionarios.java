package funcionariosStarlabs;
import java.util.TreeSet;

public class ArvoreDeFuncionarios {

    private TreeSet<FuncionarioBase> funcionarios;

    public ArvoreDeFuncionarios() {
        funcionarios = new TreeSet<>((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
    }

    public void adicionar(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    public FuncionarioBase buscar(String nome) {
        
        for (FuncionarioBase funcionarioBase : funcionarios) {
            if (funcionarioBase.getNome().equals(nome)) {
                return funcionarioBase; // retorno o funcionário encontraro
            }
        }
        System.out.println("Funcionário não existe na nossa base de dados");
        return null;
    }

    public void remover(String nome) {
        FuncionarioBase funcionarioParaRemover = buscar(nome);
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
            System.out.println("Funcionário " + nome + " removido com sucesso!");
        } else {
            System.out.println(nome + "Não foi encontrado na nossa base de dados");
        }
    }

    public void mostrarTodos() {
        System.out.println("\n=== Todos os Funcionário ===");
        for (FuncionarioBase funcionarioBase : funcionarios) {
            System.out.println(funcionarioBase.getNome() + " - " + funcionarioBase.getCargo() + " - " + funcionarioBase.getSalario());
        }
    }

    public void atualizarDados(String nome, double novoSalario, String novoCargo) {
        FuncionarioBase funcionarioParaAtualizar = buscar(nome);
        if (funcionarioParaAtualizar != null) {
            funcionarioParaAtualizar.setSalario(novoSalario);
            funcionarioParaAtualizar.setCargo(novoCargo);
            System.out.println("Dados da pessoa funcionária atulizados com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada em nossa base!");
        }
    }
}