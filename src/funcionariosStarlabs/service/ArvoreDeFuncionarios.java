package src.funcionariosStarlabs.service;

import java.util.TreeMap;
import src.funcionariosStarlabs.model.Funcionario;
import src.funcionariosStarlabs.model.Cargo;

public class ArvoreDeFuncionarios implements GerenciamentoFuncionarios {
    private TreeMap<String, Funcionario> funcionarios = new TreeMap<>();

    @Override
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getCpf().getValor(), funcionario);
    }

    @Override
    public void removerFuncionario(String cpf) {
        funcionarios.remove(cpf);
    }

    @Override
    public Funcionario buscarFuncionario(String cpf) {
        return funcionarios.get(cpf);
    }

    @Override
    public void atualizarFuncionario(Funcionario funcionario) {
        funcionarios.put(funcionario.getCpf().getValor(), funcionario);
    }

    @Override
    public void mostrarDadosOrdenados() {
        funcionarios.values().forEach(System.out::println);
    }

    @Override
    public void filtrarPorCargo(Cargo cargo) {
        funcionarios.values().stream()
            .filter(funcionario -> funcionario.getCargo().equals(cargo))
            .forEach(System.out::println);
    }

    @Override
    public void filtrarPorNome(String nome) {
        funcionarios.values().stream()
            .filter(funcionario -> funcionario.getNome().contains(nome))
            .forEach(System.out::println);
    }
}
