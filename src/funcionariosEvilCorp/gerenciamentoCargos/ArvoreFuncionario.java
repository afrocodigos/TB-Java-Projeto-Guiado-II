package funcionariosEvilCorp.gerenciamentoCargos;

import java.util.TreeSet;
import funcionariosEvilCorp.modelo.*;

public class ArvoreFuncionario<T extends Funcionario> {
    private TreeSet<T> funcionarios;

    public ArvoreFuncionario() {
        funcionarios = new TreeSet<>((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
    }

    public void adicionar(T funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    public T buscar(String nome) {

        for (T funcionarioBase : funcionarios) {
            if (funcionarioBase.getNome().equals(nome)) {
                return funcionarioBase; // retorno o funcionário encontrado
            }
        }
        System.out.println("Funcionário não existe na nossa base de dados");
        return null;
    }

    public void remover(String nome) {
        T funcionarioParaRemover = buscar(nome);
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
            System.out.println("Funcionário " + nome + " removido com sucesso!");
        } else {
            System.out.println(nome + "Não foi encontrado na nossa base de dados");
        }
    }

    public void mostrarTodos() {
        System.out.println("\n=== Todos os Funcionário ===");
        for (T funcionarioBase : funcionarios) {
            System.out.println(funcionarioBase.getNome() + " - " + funcionarioBase.getCargo() + " - "
                    + funcionarioBase.getSalario());
        }
    }

    public void atualizarDados(String nome, double novoSalario, String novoCargo) {
        T funcionarioParaAtualizar = buscar(nome);
        if (funcionarioParaAtualizar != null) {
            funcionarioParaAtualizar.setSalario(novoSalario);
            funcionarioParaAtualizar.setCargo(novoCargo);
            System.out.println("Dados da pessoa funcionária atulizados com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada em nossa base!");
        }
    }
}
