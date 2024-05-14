package funcionariosBlackMoneySoftware.model;

import java.util.TreeSet;

public class ArvoreDeFuncionarios<T extends FuncionarioBase> {

    private TreeSet<T> funcionarios;

    public ArvoreDeFuncionarios() {
        funcionarios = new TreeSet<>((f1, f2 -> f1.getNome().compareTo(f2.getNome())));
    }

    public void adicionarFuncionario(T funcionario){
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso");
    }

    public T buscar(String nome){
        for (T funcionarioBase : funcionarios) {
            if (funcionarioBase.getNome().equals(nome)){
                return funcionarioBase;
            }

        }
        System.out.println("Funcionário não existe na nossa base de dados");
        return null;
    }

    public void removerFuncionario(String nome){
        T funcionarioParaRemover = buscar(nome);
        if (funcionarioParaRemover != null){
            funcionarios.remove(funcionarioParaRemover);
            System.out.println("Funcionário " + nome + "removido com sucesso");
        } else {
            System.out.println(nome + "Não foi encontrando na nossa base de dados");
        }
    }

    public void mostrarTodos(){
        System.out.println("\n === Todos os Funcionários ===");
        for (T funcionarioBase : funcionarios) {
            System.out.println(funcionarioBase.getNome() + " - " + funcionarioBase.getCargo() + " - " + funcionarioBase.getSalario());
        }
    }

    public void atualizarDados(String nome, double novoSalario, String novoCargo){
        T funcionarioParaAtualizar = buscar(nome);
        if (funcionarioParaAtualizar != null){
            funcionarioParaAtualizar.setSalario(novoSalario);
            funcionarioParaAtualizar.setCargo(novoCargo);
            System.out.println("Dados atualizados com sucesso");
        } else {
            System.out.println(nome + "não encontrade na nossa base de dados");
        }
    }

}
