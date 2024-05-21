// ArvoreDeFuncionarios.java
package funcionariosBlackMoneySoftware.model.trees;

import funcionariosBlackMoneySoftware.model.FuncionarioBase;

import java.util.HashMap;
import java.util.Map;

public class ArvoreDeFuncionarios<T extends FuncionarioBase> {
    private Map<String, T> funcionarios;

    public ArvoreDeFuncionarios() {
        this.funcionarios = new HashMap<>();
    }

    public void adicionarFuncionario(T funcionario) {
        funcionarios.put(funcionario.getLogin(), funcionario);
    }

    public T buscar(String login) {
        return funcionarios.get(login);
    }

    public void removerFuncionario(String login) {
        funcionarios.remove(login);
    }

    public void atualizarDados(String login, double novoSalario, String novoCargo) {
        T funcionario = funcionarios.get(login);
        if (funcionario != null) {
            funcionario.setSalario(novoSalario);
            funcionario.setCargo(novoCargo);
        }
    }

    public void mostrarTodos() {
        for (T funcionario : funcionarios.values()) {
            funcionario.visualizarInformacoes();
            System.out.println();
        }
    }
}
