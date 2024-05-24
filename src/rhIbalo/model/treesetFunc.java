package rhIbalo.model;

import java.util.Comparator;
import java.util.TreeSet;

public class treesetFunc<T extends FuncBase> {

    private final TreeSet<T> funcionarios;

    public treesetFunc() {
        funcionarios = new TreeSet<>(Comparator.comparing(FuncBase::getNome));
    }

    public void adicionar(T funcionario) {
        funcionarios.add(funcionario);
        System.out.println(getClass() + " " + "Funcionário adicionado com sucesso!");
    }

    public T buscar(String nome) {

        for (T funcionarioBase : funcionarios) {
            if (funcionarioBase.getNome().equals(nome)) {
                System.out.println("encontrado em " + funcionarioBase.cargo + " " + funcionarioBase.nome);

                return  funcionarioBase; // retorno o funcionário encontrado
            }
        }
        System.out.println("Funcionário não existe na nossa base de dados" + (getClass()));
        return null;
    }

    public void remover(String nome) {
        T funcionarioParaRemover = buscar(nome);
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
            System.out.println("Funcionário " + nome + " removido com sucesso!");
        } else {
            System.out.println(nome + " " +"Não foi encontrado na nossa base de dados");
        }
    }

    public void mostrarTodos() {
        System.out.println("\n" + getClass() + " " + "\n=== Todos os Funcionários ===" );
        for (T funcionarioBase : funcionarios) {
            System.out.println(funcionarioBase.getNome() + " - " + funcionarioBase.getCargo() + " - " + funcionarioBase.getSalario());
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