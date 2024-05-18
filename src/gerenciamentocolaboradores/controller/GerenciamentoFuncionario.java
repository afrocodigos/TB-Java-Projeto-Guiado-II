package gerenciamentocolaboradores.controller;

import gerenciamentocolaboradores.model.funcionario.FuncionarioBase;

import java.util.Map;
import java.util.TreeMap;

/**
 * Classe responsável pelo gerenciamento de funcionários utilizando um TreeMap.
 * @author Diego Moura
 */
public class GerenciamentoFuncionario {

    private final TreeMap<String, FuncionarioBase> funcionarios;

    //region ...Constructor
    public GerenciamentoFuncionario() {
        this.funcionarios = new TreeMap<>();
    }
    //endregion

    //region ...CRUD
    /**
     * Adiciona um novo funcionário ao sistema.
     *
     * @param funcionario o funcionário a ser adicionado.
     */
    public void adicionarFuncionario(FuncionarioBase funcionario) {
        if (!funcionarios.containsKey(funcionario.getCpf())) {
            funcionarios.put(funcionario.getCpf(), funcionario);
            System.out.println("Funcionário adicionado com sucesso.");
        } else {
            System.out.println("Funcionário com este CPF já existe.");
        }
    }

    /**
     * Busca um funcionário pelo CPF.
     *
     * @param cpf o CPF do funcionário a ser buscado.
     * @return o funcionário encontrado, ou null se não for encontrado.
     */
    public FuncionarioBase buscarFuncionario(String cpf) {
        return funcionarios.get(cpf);
    }

    /**
     * Atualiza as informações de um funcionário existente.
     *
     * @param cpf                o CPF do funcionário a ser atualizado.
     * @param funcionarioAtualizado o objeto FuncionarioBase com os dados atualizados.
     */
    public void atualizarFuncionario(String cpf, FuncionarioBase funcionarioAtualizado) {
        if (funcionarios.containsKey(cpf)) {
            funcionarios.put(cpf, funcionarioAtualizado);
            System.out.println("Funcionário atualizado com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    /**
     * Remove um funcionário do sistema.
     *
     * @param cpf o CPF do funcionário a ser removido.
     */
    public void removerFuncionario(String cpf) {
        if (funcionarios.containsKey(cpf)) {
            funcionarios.remove(cpf);
            System.out.println("Funcionário removido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    /**
     * Lista todos os funcionários cadastrados.
     */
    public void listarFuncionarios() {
        for (Map.Entry<String, FuncionarioBase> entry : funcionarios.entrySet()) {
            FuncionarioBase f = entry.getValue();
            System.out.println("CPF: " + f.getCpf() + ", Nome: " + f.getNome() + ", Cargo: " + f.getCargo() + ", Salário: " + f.getSalario());
        }
    }
    //endregion
}
