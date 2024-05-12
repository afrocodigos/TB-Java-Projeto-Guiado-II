package data;
import model.FuncionarioBase;

import java.util.TreeSet;

public class ArvoreDeFuncionarios<T extends FuncionarioBase> {

    private TreeSet<T> funcionarios;

    public ArvoreDeFuncionarios() {
        funcionarios = new TreeSet<>((f1,  f2) -> f1.getNome().compareTo(f2.getNome()));
    }

    public void adicionar(T funcionario) {
        if (!existeFuncionario(funcionario)) {
            funcionarios.add(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");
        } else {
            System.out.println("Já existe um funcionário com o mesmo nome e cpf na nossa base de dados. ");
        }
    }
    private boolean existeFuncionario (T funcionario){
        for (T f: funcionarios){
            if (f.getNome().equals(funcionario.getNome()) && f.getCpf().equals(funcionario.getCpf())){
                return true;
            }
        }
        return false;
    }

    public T buscar(String nome) {
        
        for (T funcionarioBase : funcionarios) {
            if (funcionarioBase.getNome().equals(nome)) {
                return funcionarioBase; // retorno o funcionário encontraro
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
            System.out.println(funcionarioBase.getId() + "-" + funcionarioBase.getNome() + " - " + funcionarioBase.getCargo() + " - " + funcionarioBase.getSalario());
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